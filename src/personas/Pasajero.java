package personas;

public class Pasajero extends Persona{
    //atributos propios
    private String telefono;

    //metodo constructor
    public Pasajero(String nombre, String cedula, int edad, String telefono) {
        super(nombre, cedula, edad);
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return nombre + " | Cédula: " + cedula + " | Edad: " + edad + " | Teléfono: " + telefono;
    }

}
