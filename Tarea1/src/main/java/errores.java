/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Gaby Nieva
 */

public class errores {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
    **/
    
    public static void main(String[] args) throws IOException {
       // Declaración de variables
            Double  x, y, z;
            float a, b, c;
            
            BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
            String entrada, nombre;
            
            System.out.println("Escribe el valor de x: ");
            entrada = bufer.readLine();
            x = Double.parseDouble(entrada);
            System.out.println("Escribe el valor de y: ");
            entrada = bufer.readLine();
            y = Double.parseDouble(entrada);
            z = y / x;
            System.out.println("El residuo de dividir (" + y + ") entre (" + x + ") es: " + z);
            
            System.out.println("Escribe el valor de a: ");
            entrada = bufer.readLine();
            a = Float.parseFloat(entrada);
            System.out.println("Escribe el valor de b: ");
            entrada = bufer.readLine();
            b = Float.parseFloat(entrada);
            c = a * b ;
            System.out.println("El resultado de multiplicar a por b es: " + c);
            
            System.out.println("Escribe tu nombre: ");
            nombre = bufer.readLine();
            System.out.println("El  nombre que escribiste es: " + nombre);
            
    }
}

