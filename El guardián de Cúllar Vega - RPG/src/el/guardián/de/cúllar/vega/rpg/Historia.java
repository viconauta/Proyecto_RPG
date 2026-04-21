/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package el.guardián.de.cúllar.vega.rpg;

/**
 *
 * @author Christian
 */
public class Historia {

    // Atributos
    private Sala[] salas; 
    private int salaActual;

    //Constructor por defecto
    public Historia() {
        this.salas = new Sala[0];
        this.salaActual = 0; 
    }

    //Constructor por parametros
    public Historia(Sala[] salas, int salaActual) {
        this.salas = salas.clone();
        this.salaActual = salaActual;
    }

    //Constructor de copia
    public Historia(Historia historia) {
            this.salas = historia.salas.clone(); 
            this.salaActual = historia.salaActual;    
    }

    // Getters 
    public Sala[] getSalas() {
        return this.salas.clone();
    }

    public int getSalaActual() {
        return this.salaActual;
    }

    // Setters
    public void setSalas(Sala[] salas) {
        this.salas = salas.clone();
    }

    public void setSalaActual(int salaActual) {
        this.salaActual = salaActual;
    }

    // Método toString
    @Override
    public String toString() {
        String imprimir = "Sala actual:" + this.salaActual +
                "Lista de Salas:\n";
        for(int i=0; i < this.salas.length; i++){
            imprimir += "-" + this.salas[i];
    }
        return imprimir;

    }
        
}
