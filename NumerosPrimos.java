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
public class NumerosPrimos {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int numero, contador, i;
        contador = 0;
        System.out.println("Escriba un número");
        numero = entrada.nextInt();
        
        for(i = 1; i <= numero; i++){
            if(numero % i==0){
            contador++;
            }
        }
        if(contador ==2){
                System.out.println("El número " + numero + " es primo");
            
            }
            else{
                System.out.println("El número " + numero + " no es primo");
            }
        entrada.close();
    
    }
    
    
}
