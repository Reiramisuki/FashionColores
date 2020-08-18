package ar.org.centro8.curso.java.entidades;

import ar.org.centro8.curso.java.enums.Promocion;

public class Rebaja {
    private int id;
    private String descripcion;
    private Promocion promocion;
    private int descuento;

    public Rebaja() {
    }

    public Rebaja(String descripcion,Promocion promocion, int descuento) {
        this.descripcion =descripcion;
        this.promocion = promocion;
        this.descuento = descuento;
    }

    public Rebaja(int id,String descripcion,Promocion promocion, int descuento) {
        this.id = id;
        this.descripcion =descripcion;
        this.promocion = promocion;
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return id + "," +descripcion+","+ promocion + "," + descuento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Promocion getPromocion() {
        return promocion;
    }

    public void setPromocion(Promocion promocion) {
        this.promocion = promocion;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    
}
