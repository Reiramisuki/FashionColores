 package ar.org.centro8.curso.java.entidades;

import ar.org.centro8.curso.java.enums.Letra;
import ar.org.centro8.curso.java.enums.MediodePago;

public class Factura {
    private int numero;
    private Letra letra=Letra.a;
    private String fecha;
    private int id_cliente=1;
    private double monto;
    private MediodePago medio_pago=MediodePago.indefinido;
    private int id_rebaja = 6; //ninguna rebaja hay q saleccionar
    private int descuento;
    private double total;

    public Factura() {}
    

    public Factura( int numero,Letra letra, String fecha, int id_cliente, double monto, MediodePago medio_pago, int id_rebaja, int descuento, double total) {
        this.numero = numero;
        this.letra = letra;
        this.fecha = fecha;
        this.id_cliente = id_cliente;
        this.monto = monto;
        this.medio_pago = medio_pago;
        this.id_rebaja = id_rebaja;
        this.descuento = descuento;
        this.total = total;
    }

    @Override
    public String toString() {
        return  numero + ", "+letra + ", "+ fecha + ", " + id_cliente + ", " + monto + ", " + medio_pago + ", " + id_rebaja + ", " + descuento + ", " + total ;
    }
  
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
 public Letra getLetra() {
        return letra;
    }

    public void setLetra(Letra letra) {
        this.letra = letra;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public MediodePago getMedio_pago() {
        return medio_pago;
    }

    public void setMedio_pago(MediodePago medio_pago) {
        this.medio_pago = medio_pago;
    }

    public int getId_rebaja() {
        return id_rebaja;
    }

    public void setId_rebaja(int id_rebaja) {
        this.id_rebaja = id_rebaja;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public double getTotal() {
     //this.total= this.monto-((this.monto*this.descuento)/100);
     return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
}
