package main;

public class Ticket {
   
    private String nomApe;
    private int dni;
    private int numSala;
    private String fecha;
    private Turnos turno;

    public Ticket(String nomApe, int dni, int numSala, String fecha, Turnos turno) {
       
        this.nomApe = nomApe;
        this.dni= dni;
        this.numSala = numSala;
        this.fecha= fecha;
        this.turno= turno;
    }

     @Override
    public String toString() {
        return "Ticket{" + " NombreCompleto= " + nomApe + ", dni= " + dni + ", numSala= " 
                + numSala + ", fecha= " + fecha + ", turno= " + turno + '}';
    } 
}
