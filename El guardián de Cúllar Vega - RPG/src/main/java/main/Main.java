package main;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import Clases.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)  {
        String ruta_salas = Ruta.RUTA_RESOURCES + Ruta.RUTA_SALAS;
        try{
            Historia h = new Historia(ruta_salas);
        }catch(IOException e) {
            System.out.println("No se ha encontrado el archivo.");
        }

    }
}