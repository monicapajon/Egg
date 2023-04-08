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
public class suma {
    public static void main(String[] args) {
        int num1, num2, res;//declaramos el tipo de datos y sus variables
        Scanner sc = new Scanner(System.in);//cremos el objeto scanner para leer datos y asignarlos
        //a la variable correspondiente
        System.out.println("Ingrese el primer valor entero: ");
        num1 = sc.nextInt();//Leer un dato de tipo entero y asignarlo a num1
        System.out.println("Ingrese el segundo valor entero: ");
        num2 = sc.nextInt();//Leer un dato de tipo entero y asignarlo a num1
        res = num1 + num2;
        System.out.println("la suma de los valores ingresados es " + res);
    }
    
}
