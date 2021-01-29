/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arce
 */
import java.util.Scanner;

public class lectura {
    
    /*Este programa pide dos números al usuario y dice cual es mayor*/
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declara Variables
        int num1, num2;
        
        System.out.println("Escribe el valor del primer número.. ");
        num1 = sc.nextInt();
        
        System.out.println("Escribe el valor del segundo número.. ");
        num2 = sc.nextInt();
        
        if(num1 > num2){
            System.out.println("El valor mayor es.. " +num1);
        }else if(num1 == num2){
            System.out.println("El valor de ambos números es igual.. " +num1);
        }else{
            System.out.println("El valor mayor es.. " +num2);
        }
    }
}
