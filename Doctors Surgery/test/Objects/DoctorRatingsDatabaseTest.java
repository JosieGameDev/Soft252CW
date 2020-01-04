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
public class DoctorRatingsDatabaseTest {
    
    DoctorRatingsDatabase ratings = DoctorRatingsDatabase.getInstanceOfDatabase();
    
    public DoctorRatingsDatabaseTest() {
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
    public void testGetInstanceOfDatabase() {
    }

    @Test
    public void testAddNewRating() {
        DoctorRating testRating = new DoctorRating();
        ratings.addNewRating(testRating);
        ArrayList<DoctorRating> testArray = new ArrayList<>(0);
        testArray.add(testRating);
        assertEquals(testArray, ratings.getAllRatings());
    }

    @Test
    public void testGetAllRatings() {
    }
    
}
