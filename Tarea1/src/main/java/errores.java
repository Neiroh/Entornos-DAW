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

//Comentario Inutil

public class errores {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
    **/
    
    public static void main(String[] args) throws IOException {
       // Declaración de variables
            Double  x, y, z;
            float a, b, c;
            String entrada, nombre;

            BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
            
            //Pedimos 2 números y sacamos el resto
            
            System.out.println("Escribe el valor de x: ");
            entrada = bufer.readLine();
            x = Double.parseDouble(entrada);
            System.out.println("Escribe el valor de y: ");
            entrada = bufer.readLine();
            y = Double.parseDouble(entrada);
            z = y % x;
            System.out.println("El residuo de dividir (" + y + ") entre (" + x + ") es: " + z);
            
            //Pedimos 2 números y sacamos el producto
            
            System.out.println("Escribe el valor de a: ");
            entrada = bufer.readLine();
            a = Float.parseFloat(entrada);
            System.out.println("Escribe el valor de b: ");
            entrada = bufer.readLine();
            b = Float.parseFloat(entrada);
            c = a * b ;
            System.out.println("El resultado de multiplicar a por b es: " + c);
            
            //Pedimos y sacamos el nombre
            
            System.out.println("Escribe tu nombre: ");
            nombre = bufer.readLine();
            System.out.println("El  nombre que escribiste es: " + nombre);
            
    }
}

