/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication43;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class JavaApplication43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        //impleamos la entada de texto
        
        System.out.println("ingrese su nombre: ");
        String nombre = leer.next();
        System.out.println("Hola " +nombre+  ", ingrese un numero : ");
        float a= leer.nextInt();
        //condicional if
        
        if(a>10) {
            System.out.println(nombre+ " el valor que ingreso es mayor que 10 ");
        }
        else if (a == 10){
            System.out.println(nombre+ " el valor que ingreso es igual que 10 ");
        }
        else{
            System.out.println(nombre+ " el valor que ingrso es menor que 10 ");
        }
    }
}    