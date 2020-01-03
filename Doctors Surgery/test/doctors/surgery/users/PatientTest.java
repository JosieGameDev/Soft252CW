/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctors.surgery.users;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Josie
 */
public class PatientTest {
    
    public PatientTest() {
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
     * Test of giveRating method, of class Patient.
     */
    @Test
    public void testGiveRating() {
        System.out.println("giveRating");
        Patient instance = new Patient();
        instance.giveRating();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of viewPrescriptions method, of class Patient.
     */
    @Test
    public void testViewPrescriptions() {
        System.out.println("viewPrescriptions");
        Patient instance = new Patient();
        instance.viewPrescriptions();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
