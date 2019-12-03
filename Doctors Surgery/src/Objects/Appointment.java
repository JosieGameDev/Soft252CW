/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import doctors.surgery.users.Doctor;
import doctors.surgery.users.Patient;

/**
 *
 * @author Josie
 */
public class Appointment 
{
    // vars
    private Patient patient;
    private Doctor doctor;
    private String dateAndTime;
    private String reasonForAppointment;
    
    // methods

    public Appointment(Patient patient, Doctor doctor, String dateAndTime, String reasonForAppointment) {
        this.patient = patient;
        this.doctor = doctor;
        this.dateAndTime = dateAndTime;
        this.reasonForAppointment = reasonForAppointment;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(String dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public String getReasonForAppointment() {
        return reasonForAppointment;
    }

    public void setReasonForAppointment(String reasonForAppointment) {
        this.reasonForAppointment = reasonForAppointment;
    }
    
    
}
