package ar.org.centro8.curso.java.repositories.jdbc;

import ar.org.centro8.curso.java.entidades.Cliente;
import ar.org.centro8.curso.java.enums.Genero;
import ar.org.centro8.curso.java.repositories.interfaces.I_ClienteRepository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClienteRepository implements I_ClienteRepository {
    private Connection conn;

    public ClienteRepository(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void save(Cliente cliente) {
     if(cliente==null) return;
        try (PreparedStatement ps=conn.prepareStatement(
                "insert into clientes (nombre,apellido,dni,telefono,email,genero) values (?,?,?,?,?,?)",
                PreparedStatement.RETURN_GENERATED_KEYS
        )) {
            ps.setString(1,cliente.getNombre());
            ps.setString(2,cliente.getApellido());
            ps.setInt(3,cliente.getDni());
            ps.setInt(4,cliente.getTelefono());
            ps.setString(5,cliente.getEmail());
            ps.setString(6,cliente.getGenero().toString());
            ps.execute();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()) cliente.setId(rs.getInt(1));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }   }

    @Override
    public void remove(Cliente cliente) {
    if(cliente==null) return;
        try (PreparedStatement ps=conn.prepareStatement("delete from clientes where id=?")){
            ps.setInt(1, cliente.getId());
            ps.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } }

    @Override
    public void update(Cliente cliente) {
   if(cliente==null) return;
      try (PreparedStatement ps=conn.prepareStatement("update clientes set id=?, nombre=?, apellido=?, dni=?, telefono=?,email=?, genero=? where id=?")) {
            ps.setInt(1,cliente.getId());  
            ps.setString(2,cliente.getNombre());
            ps.setString(3,cliente.getApellido());
            ps.setInt(4,cliente.getDni());
            ps.setInt(5,cliente.getTelefono());
            ps.setString(6,cliente.getEmail());
            ps.setString(7,cliente.getGenero().toString());
            ps.setInt(8,cliente.getId());
            ps.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } }

    @Override
    public List<Cliente> getAll() {
       List<Cliente> lista=new ArrayList();
        try (ResultSet rs=conn.createStatement().executeQuery("select * from clientes where id<>1")){
            while(rs.next()){
                lista.add(new Cliente(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getInt("dni"),
                        rs.getInt("telefono"),
                        rs.getString("email"),
                        Genero.valueOf(rs.getString("genero"))
                ));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lista; }

//    public void getCliente(String id) {
//        try (ResultSet rs=conn.createStatement().executeQuery("select * from clientes where id=?")) {
//            if(rs.next()){
//            id = new Cliente(
//                   rs.getInt("id"),
//                        rs.getString("nombre"),
//                        rs.getString("apellido"),
//                        rs.getInt("dni"),
//                        rs.getInt("telefono"),
//                        rs.getString("email")
//            
//            );
//            }
//        } catch (Exception e) {
//        }
//        return id; 
//    }
}
