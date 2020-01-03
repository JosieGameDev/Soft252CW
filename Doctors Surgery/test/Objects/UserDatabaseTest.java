/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import doctors.surgery.users.SystemUser;
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
        UserDatabase tempUserDatabase = new UserDatabase();
        tempUserDatabase.addUser(tempUser);
        assertEquals(tempUser, tempUserDatabase.allUsers.get(0));
    }

    @Test
    public void testLogin() {
        fail("Test not complete");
    }
    
}
