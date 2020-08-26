package ar.org.centro8.curso.java.repositories.jdbc;
import ar.org.centro8.curso.java.entidades.Factura;
import ar.org.centro8.curso.java.enums.Letra;
import ar.org.centro8.curso.java.enums.MediodePago;
import ar.org.centro8.curso.java.gui.Facturas;
import ar.org.centro8.curso.java.repositories.interfaces.I_FacturaRepository;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class FacturaRepository implements I_FacturaRepository{
private Connection conn;
    public FacturaRepository(Connection conn) {
        this.conn = conn;
    }
    @Override
    public void save(Factura factura) {
       if(factura==null) return;
//       SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");        
//       String fecha= dateformat.format(Facturas.lblFecha);
        try (PreparedStatement ps=conn.prepareStatement(
                "insert into facturas (letra,id_cliente,fecha,medio_pago,id_rebaja,descuento,monto,total) values(?,?,?,?,?,?,?,?) ",
                PreparedStatement.RETURN_GENERATED_KEYS
        )) {
            ps.setString(1, factura.getLetra().toString());
            ps.setInt(2, factura.getId_cliente());
            ps.setString(3,factura.getFecha());
            ps.setString(4,factura.getMedio_pago().toString());
            ps.setInt(5, factura.getId_rebaja());
            ps.setInt(6, factura.getDescuento());
            ps.setDouble(7, factura.getMonto());
            ps.setDouble(8,factura.getTotal());
            ps.execute();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next())factura.setNumero(rs.getInt(1));
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
    public void remove(Factura factura) {
        if(factura==null) return;
        try (PreparedStatement ps=conn.prepareStatement("delete from facturas where numero=?")){
            ps.setInt(1, factura.getNumero());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace(); } }
    
    @Override
    public void update(Factura factura) {
         if(factura==null) return;
        try (PreparedStatement ps=conn.prepareStatement(
                "update facturas set  numero=?,letra=?,id_cliente=?,fecha=? ,medio_pago=?,id_rebaja=?,descuento=?,monto=?,total=? where numero=?"
        )) {
            ps.setInt(1,factura.getNumero());
            ps.setString(2, factura.getLetra().toString());
            ps.setInt(3, factura.getId_cliente());
            ps.setString(4, factura.getFecha());
            ps.setString(5,factura.getMedio_pago().toString());
            ps.setInt(6, factura.getId_rebaja());
            ps.setInt(7, factura.getDescuento());
            ps.setDouble(8, factura.getMonto());
            ps.setDouble(9,factura.getTotal());
            ps.setInt(10,factura.getNumero());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace(); }}
    @Override
    public List<Factura> getAll() {
       List<Factura> lista=new ArrayList();
        try (ResultSet rs=conn.createStatement().executeQuery("select * from facturas")){
            while(rs.next()){
                lista.add(new Factura(
                        rs.getInt("numero"),
                        Letra.valueOf(rs.getString("letra")),
                        rs.getString("fecha"),
                        rs.getInt("Id_cliente"),
                        rs.getDouble("monto"),
                        MediodePago.valueOf(rs.getString("medio_pago")),
                        rs.getInt("Id_rebaja"),
                        rs.getInt("descuento"),
                        rs.getDouble("total")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
    
//@Override
//    public void FacturaNumero(Factura factura){
//    try { // select last_insert_id()  //select MAX(numero)+1 as Numero from facturas
//        ResultSet rs=conn.createStatement().executeQuery("select MAX(numero)+1 as Numero from facturas");
//        while(rs.next()){
//        String resul = rs.getString(1); 
//        Facturas.lblNumero.setText(resul);}
//    } 
//        catch (Exception e) 
//        {JOptionPane.showMessageDialog(null, e);}}

@Override
    public List<Factura> getLikeFecha(String fechaInicio, String fechaFin) {
         List<Factura> listaD=new ArrayList();
        String sql="  select * from facturas where fecha BETWEEN ?  AND ?";
        try {
                PreparedStatement psd=conn.prepareStatement(sql);
                psd.setString(1, fechaInicio);
                psd.setString(2, fechaFin);
                psd.execute();
                ResultSet rs= psd.executeQuery();
                while(rs.next())
                {listaD.add(new Factura(
                       rs.getInt("numero"),
                        Letra.valueOf(rs.getString("letra")),
                        rs.getString("fecha"),
                        rs.getInt("Id_cliente"),
                        rs.getDouble("monto"),
                        MediodePago.valueOf(rs.getString("medio_pago")),
                        rs.getInt("Id_rebaja"),
                        rs.getInt("descuento"),
                        rs.getDouble("total")
                ));

            }
        } catch (Exception e) {
            e.printStackTrace();}
        return listaD;
    }

@Override
    public List<Factura> getAllFecha() {
         List<Factura> lista=new ArrayList();
        try (ResultSet rs=conn.createStatement().executeQuery(" select numero,letra,fecha,Id_cliente,monto,medio_pago,Id_rebaja,descuento,total from facturas" )){
            while(rs.next()){
                lista.add(new Factura(
                        rs.getInt("numero"),
                        Letra.valueOf(rs.getString("letra")),
                        rs.getString("fecha"),
                        rs.getInt("Id_cliente"),
                        rs.getDouble("monto"),
                        MediodePago.valueOf(rs.getString("medio_pago")),
                        rs.getInt("Id_rebaja"),
                        rs.getInt("descuento"),
                        rs.getDouble("total")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista; 
    }


  }  


