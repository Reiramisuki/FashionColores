package ar.org.centro8.curso.java.entidades;
public class Detalle {
    private int numero_factura;
    private String letra;
    private int id_ropa;
    private String ropa;
    private double precio_ropa;
    private int cantidad;
    private double monto;

    public Detalle() {
    }

    public Detalle(int id_ropa, String ropa, double precio_ropa, int cantidad, double monto) {
        this.id_ropa = id_ropa;
        this.ropa = ropa;
        this.precio_ropa = precio_ropa;
        this.cantidad = cantidad;
        this.monto = monto;
    }


    public Detalle( int numero_factura,String letra, int id_ropa, String ropa, double precio_ropa, int cantidad, double monto) {
        this.numero_factura = numero_factura;
        this.letra = letra;
        this.id_ropa = id_ropa;
        this.ropa = ropa;
        this.precio_ropa = precio_ropa;
        this.cantidad = cantidad;
        this.monto = monto;
    }

    @Override
    public String toString() {
        return  letra + ", " + numero_factura + ", " + id_ropa + ", " + ropa + ", " + precio_ropa + ", " + cantidad + ", " + monto;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int getNumero_factura() {
        return numero_factura;
    }

    public void setNumero_factura(int numero_factura) {
        this.numero_factura = numero_factura;
    }

    public int getId_ropa() {
        return id_ropa;
    }

    public void setId_ropa(int id_ropa) {
        this.id_ropa = id_ropa;
    }

    public String getRopa() {
        return ropa;
    }

    public void setRopa(String ropa) {
        this.ropa = ropa;
    }

    public double getPrecio_ropa() {
        return precio_ropa;
    }

    public void setPrecio_ropa(double precio_ropa) {
        this.precio_ropa = precio_ropa;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getMonto() {
    return this.monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    
}
