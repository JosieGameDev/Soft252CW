/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import doctors.surgery.users.SystemUser;

/**
 *
 * @author Josie
 */

// holds all the system users for logging in purposes
// singleton - can only be one database 
public class UserDatabase 
{
    public SystemUser[] allUsers;
    
    public void addUser(SystemUser newUser)
    {
        allUsers[allUsers.length +1] = newUser; // add new user to end of array
    }
    
    public Boolean login(String ID, String password)
    {
        Boolean loggedIn = false;
        for(Integer i=0; i<=allUsers.length; )
        {
            if(allUsers[i].getID().equals(ID))
            {
                loggedIn = allUsers[i].getPassword().equals(password);
            }
            else
            {
                if(i<allUsers.length)
                {
                    i++;
                }
                else
                {
                    loggedIn = false;
                    // no user with that id found 
                }
                
            }
        }
        
        return loggedIn;
    }
}
