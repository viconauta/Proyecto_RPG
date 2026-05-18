/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package el.guardián.de.cúllar.vega.rpg;

/**
 *
 * @author Christian
 */
public class Sala {

    // Atributos
    private String descripcion;
    private Enemigos enemigo;
    private boolean completada;
    private int recompensa;

    //Constructor por defecto
    public Sala() {
        this.descripcion = "";
        this.completada = false;
        this.recompensa = 0;
    }

    //Constructor por parametros
    public Sala(String d, Enemigos e, int r) {
        this.descripcion = d;
        this.enemigo = e;
        this.completada = false;
        this.recompensa = r;
    }

    //Constructor de copia
    public Sala(Sala s) {
        this.descripcion = s.descripcion;
        this.enemigo = s.enemigo; 
        this.completada = s.completada;
        this.recompensa = s.recompensa;
    }

    // Getters
    public String getDescripcion() {
        return this.descripcion;
    }

    public Enemigos getEnemigo() {
        return this.enemigo;
    }

    public boolean getCompletada() {
        return this.completada;
    }

    public int getRecompensa() {
        return this.recompensa;
    }

    // Setters
    public void setDescripcion(String d) {
        this.descripcion = d;
    }

    public void setEnemigo(Enemigos e) {
        this.enemigo = e;
    }

    public void setCompletada(boolean c) {
        this.completada = c;
    }

    public void setRecompensa(int r) {
        this.recompensa = r;
    }

    // Métodos 
    public void iniciarSala() {
        
    }

    public String mostrarDescripcion() {
        
    }

    // Método toString
    @Override
    public String toString() {
        return "Sala{" +
                "descripcion='" + this.descripcion + '\'' +
                ", enemigo=" + this.enemigo +
                ", completada=" + this.completada +
                ", recompensa=" + this.recompensa;
    }
}
