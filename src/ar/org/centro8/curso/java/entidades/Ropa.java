package ar.org.centro8.curso.java.entidades;

import ar.org.centro8.curso.java.enums.Color;
import ar.org.centro8.curso.java.enums.Estacion;
import ar.org.centro8.curso.java.enums.GeneroRopa;
import ar.org.centro8.curso.java.enums.Talle;

public class Ropa {
    private int id;
    private String ropa_d;
    private Talle talle;
    private Color color;
    private GeneroRopa genero_ropa;
    private Estacion estacion;
    private int stock;
    private double precio;

    public Ropa() {
    }

    public Ropa(String ropa_d, Talle talle, Color color, GeneroRopa genero_ropa, Estacion estacion, int stock, int precio) {
        this.ropa_d = ropa_d;
        this.talle = talle;
        this.color = color;
        this.genero_ropa = genero_ropa;
        this.estacion = estacion;
        this.stock = stock;
        this.precio = precio;
    }

    public Ropa(int id, String ropa_d, Talle talle, Color color, GeneroRopa genero_ropa, Estacion estacion, int stock, double precio) {
        this.id = id;
        this.ropa_d = ropa_d;
        this.talle = talle;
        this.color = color;
        this.genero_ropa = genero_ropa;
        this.estacion = estacion;
        this.stock = stock;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return id + ", " + ropa_d + ", " + talle + ", " + color + "," + genero_ropa + ", " + estacion + ", " + stock + ", " + precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRopa_d() {
        return ropa_d;
    }

    public void setRopa_d(String ropa_d) {
        this.ropa_d = ropa_d;
    }

    public Talle getTalle() {
        return talle;
    }

    public void setTalle(Talle talle) {
        this.talle = talle;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public GeneroRopa getGenero_ropa() {
        return genero_ropa;
    }

    public void setGenero_ropa(GeneroRopa genero_ropa) {
        this.genero_ropa = genero_ropa;
    }
    public Estacion getEstacion() {
        return estacion;
    }

    public void setEstacion(Estacion estacion) {
        this.estacion = estacion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}
