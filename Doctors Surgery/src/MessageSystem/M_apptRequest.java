/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MessageSystem;

import doctors.surgery.users.Doctor;
import doctors.surgery.users.SystemUser;

/**
 *
 * @author jwood20
 */
public class M_apptRequest extends Message {
    //type of message sent by patient to request an appt
    private Doctor docRequested;
    
    public M_apptRequest(SystemUser sender, SystemUser recipient, String message, Doctor chosenDoc) {
        super(sender, recipient, message);
        this.docRequested = chosenDoc;
    }
    
}
