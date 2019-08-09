/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.project.shopmanagement.DAO.Custom.IMPL;

import java.sql.ResultSet;
import java.util.ArrayList;
import lk.project.shopmanagement.DAO.Custom.PaymentListDAO;
import lk.project.shopmanagement.DB.DBConnection;
import lk.project.shopmanagement.entity.PaymentList;

/**
 *
 * @author NIWANTHA
 */
public class PaymentListDAOImpl implements PaymentListDAO{

    @Override
    public boolean add(PaymentList t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(PaymentList t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PaymentList find(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<PaymentList> findall() throws Exception {
        
        ArrayList<PaymentList> paymentLists = new ArrayList<>();
        ResultSet rst = DBConnection.getConnection().createStatement().executeQuery("SELECT * FROM PAYMENT");
        while(rst.next())
        {
            paymentLists.add(new PaymentList(rst.getString("payment_id"), rst.getString("payment_date"), rst.getInt("payment_cost"), rst.getString("vehical_no")));
        }
        return paymentLists;
    }

    @Override
    public ArrayList<PaymentList> findby_number(String number) throws Exception {
        ArrayList<PaymentList> paymentLists = new ArrayList<>();
        ResultSet rst = DBConnection.getConnection().createStatement().executeQuery("SELECT * FROM PAYMENT WHERE vehical_no='"+number+"' ");
        while(rst.next())
        {
            paymentLists.add(new PaymentList(rst.getString("payment_id"), rst.getString("payment_date"), rst.getInt("payment_cost"), rst.getString("vehical_no")));
        }
        return paymentLists;
    }

    @Override
    public ArrayList<PaymentList> findby_Date(String date) throws Exception {
        ArrayList<PaymentList> paymentLists = new ArrayList<>();
        ResultSet rst = DBConnection.getConnection().createStatement().executeQuery("SELECT * FROM PAYMENT WHERE payment_date='"+date+"' ");
        while(rst.next())
        {
            paymentLists.add(new PaymentList(rst.getString("payment_id"), rst.getString("payment_date"), rst.getInt("payment_cost"), rst.getString("vehical_no")));
        }
        return paymentLists;
    }

    @Override
    public ArrayList<PaymentList> findby_both(String number, String date) throws Exception {
        ArrayList<PaymentList> paymentLists = new ArrayList<>();
        ResultSet rst = DBConnection.getConnection().createStatement().executeQuery("SELECT * FROM PAYMENT where payment_date='"+date+"' AND vehical_no='"+number+"'");
        while(rst.next())
        {
            paymentLists.add(new PaymentList(rst.getString("payment_id"), rst.getString("payment_date"), rst.getInt("payment_cost"), rst.getString("vehical_no")));
        }
        return paymentLists;
    }

  
    
}
