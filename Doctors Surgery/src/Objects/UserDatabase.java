/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import doctors.surgery.users.Doctor;
import doctors.surgery.users.Patient;
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
    public SystemUser loggedInUser;
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
    
    public void logInAsUser(SystemUser currentUser)
    {
        loggedInUser = currentUser;
    }
    public SystemUser getLoggedInUser()
    {
        return loggedInUser;
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
    
    
    
    public ArrayList<SystemUser> getListOfRoles(String userType)
    {
        ArrayList<SystemUser> listOfUsers = new ArrayList<>(0);
        
        if(allUsers.isEmpty())
        {
            
        }
        //ADMIN
        if("Administrator".equals(userType))
        {
            
            for(Integer i = 0; i< allUsers.size(); i++)
            {
                
                if(allUsers.get(i).getFirstLetterID().equals("A"))
                {
                    listOfUsers.add(allUsers.get(i));
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
                    listOfUsers.add(allUsers.get(i));
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
                    listOfUsers.add(allUsers.get(i));
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
                    listOfUsers.add(allUsers.get(i));
                } 
            }
        }
        
        return listOfUsers;
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
    
    public SystemUser findUserWithID(String ID)
    {
        SystemUser tempUser = new SystemUser();
        for(Integer i = 0; i<instance.allUsers.size(); i++)
        {
            if(instance.allUsers.get(i).getID().equals(ID))
            {
                tempUser = instance.allUsers.get(i);
            }
        }
        
        return tempUser;
    }
    
    public SystemUser findDoctor(String doctorName)
    {
        ArrayList<SystemUser> allDocs = getListOfRoles("Doctor");
        SystemUser foundDoc = new Doctor();
        if(doctorName != null)
        {
        
        for(Integer i = 0; i < allDocs.size(); i++)
        {
            if(allDocs.get(i).getSurname() != null)
            {
            if(allDocs.get(i).getSurname().equals(doctorName))
            {
                foundDoc = allDocs.get(i);
            }
            }
        }
        }
        return foundDoc;
    }
    
    
    
}
