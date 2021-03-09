/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaunidad3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author arce
 */
public class CCuentaTest {
    
    public CCuentaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of asignarNombre method, of class CCuenta.
     */
//    @Test
//    public void testAsignarNombre() {
//        System.out.println("asignarNombre");
//        String nom = "";
//        CCuenta instance = new CCuenta();
//        instance.asignarNombre(nom);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of obtenerNombre method, of class CCuenta.
     */
//    @Test
//    public void testObtenerNombre() {
//        System.out.println("obtenerNombre");
//        CCuenta instance = new CCuenta();
//        String expResult = "";
//        String result = instance.obtenerNombre();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of estado method, of class CCuenta.
     */
//    @Test
//    public void testEstado() {
//        System.out.println("estado");
//        CCuenta instance = new CCuenta();
//        double expResult = 0.0;
//        double result = instance.estado();
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of ingresar method, of class CCuenta.
//     */
    @Test
    public void testIngresar() throws Exception {
        System.out.println("ingresar");
        double cantidad = 100.0;
        CCuenta instance = new CCuenta("raul", "123456789", 2500);
        instance.ingresar(cantidad);
        assertEquals(2500, 2600);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of retirar method, of class CCuenta.
     * @throws java.lang.Exception
     */
//    @Test
//    public void testRetirar() throws Exception {
//        System.out.println("retirar");
//        double cantidad = 100.0;
//        CCuenta instance = new CCuenta("raul", "12345", 2500);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }

    /**
     * Test of obtenerCuenta method, of class CCuenta.
     */
//    @Test
//    public void testObtenerCuenta() {
//        System.out.println("obtenerCuenta");
//        CCuenta instance = new CCuenta();
//        String expResult = "";
//        String result = instance.obtenerCuenta();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
