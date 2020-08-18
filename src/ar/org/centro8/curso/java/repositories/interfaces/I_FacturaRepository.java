package ar.org.centro8.curso.java.repositories.interfaces;

import ar.org.centro8.curso.java.entidades.Cliente;
import ar.org.centro8.curso.java.entidades.Factura;
import ar.org.centro8.curso.java.gui.Facturas;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface I_FacturaRepository  {
//    void Fvacio   (Factura factura);
    void save   (Factura factura);
    void remove (Factura factura);
    void update (Factura factura);
    List<Factura> getLikeFecha(String fechaInicio, String fechaFin);
    List<Factura> getAll(); 
    List<Factura> getAllFecha();
//    List<Factura>getCero();
   
default Stream<Factura> getStream(){
    return getAll().stream();
    }

default Factura getByNumero(int numero){
    return getStream()
            .filter(a->a.getNumero()==numero)
            .findAny().orElse(new Factura());
    }
default List<Factura> getLikeId_cliente(int id_cliente){
    if(id_cliente==0) return new ArrayList<Factura>();
    return getStream()
                .filter(a->a.getId_cliente()==id_cliente)
                .collect(Collectors.toList());
    }
default List<Factura> getNumero(int numero){
    if(numero==0) return new ArrayList<Factura>();
    return getStream()
                .filter(a->a.getId_cliente()==numero)
                .collect(Collectors.toList());
    }
default List<Factura>getbyCliente(Cliente cliente){
    if (cliente==null) return new ArrayList<Factura>();
    return getStream()
            .filter(a->a.getId_cliente()==cliente.getId())
            .collect(Collectors.toList());
}
//default List<Factura> getLikeFecha(String fechaInicio, String fechaFin){
//    if(fechaInicio==null,fechaFin==null) return new ArrayList<Factura>();
//    return getStream()
//                .filter(a->a.getFecha().toLowerCase().contains((fechaInicio, fechaFin)))
//                .collect(Collectors.toList());
//}


}
