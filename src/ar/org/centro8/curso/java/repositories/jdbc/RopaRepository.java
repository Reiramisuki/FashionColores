package ar.org.centro8.curso.java.repositories.jdbc;

import ar.org.centro8.curso.java.entidades.Ropa;
import ar.org.centro8.curso.java.enums.Color;
import ar.org.centro8.curso.java.enums.Estacion;
import ar.org.centro8.curso.java.enums.GeneroRopa;
import ar.org.centro8.curso.java.enums.Talle;
import ar.org.centro8.curso.java.repositories.interfaces.I_RopaRepository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RopaRepository implements I_RopaRepository{
    private Connection conn;

    public RopaRepository(Connection conn) {
        this.conn = conn;
    }
    @Override
    public void save(Ropa ropa) {
         if(ropa==null) return;
        try (PreparedStatement ps=conn.prepareStatement( 
                "insert into ropas (ropa,talle,color,genero_ropa,estacion,stock,precio) values (?,?,?,?,?,?,?)",
                PreparedStatement.RETURN_GENERATED_KEYS
        )) {
            ps.setString(1, ropa.getRopa_d());
            ps.setString(2, ropa.getTalle().toString());
            ps.setString(3, ropa.getColor().toString());
            ps.setString(4, ropa.getGenero_ropa().toString());
            ps.setString(5, ropa.getEstacion().toString());
            ps.setInt(6, ropa.getStock());
            ps.setDouble(7, ropa.getPrecio());
            ps.execute();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()) ropa.setId(rs.getInt(1));
        } catch (Exception e) {
            e.printStackTrace();
        }  
    }

    @Override
    public void remove(Ropa ropa) {
     if(ropa==null) return;
        try (PreparedStatement ps=conn.prepareStatement("delete from ropas where id=?")){
            ps.setInt(1,ropa.getId());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }  }

    @Override
  public void update(Ropa ropa) {
   if(ropa==null) return;
        try (PreparedStatement ps=conn.prepareStatement(
                "update ropas set id=?, ropa=?, talle=?, color=?,genero_ropa=?, estacion=? , stock=?, precio=? where id=?"
        )) {
            ps.setInt(1, ropa.getId());
            ps.setString(2, ropa.getRopa_d());
            ps.setString(3, ropa.getTalle().toString());
            ps.setString(4, ropa.getColor().toString());
            ps.setString(5, ropa.getGenero_ropa().toString());
            ps.setString(6, ropa.getEstacion().toString());
            ps.setInt(7, ropa.getStock());
            ps.setDouble(8, ropa.getPrecio());
            ps.setInt(9, ropa.getId());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Ropa> getAll() {
        List<Ropa> lista=new ArrayList();
    try (ResultSet rs=conn.createStatement().executeQuery("select * from ropas")){
            while(rs.next()){
                lista.add(new Ropa(
                        rs.getInt("id"),
                        rs.getString("ropa"),
                        Talle.valueOf(rs.getString("talle")),
                        Color.valueOf(rs.getString("color")),
                        GeneroRopa.valueOf(rs.getString("genero_ropa")),
                        Estacion.valueOf(rs.getString("estacion")),
                        rs.getInt("stock"),
                        rs.getDouble("precio")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista; }

//    @Override
//    public List<Ropa> getLikeRopa(String ropa_d,int stock, String estacion,String talle, String Genero_ropa ) {
//     List<Ropa> listaD=new ArrayList();
//        String sql="Select*From ropas where ropa=? and stock=? and talle= ? and estacion=? and genero_ropa =? ";
//        try {
//                PreparedStatement psd=conn.prepareStatement(sql);
//                psd.setString(1, ropa_d);
//                psd.setInt(2, stock);
//                psd.setString(3, talle);
//                psd.setString(4, estacion);
//                psd.setString(5, Genero_ropa);
//                psd.execute();
//                ResultSet rs= psd.executeQuery();
//                while(rs.next())
//                {listaD.add(new Ropa(
//                        rs.getInt("id"),
//                        rs.getString("ropa"),
//                        Talle.valueOf(rs.getString("talle")),
//                        Color.valueOf(rs.getString("color")),
//                        GeneroRopa.valueOf(rs.getString("genero_ropa")),
//                        Estacion.valueOf(rs.getString("estacion")),
//                        rs.getInt("stock"),
//                        rs.getDouble("precio")
//                ));
//
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();}
//        return listaD;
//}
}