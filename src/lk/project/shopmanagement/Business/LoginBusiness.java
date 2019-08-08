/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.project.shopmanagement.Business;

import java.sql.ResultSet;
import lk.project.shopmanagement.DAO.Custom.LoginDAO;
import lk.project.shopmanagement.DAO.DAOFactory;
import lk.project.shopmanagement.DB.DBConnection;
import lk.project.shopmanagement.DTO.LoginDTO;
import lk.project.shopmanagement.entity.Login;

/**
 *
 * @author NIWANTHA
 */
public class LoginBusiness {
    
    private static LoginDAO loginDAO = (LoginDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.LOGIN);
    
    public static boolean login_validate(LoginDTO loginDTO) throws Exception
    {
        return loginDAO.isSuccess(new Login(loginDTO.getUsername(), loginDTO.getPassword()));
    }
    
    public static boolean ismatch_answer(LoginDTO loginDTO) throws Exception
    {
        return loginDAO.ismatch_answer(new Login(loginDTO.getUsername(), loginDTO.getQuestion(), loginDTO.getAnswer(), loginDTO.getPassword()) );
    }  
    
    public static boolean create_user(LoginDTO loginDTO) throws Exception
    {
        return loginDAO.add(new Login(loginDTO.getUsername(), loginDTO.getQuestion(), loginDTO.getAnswer(), loginDTO.getPassword()));
    }
    
    public static boolean remove_user(String username) throws Exception
    {
        return loginDAO.delete(username);
    }
    
    public static LoginDTO find_user(String username) throws Exception
    {
        Login login = loginDAO.find(username);
        return login!=null? new LoginDTO(login.getUsername(), login.getQuestion(), login.getAnswer(), login.getPassword()):null;
    }
    
    public static boolean update_user(LoginDTO loginDTO) throws Exception
    {
        return loginDAO.update(new Login(loginDTO.getUsername(), loginDTO.getQuestion(), loginDTO.getAnswer(), loginDTO.getPassword()));
    }
    
    public static boolean password_change(LoginDTO loginDTO,String new_pass) throws Exception
    {
        return loginDAO.password_change(new Login(loginDTO.getUsername(), loginDTO.getPassword()), new_pass);
    }
}
