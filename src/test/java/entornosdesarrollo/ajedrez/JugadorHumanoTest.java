/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package entornosdesarrollo.ajedrez;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuario
 */
public class JugadorHumanoTest {
    
    public JugadorHumanoTest() {
    }

    @Test
    public void testRegistrarse() {
        System.out.println("registrarse");
        String nombre = "";
        String password = "";
        JugadorHumano instance = new JugadorHumano();
        boolean expresion = true;
        boolean resultado = instance.registrarse("Minombre", "passwordlarga");
        assertEquals(expresion,resultado);
//fail("The test case is a prototype.");
    }
/*
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        JugadorHumano instance = new JugadorHumano();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String value = "";
        JugadorHumano instance = new JugadorHumano();
        instance.setNombre(value);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        JugadorHumano instance = new JugadorHumano();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String value = "";
        JugadorHumano instance = new JugadorHumano();
        instance.setPassword(value);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPreferencias() {
        System.out.println("getPreferencias");
        JugadorHumano instance = new JugadorHumano();
        String expResult = "";
        String result = instance.getPreferencias();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetPreferencias() {
        System.out.println("setPreferencias");
        String value = "";
        JugadorHumano instance = new JugadorHumano();
        instance.setPreferencias(value);
        fail("The test case is a prototype.");
    }
    */
}
