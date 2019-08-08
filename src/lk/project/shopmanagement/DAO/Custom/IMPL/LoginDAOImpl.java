/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.project.shopmanagement.DAO.Custom.IMPL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
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
    public boolean add(Login login) throws Exception {
        Connection connection = DBConnection.getConnection();
        PreparedStatement pstm = connection.prepareStatement("INSERT INTO USER_DETAILS VALUES( ?, ?, ?, ?)");
        pstm.setObject(1, login.getUsername());
        pstm.setObject(2, login.getQuestion());
        pstm.setObject(3, login.getAnswer());
        pstm.setObject(4, login.getPassword());
        return pstm.executeUpdate()>0;
    }

    @Override
    public boolean delete(String username) throws Exception {
        return DBConnection.getConnection().createStatement().executeUpdate("DELETE FROM USER_DETAILS WHERE user_name='"+username+"'")>0;
    }

    @Override
    public boolean update(Login login) throws Exception {
        return DBConnection.getConnection().createStatement().executeUpdate("UPDATE USER_DETAILS SET user_question='"+login.getQuestion()+"',user_answer='"+login.getAnswer()+"',user_password='"+login.getPassword()+"' WHERE user_name='"+login.getUsername()+"'")>0;
    }

    @Override
    public Login find(String user) throws Exception {
        ResultSet rst = DBConnection.getConnection().createStatement().executeQuery("SELECT * FROM USER_DETAILS WHERE user_name='"+user+"'");
        return rst.next()? new Login(rst.getString("user_name"), rst.getString("user_question"), rst.getString("user_answer"), rst.getString("user_password")):null;
    }

    @Override
    public ArrayList<Login> findall() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean ismatch_answer(Login login) throws Exception {
        
        PreparedStatement pstm = DBConnection.getConnection().prepareStatement("select * from user_details where user_name ='"+login.getUsername()+"' AND user_question='"+login.getQuestion()+"' AND user_answer='"+login.getAnswer()+"'");
        ResultSet rst = pstm.executeQuery();
        
        if(rst.next()){
             return DBConnection.getConnection().createStatement().executeUpdate("UPDATE USER_DETAILS SET user_password='"+login.getPassword()+"' WHERE user_name='"+login.getUsername()+"'")>0;
        }else
            return false;
    }

    @Override
    public boolean isreset_password(Login login) throws Exception {
        return DBConnection.getConnection().createStatement().executeUpdate("UPDATE USER_DETAILS SET user_password='"+login.getPassword()+"' WHERE user_name='"+login.getUsername()+"'")>0;
    }

    @Override
    public boolean password_change(Login login ,String new_pass) throws Exception {
        PreparedStatement pstm = DBConnection.getConnection().prepareStatement("select * from user_details where user_name='"+login.getUsername()+"' AND user_password='"+login.getPassword()+"'");
        ResultSet rst = pstm.executeQuery();
        
        if(rst.next())
        {
            return DBConnection.getConnection().createStatement().executeUpdate("update user_details set user_password='"+new_pass+"' where user_name='"+login.getUsername()+"'")>0;
        }
        return false;
        
    }
    
}
