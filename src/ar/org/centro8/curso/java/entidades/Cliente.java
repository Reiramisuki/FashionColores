package ar.org.centro8.curso.java.entidades;

import ar.org.centro8.curso.java.enums.Genero;

public class Cliente {
    private int id;
    private String nombre;
    private String apellido;
    private int dni;
    private int telefono;
    private String email;
    private Genero genero;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, int dni, int telefono, String email, Genero genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
        this.genero = genero;
    }

    public Cliente(int id, String nombre, String apellido, int dni, int telefono, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
    }

    public Cliente(int id, String nombre, String apellido, int dni, int telefono, String email, Genero genero) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return id + ", " + nombre + ", " + apellido + ", " + dni + ", " + telefono + "," + email + ", " + genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
    
}
