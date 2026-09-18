/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.assignment;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author tefy
 */
public class LoginTest {
    
    public LoginTest() {
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
     * Test of main method, of class Registration.
     */
    @org.junit.jupiter.api.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Registration.main(args);
        
       
    }

    /**
     * Test of user method, of class Login.
     */
    @Test
    public void testUser() {
        System.out.println("user");
        Login instance = new Login();
        String expResult = "";
        String result = instance.user();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of strPassword method, of class Login.
     */
    @Test
    public void testStrPassword() {
        System.out.println("strPassword");
        Login instance = new Login();
        String expResult = "Tafadzwa@2005";
        String result = instance.strPassword();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of checkCellPhoneNumber method, of class Login.
     */
    @Test
    public void testCheckCellPhoneNumber() {
        System.out.println("checkCellPhoneNumber");
        Login instance = new Login();
        String expResult = "";
        String result = instance.checkCellPhoneNumber();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of authentication method, of class Login.
     */
    @Test
    public void testAuthentication() {
        System.out.println("authentication");
        Login instance = new Login();
        String expResult = "";
        String result = instance.authentication();
        assertEquals(expResult, result);
       
    }
    
}
