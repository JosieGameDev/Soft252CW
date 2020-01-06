/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author jwood20
 */
public class Address implements java.io.Serializable
{
    //vars
    private Integer houseNumber;
    private String houseName;
    private String streetName;
    private String Town;
    private String Postcode;

    public Address(Integer houseNumber, String streetName, String Town, String Postcode) {
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.Town = Town;
        this.Postcode = Postcode;
    }

    public Address(String houseName, String streetName, String Town, String Postcode) {
        this.houseName = houseName;
        this.streetName = streetName;
        this.Town = Town;
        this.Postcode = Postcode;
    }
    
    public Address()
    {
        
    }

    
    
    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }
    
    public Integer getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(Integer houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getTown() {
        return Town;
    }

    public void setTown(String Town) {
        this.Town = Town;
    }

    public String getPostcode() {
        return Postcode;
    }

    public void setPostcode(String Postcode) {
        this.Postcode = Postcode;
    }
    
    public void writeToFile(String newFileName)
    {
        // Serialization  
        try
        {    
            //Saving of object in a file 
            FileOutputStream file = new FileOutputStream(newFileName); 
            ObjectOutputStream out = new ObjectOutputStream(file); 
              
            // Method for serialization of object 
            out.writeObject(this); 
              
            out.close(); 
            file.close(); 
              
            System.out.println("Object has been serialized"); 
  
        } 
          
        catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 
  
    }
    
    public Address readAddressFromFile(String filename, Address thisAddress)
    {
//        Address tempAddress = null;
        thisAddress = null;
        
        try
        {    
            // Reading the object from a file 
            FileInputStream file = new FileInputStream(filename); 
            ObjectInputStream in = new ObjectInputStream(file); 
              
            // Method for deserialization of object 
            thisAddress = (Address)in.readObject(); 
            //thisAddress = tempAddress;
              
            in.close(); 
            file.close(); 
              
            System.out.println("Object has been deserialized "); 
            System.out.println("a = " + thisAddress.getHouseName()); 
            System.out.println("b = " + thisAddress.getTown()); 
        } 
         catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 
        catch(ClassNotFoundException ex) 
        { 
            System.out.println("ClassNotFoundException is caught"); 
        } 
        
        return thisAddress;
    }
    
    
    
}
