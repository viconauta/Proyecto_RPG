package Clases;

public class Jugador extends Personaje{
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
    public Jugador(String nom) {
        super(nom);
        this.nivel = 0;
        this.exp = 0;
    }

    //copia
    public Jugador(Jugador j) {
        super();
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
    public void ganarExp(int cantidad) {
        this.exp += cantidad;
        while (this.exp >= 100) {
            this.exp -= 100;
            subirNivel();
        }
    }

    public void subirNivel() {
        this.nivel++;
        this.setVida(this.getVida() + 5);
        this.setAtaque(this.getAtaque() + 4);
    }


    //to string
    @Override
    public String toString() {
        return super.toString() +
                "\n Exp: " + this.exp +
                "\n Nivel: " + this.nivel;
    }
}