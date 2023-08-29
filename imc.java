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
public class imc {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        double peso, altura, resultado;
        
        System.out.println("Escriba su peso en kilos");
        peso = entrada.nextDouble();
        
        System.out.println("Escriba su altura en metros");
        altura = entrada.nextDouble();
        
        resultado = (peso)/ (altura * altura);
        System.out.println("Su indice de masa corporal es: " + resultado);
        
        
   
        
    }
    
}
