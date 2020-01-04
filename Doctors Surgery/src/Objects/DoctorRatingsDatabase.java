/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import doctors.surgery.users.Doctor;
import java.util.ArrayList;

/**
 *
 * @author jwood20
 */
public class DoctorRatingsDatabase {
    //singleton pattern to create one database holding all the ratings
    
    public ArrayList<DoctorRating> allRatings;
    
    // one instance of user databse, to folow the singleton pattern 
    public static DoctorRatingsDatabase instance = null;
    
    private DoctorRatingsDatabase(){ allRatings = new ArrayList<>(0);}
    
    public static DoctorRatingsDatabase getInstanceOfDatabase()
    {
        if(instance == null)
        {
            instance = new DoctorRatingsDatabase();
        }
        return instance;
    }
    
    public void addNewRating(DoctorRating newRate)
    {
        allRatings.add(newRate);
    }
    
    public ArrayList<DoctorRating> getAllRatings()
    {
        return allRatings;
    }
    
    public ArrayList<DoctorRating> getDocsRatings(Doctor doc)
    {
        ArrayList<DoctorRating> subList = new ArrayList<>(0);
        for(Integer i = 0; i < allRatings.size(); i++ )
        {
            if(allRatings.get(i).getDoctor().equals(doc))
            {
                subList.add(allRatings.get(i));
            }
            
        }
        
        return subList;
    }
    
    public ArrayList<DoctorRating> getDocsRatingsSurname(String name)
    {
        ArrayList<DoctorRating> subList = new ArrayList<>(0);
        for(Integer i = 0; i < allRatings.size(); i++ )
        {
            if(allRatings.get(i).getDoctor().getSurname().equals(name))
            {
                subList.add(allRatings.get(i));
            }
            
        }
        
        return subList;
    }
}
