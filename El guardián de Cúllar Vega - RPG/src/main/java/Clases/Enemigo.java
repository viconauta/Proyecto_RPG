package Clases;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.ArrayList;
//
public class Enemigo extends Personaje {
    //Atributos
    private int id_enemigo;
    private TipoDificultad dificultad;

    public Enemigo(){
        super();
        this.id_enemigo = 0;
        this.dificultad = TipoDificultad.Facil;
    }

    //Constructor por parametros
    public Enemigo(int id, TipoDificultad dificultad, String nombre){
        super(nombre);
        this.id_enemigo = id;
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
    }

    //Constructor de copia
    public Enemigo(Enemigo enemigos){
        this.id_enemigo = enemigos.id_enemigo;
        this.dificultad = enemigos.dificultad;
    }

    //Getters
    public int getId() {
        return this.id_enemigo;
    }

    public TipoDificultad getDificultad() {
        return this.dificultad;
    }


    //Setters
    public void setDificultad(TipoDificultad dificultad) {
        this.dificultad = dificultad;
    }

    //ToString
    @Override
    public String toString() {
        return "Id enemigo: " + this.id_enemigo + " (Dificultad: " + this.dificultad + ") " + super.toString();
    }
}
