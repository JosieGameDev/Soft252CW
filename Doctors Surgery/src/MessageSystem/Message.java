/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MessageSystem;

import doctors.surgery.users.SystemUser;

/**
 *
 * @author jwood20
 */
public class Message {
    // messages are sent to system user to give information and request action on their part eg to request an appt, secs get a message
    //this is the superclass, subtypes are implemented in concrete classes
    
    private SystemUser sender;
    private SystemUser recipient;
    private String message;
    private Boolean read;
    private String title;

    public Message(SystemUser sender, SystemUser recipient, String message, String title) {
        this.sender = sender;
        this.recipient = recipient;
        this.message = message;
        this.read = false;
        this.title = title;
    }
    
    public String getTitle()
    {
        return title;
    }

    public SystemUser getSender() {
        return sender;
    }

    public SystemUser getRecipient() {
        return recipient;
    }

    public String getMessage() {
        return message;
    }
    
    public void setAsRead()
    {
        this.read = true;
    }
    
    
}
