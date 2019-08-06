/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.project.shopmanagement.Controller;

import lk.project.shopmanagement.Business.LoginBusiness;
import lk.project.shopmanagement.DTO.LoginDTO;

/**
 *
 * @author NIWANTHA
 */
public class Login_Controller {
    
    public static boolean login_isfill(String username , String password)
    {
        if(username.equals("User Name") || password.equals("****************"))
        {
            return false;
        }
        return true;
    }
    
    public static boolean check_login(LoginDTO loginDTO) throws Exception
    {
        return LoginBusiness.login_validate(loginDTO);
    }
    
}
