package ar.org.centro8.curso.java.repositories.jdbc;

import ar.org.centro8.curso.java.entidades.Detalle;
import ar.org.centro8.curso.java.entidades.DetalledeCompra;
import ar.org.centro8.curso.java.repositories.interfaces.I_DetallesdecompradeFacturaRepository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DetallesdecompradeFacturaRepository implements I_DetallesdecompradeFacturaRepository{
 private Connection conn;
 PreparedStatement ps;
 ResultSet rs;
 Connection con;

    public DetallesdecompradeFacturaRepository(Connection conn) {
        this.conn = conn;
    }
    @Override
    public List<DetalledeCompra> getAll() {
        List<DetalledeCompra> lista=new ArrayList();
        try (ResultSet rs=conn.createStatement().executeQuery("select * from detalles")){
            while(rs.next()){
                lista.add(new DetalledeCompra(
                        rs.getInt("numero_factura"),
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
        return lista; 
    }
   public List<DetalledeCompra> getLikeNumeroDetalles(int numerofactura) {
        List<DetalledeCompra> listaD=new ArrayList();
        String sql="select id_ropa,ropa,precio_ropa,cantidad,monto from detalles where numero_factura=?;";
        try {
                PreparedStatement psd=conn.prepareStatement(sql);
                psd.setInt(1, numerofactura);
                psd.execute();
                ResultSet rs= psd.executeQuery();
                while(rs.next())
                {listaD.add(new DetalledeCompra(
                        rs.getInt("numero_factura"),
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
    
}
