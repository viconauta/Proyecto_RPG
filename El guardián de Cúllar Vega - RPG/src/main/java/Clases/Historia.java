package Clases;
import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Historia  {
    // Atributos
    private ArrayList<Sala> salas;
    private int id_sala;

    //Constructor por defecto
    public Historia() throws FileNotFoundException {
        Gson gson = new Gson();
        try {
            FileReader fr = new FileReader(Ruta.RUTA_SALAS);
            Historia historia = gson.fromJson(fr, Historia.class);

            fr.close();
        }catch(FileNotFoundException e) {
            System.out.println("No se encontro el archivo.");
        }catch(IOException e) {
            System.out.println("Archivo no encontrado");
        }
        this.salas = new ArrayList<>();
    }

    //Constructor por parametros CAMBIAR CONSTRUCTOR PARA RECIBIR POR PARAMETROS OTRO JSON 
    public Historia(Sala[] salas, int salaActual) {
        this.salas = salas.clone();
        this.salaActual = salaActual;
    }

    //Constructor de copia
    public Historia(Historia historia) {
        this.salas = historia.salas.clone();
        this.salaActual = historia.salaActual;
    }

    // Getters
    public Sala[] getSalas() {
        return this.salas.clone();
    }

    public int getSalaActual() {
        return this.salaActual;
    }

    // Setters
    public void setSalas(Sala[] salas) {
        this.salas = salas.clone();
    }

    public void setSalaActual(int salaActual) {
        this.salaActual = salaActual;
    }

    // Método toString
    @Override
    public String toString() {
        String imprimir = "Sala actual:" + this.salaActual +
                "Lista de Salas:\n";
        for(int i=0; i < this.salas.length; i++){
            imprimir += "-" + this.salas[i];
        }
        return imprimir;

    }
}
