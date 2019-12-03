/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctors.surgery.users;

import Interfaces.AccountManagement;
import Interfaces.AppointmentManagement;

/**
 *
 * @author Josie
 */

// sec subclass
public class Secretary implements AppointmentManagement, AccountManagement
{
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
    public void makeAccount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeAccount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
