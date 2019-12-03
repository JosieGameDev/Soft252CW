/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Josie
 */

// interface used by patient and doctor to view current patient info
public interface PatientInformation 
{
    public void viewHistory();
    
    public void viewAppointments();
    
    public void viewPrescriptions();
}
