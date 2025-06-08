package Tickets;
import personas.Pasajero;
import rutas.Ruta;

public abstract class Ticket {
    protected Pasajero pasajero;
    protected Ruta ruta;
    protected String tipoAsiento; // ventana, pasillo, etc.

    //metodo constructor
    public Ticket(Pasajero pasajero, Ruta ruta, String tipoAsiento) {
        this.pasajero = pasajero;
        this.ruta = ruta;
        this.tipoAsiento = tipoAsiento;
    }

    //metodo
    public abstract double calcularCosto();

    public abstract void mostrarDetalles();
}
