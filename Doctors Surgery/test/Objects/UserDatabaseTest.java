/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import doctors.surgery.users.SystemUser;
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
public class UserDatabaseTest {
    
    public UserDatabaseTest() {
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
    public void testAddUser() {
        // create a user
        SystemUser tempUser = new SystemUser("Josie", "1234");
        //UserDatabase.addUser(tempUser);
        UserDatabase tempUserDatabase = UserDatabase.getInstanceOfDatabase();
        tempUserDatabase.addUser(tempUser);
        assertEquals(tempUser, tempUserDatabase.allUsers.get(0));
    }

    @Test
    public void testLogin() {
        //create user, add to database
        UserDatabase tempUserDatabase = UserDatabase.getInstanceOfDatabase();
        SystemUser testUser = new SystemUser("Administrator", tempUserDatabase);
        tempUserDatabase.addUser(testUser);
        
        assertTrue(tempUserDatabase.login("A1", "tempPw"));
    }

    @Test
    public void testGetNumberOfRoles() {
        
        UserDatabase tempUserDatabase = UserDatabase.getInstanceOfDatabase();
        SystemUser tempUser = new SystemUser("Josie", "123");
        tempUserDatabase.addUser(tempUser);
 
        //should currently have no doctors
        Integer num = 0;
        assertEquals(tempUserDatabase.getNumberOfRoles("Doctor"), num);
        
        // add an admin
        SystemUser testAdmin = new SystemUser("Doctor", tempUserDatabase);
        tempUserDatabase.addUser(testAdmin);
        tempUserDatabase.addUser(testAdmin);
        tempUserDatabase.addUser(testAdmin);
        assertTrue(tempUserDatabase.getNumberOfRoles("Doctor").equals(3));

    }
    
    @Test
    public void testGetListOfRoles()
    {
        UserDatabase tempUserDatabase = UserDatabase.getInstanceOfDatabase();
        SystemUser testRoleUser1 = new SystemUser("Patient", tempUserDatabase);
        tempUserDatabase.addUser(testRoleUser1);
        SystemUser testRoleUser2 = new SystemUser("Patient", tempUserDatabase);
        tempUserDatabase.addUser(testRoleUser2);
        SystemUser testRoleUser3 = new SystemUser("Patient", tempUserDatabase);
        tempUserDatabase.addUser(testRoleUser3);
        
        ArrayList<SystemUser> expectedList = new ArrayList<>(0);
        expectedList.add(testRoleUser1);
        expectedList.add(testRoleUser2);
        expectedList.add(testRoleUser3);
        
        tempUserDatabase.getListOfRoles("Patient");
        
        assertEquals(expectedList,tempUserDatabase.getListOfRoles("Patient") );
        
    }

    @Test
    public void testFindUser() {
    }

    @Test
    public void testGetInstanceOfDatabase() {
    }

    @Test
    public void testLogInAsUser() {
    }

    @Test
    public void testGetLoggedInUser() {
    }

    @Test
    public void testFindUserWithID() 
    {
        
        UserDatabase tempUserDatabase = UserDatabase.getInstanceOfDatabase();
        SystemUser tempUserSec = new SystemUser("Secretary", tempUserDatabase);
        tempUserDatabase.addUser(tempUserSec);
        assertEquals(tempUserSec.getID(), "S1");
        assertEquals(tempUserSec.getID(), tempUserDatabase.findUserWithID("S1").getID());
        //assertEquals(tempUserSec, tempUserDatabase.findUserWithID("S1"));
    }

    @Test
    public void testFindDoctor() {
    }
    
}
