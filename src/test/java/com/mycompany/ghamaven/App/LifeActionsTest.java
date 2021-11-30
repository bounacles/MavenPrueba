/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ghamaven.App;

import com.mycompany.ghamaven.Persona;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author pablo
 */
public class LifeActionsTest {
    
    public LifeActionsTest() {
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

    @org.junit.Test
    public void testDead() {
        
        Persona persona = new Persona("a","b",80);
        boolean resultA = persona.isAlive();
        boolean expResultA = true;
        
        LifeActions.morir(persona);
        
        boolean resultD = persona.isAlive();
        boolean expResultD = true;
        
        assertEquals(expResultA, resultA);
        assertEquals(expResultD, resultD);
        
    }
    
    @org.junit.Test
    public void testMayorDeEdad() {
        
        Persona persona17 = new Persona("a","b",17);
        Persona persona18 = new Persona("a","b",18);
        Persona persona19 = new Persona("a","b",19);
        
        boolean result17 = LifeActions.mayorDeEdad(persona17);
        boolean result18 = LifeActions.mayorDeEdad(persona18);
        boolean result19 = LifeActions.mayorDeEdad(persona19);
        
        boolean expResult17 = false;
        boolean expResult18 = true;
        boolean expResult19 = true;
        
        assertEquals(expResult17, result17);
        assertEquals(18, persona18.getAge());
        assertEquals(expResult18, result18);
        assertEquals(expResult19, result19);
        
    }
    
}
