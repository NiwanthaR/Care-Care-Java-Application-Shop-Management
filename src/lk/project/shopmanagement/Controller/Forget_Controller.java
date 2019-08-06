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
public class Forget_Controller {
    
    public static boolean Forget_isfill(String username, String question,String answer, String password)
    {
        if(username.equals("User Name") || question.equals("Select Your Question") || answer.equals("Your Answer") || password.equals("****************"))
        {
            return false;
        }
        return true;
    }
}
