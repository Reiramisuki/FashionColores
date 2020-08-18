package ar.org.centro8.curso.java.repositories.jdbc;

import ar.org.centro8.curso.java.entidades.Detalle;
import ar.org.centro8.curso.java.repositories.interfaces.I_DetalleRepository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DetalleRepository  implements I_DetalleRepository{
 private Connection conn;
 PreparedStatement ps;
 ResultSet rs;
 Connection con;

    public DetalleRepository(Connection conn) {
        this.conn = conn;
    }
    @Override
    public void save(Detalle detalle) {
        if(detalle==null) return;
        try (PreparedStatement ps=conn.prepareStatement(
                "insert into detalles (numero_factura,letra,id_ropa,ropa,precio_ropa,cantidad,monto) values (?,?,?,?,?,?,?)",
                PreparedStatement.RETURN_GENERATED_KEYS
        )) {
            ps.setInt(1, detalle.getNumero_factura());
            ps.setString(2, detalle.getLetra());
            ps.setInt(3, detalle.getId_ropa());
            ps.setString(4, detalle.getRopa());
            ps.setDouble(5, detalle.getPrecio_ropa());
            ps.setInt(6, detalle.getCantidad());
            ps.setDouble(7, detalle.getMonto());
            ps.execute();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()) detalle.setNumero_factura(rs.getInt(1));
        } catch (Exception e) {
            e.printStackTrace();
        }   }

    @Override
    public void remove(Detalle detalle) {
      if(detalle==null) return;
        try (PreparedStatement ps=conn.prepareStatement("delete from detalles where numero_factura=?")){
            ps.setInt(1, detalle.getNumero_factura());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace(); }}

    @Override
    public void update(Detalle detalle) {
     if(detalle==null) return;
        try (PreparedStatement ps=conn.prepareStatement(
                "update detalles set letra=?,numero_factura=?,id_ropa=?,ropa=?,precio_ropa=?,cantidad=?,monto=? where numero_factura=?",
                PreparedStatement.RETURN_GENERATED_KEYS
        )) {
            ps.setString(1, detalle.getLetra());
            ps.setInt(2, detalle.getNumero_factura());
            ps.setInt(3, detalle.getId_ropa());
            ps.setString(4, detalle.getRopa());
            ps.setDouble(5, detalle.getPrecio_ropa());
            ps.setInt(6, detalle.getCantidad());
            ps.setDouble(7, detalle.getMonto());
            ps.setInt(8, detalle.getNumero_factura());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }  }

    @Override
    public List<Detalle> getAll() {
    List<Detalle> lista=new ArrayList();
        try (ResultSet rs=conn.createStatement().executeQuery("select * from detalles numero_factura <> 11")){
            while(rs.next()){
                lista.add(new Detalle(
                        rs.getInt("numero_factura"),
                        rs.getString("letra"),
                        rs.getInt("id_ropa"),
                        rs.getString("ropa"),
                        rs.getDouble("precio_ropa"),
                        rs.getInt("cantidad"),
                        rs.getDouble("monto")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista; }
      @Override
    public List<Detalle> getLikeNumeroCero() {
    List<Detalle> lista=new ArrayList();
        try (ResultSet rs=conn.createStatement().executeQuery("select * from detalles where numero_factura=11")){
            while(rs.next()){
                lista.add(new Detalle(
                        rs.getInt("numero_factura"),
                        rs.getString("letra"),
                        rs.getInt("id_ropa"),
                        rs.getString("ropa"),
                        rs.getDouble("precio_ropa"),
                        rs.getInt("cantidad"),
                        rs.getDouble("monto")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista; }

//    public List<Detalle> getbyNumeroFactura(int numerofactura) {
//    List<Detalle> lista=new ArrayList();
//        try (ResultSet rs=conn.createStatement().executeQuery("select id_ropa,ropa,precio_ropa,cantidad,monto from detalles where numero_factura=?")){
//            while(rs.next()){
//                lista.add(new Detalle(
//                        rs.getInt("id_ropa"),
//                        rs.getString("ropa"),
//                        rs.getDouble("precio_ropa"),
//                        rs.getInt("cantidad"),
//                        rs.getDouble("monto")
//                ));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();} return lista;
//}
 @Override
    public List<Detalle> getLikeNumero(int numerofactura) {
        List<Detalle> listaD=new ArrayList();
        String sql="select * from detalles where numero_factura=?;";
        try {
                PreparedStatement psd=conn.prepareStatement(sql);
                psd.setInt(1, numerofactura);
                psd.execute();
                ResultSet rs= psd.executeQuery();
                while(rs.next())
                {listaD.add(new Detalle(
                        rs.getInt("numero_factura"),
                        rs.getString("letra"),
                        rs.getInt("id_ropa"),
                        rs.getString("ropa"),
                        rs.getDouble("precio_ropa"),
                        rs.getInt("cantidad"),
                        rs.getDouble("monto")
                ));
                    
            }
        } catch (Exception e) {
            e.printStackTrace();}
        return listaD; }
    

//public  List<Detalle> GetListado(int NumFac){
//    List<Detalle> listaD=new ArrayList();
//    try (PreparedStatement psD=conn.prepareStatement("select *From detalles where numero_factura=?");)
//         {  psD.setInt(1, NumFac);
//            psD.execute();
//            ResultSet rs = psD.executeQuery();
//            while(rs.next()){
//            listaD.add(new Detalle(
//            rs.getInt("numero_factura"),
//            rs.getString("letra"),        
//            rs.getInt("id_ropa"),
//            rs.getString("ropa"),
//            rs.getDouble("precio_ropa"),
//            rs.getInt("cantidad"),
//            rs.getDouble("monto")
//            ));
//            }
//    } catch (Exception e) {
//    }
//     return listaD;
//}


}

