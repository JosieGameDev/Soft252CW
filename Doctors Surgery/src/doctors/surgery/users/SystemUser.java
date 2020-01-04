/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctors.surgery.users;

import MessageSystem.Message;
import MessageSystem.PostBox;
import Objects.Address;
import Objects.UserDatabase;

/**
 *
 * @author Josie
 * 
 * 
 */

// Superclass - all users are subclasses of system user
// has id, pw, and can log in 
public class SystemUser {
    
    // login details
    private String ID;
    private String password;

    // personal details
    private String forename;
    String surname;
    private Address address;
    
    private PostBox postBox = new PostBox();

    public void sendMessage(Message newMessage)
    {
        postBox.sendMessage(newMessage);
    }
    public PostBox getPostbox()
    {
        return postBox;
    }
    
    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    
    
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getFirstLetterID()
    {
        return Character.toString(this.ID.charAt(0));
    }

    // constructor basic
    public SystemUser(String ID, String password) {
        this.ID = ID;
        this.password = password;
    }

    public SystemUser() {
    }
    
    //constructor generate id 
    public SystemUser(String userType, UserDatabase userSystem)
    {
        String ID = "";
        if("Administrator".equals(userType))
        {
            //ID = "A" + (userSystem.getNumberOfRoles(userType)+1);
            
            ID = "A" + (userSystem.getNumberOfRoles("Administrator") +1);
        }
        if("Doctor".equals(userType))
        {
            ID = "D" + (userSystem.getNumberOfRoles(userType)+1);
        }
        if("Patient".equals(userType))
        {
            ID = "P" + (userSystem.getNumberOfRoles(userType)+1);
        }
        if("Secretary".equals(userType))
        {
            ID = "S" + (userSystem.getNumberOfRoles(userType)+1);
        }
        
        this.ID = ID;
        this.password = "tempPw";
    }
    
    //constructor with personal detials

    public SystemUser(String userType, String forename, String surname, Address address) {
        this.forename = forename;
        this.surname = surname;
        this.address = address;
        
        String ID = "";
        if("Administrator".equals(userType))
        {
            //ID = "A" + (userSystem.getNumberOfRoles(userType)+1);
            
            ID = "A" + (UserDatabase.getInstanceOfDatabase().getNumberOfRoles("Administrator") +1);
        }
        if("Doctor".equals(userType))
        {
            ID = "D" + (UserDatabase.getInstanceOfDatabase().getNumberOfRoles(userType)+1);
        }
        if("Patient".equals(userType))
        {
            ID = "P" + (UserDatabase.getInstanceOfDatabase().getNumberOfRoles(userType)+1);
        }
        if("Secretary".equals(userType))
        {
            ID = "S" + (UserDatabase.getInstanceOfDatabase().getNumberOfRoles(userType)+1);
        }
        
        this.ID = ID;
        this.password = "tempPw";
    }
    
    
    
    
    
    
}
