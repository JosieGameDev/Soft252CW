/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctors.surgery.users;

import Interfaces.AccountManagement;
import Interfaces.DoctorRatings;
import Objects.Address;
import Objects.DoctorRatingsDatabase;
import Objects.UserDatabase;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Josie
 */

// Admin subclass

public class Administrator extends SystemUser implements DoctorRatings, AccountManagement
{

    public Administrator(String userType, UserDatabase userSystem) {
        super("Administrator", UserDatabase.getInstanceOfDatabase());
    }

    public Administrator(String forename, String surname, Address address) {
        super("Administrator", forename, surname, address);
    }
    
    //vars
    
    //methods
    
    public void reviewRatings(Doctor docToInform)
    {
        DoctorRatingsDatabase docRatings = DoctorRatingsDatabase.getInstanceOfDatabase();
        docRatings.getDocsRatings(docToInform);
        
    }

    @Override
    public void viewRatings() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void makeAccount(String UserType) {
        
    }
    
    
    public Administrator readFromFile(String filename, Administrator thisAdmin)
    {
        
        thisAdmin = null;
        
        try
        {    
            // Reading the object from a file 
            FileInputStream file = new FileInputStream(filename); 
            ObjectInputStream in = new ObjectInputStream(file); 
              
            // Method for deserialization of object 
            thisAdmin = (Administrator)in.readObject(); 
            //thisAddress = tempAddress;
              
            in.close(); 
            file.close(); 
              
//            System.out.println("Object has been deserialized "); 
//            System.out.println("a = " + thisAddress.getHouseName()); 
//            System.out.println("b = " + thisAddress.getTown()); 
        } 
         catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 
        catch(ClassNotFoundException ex) 
        { 
            System.out.println("ClassNotFoundException is caught"); 
        } 
        
        return thisAdmin;
    }
    

    @Override
    public void removeAccount(SystemUser accountToRemove) {
        UserDatabase allUsers = UserDatabase.getInstanceOfDatabase();
        allUsers.allUsers.remove(accountToRemove);
    }
}
