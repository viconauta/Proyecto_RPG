package Clases;

public class Personaje {
    //atributos
    private String nombre;
    private int vida = 100;
    private int ataque;
    private boolean defendiendo = false;
    private boolean defensaExtra = false;

    //constructores
    //defecto
    public Personaje() {
        this.nombre = "Sin nombre";
        this.ataque = Utiles.numerosAleatorios(20, 50);
    }

    //parametros
    public Personaje(String n) {
        this.nombre = n;
        this.ataque = Utiles.numerosAleatorios(20, 50);
    }

    //copia
    public Personaje(Personaje p) {
        this.nombre = p.nombre;
        this.vida = p.vida;
        this.ataque = p.ataque;
        this.defendiendo = p.defendiendo;
        this.defensaExtra = p.defensaExtra;
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

    public boolean getDefendiendo() {
        return this.defendiendo;
    }

    public boolean getDefensaExtra() {
        return this.defensaExtra;
    }

    //setters
    public void setNombre(String n) {
        this.nombre = n;
    }

    public void setDefendiendo(boolean d) {
        this.defendiendo = d;
    }

    public void setVida(int vida) { this.vida = vida; }

    public void setAtaque(int ataque) { this.ataque = ataque; }

    public void setDefensaExtra(boolean def) {
        this.defensaExtra = def;
    }

    //metodos
    public void atacar(Personaje p) {
        int daño = this.ataque;
        p.recibirDaño(daño);
    }

    public void defender() {
        this.defendiendo = true;
    }

    public void recibirDaño(int daño) {
        if(this.getDefensaExtra()) {
            daño /= 3;
            this.vida -= daño;
            if (this.vida < 0) this.vida = 0;
        }
        else if (defendiendo && !this.getDefensaExtra()) {
            daño /= 2;
            defendiendo = false;
        }
        this.vida -= daño;
        if (this.vida < 0) this.vida = 0;
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
                "\n Defenddiendo: " + this.defendiendo;
    }
}
