/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.util.ArrayList;
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
public class PatientHistoryTest {
    
    PatientHistory testPatHist = new PatientHistory();
    Appointment newAppt = new Appointment();
    Prescription newPresc = new Prescription();
    
    public PatientHistoryTest() {
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
    public void testAddAppointment() {
        
        //make appointment object to add to history record
        
        testPatHist.getUpcomingAppointments().add(newAppt);
        ArrayList<Appointment> tempApptList = new ArrayList<>();
        tempApptList.add(newAppt);
        
        assertEquals(tempApptList, testPatHist.getUpcomingAppointments());
        
    }

    @Test
    public void testAddPrescription() {
        testPatHist.addPrescription(newPresc);
        ArrayList<Prescription> tempPrescList = new ArrayList<>(0);
        tempPrescList.add(newPresc);
        assertEquals(tempPrescList, testPatHist.getCurrentPrescriptions());
    }

    @Test
    public void testMoveApptToPast() {
        testPatHist.moveApptToPast(newAppt);
        ArrayList<Appointment> tempApptList = new ArrayList<>(0);
        assertEquals(tempApptList, testPatHist.getUpcomingAppointments() );
        tempApptList.add(newAppt);
        assertEquals(tempApptList, testPatHist.getPastAppointments());
    }

    @Test
    public void testFinishPrescriptiom() {
        
        testPatHist.finishPrescriptiom(newPresc);
        ArrayList<Prescription> tempPrescList = new ArrayList<>(0);
        assertEquals(tempPrescList, testPatHist.getCurrentPrescriptions());
        tempPrescList.add(newPresc);
        assertEquals(tempPrescList, testPatHist.getPastPrescriptions());
    }


}
