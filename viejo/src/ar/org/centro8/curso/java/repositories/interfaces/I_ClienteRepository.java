package ar.org.centro8.curso.java.repositories.interfaces;

import ar.org.centro8.curso.java.entidades.Cliente;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface I_ClienteRepository {
    void save   (Cliente cliente);
    void remove (Cliente cliente);
    void update (Cliente cliente);
    List<Cliente> getAll();
    
default Stream<Cliente> getStream(){
        return getAll().stream();
    }
default Cliente getById(int id){
        return getStream().filter(a->a.getId()==id).findAny().orElse(new Cliente());
    }
default List<Cliente> getLikeApellido(String apellido){
        if(apellido==null) return new ArrayList<Cliente>();
        return getStream()
                .filter(a->a.getApellido().toLowerCase().contains(apellido.toLowerCase()))
                .collect(Collectors.toList());
    }
default List<Cliente> getLikeNombre(String nombre){
        if(nombre==null) return new ArrayList<Cliente>();
        return getStream()
                .filter(a->a.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .collect(Collectors.toList());
    }
default List<Cliente> getLikeDni(int dni){
        if(dni==0) return new ArrayList<Cliente>();
        return getStream()
                .filter(a->a.getDni()==dni)
                .collect(Collectors.toList());
    }    
default List<Cliente> getLikeId(int Id){
        if(Id==0) return new ArrayList<Cliente>();
        return getStream()
                .filter(a->a.getId()==Id)
                .collect(Collectors.toList());
    } 
}
