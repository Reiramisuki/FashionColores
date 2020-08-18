package ar.org.centro8.curso.java.repositories.interfaces;

import ar.org.centro8.curso.java.entidades.Rebaja;
import ar.org.centro8.curso.java.enums.Promocion;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface I_RebajaRepository {
    void save   (Rebaja rebaja);
    void remove (Rebaja rebaja);
    void update (Rebaja rebaja);
    List<Rebaja> getAll();
     
default Stream<Rebaja> getStream(){
        return getAll().stream();}

default Rebaja getById(int id){
        return getStream().filter(a->a.getId()==id).findAny().orElse(new Rebaja());
    }

default List<Rebaja> getLikeDescuento(int descuento){
    if(descuento==0) return new ArrayList<Rebaja>();
    return getStream()
                .filter(a->a.getDescuento()==descuento)
                .collect(Collectors.toList());
}
default List<Rebaja> getLikeId(int id){
        if(id==0) return new ArrayList<Rebaja>();
        return getStream()
                .filter(a->a.getId()==id)
                .collect(Collectors.toList());
    }
default List<Rebaja> getLikeDescripcion(String descripcion){
        if( descripcion==null) return new ArrayList<Rebaja>();
        return getStream()
                .filter(a->a.getDescripcion().toLowerCase().contains( descripcion.toLowerCase()))
                .collect(Collectors.toList());
}
}