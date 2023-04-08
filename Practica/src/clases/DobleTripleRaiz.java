/*
 Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().

 */
package clases;

import java.util.Scanner;

/**
 *
 * @author monic
 */
public class DobleTripleRaiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer;
        
        leer = new Scanner(System.in);
        System.out.println("Escriba un número entero");
        // La raíz cuadrada de 16
//System.out.println(Math.sqrt());
         int numero = leer.nextInt();
                int doble = numero * 2;
                int triple = numero*3;
                double raiz = Math.sqrt(numero);
                
                
        System.out.println("El doble del numero es: " + doble );
        System.out.println("El triple del numero es: "  + triple);
        System.out.println("La raiz cuadrada del numero es " + raiz);
    
    }
}
