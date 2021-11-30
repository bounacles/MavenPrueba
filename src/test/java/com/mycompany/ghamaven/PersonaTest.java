/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ghamaven;

import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author pablo
 */
public class PersonaTest {
    
    public PersonaTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    //@BeforeAll
    //public static void setUpClass() {
    //}
    
    //@AfterAll
    //public static void tearDownClass() {
    //}
    
    //@BeforeEach
    //public void setUp() {
    //}
    
    //@AfterEach
    //public void tearDown() {
    //}

    /**
     * Test of hBirthday method, of class Persona.
     */
    @org.junit.Test
    public void testHBirthday() {
        System.out.println("hBirthday");
        
        Random random = new Random();
        int initAge = random.nextInt();
        
        Persona instance = new Persona("a","b",initAge,false);
        instance.hBirthday();
        int expResultD=initAge;
        int resultD = instance.getAge();
        // TODO review the generated test code and remove the default call to fail.
        
        instance.setAlive(true);
        instance.hBirthday();
        
        int expResultA=initAge + 1;
        int resultA = instance.getAge();        
        
        assertEquals(expResultD, resultD);
        assertEquals(expResultA, resultA);


    }

    /**
     * Test of getId method, of class Persona.
     */
    @org.junit.Test
    public void testGetId() {
        System.out.println("getId");
        Persona instance = new Persona("a","b",2);
        String expResult = "a";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Persona.
     */
    @org.junit.Test
    public void testSetId() {
    }

    /**
     * Test of getName method, of class Persona.
     */
    @org.junit.Test
    public void testGetName() {
    }

    /**
     * Test of setName method, of class Persona.
     */
    @org.junit.Test
    public void testSetName() {
    }

    /**
     * Test of getAge method, of class Persona.
     */
    @org.junit.Test
    public void testGetAge() {
    }

    /**
     * Test of isAlive method, of class Persona.
     */
    @org.junit.Test
    public void testIsAlive() {
    }

    /**
     * Test of setAlive method, of class Persona.
     */
    @org.junit.Test
    public void testSetAlive() {
    }
    
}
