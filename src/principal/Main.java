package principal;


import personas.Pasajero;
import rutas.Ruta;
import servicios.Servicio;
import tickets.Ticket;
import tickets.TicketNormal;
import tickets.TicketVIP;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Ruta> rutas = new ArrayList<>();
    static ArrayList<Servicio> servicios = new ArrayList<>();
    static ArrayList<Ticket> tickets = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        inicializarDatos();

        int opcion;
        do {
            System.out.println("\n=== SISTEMA 'EL BÚHO' ===");
            System.out.println("1. Ver rutas disponibles");
            System.out.println("2. Comprar ticket");
            System.out.println("3. Ver tickets comprados");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt(); sc.nextLine();

            switch (opcion) {
                case 1 -> mostrarRutas();
                case 2 -> comprarTicket(sc);
                case 3 -> mostrarTickets();
                case 4 -> System.out.println("¡Gracias por usar el sistema!");
                default -> System.out.println("Opción inválida");
            }
        } while (opcion != 4);
    }
    static void inicializarDatos(){
        // crear rutas
        rutas.add(new Ruta("Quito","Guayaquil",20.00));
        rutas.add(new Ruta("Quito","Puyo",15.00));
        rutas.add(new Ruta("Quito","Tulcán",17.00));
        rutas.add(new Ruta("Quito","Riobamba",17.50));

        // crear servicios extra
        servicios.add(new Servicio("Televisión", 0.0));
        servicios.add(new Servicio("Internet", 0.0));
        servicios.add(new Servicio("Snacks", 0.0));
        servicios.add(new Servicio("Aire acondicionado", 0.0));

    }

    static void mostrarRutas() {
        System.out.println("\n--- Rutas ---");
        for (int i = 0; i < rutas.size(); i++) {
            System.out.println((i + 1) + ". " + rutas.get(i));
        }
    }

    static void comprarTicket(Scanner sc) {
        System.out.println("\n--- Datos del Pasajero ---");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Cédula: ");
        String cedula = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt(); sc.nextLine();
        System.out.print("Teléfono: ");
        String telefono = sc.nextLine();

        mostrarRutas();
        System.out.print("Seleccione la ruta (1-" + rutas.size() + "): ");
        int rutaIndex = sc.nextInt(); sc.nextLine();
        Ruta ruta = rutas.get(rutaIndex - 1);

        System.out.print("Tipo de asiento (ventana/pasillo): ");
        String tipoAsiento = sc.nextLine();
        System.out.print("Posición del asiento (adelante/final): ");
        String asiento = sc.nextLine();

        System.out.print("¿Maleta adicional? (s/n): ");
        boolean maletaExtra = sc.nextLine().equalsIgnoreCase("s");

        System.out.print("¿Servicio VIP? (s/n): ");
        boolean esVIP = sc.nextLine().equalsIgnoreCase("s");

        Pasajero pasajero = new Pasajero(nombre, cedula, edad, telefono);
        Ticket ticket;

        if (esVIP) {
            System.out.println("Seleccione 2 servicios VIP:");
            Servicio[] seleccionados = new Servicio[2];
            for (int i = 0; i < servicios.size(); i++) {
                System.out.println((i + 1) + ". " + servicios.get(i).getNombre());
            }
            for (int i = 0; i < 2; i++) {
                System.out.print("Servicio #" + (i + 1) + ": ");
                int sIndex = sc.nextInt(); sc.nextLine();
                seleccionados[i] = servicios.get(sIndex - 1);
            }
            ticket = new TicketVIP(pasajero, ruta, tipoAsiento, asiento, maletaExtra, seleccionados);
        } else {
            ticket = new TicketNormal(pasajero, ruta, tipoAsiento, asiento, maletaExtra);
        }

        tickets.add(ticket);
        System.out.println("\nTicket generado con éxito:");
        ticket.mostrarDetalles();
    }

    static void mostrarTickets() {
        if (tickets.isEmpty()) {
            System.out.println("No hay tickets registrados.");
            return;
        }

        System.out.println("\n--- Tickets Comprados ---");
        for (Ticket t : tickets) {
            t.mostrarDetalles();
            System.out.println("------------------------");
        }
    }

}