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
    
    public static boolean ismatch_answer(LoginDTO loginDTO) throws Exception
    {
        return LoginBusiness.ismatch_answer(loginDTO);
    }
    
    public static boolean creat_user(LoginDTO loginDTO , String repassword) throws Exception
    {
        if(loginDTO.getPassword().equals(repassword))
        {
            return LoginBusiness.create_user(loginDTO);
        }
        else
            return false;
    }
    
    public static boolean remove_user(String username) throws Exception
    {
        return LoginBusiness.remove_user(username);
    }
    
    public static LoginDTO find_user(String username) throws Exception
    {
        return LoginBusiness.find_user(username);
    }
    
    public static boolean update_user(LoginDTO loginDTO) throws Exception
    {
        return LoginBusiness.update_user(loginDTO);
    }
            
            
   
}
