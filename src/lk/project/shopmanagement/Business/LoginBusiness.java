/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.project.shopmanagement.Business;

import lk.project.shopmanagement.DAO.Custom.LoginDAO;
import lk.project.shopmanagement.DAO.DAOFactory;
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
    
}
