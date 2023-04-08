/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author monic
 */
public class CondVideo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int opinion;
        Scanner leer = new Scanner(System.in);
        System.out.println("Intoduzca una puntuacion del 1 al 5");
        opinion = leer.nextInt();

        if (opinion >= 1 && opinion <= 5) {
            switch (opinion) {
                case 1:
                case 2:
                    System.out.println("Que bajo puntaje!!");   

                    breack;
                case 3:
                    System.out.println("Que es lo que no te gusto??");
                    breack;
                case 4:
                    System.out.println("Casi que si te gusto");
                    //breack;
                case 5:
                    System.out.println("Que bueno que te haya gustado!!");
                    breack;
                    
            }else if (opinion == 0){
                    System.out.println("El valor " + opinion + "no válida");
                    } else if (opinion < 0) {
                    System.out.println("El valor " + opinion + "es un número negativo");
                    }else{
                    System.out.println("Que tengas linda noche!!");
                    
                   
                    }

        }

    }
}
