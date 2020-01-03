/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctors.surgery.users;

import Objects.Address;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jwood20
 */
public class PatientTest {
    
    Address patientAddress = new Address(12, "Ullswater Lane", "Weymouth", "DT4");
    
    public PatientTest() {
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

    @Test
    public void testGiveRating() {
    }

    @Test
    public void testViewPrescriptions() {
    }

    @Test
    public void testMakeAppointment() {
    }

    @Test
    public void testViewHistory() {
    }

    @Test
    public void testViewAppointments() {
    }

    @Test
    public void testMakeAccount() {
    }

    @Test
    public void testRemoveAccount() {
    }
    
    @Test 
    public void testPatientConstructor()
    {
        Patient testPatient = new Patient("Kim", "Culverhouse", patientAddress, 21, "Female");
        assertTrue("Kim".equals(testPatient.getForename()));
        Integer patientAge = 21;
        assertTrue(patientAge.equals(testPatient.getAge()));
        assertTrue("Female".equals(testPatient.getGender()));
    }
    
}
