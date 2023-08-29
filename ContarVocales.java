/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller1construccion;
import java.util.Scanner;

/**
 *
 * @author Tiben
 */
public class ContarVocales {
    public static int contarLasVocales(String palabra) {
        
        int contador = 0;
        palabra = palabra.toLowerCase();
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }
        return contador;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String palabra;
        
        System.out.println("Ingrese una palabra");
        palabra = entrada.nextLine();
        
        int resultado = contarLasVocales(palabra);
        System.out.println("La palabra "+ palabra + " contiene " + resultado + " vocales");
        
        entrada.close();
    
    }
    
}
