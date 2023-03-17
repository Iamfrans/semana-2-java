/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package friday;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Friday {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
        //impleamos la entada de texto
        
        System.out.println("ingrese su nombre: ");
        String nombre = leer.next();
        System.out.println("Hola " +nombre+  ", ingrese un numero : ");
        float a= leer.nextFloat();
        //condicional if
        
        if(a>0) {
            System.out.println("Hola " +nombre+ " el numero que ingreso es positivo");
        }
        else if (a==0){
            System.out.println("Hola "+nombre+ " el numero que ingreso es neutro ");
        }
        else{
            System.out.println("Hola " +nombre+ " el numero que ingrso es negativo");
        }
    }
}    