package Clases;

public class Enemigo extends Personaje {
    //Atributos
    private TipoDificultad dificultad;
    private String tipo;

    public Enemigo(){
        super();
        this.dificultad = TipoDificultad.Facil;
        this.tipo = "Sin tipo";
    }

    //Constructor por parametros
    public Enemigo(TipoDificultad dificultad, String tipo, String nombre){
        super(nombre);
        this.dificultad = dificultad;
        this.tipo = tipo;
    }

    //Constructor de copia
    public Enemigo(Enemigo enemigos){
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
