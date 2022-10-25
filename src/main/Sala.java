package main;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Sala {

    private int numSala;
    private Turnos turno;
    private LocalDate fecha;

    public Sala() {
    }

    public Sala(int numSala, Turnos turno, LocalDate fecha) {
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

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalDate validarFecha() {
        boolean formValido = true;
        LocalDate testDate = null;
        Scanner in = new Scanner(System.in);
        String fecha="";
        LocalDate fecha1 = LocalDate.of(2000, 01, 01);

        while (formValido) {
            System.out.println("Indique la fecha con formato yyyy-mm-dd");
            fecha = in.next();

            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

                fecha1 = LocalDate.parse(fecha, formatter);
                System.out.println(fecha1);

            } catch (DateTimeException e) {
                System.out.println("-----------------------------");
                System.out.println("Formato de fecha incorrecto");
                System.out.println("------------------------------");
                if (formValido) {
                    
                }
                formValido = true;
            }

            if (fecha1.isAfter(LocalDate.now()) || fecha1.equals(LocalDate.now())) {
                testDate = fecha1;
                formValido = false;

            }
            if (fecha1.isBefore(LocalDate.now())) {
                System.out.println("----------------------------------------------");
                System.out.println("No puede ingresar una fecha anterior al actual");
                System.out.println("----------------------------------------------");
                formValido = true;
            }
        }
        return testDate;
    }

    @Override
    public String toString() {
        return "Sala{" + "sala=" + numSala + ", turno=" + turno + ", fecha=" + fecha + '}';
    }
}
