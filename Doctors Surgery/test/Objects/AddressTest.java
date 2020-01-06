/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
public class AddressTest {
    
    public AddressTest() {
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
    public void testGetHouseName() {
    }

    @Test
    public void testSetHouseName() {
    }

    @Test
    public void testGetHouseNumber() {
    }

    @Test
    public void testSetHouseNumber() {
    }

    @Test
    public void testGetStreetName() {
    }

    @Test
    public void testSetStreetName() {
    }

    @Test
    public void testGetTown() {
    }

    @Test
    public void testSetTown() {
    }

    @Test
    public void testGetPostcode() {
    }

    @Test
    public void testSetPostcode() {
    }

    @Test
    public void testWriteToFile() {
        //create an address
        Address testAddress = new Address("The Cottage", "Waterloo Street", "Plymouth", "PL4 8NS");
        testAddress.writeToFile("TestFile");
        
        //read back in
        // Deserialization 
        Address testAddress2 = new Address();
        testAddress2 = testAddress2.readAddressFromFile("TestFile", testAddress2);
        
        //test bit
        assertEquals(testAddress.getPostcode(), testAddress2.getPostcode());
        
    }
    
}
