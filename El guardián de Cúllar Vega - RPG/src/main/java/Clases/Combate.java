package Clases;

import java.util.LinkedList;
import java.util.Queue;

public class Combate {
    //atributos
    private Jugador jugador;
    private Enemigo enemigo;
    private Sala salas;
    private Queue<Personaje> turnos;

    //constructor
    //parametros
    public Combate(Jugador jugador, Enemigo enemigo, Sala s) {
        this.jugador = jugador;
        this.enemigo = enemigo;
        this.salas = s;
        this.turnos = new LinkedList<>();
        turnos.add(jugador);
        turnos.add(enemigo);
    }

    //getters
    public Jugador getJugador() {
        return this.jugador;
    }

    public Personaje getEnemigo() {
        return this.enemigo;
    }

    public Sala getSala() {
        return this.salas;
    }

    public Queue getTurnoJugador() {
        return this.turnos;
    }

    //setters
    public void setJugador(Jugador j) {
        this.jugador = j;
    }

    public void setEnemigo(Enemigo e) {
        this.enemigo = e;
    }

    public void setSalas(Sala s) {
        this.salas = s;
    }

    public void setTurnoJugador(Queue t) {
        this.turnos = t;
    }

    //metodos
    public boolean iniciar() {
        System.out.println("¡Comienza el combate!");
        while (jugador.estaVivo() && enemigo.estaVivo()) {
            Personaje actual = turnos.poll();

            if (actual instanceof Jugador) {
                turnoJugador();
            } else {
                turnoEnemigo();
            }

            turnos.add(actual);
        }

        if (jugador.estaVivo()) {
            System.out.println("Has ganado.");
            jugador.ganarExp(this.salas.getRecompensa());
            salas.setCompletada(true);
            return true;
        } else {
            System.out.println("Has sido derrotado.");
            return false;
        }
    }

    private void turnoJugador() {
        System.out.println("\nTu turno:");
        System.out.println("1. Atacar");
        System.out.println("2. Defender");
        int opcion = Utiles.menu(1, 2);

        switch (opcion) {
            case 1 -> jugador.atacar(enemigo);
            case 2 -> jugador.defender();
            default -> System.out.println("Opción inválida, pierdes el turno.");
        }
    }

    private void turnoEnemigo() {
        int num = Utiles.numerosAleatorios(1, 2);
        switch(num) {
            case 1 -> enemigo.atacar(jugador);
            case 2 -> enemigo.defender();
        }
    }

    //to string
    @Override
    public String toString() {
        return "Jugador: " + this.jugador +
                "\n Enemigo: " + this.enemigo +
                "\n Turno Jugador: " + this.turnos;
    }
}
