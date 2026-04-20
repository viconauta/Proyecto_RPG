/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package el.guardián.de.cúllar.vega.rpg;

/**
 *
 * @author anton
 */
public class Utiles {
    //genera numeros aleatorios pasandolel el minimo y el maximo
    public static int numerosAleatorios (int min, int max) {
        return (int)Math.random() * (max - min + 1) + min;
    }
}
