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


public class Prescription 
{
    // vars
    private Medicine medicine;
    private String instructions;
    private Doctor doctor;
    private Patient patient;
    
    // methods

    public Prescription(Medicine medicine, String instructions, Doctor doctor, Patient patient) {
        this.medicine = medicine;
        this.instructions = instructions;
        this.doctor = doctor;
        this.patient = patient;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    
}
