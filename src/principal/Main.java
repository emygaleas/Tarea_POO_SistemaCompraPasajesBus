package principal;


import rutas.Ruta;
import servicios.Servicio;

import java.util.ArrayList;

public class Main {
    static ArrayList<Ruta> rutas = new ArrayList<>();
    static ArrayList<Servicio> servicios = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("hola");
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

}