/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctors.surgery.users;

import Interfaces.AppointmentManagement;
import Interfaces.PatientInformation;

import Objects.Address;
import Objects.UserDatabase;

/**
 *
 * @author Josie
 */

// doctor subclass

public class Doctor extends SystemUser implements AppointmentManagement, PatientInformation
{

    public Doctor() {
        super("Doctor", UserDatabase.getInstanceOfDatabase());
    }

    public Doctor(String userType, String forename, String surname, Address address) {
        super("Doctor", forename, surname, address);
    }
    
    
    //vars
    
    //methods
    
    public void addNotes()
    {
        // can add notes to patients history
    }
    
    public void prescribeDrugs()
    {
        // can add new drugs to patients prescriptions
    }
    
    public void newMedicine()
    {
        // can make a new medicine object
    }

    @Override
    public void makeAppointment() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void viewHistory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void viewAppointments() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void viewPrescriptions() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
