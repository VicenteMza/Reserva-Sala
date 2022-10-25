package main;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);
    static String fecha;

    public static void main(String[] args) {

        String nombre;
        String apellido;
        int dni;

//        Persona persona = new Persona("Vicente", "Llanos", 30312585);
//        Sala sala = new Sala(1, Turnos.MAÑANA, "19-04-2022");
//
//        res.crearReserva(sala, persona);
//
//        Persona persona1 = new Persona("Valeria", "Perez", 58965421);
//        Sala sala1 = new Sala(1, Turnos.MAÑANA, "20-01-22");
//        res.crearReserva(sala1, persona1);
        Reserva res = new Reserva();
        Sala sala = new Sala();
        Persona persona = new Persona();

        int opcion = 0;
        do {
            System.out.println("Ingrese\n"
                    + "1. Para Crear una Reserva\n"
                    + "2. Para ver las Reservas\n"
                    + "0. Para salir");
            opcion = in.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa Nombre");
                    nombre = in.next();

                    System.out.println("Ingresa Apellido");
                    apellido = in.next();

                    System.out.println("Ingrese DNI");
                    dni = in.nextInt();
                    persona = new Persona(nombre, apellido, dni);

                    LocalDate dat = sala.validarFecha();

                    Turnos turno = elijaTurno();
                    Sala s = new Sala(1, turno, dat);

                    System.out.println("------------------------------");
                    System.out.println(res.crearReserva(s, persona));
                    System.out.println("------------------------------");

                    break;
                case 2:
                    res.mostrarReservas();
                    break;
            }
        } while (opcion != 0);
    }

    public static Turnos elijaTurno() {
        Turnos t = null;
        int i;
        boolean correcto;

        do {
            System.out.println("\nElija un turno");
            for (Turnos turno : Turnos.values()) {
                System.out.println(turno.ordinal() + 1 + ". " + turno);
            }
            i = in.nextInt();

            correcto = !(i > 0 && i <= Turnos.values().length);

            System.out.println((correcto) ? "Opción Incorrecta" : "");

        } while (correcto);

        return t = Turnos.values()[i - 1];
    }
}
