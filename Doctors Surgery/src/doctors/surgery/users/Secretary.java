/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctors.surgery.users;

import Interfaces.AccountManagement;
import Interfaces.AppointmentManagement;
import Objects.Address;
import Objects.UserDatabase;

/**
 *
 * @author Josie
 */

// sec subclass
public class Secretary extends SystemUser  implements AppointmentManagement, AccountManagement
{

    public Secretary() {
        super("Secretary", UserDatabase.getInstanceOfDatabase());
    }

    public Secretary(String forename, String surname, Address address) {
        super("Secretary", forename, surname, address);
    }
    
    //vars
    
    //methods
    public void dispensePrescription()
    {
        // can dispense prescription to a patient if its in stock
    }
    
    public void orderStock()
    {
        // can order more medicines as required 
    }

    @Override
    public void makeAppointment() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void makeAccount(String UserType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeAccount(SystemUser accToRemove) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
