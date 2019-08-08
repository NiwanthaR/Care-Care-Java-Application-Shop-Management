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
    
    //login form is empty
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
    
    //forget password panel question
    public static boolean ismatch_answer(LoginDTO loginDTO) throws Exception
    {
        return LoginBusiness.ismatch_answer(loginDTO);
    }
    //create user in settings panel
    public static boolean creat_user(LoginDTO loginDTO , String repassword) throws Exception
    {
        if(loginDTO.getPassword().toString().equals(repassword))
        {
            System.out.println("awa awa");
            return LoginBusiness.create_user(loginDTO); 
        
        }else
            return false;
    }
    //change password in settings panel text box is empty and change
    public static boolean change_password(LoginDTO loginDTO, String new_pass) throws Exception
    {
        if(loginDTO.getUsername().equals("") && loginDTO.getPassword().equals("") && new_pass.equals(""))
        {
            return false;
        }
        return LoginBusiness.password_change(loginDTO, new_pass);
    }
    
    public static boolean remove_user(String username) throws Exception
    {
        return LoginBusiness.remove_user(username);
    }
    
    public static LoginDTO find_user(String username) throws Exception
    {
        return LoginBusiness.find_user(username);
    }
    
    public static boolean update_user(LoginDTO loginDTO,String repassword) throws Exception
    {
        if(loginDTO.getPassword().toString().equals(repassword))
            return LoginBusiness.update_user(loginDTO);
        else
            return false;
        
    }
            
            
   
}
