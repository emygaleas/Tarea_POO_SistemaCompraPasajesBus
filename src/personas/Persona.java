package personas;

public abstract class Persona {
    protected String nombre, cedula;
    protected int edad;

    //metodo constructor
    public Persona(String nombre, String cedula, int edad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
    }

}
