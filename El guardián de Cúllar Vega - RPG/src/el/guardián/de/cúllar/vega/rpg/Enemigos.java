/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package el.guardián.de.cúllar.vega.rpg;

/**
 *
 * @author EAG
 */
public class Enemigos extends Personaje{
    //Atributos
    private TipoDificultad dificultad;
    private String tipo;
    
    public Enemigos(){
    super();
    this.dificultad = TipoDificultad.Facil;
    this.tipo = "Sin tipo";
}

    //Constructor por parametros
    public Enemigos(TipoDificultad dificultad, String tipo, Personaje personaje){
        super(personaje);
        this.dificultad = dificultad;
        this.tipo = tipo;
    }

    //Constructor de copia
    public Enemigos(Enemigos enemigos){
        this.dificultad = enemigos.dificultad;
        this.tipo = enemigos.tipo;
    }

    //Getters
    public TipoDificultad getDificultad() {
        return this.dificultad;
    }

    public String getTipo() {
        return this.tipo;
    }

    //Setters
    public void setDificultad(TipoDificultad dificultad) {
        this.dificultad = dificultad;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    //Metodos
    public int decidirAccion(){

    }

    //ToString
    @Override
    public String toString() {
        return "Enemigo: " + this.tipo + " (Dificultad: " + this.dificultad + ") " + super.toString();
    }
}


