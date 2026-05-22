package Clases;

public class Sala {
    // Atributos
    private int id_sala, recompensa;
    private String descripcion, historia;
    private int enemigo;
    private boolean completada;

    //Constructor por defecto
    private Sala() {
        this.descripcion = "";
        this.completada = false;
        this.recompensa = 0;
        this.id_sala = 0;
        this.historia = "";
        this.enemigo = 0;
    }

    //Constructor por parametros
    public Sala(String d, int e, int r, int id, String his) {
        this.descripcion = d;
        this.enemigo = e;
        this.completada = false;
        this.recompensa = r;
        this.id_sala = id;
        this.historia = his;
    }

    //Constructor de copia
    public Sala(Sala s) {
        this.descripcion = s.descripcion;
        this.enemigo = s.enemigo;
        this.completada = s.completada;
        this.recompensa = s.recompensa;
        this.id_sala = s.id_sala;
        this.historia = s.historia;
    }

    // Getters
    public String getDescripcion() {
        return this.descripcion;
    }

    public int getEnemigo() {
        return this.enemigo;
    }

    public boolean getCompletada() {
        return this.completada;
    }

    public int getRecompensa() {
        return this.recompensa;
    }

    public int getId_sala() { return this.id_sala; }

    public String getHistoria() { return this.historia; }

    // Setters
    public void setCompletada(boolean c) {
        this.completada = c;
    }

    // Métodos
    public void iniciarSala() {

    }

    public void mostrarDescripcion() {

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
