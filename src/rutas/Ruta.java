package rutas;

public class Ruta {
    private String origen;
    private String destino;
    private double precioBase;

    public Ruta(String origen, String destino, double precioBase) {
        this.origen = origen;
        this.destino = destino;
        this.precioBase = precioBase;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    @Override
    public String toString() {
        return origen + " - " + destino + " ($" + precioBase + ")";
    }
}
