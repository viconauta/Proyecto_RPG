/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package el.guardián.de.cúllar.vega.rpg;

/**
 *
 * @author pablo
 */
public class Jefes extends Enemigos{
    //Atributos
    private Habilidad habilidadEspecial;
    
    public Jefes(){
    super();
    this.habilidadEspecial = Habilidad.AtaqueExtra;
}

    //Constructor por parametros
    public Jefes(Habilidad habilidadEspecial, Enemigos enemigos){
        super(enemigos);
        this.habilidadEspecial = habilidadEspecial;
    }

    //Constructor de copia
    public Jefes(Jefes jefes){
        this.habilidadEspecial = jefes.habilidadEspecial;
    }

    //Getters
    public Habilidad getHabilidadEspecial() {
        return habilidadEspecial;
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
        return "Jefes{" + "habilidadEspecial=" + habilidadEspecial + '}';
    }
    

}
