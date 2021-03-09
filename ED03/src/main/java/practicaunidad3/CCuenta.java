/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaunidad3;

/**
 *
 * @author Neiroh
 */
public class CCuenta {

    // Propiedades de la Clase Cuenta
    private String nombre;
    private String cuenta;
    private double saldo;

    /* Constructor sin argumentos */
    public CCuenta() {
    }

    // Constructor con parámetro para iniciar todas las propiedades de la clase
    //@param nom almacena el nombre del usuario de la cuenta
    //@param cue almacena la cuenta
    //@param sal almacena el saldo que el usuario tiene en la cuenta
    public CCuenta(String nom, String cue, double sal) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    // Método para asignar el nombre del titular de la cuenta
    //@param nom almacena el nombre del usuario de la cuenta
    public void asignarNombre(String nom) {
        nombre = nom;
    }

    // Método que me devuelve el nombre del titular
    //@param nom almacena el nombre del usuario de la cuenta
    public String obtenerNombre() {
        return nombre;
    }

    // Método que me devuelve el saldo disponible en cada momento
    public double estado() {
        return saldo;
    }

    /* Método para ingresar cantidades en la cuenta. Modifica el saldo.
     * Este método va a ser probado con Junit
     */
    //@param cantidad almacena la cantidad de saldo a ingresar
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo += cantidad;
    }

    /* Método para retirar cantidades en la cuenta. Modifica el saldo.
     * Este método va a ser probado con Junit
     */
    //@param cantidad almacena la cantidad a retirar
    public void retirar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No hay suficiente saldo");
        }
        saldo -= cantidad;
    }

    // Método que me devuelve el número de cuenta
    public String obtenerCuenta() {
        return cuenta;
    }
}