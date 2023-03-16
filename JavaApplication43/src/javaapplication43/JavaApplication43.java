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
        System.out.println("ingrese el primer numero: ");
        int a= leer.nextInt();
        System.out.println("Ingrese e segundo numero: ");
        int b= leer.nextInt();
         if(a>b) {
            System.out.println("El numro mayor es " +a+ " y el numero menor es " +b);
        }   else{
            System.out.println("El numro mayor es " +b+ " y el numro menor es " +a);
        }
    }
}    