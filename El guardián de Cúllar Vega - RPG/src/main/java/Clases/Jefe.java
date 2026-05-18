package Clases;

public class Jefe {
    //Atributos
    private Habilidad habilidadEspecial;

    public Jefe(){
        super();
        this.habilidadEspecial = Habilidad.AtaqueExtra;
    }

    //Constructor por parametros
    public Jefe(Habilidad habilidadEspecial, Enemigo enemigos){
        super(enemigo);
        this.habilidadEspecial = habilidadEspecial;
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
