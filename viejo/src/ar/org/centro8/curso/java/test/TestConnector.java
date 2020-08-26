package ar.org.centro8.curso.java.test;

import ar.org.centro8.curso.java.connectors.Connector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestConnector {
    /* public static void main(String[]args) throws Exception{
        Connection conn=Connector.getConnection();
       String query="insert into clientes (id,nombre,apellido,dni,telefono,email,genero) values (11,'Belen','Silva',4444444,40404040,'belu_silva@gmail.com','f');";
        Statement st=conn.createStatement();
        st.execute(query);
        Connector.getConnection() .createStatement().execute
        ("insert into ropas (id,ropa,talle,color,genero_ropa,estacion,stock,precio)  values (11,'calsa','xl','verde','femenino','primavera_verano',10,1000)");
       
       Connector.getConnection() .createStatement().execute
        ("insert into rebajas (id,promocion,descuento) values(8,'descuento_50',50);");
          
        Connector.getConnection() .createStatement().execute
        ("insert into facturas (letra,numero,id_cliente,fecha,medio_pago,id_rebaja,descuento,monto,total) values ('a',14,11,'2003/12/24','efectivo',8,50,600,300);");

          
        Connector.getConnection() .createStatement().execute
        ("insert into detalles(letra,numero_factura,id_ropa,ropa,precio_ropa,cantidad,monto) values('a',14,11,'calsa',600,2,1200);");
        
      ResultSet rs=Connector.getConnection().createStatement().executeQuery("select * from facturas");
        while(rs.next()){
            System.out.println(
                    rs.getString("letra")+", "+
                    rs.getInt("numero")+", "+
                    rs.getInt("id_cliente")+", "+
                    rs.getString("fecha")+", "+
                    rs.getString("medio_pago")+", "+
                    rs.getInt("id_rebaja")+", "+
                    rs.getInt("descuento")+", "+
                    rs.getInt("monto")+", "+   
                    rs.getInt("total")
            );}
         
   ResultSet rss=Connector.getConnection().createStatement().executeQuery("select * from ropas");
    while(rss.next()){
            System.out.println(
                    rss.getInt("id")+", "+
                    rss.getString("ropa")+", "+
                    rss.getString("talle")+", "+
                    rss.getString("color")+", "+
                    rss.getString("genero_ropa")+", "+
                    rss.getString("estacion")+", "+
                    rss.getInt("stock")+", "+
                    rss.getInt("precio")   );
                            }
       ResultSet rsw=Connector.getConnection().createStatement().executeQuery("  select*from facturas where fecha='2000-05-04'");
        while(rsw.next()){
            System.out.println(
                    rsw.getString("letra")+", "+
                    rsw.getInt("numero")+", "+
                    rsw.getInt("id_cliente")+", "+
                    rsw.getString("fecha")+", "+
                    rsw.getString("medio_pago")+", "+
                    rsw.getInt("id_rebaja")+", "+
                    rsw.getInt("descuento")+", "+
                    rsw.getInt("monto")+", "+   
                    rsw.getInt("total")
            );}
  
   }*/
}
