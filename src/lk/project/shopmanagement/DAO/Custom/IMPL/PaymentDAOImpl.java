/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.project.shopmanagement.DAO.Custom.IMPL;

import java.sql.ResultSet;
import java.util.ArrayList;
import lk.project.shopmanagement.DAO.Custom.PaymentDAO;
import lk.project.shopmanagement.DB.DBConnection;
import lk.project.shopmanagement.entity.Payment;

/**
 *
 * @author NIWANTHA
 */
public class PaymentDAOImpl implements PaymentDAO{

    @Override
    public String generateOrderID() throws Exception {
        ResultSet rst = DBConnection.getConnection().createStatement().executeQuery("SELECT payment_id FROM Payment ORDER BY payment_id DESC LIMIT 1");
        if(rst.next()) {
            String orderID = rst.getString("payment_id");
            orderID = Integer.parseInt(orderID.split("[A-Z]")[1])+1+"";
            return "D"+orderID;
        }
        return "A1";
    }

    @Override
    public boolean add(Payment t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Payment t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Payment find(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Payment> findall() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
