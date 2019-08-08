/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.project.shopmanagement.DAO.Custom;

import lk.project.shopmanagement.DAO.CrudDAO;
import lk.project.shopmanagement.entity.Login;

/**
 *
 * @author NIWANTHA
 */
public interface LoginDAO extends CrudDAO<Login, String>{
    
    public boolean isSuccess(Login login) throws Exception;
    public boolean ismatch_answer(Login login) throws Exception;
    public boolean isreset_password(Login login) throws Exception;
    public boolean password_change(Login login ,String new_pass) throws Exception;
    
}
