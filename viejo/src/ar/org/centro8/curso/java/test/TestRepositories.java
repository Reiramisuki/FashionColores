package ar.org.centro8.curso.java.test;

import ar.org.centro8.curso.java.connectors.Connector;
import ar.org.centro8.curso.java.entidades.Cliente;
import ar.org.centro8.curso.java.entidades.Detalle;
import ar.org.centro8.curso.java.entidades.Factura;
import ar.org.centro8.curso.java.entidades.Rebaja;
import ar.org.centro8.curso.java.entidades.Ropa;
import ar.org.centro8.curso.java.enums.Color;
import ar.org.centro8.curso.java.enums.Estacion;
import ar.org.centro8.curso.java.enums.GeneroRopa;
import ar.org.centro8.curso.java.enums.Promocion;
import ar.org.centro8.curso.java.enums.Talle;
import ar.org.centro8.curso.java.repositories.interfaces.I_ClienteRepository;
import ar.org.centro8.curso.java.repositories.interfaces.I_DetalleRepository;
import ar.org.centro8.curso.java.repositories.interfaces.I_FacturaRepository;
import ar.org.centro8.curso.java.repositories.interfaces.I_RebajaRepository;
import ar.org.centro8.curso.java.repositories.interfaces.I_RopaRepository;
import ar.org.centro8.curso.java.repositories.jdbc.ClienteRepository;
import ar.org.centro8.curso.java.repositories.jdbc.DetalleRepository;
import ar.org.centro8.curso.java.repositories.jdbc.FacturaRepository;
import ar.org.centro8.curso.java.repositories.jdbc.RebajaRepository;
import ar.org.centro8.curso.java.repositories.jdbc.RopaRepository;
import java.util.List;

public class TestRepositories {
    public static void main(String[] args) {  
     I_ClienteRepository c=new ClienteRepository(Connector.getConnection());
        List<Cliente> l =c.getLikeDni(30001546);
        System.out.print(l);
       
  System.out.println("....1....");
        I_ClienteRepository cl=new ClienteRepository(Connector.getConnection());
        List<Cliente> f =cl.getLikeApellido("Martinez");
        System.out.println(f);
        
System.out.println("....2....");
        I_ClienteRepository cr=new ClienteRepository(Connector.getConnection());
        List<Cliente> n =cr.getAll();
        System.out.println(n);
      
System.out.println("....Factura....");
        I_FacturaRepository fr=new FacturaRepository(Connector.getConnection());
        List<Factura> j=fr.getAll();
        System.out.println(j);
        
System.out.println("...Id_cliente.....");   
        I_FacturaRepository frr=new FacturaRepository(Connector.getConnection());
        List<Factura> t=frr.getLikeId_cliente(4);
        System.out.println(t);

System.out.println("....Id_rebaja...."); 
        I_RebajaRepository o=new RebajaRepository(Connector.getConnection());
        List<Rebaja>fat=o.getLikeId(2);
        System.out.println(fat);
        
System.out.println("....Detalle...."); 
      I_DetalleRepository crw=new DetalleRepository(Connector.getConnection());
      List<Detalle> nw =crw.getAll();
      System.out.println(nw);
      
System.out.println("........"); 
      I_RebajaRepository w=new RebajaRepository(Connector.getConnection());
      List<Rebaja> nwy =w.getAll();
      System.out.println(nwy);
      
System.out.println("....lita ropas...."); 
      I_RopaRepository x=new RopaRepository(Connector.getConnection());
      List<Ropa> xx =x.getAll();
      System.out.println(xx);
    
System.out.println("....Camisa...."); 
      I_RopaRepository qtq=new RopaRepository(Connector.getConnection());
      List<Ropa> hqt =qtq.getLikeRopaD("camisa");
        System.out.println(hqt);
        
System.out.println("...UPDATe....."); 
        I_RopaRepository ve=new RopaRepository(Connector.getConnection());
        Ropa ropa=new Ropa(10,"campera",Talle.l,Color.amarillo,GeneroRopa.unisex,Estacion.primavera_verano,4,4500);
        ve.update(ropa);
        System.out.println(ropa);
        
System.out.println("....2da...."); 
      I_RebajaRepository ty=new RebajaRepository(Connector.getConnection());
      Rebaja rebaja=new Rebaja(6,"nada",Promocion.ninguna,20);
      ty.update(rebaja);
      System.out.println(rebaja);
 }
}
