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
public class TemperaturaConverter {
    public static void main(String[] args) {
        
            Scanner entrada = new Scanner(System.in);

            double celsius, fahrenheit, celsiusGuardar, fahrenheitGuardar;
            String textoPregunta;

            System.out.println("Para convertir de C a F escriba 1. Para convertir de F a C escriba 2");
            textoPregunta = entrada.nextLine();

            if (textoPregunta.equals("1")) {
                System.out.println("Escriba los grados a convertir");
                celsius = entrada.nextInt();
                celsiusGuardar = celsius;
                fahrenheit = (celsius * 9/5) + 32;
                System.out.println("Los " + celsiusGuardar + " grados Celsius equivale a: " + fahrenheit + " grados Fahrenheit");
            } else if (textoPregunta.equals("2")) {
                System.out.println("Escriba los grados a convertir");
                fahrenheit = entrada.nextInt();
                fahrenheitGuardar = fahrenheit;
                celsius = (fahrenheit - 32) * 5/9;
                System.out.println("Los " + fahrenheitGuardar + " grados Fahrenheit equivale a: " + celsius + " grados Celsius");
            } else {
                System.out.println("Elegiste una opción no válida. Bye");
            }

            entrada.close();
    }
    
}
