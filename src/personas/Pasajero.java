package personas;

public class Pasajero extends Persona{
    //atributos propios
    private String telefono;

    //metodo constructor
    public Pasajero(String nombre, String cedula, int edad, String telefono) {
        super(nombre, cedula, edad);
        this.telefono = telefono;
    }

}
