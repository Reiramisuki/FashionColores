package ar.org.centro8.curso.java.entidades;

public class DetalledeCompra {
    private int numero_factura;
    private int id_ropa;
    private String ropa;
    private double precio_ropa;
    private int cantidad;
    private double monto;

    public DetalledeCompra() {
    }

    public DetalledeCompra(int numero_factura, int id_ropa, String ropa, double precio_ropa, int cantidad, double monto) {
        this.numero_factura = numero_factura;
        this.id_ropa = id_ropa;
        this.ropa = ropa;
        this.precio_ropa = precio_ropa;
        this.cantidad = cantidad;
        this.monto = monto;
    }

    @Override
    public String toString() {
        return  numero_factura + "," + id_ropa + "," + ropa + "," + precio_ropa + "," + cantidad + "," + monto;
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
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    
   
}
