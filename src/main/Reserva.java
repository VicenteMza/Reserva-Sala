package main;

import java.util.ArrayList;

public class Reserva {

    ArrayList<Ticket> tickets = new ArrayList<>();
    ArrayList<Sala> salas = new ArrayList<>();

    public Ticket crearReserva(Sala sala, Persona perso) {
        Ticket miTicket = null;

        if (salaValida(sala)) {
            String nomCom = perso.nomApe();
            miTicket = new Ticket(nomCom, perso.getDni(), sala.getNumSala(), sala.getFecha(), sala.getTurno());
            guardarTicket(miTicket);
            guardarSala(sala);
        } else {
            System.out.println("------------------------------------");
            System.out.println("La sala esta ocupada ese dia y turno");
            System.out.println("------------------------------------");
        }
        return miTicket;
    }

    private void guardarSala(Sala sala) {
        salas.add(sala);
    }

    private void guardarTicket(Ticket miTicket) {
        tickets.add(miTicket);
    }

    public void mostrarReservas() {
        System.out.println("--------------------------------");
        for (Ticket t : tickets) {
            System.out.println(t);
            System.out.println("---------------------------------");
        }
    }

    private boolean salaValida(Sala sala) {
        int numSa = sala.getNumSala();
        String fech = sala.getFecha();
        Turnos turn = sala.getTurno();

        for (Sala s : salas) {
            if (s.getNumSala() == numSa && s.getFecha().equals(fech) && s.getTurno().equals(turn)) {
                return false;
            }
        }
        return true;
    }
}
