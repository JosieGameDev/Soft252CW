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
class tempSer implements java.io.Serializable{
    
    public int integer;
    public String string;

    public tempSer(int integer, String string) {
        this.integer = integer;
        this.string = string;
    }
    
    
}

class TestThis
{
    public static void main(String[] args)
    {
        tempSer tempSerObj = new tempSer(1, "test");
        String filename = "test_filename";
        
        //serialize
        try
        {
            FileOutputStream file = new FileOutputStream(filename); 
            ObjectOutputStream out = new ObjectOutputStream(file); 
              
            // Method for serialization of object 
            out.writeObject(tempSerObj); 
              
            out.close(); 
            file.close(); 
              
            System.out.println("Object has been serialized"); 
  
        } 
          
        catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 
        
        
        tempSer tempSerObj2 = null;
        
        //deserialization
        // Deserialization 
        try
        {    
            // Reading the object from a file 
            FileInputStream file = new FileInputStream(filename); 
            ObjectInputStream in = new ObjectInputStream(file); 
              
            // Method for deserialization of object 
            tempSerObj2 = (tempSer)in.readObject(); 
              
            in.close(); 
            file.close(); 
              
            System.out.println("Object has been deserialized "); 
            System.out.println("a = " + tempSerObj2.integer); 
            System.out.println("b = " + tempSerObj2.string); 
        } 
          
        catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 
          
        catch(ClassNotFoundException ex) 
        { 
            System.out.println("ClassNotFoundException is caught"); 
        } 
  
    }
}