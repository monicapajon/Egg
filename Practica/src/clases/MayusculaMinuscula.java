/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author monic
 */
public class MayusculaMinuscula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner (System.in); 
      System.out.print("Escriba una frase: ");
      String  frase = leer.nextLine();
      String mayuscula =toUpperCase(frase);
      String minuscula =toLowerCase(frase);
      System.out.println("la frase en mayuscula es: "+mayuscula);
      System.out.println("la frase en minuscula es: "+minuscula);
    }

   
    }
    

