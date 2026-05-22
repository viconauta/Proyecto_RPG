package Clases;

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

    //Metodos
    public void decidirAccion(){

    }

    //ToString
    @Override
    public String toString() {
        return "Enemigo: " + this.nombre + " (Dificultad: " + this.dificultad + ") " + super.toString();
    }
}
