package Clases;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.ArrayList;
//
public class Enemigo extends Personaje {
    //Atributos
    private int id;
    private TipoDificultad dificultad;
    private String nombre;

    public Enemigo(){
        super();
        this.id = 0;
        this.dificultad = TipoDificultad.Facil;
        this.nombre = "Sin tipo";
    }

    //Constructor por parametros
    public Enemigo(int id, TipoDificultad dificultad, String tipo, String nombre){
        super(nombre);
        this.id = id;
        this.dificultad = dificultad;
        switch(this.dificultad) {
            case Facil -> {
                this.setAtaque(this.getAtaque() - 15);
                this.setVida(this.getVida() - 20);
            }
            case Dificil -> {
                this.setAtaque(this.getAtaque() + 15);
                this.setVida(this.getVida() + 20);
            }
        }
        this.nombre = tipo;
    }

    //Constructor de copia
    public Enemigo(Enemigo enemigos){
        this.id = enemigos.id;
        this.dificultad = enemigos.dificultad;
        this.nombre = enemigos.nombre;
    }

    //Getters
    public int getId() {
        return this.id;
    }

    public TipoDificultad getDificultad() {
        return this.dificultad;
    }

    public String getTipo() {
        return this.nombre;
    }

    //Setters
    public void setDificultad(TipoDificultad dificultad) {
        this.dificultad = dificultad;
    }

    public void setTipo(String tipo) {
        this.nombre = tipo;
    }



    //ToString
    @Override
    public String toString() {
        return "Enemigo: " + this.nombre + " (Dificultad: " + this.dificultad + ") " + super.toString();
    }
}
