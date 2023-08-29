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
public class NumerosPares {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int numero;
        
         System.out.println("Escriba un número");
         numero = entrada.nextInt();
         
         if(numero%2==0){
             System.out.println("El número es par");
         }
         else{
             System.out.println("El número es impar");
         
         }
    entrada.close();
    
    }
    
}
