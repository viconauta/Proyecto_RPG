package Clases;

public class Jefe extends Enemigo{
    //Atributos
    private Habilidad habilidadEspecial;

    public Jefe(){
        super();
        this.habilidadEspecial = null;
    }

    //Constructor por parametros
    public Jefe(int id, TipoDificultad dificultad, String tipo, String nombre, Habilidad h){
        super(id, dificultad, tipo, nombre);
        this.habilidadEspecial = h;
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

    //Metodos
    public void usarHabilidadEspecial(){

    }

    //ToString
    @Override
    public String toString() {
        return "Jefes{" + "habilidadEspecial=" + this.habilidadEspecial + '}';
    }
}
