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
public class TablaMultiplicar {
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    
    int numero, i;
        i = 1;
        System.out.println("Escriba un número");
        numero = entrada.nextInt();
        
        while(i <= 10){
            System.out.println(""+ numero + "*" + i + "= " + numero*i);
            i++;
            
        }
        entrada.close();
    }
    
}
