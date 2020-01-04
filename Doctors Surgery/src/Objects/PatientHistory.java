/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.util.ArrayList;

/**
 *
 * @author jwood20
 */
public class PatientHistory {
    // each aptient has a history object which holds patient history, past appts, upcoming appts, prescriptions
    private ArrayList<Appointment> pastAppointments;
    private ArrayList<Appointment> upcomingAppointments;
    private ArrayList<Prescription> pastPrescriptions;
    private ArrayList<Prescription> currentPrescriptions;

    public PatientHistory() 
    {
        pastAppointments = new ArrayList<>(0);
        upcomingAppointments = new ArrayList<>(0);
        pastPrescriptions = new ArrayList<>(0);
        currentPrescriptions = new ArrayList<>(0);
    }

    public void addAppointment(Appointment newAppt)
    {
        upcomingAppointments.add(newAppt);
    }
    public void addPrescription(Prescription newPresc)
    {
        currentPrescriptions.add(newPresc);
    }
    
    public void moveApptToPast(Appointment completedAppt)
    {
        upcomingAppointments.remove(completedAppt);
        pastAppointments.add(completedAppt);
    }
    public void finishPrescriptiom(Prescription completedPresc)
    {
        currentPrescriptions.remove(completedPresc);
        pastPrescriptions.add(completedPresc);
    }
    
    public ArrayList<Appointment> getPastAppointments() {
        return pastAppointments;
    }

    public ArrayList<Appointment> getUpcomingAppointments() {
        return upcomingAppointments;
    }

    public ArrayList<Prescription> getPastPrescriptions() {
        return pastPrescriptions;
    }

    public ArrayList<Prescription> getCurrentPrescriptions() {
        return currentPrescriptions;
    }
    
    
    
    
}
