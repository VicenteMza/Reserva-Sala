package main;

public class Main {

    public static void main(String[] args) {
        Reserva res = new Reserva();
        Persona persona = new Persona("Vicente", "Llanos", 30312585);
        Sala sala = new Sala(1, Turnos.MAÑANA, "19-04-2022");

        res.crearReserva(sala, persona);
        
        Persona persona1 = new Persona("Valeria", "Perez", 58965421);
        Sala sala1 = new Sala(1, Turnos.MAÑANA, "20-01-22");
        res.crearReserva(sala1, persona1);

        Persona persona2 = new Persona("Valeria", "Perez", 58965421);
        Sala sala2 = new Sala(1, Turnos.MAÑANA, "20-01-22");
        res.crearReserva(sala2, persona2);

        Persona persona3 = new Persona("Maria", "Sanchez", 58965421);
        Sala sala3 = new Sala(1, Turnos.TARDE, "22-05-22");
        res.crearReserva(sala3, persona3);
        
        res.mostrarReservas();

    }
}
