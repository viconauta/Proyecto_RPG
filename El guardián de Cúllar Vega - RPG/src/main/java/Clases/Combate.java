package Clases;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;

public class Combate {
    //atributos
    private Jugador jugador;
    private Enemigo enemigo;
    private Sala salas;
    private Queue<Personaje> turnos;

    //constructor parametrizado
    public Combate(Jugador jugador, Enemigo enemigo, Sala s) {
        this.jugador = jugador;
        this.enemigo = enemigo;
        this.salas = s;
        this.turnos = new LinkedList<>();
        turnos.add(jugador);
        turnos.add(enemigo);
    }
    
    //metodos
    public boolean iniciar() {
        System.out.println("\n¡Comienza el combate!");
        System.out.println("Te enfrentas a: " + enemigo.getNombre());
        System.out.println("Tu vida: " + jugador.getVida() + " | Su vida: " + enemigo.getVida() + "\nTu ataque: " + jugador.getAtaque());

        while (jugador.estaVivo() && enemigo.estaVivo()) {
            Personaje actual = turnos.poll();

            if (actual instanceof Jugador) {
                turnoJugador();
            } else {
                turnoEnemigo();
            }
            System.out.println("-----------------------------------------");
            System.out.println("Tu vida: " + jugador.getVida() + " | Su vida: " + enemigo.getVida() + "\nTu ataque: " + jugador.getAtaque());
            turnos.add(actual);
        }

        if (jugador.estaVivo()) {
            System.out.println("\n¡Has ganado el combate!");
            jugador.ganarExp(this.salas.getRecompensa());
            System.out.println("Ganaste " + this.salas.getRecompensa() + " de experiencia.");
            salas.setCompletada(true);
            return true;
        } else {
            System.out.println(this.enemigo.getNombre() + " te ha matado.");
            return false;
        }
    }

    private void turnoJugador() {
        int opcion = 0;
        System.out.println("\nTu turno:");
        System.out.println("1. Atacar");
        System.out.println("2. Defender");
        try{
            opcion = Utiles.menu(1, 2);
        }catch(InputMismatchException e) {
            System.out.println("Formato de numero no valido.");
        }


        switch (opcion) {
            case 1 -> {
                jugador.atacar(enemigo);
                System.out.println("Atacaste a " + enemigo.getNombre());
            }
            case 2 -> {
                jugador.defender();
                System.out.println("Te pusiste en posición defensiva.");
            }
            default -> System.out.println("Opción inválida, pierdes el turno.");
        }
    }

    private void turnoEnemigo() {
        int num = Utiles.numerosAleatorios(1, 2);
        switch(num) {
            case 1 -> {
                enemigo.atacar(jugador);
                System.out.println(enemigo.getNombre() + " te atacó.");
            }
            case 2 -> {
                enemigo.defender();
                System.out.println(enemigo.getNombre() + " se puso en posición defensiva.");
            }
        }
    }

    //to string
    @Override
    public String toString() {
        return "Combate{" +
                "Jugador=" + this.jugador.getNombre() +
                ", Enemigo=" + this.enemigo.getNombre() +
                '}';
    }
}