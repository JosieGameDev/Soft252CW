/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctors.surgery.users;

import Objects.Address;
import Objects.UserDatabase;
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
public class SystemUserTest {
    
    UserDatabase tempUserDatabase = UserDatabase.getInstanceOfDatabase();
    Address patientAddress = new Address(380, "Dorchester Road", "Weymouth", "DT3 5AW");
    
    public SystemUserTest() 
            
    {
    }
    
    @BeforeClass
    public static void setUpClass() {
                  //make a database to use
        UserDatabase tempUserDatabase = UserDatabase.getInstanceOfDatabase();
      
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
    public void testGetFirstLetterID() {
        SystemUser testUser1 = new SystemUser("Josie", "1234");
        assertTrue(testUser1.getFirstLetterID().equals("J"));
    }
    
    @Test
    public void testBasicConstructor()
    {

        // testing basic method
        SystemUser testUser1 = new SystemUser("Josie", "1234");
        assertTrue(testUser1.getID().equals("Josie"));
    }
    
    @Test
    public void testGenerateIDConstructor()
    {
        //testing creating one of each type with correct ID
        SystemUser testUser2 = new SystemUser("Administrator", tempUserDatabase);
        assertEquals(testUser2.getID(), "A1");
        SystemUser testUser3 = new SystemUser("Doctor", tempUserDatabase);
        assertEquals(testUser3.getID(), "D1");
        SystemUser testUser4 = new SystemUser("Patient", tempUserDatabase);
        assertEquals(testUser4.getID(), "P1");
        SystemUser testUser5 = new SystemUser("Secretary", tempUserDatabase);
        assertEquals(testUser5.getID(), "S1");
        
        //testing making multiples with correct, unique ID
        tempUserDatabase.addUser(testUser2);
        SystemUser testUser6 = new SystemUser("Administrator", tempUserDatabase);
        tempUserDatabase.addUser(testUser6);
        SystemUser testUser7 = new SystemUser("Administrator", tempUserDatabase);
        tempUserDatabase.addUser(testUser7);
        assertEquals(testUser7.getID(), "A3");
    }
    
    @Test
    public void testConstructorWithPersonalInfo()
    {
        // creates a user with given address, names, and generates ID
        SystemUser testUser8 = new SystemUser("Patient",  "Jacksie", "Woower", patientAddress );
        Integer houseNum = 380;
        assertTrue(houseNum.equals( testUser8.getAddress().getHouseNumber()));
        assertTrue("DT3 5AW".equals(testUser8.getAddress().getPostcode()));
        assertTrue("Jacksie".equals(testUser8.getForename()));
        assertTrue("Woower".equals(testUser8.getSurname())); 
        assertTrue("P1".equals(testUser8.getID()));
    }
}
