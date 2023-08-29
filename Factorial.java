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
public class Factorial {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int numero, acumulador;
        
        System.out.println("Ingrese un número");
        numero = entrada.nextInt();
        acumulador = numero;
        
        while(numero >1){
        numero = numero-1;
        acumulador = acumulador * numero;
        }
        System.out.println("El factorial es: " + acumulador);
    
    }
    
}
