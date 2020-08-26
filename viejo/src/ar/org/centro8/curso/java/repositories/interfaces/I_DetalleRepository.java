package ar.org.centro8.curso.java.repositories.interfaces;

import ar.org.centro8.curso.java.entidades.Detalle;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface I_DetalleRepository {
    void save   (Detalle detalles);
    void remove (Detalle detalles);
    void update (Detalle detalles);
     List<Detalle> getAll();
  List<Detalle> getLikeNumeroCero();
    
default Stream<Detalle> getStream(){
        return getAll().stream();}

default List<Detalle> getLikeNumero(int numero){
    if(numero==11) return new ArrayList<Detalle>();
    return getStream()
                .filter(a->a.getNumero_factura()==numero)
                .collect(Collectors.toList());
}
default Detalle getByNumero(int numero){
return getStream().filter(a->a.getNumero_factura()==numero)
        .findAny().orElse(new Detalle());
}

default List<Detalle> getByLetra(String letra){
        if(letra==null) return new ArrayList<Detalle>();
        return getStream()
                .filter(a->a.getLetra().toLowerCase().contains(letra.toLowerCase()))
                .collect(Collectors.toList());
    } 

//    public List<Detalle> detaNumero(Detalle detalle);
}
