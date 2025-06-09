package tickets;


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

    @Override
    public void mostrarDetalles() {
        System.out.println("----- TICKET VIP ------");
        System.out.println("Pasajero: " + pasajero);
        System.out.println("Ruta: " + ruta);
        System.out.println("Asiento: " + asiento + " (" + tipoAsiento + ")");
        System.out.println("Maleta extra: " + (maletaAdicional ? "Sí" : "No"));
        System.out.println("Servicios VIP incluidos:");
        for (Servicio s : serviciosExtra) {
            System.out.println(" - " + s.getNombre());
        }
        System.out.println("Total VIP: $" + calcularCosto());
    }
}