/*
 * Implementa un programa que pida al usuario un valor entero A utilizando un nextInt() (de Scanner) y luego muestre por pantalla el mensaje “Valor introducido: ...”. Se deberá tratar la excepción InputMismatchException que lanza nextInt() cuando no se introduce un entero válido. En tal caso se mostrará el mensaje “Valor introducido incorrecto”.
 * 
 * @author Julia López de la Torre
 * @creation date 10/04/2023
 */

import java.util.InputMismatchException; 
import java.util.Scanner;

 public class ejercicio {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in); 

        System.out.println("Introduzca un valor entero: ");        // se pide la entrada de un dato entero

        try {                                                        // instrucciones con posibles excepciones
          int num = s.nextInt();

          System.out.println("Valor introducido: "+num);  


        } catch (InputMismatchException i){                          // instrucciones a realizar en caso de excepcion
            System.out.println("Valor introducido incorrecto");
            i.printStackTrace();                                    // se muestra la pila de llamadas
        } 

    }
 }

 // David Martos