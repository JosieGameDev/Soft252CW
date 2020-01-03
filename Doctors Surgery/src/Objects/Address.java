/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

/**
 *
 * @author jwood20
 */
public class Address 
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
    
    
}
