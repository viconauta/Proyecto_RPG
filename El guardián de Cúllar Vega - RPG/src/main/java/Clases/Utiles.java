package Clases;

public class Utiles {
    //genera numeros aleatorios pasandolel el minimo y el maximo
    public static int numerosAleatorios (int min, int max) {
        return (int)(Math.random() * (max - min + 1)) + min;
    }
}
