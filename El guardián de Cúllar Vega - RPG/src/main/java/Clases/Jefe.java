package Clases;

public class Jefe extends Enemigo{
    //Atributos
    private Habilidad habilidadEspecial;
    private ArrayList<Jefe> jefes;

    public Jefe() {
        super();
        this.habilidadEspecial = null;
    }

    //Constructor por parametros
    public Jefe(int id, TipoDificultad dificultad, String tipo, String nombre){
        super(id, dificultad, tipo, nombre);
        this.habilidadEspecial = h;
        switch(this.habilidadEspecial) {
            case VidaExtra -> this.setVida(this.getVida() + 30);
            case DefensaExtra -> this.setDefensaExtra(true);
            case AtaqueExtra -> this.setAtaque(this.getAtaque() + 30);
        }
    }

    //Constructor de copia
    public Jefe(Jefe jefe){
        this.habilidadEspecial = jefe.habilidadEspecial;
    }

    //Getters
    public Habilidad getHabilidadEspecial() {
        return this.habilidadEspecial;
    }

    //Setters
    public void setHabilidadEspecial(Habilidad habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }

    //ToString
    @Override
    public String toString() {
        return "Jefes{" + "habilidadEspecial=" + this.habilidadEspecial + '}';
    }
}
