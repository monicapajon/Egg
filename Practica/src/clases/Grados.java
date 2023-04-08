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
public class Grados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer;
        leer = new Scanner(System.in);
        System.out.println("coloque grados Centigrados");
        double c = leer.nextDouble();
        double f = 32 + (9 * c / 5);
        System.out.println("los grados equivalentes son: " + f);
    }

}
