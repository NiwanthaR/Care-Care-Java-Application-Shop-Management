/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.project.shopmanagement.DAO.Custom.IMPL;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import lk.project.shopmanagement.DAO.Custom.Payment_DetailsDAO;
import lk.project.shopmanagement.DB.DBConnection;
import lk.project.shopmanagement.entity.Payment_Details;

/**
 *
 * @author NIWANTHA
 */
public class Payment_DetailsDAOImpl implements Payment_DetailsDAO{

    @Override
    public boolean add(Payment_Details payment_Details) throws Exception {
        PreparedStatement pstm = DBConnection.getConnection().prepareStatement("INSERT INTO PAYMENT_DETAILS VALUES(?,?,?,?,?)");
        pstm.setObject(1, payment_Details.getPayment_id());
        pstm.setObject(2, payment_Details.getPart_id());
        pstm.setObject(3, payment_Details.getUnite_price());
        pstm.setObject(4, payment_Details.getQty());
        pstm.setObject(5, payment_Details.getTotal_cost());
        return pstm.executeUpdate()>0;
        
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Payment_Details t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Payment_Details find(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Payment_Details> findall() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
