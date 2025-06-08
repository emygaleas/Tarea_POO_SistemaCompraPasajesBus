package Tickets;


import personas.Pasajero;
import rutas.Ruta;
import servicios.Servicio;

public class TicketVIP extends TicketNormal {
    private Servicio[] serviciosExtra; // Ej: ["TV", "WiFi"]

    public TicketVIP(Pasajero pasajero, Ruta ruta, String tipoAsiento, String asiento, boolean maletaAdicional, Servicio[] serviciosExtra) {
        super(pasajero, ruta, tipoAsiento, asiento, maletaAdicional);
        this.serviciosExtra = serviciosExtra;
    }

    @Override
    public double calcularCosto() {
        return super.calcularCosto() * 1.30;
    }
}