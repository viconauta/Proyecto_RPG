package Clases;

public class Personaje {
    //atributos
    private String nombre;
    private int vida = 100;
    private int ataque;
    private int defensa;
    private boolean defendiendo = false;

    //constructores
    //defecto
    public Personaje() {
        this.nombre = "Sin nombre";
        this.ataque = Utiles.numerosAleatorios(20, 50);
        this.defensa = Utiles.numerosAleatorios(5, 30);
    }

    //parametros
    public Personaje(String n) {
        this.nombre = n;
        this.ataque = Utiles.numerosAleatorios(20, 50);
        this.defensa = Utiles.numerosAleatorios(5, 30);
    }

    //copia
    public Personaje(Personaje p) {
        this.nombre = p.nombre;
        this.vida = p.vida;
        this.ataque = p.ataque;
        this.defensa = p.defensa;
        this.defendiendo = p.defendiendo;
    }

    //getters
    public String getNombre() {
        return this.nombre;
    }

    public int getVida() {
        return this.vida;
    }

    public int getAtaque() {
        return this.ataque;
    }

    public int getDefensa() {
        return this.defensa;
    }

    public boolean getDefendiendo() {
        return this.defendiendo;
    }

    //setters
    public void setNombre(String n) {
        this.nombre = n;
    }

    public void setDefendiendo(boolean d) {
        this.defendiendo = d;
    }

    //metodos
    public void atacar(Personaje enemigo) {

    }

    public void defender() {

    }

    public void recibirDaño(int daño) {

    }

    public boolean estaVivo() {
        return vida >= 1;
    }

    //to string
    @Override
    public String toString() {
        return "Nombre: " + this.nombre +
                "\n Vida: " + this.vida +
                "\n Ataque: " + this.ataque +
                "\n Defensa: " + this.defensa +
                "\n Defenddiendo: " + this.defendiendo;
    }
}
