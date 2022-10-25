package main;

import java.time.LocalDate;

public class Ticket {
   
    private String nomApe;
    private int dni;
    private int numSala;
    private LocalDate fecha;
    private Turnos turno;

    public Ticket(String nomApe, int dni, int numSala, LocalDate fecha, Turnos turno) {
       
        this.nomApe = nomApe;
        this.dni= dni;
        this.numSala = numSala;
        this.fecha= fecha;
        this.turno= turno;
    }

     @Override
    public String toString() {
        return "Ticket Creado:\n" + 
                "Nombre Completo= " + nomApe + 
                "\nDni= " + dni + 
                "\nNumSala= " + numSala + 
                "\nFecha= " + fecha + 
                "\nTurno= " + turno;
    } 
}
