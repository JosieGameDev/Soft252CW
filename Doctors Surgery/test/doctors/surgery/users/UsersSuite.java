/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctors.surgery.users;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author jwood20
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({doctors.surgery.users.AdministratorTest.class, doctors.surgery.users.NewUserTest.class, doctors.surgery.users.PatientTest.class, doctors.surgery.users.SecretaryTest.class, doctors.surgery.users.SystemUserTest.class, doctors.surgery.users.DoctorTest.class})
public class UsersSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
