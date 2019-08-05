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
    
    private boolean Forget_isfill(String username, String question, String password, String new_password)
    {
        if(username.isEmpty() ||question.isEmpty() ||password.isEmpty() ||new_password.isEmpty())
        {
            return true;
        }
        return false;
    }
}
