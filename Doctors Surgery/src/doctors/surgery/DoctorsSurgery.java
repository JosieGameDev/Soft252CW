/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctors.surgery;

import GUIs.Login;
import Objects.Address;
import Objects.Appointment;
import Objects.DoctorRating;
import Objects.DoctorRatingsDatabase;
import Objects.Medicine;
import Objects.Prescription;
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
       
        UserDatabase userData = UserDatabase.getInstanceOfDatabase();
        DoctorRatingsDatabase docRatings = DoctorRatingsDatabase.getInstanceOfDatabase();
        //populate databse
        Address newAdd1 = new Address("The Batcave", "Edgy Island", "Gotham City", "2kwl 4u");
        Address newAdd2 = new Address("Plymouth University", "Drake Circus", "Plymouth", "PLSomething");
        Address newAdd3 = new Address(64, "Zoo Lane", "Townsville", "TWN ZOO");
        
        //make medicines
        Medicine newMed1 = new Medicine("Citalopram", "SSRI Antidepressent");
        Medicine newMed2 = new Medicine("Cocodamol", "Strong Painkiller");
        Medicine newMed3 = new Medicine("Insulin", "Diabetes Control");
        
        Administrator newAdmin = new Administrator("Alfred", "Batdad", newAdd1);
        userData.addUser(newAdmin);
        
        Doctor newDoc1 = new Doctor("Bruce", "Wayne", newAdd1);
        userData.addUser(newDoc1);
        Doctor newDoc2 = new Doctor("Lucy", "Jones", newAdd3);
        userData.addUser(newDoc2);
        Doctor newDoc3 = new Doctor("James", "Hayter", newAdd2);
        userData.addUser(newDoc3);
        Doctor newDoc4 = new Doctor("Barbara", "Gordon", newAdd1);
        userData.addUser(newDoc4);
        
        Secretary newSec = new Secretary("Robin", "Batson", newAdd1);
        userData.addUser(newSec);
        
        //make prescriptions Medicine medicine, String instructions, Doctor doctor, Patient patient
        //medicine - String name, String description
        //apt Patient patient, Doctor doctor, String dateAndTime, String reasonForAppointment
        
        
        Patient newPat = new Patient("Bat", "Man", newAdd1, 40, "Male");
        Prescription pres1 = new Prescription(newMed1, "One a day with water", newDoc4, newPat);
        newPat.getPatientHistory().addPrescription(pres1);
        Prescription pres2 = new Prescription(newMed2, "Upto 4 a day to relieve pain", newDoc4, newPat);
        newPat.getPatientHistory().addPrescription(pres2);
        newPat.getPatientHistory().finishPrescriptiom(pres2);
        Prescription pres3 = new Prescription(newMed3, "Takes as needed when blood sugar is critically low", newDoc4, newPat);
        newPat.getPatientHistory().addPrescription(pres3);
        newPat.getPatientHistory().finishPrescriptiom(pres3);
        Appointment app1 = new Appointment(newPat, newDoc4, "3pm 1st Feb 2018", "Patient feeling overly dramatic");
        newPat.getPatientHistory().addAppointment(app1);
        newPat.getPatientHistory().moveApptToPast(app1);
        Appointment app2 = new Appointment(newPat, newDoc1, "11AM 5th November 2018", "Patient believes they are the doctor");
        newPat.getPatientHistory().addAppointment(app2);
        newPat.getPatientHistory().moveApptToPast(app2);
        userData.addUser(newPat);
        
        Patient newPat2 = new Patient("Denace", "The-Menace", newAdd2, 12, "Male");
        Prescription pres4 = new Prescription(newMed2, "Take 3 times a day to relieve pain", newDoc1, newPat2);
        newPat2.getPatientHistory().addPrescription(pres2);
        userData.addUser(newPat2);
        Patient newPat3 = new Patient("Josie", "Wood", newAdd3, 21, "Female");
        userData.addUser(newPat3);
        
        //add all to database
        
        System.out.println(userData.findUserWithID("P3").getForename());
        
        //make ratings Doctor doctor, Integer rateOutOfFive, String comments
        DoctorRating rate1 = new DoctorRating(newDoc1, 4, "Good dude, always goes on about how amazing Batman is though.");
        docRatings.addNewRating(rate1);
        DoctorRating rate2 = new DoctorRating(newDoc1, 1, "Really broddy. Seems fake");
        DoctorRating rate3 = new DoctorRating(newDoc2, 5, "Really fab");
        DoctorRating rate4 = new DoctorRating(newDoc2, 2, "Waiting room has bad magazines");
        DoctorRating rate5 = new DoctorRating(newDoc3, 5, "Gives his students cheat sheets after lectures, what a lad");
        DoctorRating rate6 = new DoctorRating(newDoc3, 4, "Good dude, but likes snickers, an arguably gross chocolate");
        DoctorRating rate7 = new DoctorRating(newDoc4, 3, "Good care, also her dad is the commissioner so don't be mean to her or she will fuck you up");
        DoctorRating rate8 = new DoctorRating(newDoc4, 5, "If you're nice you get to call her Babs" );
        
        
        docRatings.addNewRating(rate2);
        docRatings.addNewRating(rate3);
        docRatings.addNewRating(rate4);
        docRatings.addNewRating(rate5);
        docRatings.addNewRating(rate6);
        docRatings.addNewRating(rate7);
        docRatings.addNewRating(rate8);
        
        
        //OPen login
        new Login().setVisible(true);
        
        
    }
    
}
