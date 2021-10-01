package mx.utel.poo.misvac.pasajeros;

public class Pasajero {

    private String nombre;
    private String apellidos;
    private int edad;

    public Pasajero(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "\tPasajero: %s/%s %d año(s)\n".formatted(apellidos, nombre, edad);
    }
}
