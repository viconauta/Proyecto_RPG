package Clases;

public class Juego {
    //Atributos

    private Jugador jugador;
    private Historia historia;

    //Constructor por parametros
    public Juego(Jugador jugador, Historia historia) {
        this.jugador = jugador;
        this.historia = historia;
    }

    //Constructor de copia
    public Juego(Juego juego) {
        this.jugador = juego.jugador;
        this.historia = juego.historia;
    }

    //Getters
    public Jugador getJugador() {
        return this.jugador;
    }

    public Historia getHistoria() {
        return this.historia;
    }

    //Setters
    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public void setHistoria(Historia historia) {
        this.historia = historia;
    }

    //Metodos
    public void iniciar() {

    }

    public void entrarSala() {

    }

    public void comprabarFin() {

    }

    //ToString
    @Override
    public String toString() {
        return "Juego{" + "jugador=" + this.jugador + ", historia=" + this.historia + '}';
    }
}
