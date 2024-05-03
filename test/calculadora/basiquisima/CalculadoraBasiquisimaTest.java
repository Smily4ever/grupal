/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calculadora.basiquisima;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author G513
 */
public class CalculadoraBasiquisimaTest {
    
    public CalculadoraBasiquisimaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class CalculadoraBasiquisima.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CalculadoraBasiquisima.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sumar method, of class CalculadoraBasiquisima.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        double a = 2.0;
        double b = 1.0;
        double expResult = 3.0;
        double result = CalculadoraBasiquisima.sumar(a, b);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of restar method, of class CalculadoraBasiquisima.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        double a = 2.0;
        double b = 1.0;
        double expResult = 1.0;
        double result = CalculadoraBasiquisima.restar(a, b);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicar method, of class CalculadoraBasiquisima.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        double a = 2.0;
        double b = 1.0;
        double expResult = 2.0;
        double result = CalculadoraBasiquisima.multiplicar(a, b);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of dividir method, of class CalculadoraBasiquisima.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        double a = 2.0;
        double b = 1.0;
        double expResult = 2.0;
        double result = CalculadoraBasiquisima.dividir(a, b);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype."); comentar lo fail para que funcione el testing
    }
    
}
