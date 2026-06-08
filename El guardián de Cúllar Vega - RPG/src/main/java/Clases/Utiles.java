package Clases;

import java.util.Scanner;

public class Utiles {
    //genera numeros aleatorios pasandolel el minimo y el maximo
    public static int numerosAleatorios (int min, int max) {
        return (int)(Math.random() * (max - min + 1)) + min;
    }

    //menu para la opcion de atacar o defender
    public static int menu(int min, int max) {
        int num = 0;
        boolean valido = false;

        do {
            Scanner sc = new Scanner(System.in);
            try {
                num = sc.nextInt();

                if (num < min || num > max) {
                    System.out.println("Debes introducir un número entre " + min + " y " + max + ".");
                } else {
                    valido = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Eso no es un número válido. Inténtalo de nuevo.");
            }
        } while (!valido);

        return num;
    }
}