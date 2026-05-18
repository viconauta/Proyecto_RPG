package Clases;

public class Combate {
    //atributos
    private Jugador jugador;
    private Personaje enemigo;
    private boolean turnoJugador;

    //constructor
    //parametros
    public Combate(Jugador j, Personaje enemigo) {
        this.jugador = j;
        this.enemigo = enemigo;
        this.turnoJugador = true;
    }

    //getters
    public Jugador getJugador() {
        return this.jugador;
    }

    public Personaje getEnemigo() {
        return this.enemigo;
    }

    public boolean getTurnoJugador() {
        return this.turnoJugador;
    }

    //setters
    public void setJugador(Jugador j) {
        this.jugador = j;
    }

    public void setEnemigo(Personaje e) {
        this.enemigo = e;
    }

    public void setTurnoJugador(boolean t) {
        this.turnoJugador = t;
    }

    //metodos
    public void iniciar() {

    }

    public void turnoJugador() {

    }

    public void turnoEnemigo() {

    }

    public void calcularDaño() {

    }

    //to string
    @Override
    public String toString() {
        return "Jugador: " + this.jugador +
                "\n Enemigo: " + this.enemigo +
                "\n Turno Jugador: " + this.turnoJugador;
    }
}
