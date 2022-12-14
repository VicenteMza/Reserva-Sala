package main;

public class Persona {
    private String nombre;
    private String apellido;
    private int dni;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String nomApe(){
        return nombre + " " + apellido;
    }

    public int getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + '}';
    }
    
}
