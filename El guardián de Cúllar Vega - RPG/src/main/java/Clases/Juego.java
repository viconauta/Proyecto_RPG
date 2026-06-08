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
        System.out.println("¡Comienza la aventura!");

        for (Sala sala : historia.getSalas()) {
            if(!jugador.estaVivo()) {
                System.out.println("Has sido derrotado. Fin del juego.");
                return;
            }
            System.out.println("\nEntrando en la sala: ");
            sala.iniciarSala(this.jugador);


            if (sala.getCompletada()) {
                this.jugador.setVida(100 + (this.jugador.getNivel() * 5));
                System.out.println("Has superado la sala.");
            }
        }
    }

    //ToString
    @Override
    public String toString() {
        return "Juego{" + "jugador=" + this.jugador + ", historia=" + this.historia + '}';
    }
}