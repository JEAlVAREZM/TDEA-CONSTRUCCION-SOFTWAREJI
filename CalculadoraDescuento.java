/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller1construccion;
import  java.util.Scanner;
/**
 *
 * @author Tiben
 */
public class CalculadoraDescuento {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        double descuento, valorProducto, total;

           System.out.println("Ingrese el porcentaje de descuento");
           descuento = entrada.nextDouble();
           System.out.println("Ingrese el valor del producto");
           valorProducto = entrada.nextDouble();
           total = valorProducto -((descuento / 100) * valorProducto);
           
           System.out.println("El valor total a pagar por el producto con el porcentaje de descuento es: " + total);
           entrada.close();
    }
    
    
    
}
