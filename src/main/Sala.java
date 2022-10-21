package main;

public class Sala {
    private int numSala;
    private Turnos turno;
    private String fecha;

    public Sala(int numSala, Turnos turno, String fecha) {
        this.numSala = numSala;
        this.turno = turno;
        this.fecha = fecha;
    }

    public int getNumSala() {
        return numSala;
    }

    public Turnos getTurno() {
        return turno;
    }

    public String getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Sala{" + "sala=" + numSala + ", turno=" + turno + ", fecha=" + fecha + '}';
    }
    
}
