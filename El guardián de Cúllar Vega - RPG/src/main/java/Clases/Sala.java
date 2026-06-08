package Clases;

public class Sala {
    // Atributos
    private int id_sala;
    private int recompensa;
    private String descripcion;
    private String historia;
    private int id_enemigo;
    private boolean completada;
    private transient Enemigo enemigo;

    //Constructor por parametros (el único que se usa)
    public Sala(String d, int e, int r, int id, String his) {
        this.descripcion = d;
        this.id_enemigo = e;
        this.completada = false;
        this.recompensa = r;
        this.id_sala = id;
        this.historia = his;
        this.enemigo = null;
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
    public int getIdEnemigo() {
        return this.id_enemigo;
    }

    public int getId_sala() {
        return this.id_sala;
    }

    public boolean getCompletada() {
        return this.completada;
    }

    public int getRecompensa() {
        return this.recompensa;
    }

    public Enemigo getEnemigo() {
        return this.enemigo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public String getHistoria() {
        return this.historia;
    }


    // Setters
    public void setCompletada(boolean c) {
        this.completada = c;
    }

    public void setEnemigo(Enemigo e) {
        this.enemigo = e;
    }

    // Métodosdf
    public boolean iniciarSala(Jugador j) {
        String imprimir = "-------------------------------------------------------------------------------------------------------\n";
        imprimir += "| Te encuentras en " + this.descripcion +
                "\n---" +
                "\n| " + this.historia;
        imprimir += "\n-------------------------------------------------------------------------------------------------------\n";
        System.out.println(imprimir);

        if (this.enemigo == null) {
            System.out.println("Error: No hay enemigo asignado a esta sala.");
            return false;
        }

        Combate com = new Combate(j, this.enemigo, this);
        return com.iniciar();
    }

    // Método toString
    @Override
    public String toString() {
        return "Sala {" +
                "\nDescripción: '" + this.descripcion +
                "\nEnemigo: " + this.enemigo.getNombre() +
                "\nCompletada: " + this.completada +
                "\nRecompensa: " + this.recompensa +
                "\nHistoria: " + this.historia +
                "\n-------------------------------------";
    }
}