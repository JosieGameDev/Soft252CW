/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctors.surgery.users;

/**
 *
 * @author Josie
 * 
 * 
 */

// Superclass - all users are subclasses of system user
// has id, pw, and can log in 
public class SystemUser {
    
    // variables 
    private String ID;
    private String password;

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

    public SystemUser(String ID, String password) {
        this.ID = ID;
        this.password = password;
    }
    
    
    
    
    
}
