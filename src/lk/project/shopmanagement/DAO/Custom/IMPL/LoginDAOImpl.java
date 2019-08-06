/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.project.shopmanagement.DAO.Custom.IMPL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import lk.project.shopmanagement.DAO.Custom.LoginDAO;
import lk.project.shopmanagement.DB.DBConnection;
import lk.project.shopmanagement.entity.Login;

/**
 *
 * @author NIWANTHA
 */
public class LoginDAOImpl implements LoginDAO{

    @Override
    public boolean isSuccess(Login login) throws Exception {
       
        PreparedStatement pstm = DBConnection.getConnection().prepareStatement("SELECT * FROM USER_DETAILS WHERE user_name='"+login.getUsername()+"' AND user_password='"+login.getPassword()+"'");
        ResultSet rst = pstm.executeQuery();
        if(rst.next())
        {
            return true;
        }
        return false;
    }

    @Override
    public boolean add(Login t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Login t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Login find(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Login> findall() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
