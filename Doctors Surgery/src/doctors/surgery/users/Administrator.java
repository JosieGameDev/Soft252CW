/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctors.surgery.users;

import Interfaces.AccountManagement;
import Interfaces.DoctorRatings;
import Objects.Address;
import Objects.UserDatabase;

/**
 *
 * @author Josie
 */

// Admin subclass

public class Administrator extends SystemUser implements DoctorRatings, AccountManagement
{

    public Administrator(String userType, UserDatabase userSystem) {
        super("Administrator", UserDatabase.getInstanceOfDatabase());
    }

    public Administrator(String userType, String forename, String surname, Address address) {
        super("Administrator", forename, surname, address);
    }
    
    //vars
    
    //methods
    
    public void reviewRatings()
    {
        
    }

    @Override
    public void viewRatings() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void makeAccount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeAccount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
