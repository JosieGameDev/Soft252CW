/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

/**
 *
 * @author Josie
 */

// medicine object, can be prescribed to patients by docs
public class Medicine 
{
    //variables
    private final String name;
    private final String description;
    
    //methods

    public Medicine(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    
    
    
}
