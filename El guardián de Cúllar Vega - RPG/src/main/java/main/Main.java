package main;
import com.google.gson.Gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Clases.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)  {
        //iniciamos atributos necesarios
        Scanner sc = new Scanner(System.in);
        String nom = "";
        Historia h = new Historia();
        String ruta_salas = Ruta.RUTA_RESOURCES + Ruta.RUTA_SALAS;
        String ruta_enemig = Ruta.RUTA_RESOURCES + Ruta.RUTA_ENEMIGO;
        String ruta_jefes = Ruta.RUTA_RESOURCES + Ruta.RUTA_JEFES;

        //creamos el array list de salas en hsitoria y lo guardamos
        try{
            h = new Historia(ruta_salas, ruta_jefes, ruta_enemig);
            ArrayList<Sala> listaSalas = h.getSalas();
            ArrayList<Enemigo> listaEnemigos = h.getEnemigos();
/*
            for(Sala s: listaSalas) {
                System.out.println(s);
            }
            for(Enemigo e: listaEnemigos) {
                System.out.println(e);
            }
*/
        }catch(IOException e) {
            System.out.println("No se ha encontrado el archivo.");
        }

        //pedimos el nombre del jugador
        try {
            System.out.println("Introduce el nombre de tu jugador.");
            nom = sc.nextLine();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

        //iniciamos a jugador y despues a juego
        Jugador jug = new Jugador(nom);
        Juego j = new Juego(jug, h);
        j.iniciar();
    }
}