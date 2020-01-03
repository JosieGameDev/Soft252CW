/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctors.surgery.users;

import Interfaces.AccountManagement;
import Interfaces.AppointmentManagement;
import Interfaces.PatientInformation;
import Objects.Address;
import Objects.UserDatabase;

/**
 *
 * @author Josie
 */

// Patient subclass
// 
public class Patient extends SystemUser implements AppointmentManagement, PatientInformation, AccountManagement
{
    //specific values
    private Integer Age;
    private String Gender;

    public Patient() {
        super("Patient", UserDatabase.getInstanceOfDatabase());
    }
    
    //vars

    public Patient(String userType, String forename, String surname, Address address) {
        super("Patient", forename, surname, address);
    }
    
    public Patient(String forename, String surname, Address address, Integer age, String gender ) {
        super("Patient", forename, surname, address);
        this.Age = age;
        this.Gender = gender;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer Age) {
        this.Age = Age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }
    
    
    //methods
    public void giveRating()
    {
        //method to allow patient to give doctor feedback
    }
    
    public void viewPrescriptions()
    {
        //method to view current prescriptions
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
    public void makeAccount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeAccount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
