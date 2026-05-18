package Clases;

public class Jugador {
    //atributos
    private int nivel ;
    private int exp;

    //constructor
    //defecto
    public Jugador() {
        super();
        this.nivel = 0;
        this.exp = 0;
    }

    //parametros
    public Jugador(Personaje p) {
        super(p);
        this.nivel = 0;
        this.exp = 0;
    }

    //copia
    public Jugador(Jugador j) {
        super(j);
        this.nivel = j.nivel;
        this.exp = j.exp;
    }

    //getters
    public int getNivel() {
        return this.nivel;
    }

    public int getExp() {
        return this.exp;
    }

    //setters
    public void setExp(int exp) {
        this.exp = exp;
    }

    //metodos
    public void subirNivel() {

    }

    //to string
    @Override
    public String toString() {
        return super.toString() +
                "\n Exp: " + this.exp +
                "\n Nivel: " + this.nivel;
    }
}
