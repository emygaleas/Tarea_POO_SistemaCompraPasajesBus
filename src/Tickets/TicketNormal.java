package Tickets;

import personas.Pasajero;
import rutas.Ruta;

public class TicketNormal extends Ticket {
    //atributos propios
    protected String asiento;
    protected boolean maletaAdicional;

    //metodo constructor
    public TicketNormal(Pasajero pasajero, Ruta ruta, String tipoAsiento, String asiento, boolean maletaAdicional) {
        super(pasajero, ruta, tipoAsiento);
        this.asiento = asiento;
        this.maletaAdicional = maletaAdicional;
    }

    //metodo
    @Override
    public double calcularCosto() {
        return ruta.getPrecioBase() + (maletaAdicional ? 5.00 : 0.00);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("----- TICKET ------");
        System.out.println("Tipo: Normal");
        System.out.println("Pasajero: " + pasajero);
        System.out.println("Ruta: " + ruta);
        System.out.println("Asiento: " + asiento);
        System.out.println("Maleta extra: " + (maletaAdicional ? "Sí" : "No"));
        System.out.println("Total: $" + calcularCosto());
    }
}
