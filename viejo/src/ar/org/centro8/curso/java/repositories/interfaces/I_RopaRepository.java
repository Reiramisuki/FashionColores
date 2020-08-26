package ar.org.centro8.curso.java.repositories.interfaces;

import ar.org.centro8.curso.java.entidades.Ropa;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface I_RopaRepository {
    void save   (Ropa ropa);
    void remove (Ropa ropa);
    void update (Ropa ropa);
    List<Ropa> getAll();
//     List<Ropa> getLikeRopa(String ropa_d,int stock, String estacion,String talle, String Genero_ropa);
    
default Stream<Ropa> getStream(){
    return getAll().stream();}

default Ropa getById(int id){
        return getStream().filter(a->a.getId()==id).findAny().orElse(new Ropa());
    }         
default List<Ropa> getLikeId(int id){
    if(id==0) return new ArrayList<Ropa>();
    return getStream()
                .filter(a->a.getId()==id)
                .collect(Collectors.toList());
}
default List<Ropa> getLikeRopaD(String ropa_d){
        if(ropa_d==null) return new ArrayList<Ropa>();
        return getStream()
                .filter(a->a.getRopa_d().toLowerCase().contains(ropa_d.toLowerCase()))
                .collect(Collectors.toList());
}    
 default List<Ropa> getLikeRopaGENERO(String Genero_ropa){
     if (Genero_ropa==null) return new ArrayList<Ropa>();
     return getStream()
             .filter(a->a.getGenero_ropa().toString().contains(Genero_ropa.toLowerCase()))
             .collect(Collectors.toList());
 }

 default List<Ropa> getLikeESTACION(String estacion){
     if (estacion==null) return new ArrayList<Ropa>();
     return getStream()
             .filter(a->a.getEstacion().toString().contains(estacion.toLowerCase()))
             .collect(Collectors.toList());
 }
  default List<Ropa> getLiketalle(String talle){
     if (talle==null) return new ArrayList<Ropa>();
     return getStream()
             .filter(a->a.getTalle().toString().contains(talle.toLowerCase()))
             .collect(Collectors.toList());
 }
 
 
 default List<Ropa> getLikeStock(int stock){
    if(stock==0) return new ArrayList<Ropa>();
    return getStream()
                .filter(a->a.getStock()==stock)
                .collect(Collectors.toList());
} 


}
