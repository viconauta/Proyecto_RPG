package Clases;
import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Historia  {
    // Atributos
    private ArrayList<Sala> salas;
    private ArrayList<Enemigo> enemigos ;

    //Constructor por defecto
    public Historia(){
        this.salas = null;
    }

    public Historia(String rutaH, String rutaJ, String rutaE) throws FileNotFoundException {
        Gson gson = new Gson();
        Historia historiaTemporal = new Historia();
        try {
            FileReader fr = new FileReader(rutaH);
            historiaTemporal = gson.fromJson(fr, Historia.class);

            fr.close();

            this.salas = historiaTemporal.salas;

            FileReader frE = new FileReader(rutaE);
            EnemigosWrapper enemigosTemp = gson.fromJson(frE, EnemigosWrapper.class);
            frE.close();

            FileReader frJ = new FileReader(rutaJ);
            JefesWrapper jefesTemp = gson.fromJson(frJ, JefesWrapper.class);
            frJ.close();

            this.enemigos = new ArrayList<>();
            this.enemigos.addAll(enemigosTemp.enemigos);
            this.enemigos.addAll(jefesTemp.jefes);

        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo.");
        } catch (IOException e) {
            System.out.println("Archivo no encontrado");
        }


        for (Sala s : this.salas) {
            for (Enemigo e : this.enemigos) {
                if (e.getId() == s.getIdEnemigo()) {
                    s.setEnemigo(e);
                    break;
                }
            }
        }
    }

    //Constructor de copia
    public Historia(Historia historia) {
        this.salas = new ArrayList<>(historia.salas);
    }

    // Getters
    public ArrayList<Sala> getSalas() {
        return this.salas;
    }

    public ArrayList<Enemigo> getEnemigos() {
        return this.enemigos;
    }

    //toString
    @Override
    public String toString() {
        String imprimir = "Lista de Salas:\n";
        for(Sala s: this.salas){
            imprimir += "-" + s;
        }
        return imprimir;

    }
}
