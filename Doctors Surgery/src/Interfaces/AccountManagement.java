/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import doctors.surgery.users.SystemUser;

/**
 *
 * @author Josie
 */

// interface used by patient, admin and sec

public interface AccountManagement 
{
    public void makeAccount(String userType);
    
    public void removeAccount(SystemUser accToRemove);
}
