package Clases;

import java.util.ArrayList;

public class Sala {
    // Atributos
    private int id_sala, recompensa;
    private String descripcion, historia;
    private int id_enemigo;
    private boolean completada;
    private Enemigo enemigo;

    //Constructor por defecto
    private Sala() {
        this.descripcion = "";
        this.completada = false;
        this.recompensa = 0;
        this.id_sala = 0;
        this.historia = "";
        this.id_enemigo = 0;
        this.enemigo = null;
    }

    //Constructor por parametros
    public Sala(String d, int e, int r, int id, String his) {
        this.descripcion = d;
        this.id_enemigo = e;
        this.completada = false;
        this.recompensa = r;
        this.id_sala = id;
        this.historia = his;
    }

    //Constructor de copia
    public Sala(Sala s) {
        this.descripcion = s.descripcion;
        this.id_enemigo = s.id_enemigo;
        this.completada = s.completada;
        this.recompensa = s.recompensa;
        this.id_sala = s.id_sala;
        this.historia = s.historia;
        this.enemigo = s.enemigo;
    }

    // Getters
    public String getDescripcion() {
        return this.descripcion;
    }

    public int getIdEnemigo() {
        return this.id_enemigo;
    }

    public boolean getCompletada() {
        return this.completada;
    }

    public int getRecompensa() {
        return this.recompensa;
    }

    public int getId_sala() { return this.id_sala; }

    public String getHistoria() { return this.historia; }

    public Enemigo getEnemigo() {
        return this.enemigo;
    }

    // Setters
    public void setCompletada(boolean c) {
        this.completada = c;
    }

    public void setEnemigo(Enemigo e) {
        this.enemigo = e;
    }

    // Métodos
    public boolean iniciarSala(Jugador j) {
        String imprimir = "Te encuentras en " + this.descripcion +
                "\n" + this.historia +
                "\nEn esta sala te espera " + this.enemigo;

        Combate com = new Combate(j, this.enemigo, this);
        return com.iniciar();
    }

    // Método toString
    @Override
    public String toString() {
        return "Sala {" +
                "\nDescripcion: '" + this.descripcion +
                "\nEnemigo: " + this.enemigo +
                "\nCompletada: " + this.completada +
                "\nRecompensa: " + this.recompensa +
                "\nHistoria: " + this.historia +
                "\n-------------------------------------";
    }
}
