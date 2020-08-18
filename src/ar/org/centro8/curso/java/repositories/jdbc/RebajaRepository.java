package ar.org.centro8.curso.java.repositories.jdbc;

import ar.org.centro8.curso.java.entidades.Rebaja;
import ar.org.centro8.curso.java.enums.Promocion;
import ar.org.centro8.curso.java.repositories.interfaces.I_RebajaRepository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class RebajaRepository implements I_RebajaRepository{
private Connection conn;

    public RebajaRepository(Connection conn) {
        this.conn = conn;
    }
    @Override
    public void save(Rebaja rebaja) {
       if(rebaja==null)return;
          try (PreparedStatement ps=conn.prepareStatement(
                "insert into rebajas(id,descripcion,promocion,descuento) values (?,?,?,?)",
                PreparedStatement.RETURN_GENERATED_KEYS
        )) {
            ps.setInt(1, rebaja.getId());
            ps.setString(2, rebaja.getDescripcion());
            ps.setString(3, rebaja.getPromocion().toString());
            ps.setInt(4, rebaja.getDescuento());
            ps.execute();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()) rebaja.setId(rs.getInt(1));
        } catch (Exception e) {
           e.printStackTrace();
        } 
    }

    @Override
    public void remove(Rebaja rebaja) {
         if(rebaja==null) return;
        try (PreparedStatement ps=conn.prepareStatement("delete from rebajas where id=?")){
            ps.setInt(1, rebaja.getId());
            ps.execute();
        } catch (Exception e) {
           e.printStackTrace();
        } 
    }

    @Override
    public void update(Rebaja rebaja) {
       if(rebaja==null)return;
          try (PreparedStatement ps=conn.prepareStatement(
                "update rebajas set id=?,descripcion=?,promocion=?,descuento=? where id=?"
        )) {
            ps.setInt(1, rebaja.getId());
            ps.setString(2, rebaja.getDescripcion());
            ps.setString(3,rebaja.getPromocion().toString());
            ps.setInt(4, rebaja.getDescuento());
            ps.setInt(5, rebaja.getId());
            ps.execute();
        } catch (Exception e) {
          e.printStackTrace();
        } }

    @Override
    public List<Rebaja> getAll() {
        List<Rebaja> lista=new ArrayList();
        try (ResultSet rs=conn.createStatement().executeQuery("select * from rebajas")){
            while(rs.next()){
                lista.add(new Rebaja(
                        rs.getInt("id"),
                        rs.getString("descripcion"),
                        Promocion.valueOf(rs.getString("promocion")),
                        rs.getInt("descuento")
                         ));
            }
        } catch (Exception e) {
           e.printStackTrace();
        }
        return lista;
    }
    
}
