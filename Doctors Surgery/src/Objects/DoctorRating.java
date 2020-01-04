/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import doctors.surgery.users.Doctor;

/**
 *
 * @author jwood20
 */
public class DoctorRating {
    public Doctor doctor;
    public Integer rateOutOfFive;
    public String comments;

    public DoctorRating(Doctor doctor, Integer rateOutOfFive, String comments) {
        this.doctor = doctor;
        this.rateOutOfFive = rateOutOfFive;
        this.comments = comments;
    }
    
    public DoctorRating(Doctor doctor, Integer rateOutOfFive) {
        this.doctor = doctor;
        this.rateOutOfFive = rateOutOfFive;
        this.comments = "";
    }
    
    public DoctorRating()
    {
        //testn doc 
        Doctor testDoc = new Doctor();
        this.doctor = testDoc;
        this.rateOutOfFive = 5;
        this.comments = "test rating";
    }
    
    public DoctorRating(String surname, Integer rateOutOfFive, String comments) {
        Doctor testDoc = new Doctor(surname);
        this.doctor = testDoc;
        this.rateOutOfFive = rateOutOfFive;
        this.comments = comments;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Integer getRateOutOfFive() {
        return rateOutOfFive;
    }

    public String getComments() {
        return comments;
    }
    
    
    
    
}
