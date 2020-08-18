package ar.org.centro8.curso.java.repositories.interfaces;

import ar.org.centro8.curso.java.entidades.DetalledeCompra;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface I_DetallesdecompradeFacturaRepository {
    List<DetalledeCompra> getAll();
    default Stream<DetalledeCompra> getStream(){
        return getAll().stream();}
    
    default List<DetalledeCompra> getLikeNumeroDetalle(int numero){
    if(numero==11) return new ArrayList<DetalledeCompra>();
    return getStream()
                .filter(a->a.getNumero_factura()==numero)
                .collect(Collectors.toList());
}

}
