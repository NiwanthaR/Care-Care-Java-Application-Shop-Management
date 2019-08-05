/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.project.shopmanagement.Controller;

/**
 *
 * @author NIWANTHA
 */
public class Login_Controller {
    
    private boolean login_isfill(String username , String password)
    {
        if(username.isEmpty() || password.isEmpty())
        {
            return true;
        }
        return false;
    }
    
}
