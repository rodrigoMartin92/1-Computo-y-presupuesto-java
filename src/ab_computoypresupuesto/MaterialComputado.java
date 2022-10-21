package ab_computoypresupuesto;

public class MaterialComputado {

    private int numeroMaterial;
    private String nombreMaterial;
    private double cantidad, precio, computoParcial;

    public MaterialComputado() {
    }

    public MaterialComputado(int numeroMaterial, String nombreMaterial, double cantidad, double precio) {
        this.numeroMaterial = numeroMaterial;
        this.nombreMaterial = nombreMaterial;
        this.cantidad = cantidad;
        this.precio = precio;
        this.computoParcial = computoParcial;
    }

    public int getNumeroMaterial() {
        return numeroMaterial;
    }

    public void setNumeroMaterial(int numeroMaterial) {
        this.numeroMaterial = numeroMaterial;
    }

    public String getNombreMaterial() {
        return nombreMaterial;
    }

    public void setNombreMaterial(String nombreMaterial) {
        this.nombreMaterial = nombreMaterial;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getComputoParcial() {
        return computoParcial;
    }

    public void setComputoParcial(double computoParcial) {
        this.computoParcial = computoParcial;
    }

    @Override
    public String toString() {
        return "MaterialComputado{" + "numeroMaterial=" + numeroMaterial + ", nombreMaterial=" + nombreMaterial + ", cantidad=" + cantidad + ", precio=" + precio + ", computoParcial=" + computoParcial + '}';
    }

}
