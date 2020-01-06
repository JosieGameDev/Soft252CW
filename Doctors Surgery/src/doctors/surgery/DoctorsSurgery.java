/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctors.surgery;

import GUIs.Login;
import Objects.Address;
import Objects.DoctorRating;
import Objects.DoctorRatingsDatabase;
import Objects.UserDatabase;
import doctors.surgery.users.Administrator;
import doctors.surgery.users.Doctor;
import doctors.surgery.users.Patient;
import doctors.surgery.users.Secretary;
import doctors.surgery.users.SystemUser;

/**
 *
 * @author Josie
 */
public class DoctorsSurgery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Populate databases with users and objects to show off functionalit
        
        UserDatabase userData = UserDatabase.getInstanceOfDatabase();
        DoctorRatingsDatabase doctorRates = DoctorRatingsDatabase.getInstanceOfDatabase();
        
        
        //making addresses
        Address add1 = new Address("Stark Tower", "5th Avenue", "New York", "AVN GRS");
        Address add2 = new Address(13, "North Hill Rd", "Plymouth", "PL4 SMM");
        Address add3 = new Address ("Secret Batcave", "Edgy Island", "Gotham", "2KWL 4U");
        Address add4 = new Address ("Secret Hideout", "Unknown", "Unknown", "??? ???");
        //Making Doctors String forename, String surname, Address address
        Doctor doc1 = new Doctor("Bruce", "Wayne", add3);
        Doctor doc2 = new Doctor("Doctor", "Who", add2);
        Doctor doc3 = new Doctor("James", "Haytor", add1);
        
        //making patientsString forename, String surname, Address address, Integer age, String gender
        Patient pat1 = new Patient("Moth", "Man", add4, 69, "BigBoi" );
        Patient pat2 = new Patient("Robin", "Bat", add3, 12, "Male");
        
        //making admin String userType, String forename, String surname, Address address
        Administrator admin = new Administrator("Alfred", "BatDad", add3);
        
        //making sec
        Secretary sec = new Secretary ("Clark", "Kent", add4);
        
        userData.addUser(sec);
        userData.addUser(doc1);
        userData.addUser(doc2);
        userData.addUser(doc3);
        userData.addUser(pat1);
        userData.addUser(pat2);
        userData.addUser(admin);
        
        //making ratings  Doctor doctor, Integer rateOutOfFive, String comments
        DoctorRating rate1 = new DoctorRating(doc1, 5, "I like how dramatically he enters appointments");
        DoctorRating rate2 = new DoctorRating(doc1, 2, "Too broody for my tastes");
        DoctorRating rate3 = new DoctorRating(doc1, 4, "Good doctor, only issue is he talks too low for me to hear");
        
        DoctorRating rate4 = new DoctorRating(doc2, 5, "Good bedside manner, wise beyond their years");
        DoctorRating rate5 = new DoctorRating(doc2, 2, "Always makes bad puns about their name");
        DoctorRating rate6 = new DoctorRating(doc2, 5, "Funky");
        
        DoctorRating rate7 = new DoctorRating(doc3, 5, "Gives students cheat sheets for lectures, what a lad");
        DoctorRating rate8 = new DoctorRating(doc3, 4, "Gives CGD students shout outs in lectures");
        
        doctorRates.addNewRating(rate1);
        doctorRates.addNewRating(rate2);
        doctorRates.addNewRating(rate3);
        doctorRates.addNewRating(rate4);
        doctorRates.addNewRating(rate5);
        doctorRates.addNewRating(rate6);
        doctorRates.addNewRating(rate7);
        doctorRates.addNewRating(rate8);
        
        
        
        
        
        
        
       
                
        
        // OPEN LOGIN
        new Login().setVisible(true);
        
        
    }
    
}
