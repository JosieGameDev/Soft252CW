/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import doctors.surgery.users.SystemUser;
import java.util.ArrayList;


/**
 *
 * @author Josie
 */

// holds all the system users for logging in purposes
// singleton - can only be one database 
public class UserDatabase 
{
    //public SystemUser[] allUsers;
    public ArrayList<SystemUser> allUsers;
    
    // one instance of user databse, to folow the singleton pattern 
    public static UserDatabase instance = null;
    
    private UserDatabase(){ allUsers = new ArrayList<>(0);}
    
    public static UserDatabase getInstanceOfDatabase()
    {
        if(instance == null)
        {
            instance = new UserDatabase();
        }
        return instance;
    }
    
    
    public void addUser(SystemUser newUser)
    {
        //allUsers[allUsers.length +1] = newUser; // add new user to end of array
        allUsers.add(newUser);
    }
    
    public Boolean login(String ID, String password)
    {
        Boolean loggedIn = false;
        for(Integer i=0; i < allUsers.size(); i++)
        {
            if(allUsers.get(i).getID().equals(ID) )
            {
                loggedIn = allUsers.get(i).getPassword().equals(password);
            }
            
        }
        
        return loggedIn;
    }
    
    public Integer getNumberOfRoles(String userType)
    {
        Integer counter = 0;
        
        if(allUsers.isEmpty())
        {
            counter = 0;
        }
        //ADMIN
        if("Administrator".equals(userType))
        {
            
            for(Integer i = 0; i< allUsers.size(); i++)
            {
                
                if(allUsers.get(i).getFirstLetterID().equals("A"))
                {
                    counter++;
                } 
            }
        }
        //DOC
        if("Doctor".equals(userType))
        {
            
            for(Integer i = 0; i< allUsers.size(); i++)
            {
                
                if(allUsers.get(i).getFirstLetterID().equals("D"))
                {
                    counter++;
                } 
            }
        }
        //PAT
        if("Patient".equals(userType))
        {
            
            for(Integer i = 0; i< allUsers.size(); i++)
            {
                
                if(allUsers.get(i).getFirstLetterID().equals("P"))
                {
                    counter++;
                } 
            }
        }
        //SEC
        if("Secretary".equals(userType))
        {
            
            for(Integer i = 0; i< allUsers.size(); i++)
            {
                
                if(allUsers.get(i).getFirstLetterID().equals("S"))
                {
                    counter++;
                } 
            }
        }
        
        return counter;
    }


    
    public SystemUser findUser(Integer listIndex)
    {
        return allUsers.get(listIndex);
    }
    
    
}
