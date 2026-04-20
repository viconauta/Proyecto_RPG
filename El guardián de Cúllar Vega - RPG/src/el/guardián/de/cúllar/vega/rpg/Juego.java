/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package el.guardián.de.cúllar.vega.rpg;

/**
 *
 * @author pablo
 */
public class Juego {
    //Atributos
    private Jugador jugador;
    private Historia historia;
    
    //Constructor por parametros
    public Juego(Jugador jugador, Historia historia){
        this.jugador = jugador;
        this.historia = historia;
    }

    //Constructor de copia
    public Juego(Juego juego){
        this.jugador = juego.jugador;
        this.historia = juego.historia;
    }

    //Getters
    public Jugador getJugador() {
        return jugador;
    }

    public Historia getHistoria() {
        return historia;
    }

    //Setters
    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public void setHistoria(Historia historia) {
        this.historia = historia;
    }
    
    //Metodos
    public void iniciar(){
        
    }
    
    public void mover(char tecla){
        
    }
    
    public void entrarSala(){
        
    }
    
    public void comprabarFin(){
        
    }
    
    //ToString
    @Override
    public String toString() {
        return "Juego{" + "jugador=" + jugador + ", historia=" + historia + '}';
    }
    
    

    
    }
}
