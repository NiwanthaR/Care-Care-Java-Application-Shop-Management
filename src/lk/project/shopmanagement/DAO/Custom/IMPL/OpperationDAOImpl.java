/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.project.shopmanagement.DAO.Custom.IMPL;

import java.sql.ResultSet;
import java.util.ArrayList;
import lk.project.shopmanagement.DAO.Custom.OpperationDAO;
import lk.project.shopmanagement.DB.DBConnection;
import lk.project.shopmanagement.entity.Opperation;

/**
 *
 * @author NIWANTHA
 */
public class OpperationDAOImpl implements OpperationDAO{

    @Override
    public ArrayList<Opperation> find_today_list(String date) throws Exception {
        ArrayList<Opperation> today_list = new ArrayList<>();
        ResultSet  rst = DBConnection.getConnection().createStatement().executeQuery
        ("select payment.payment_id,payment_details.part_id,payment_details.qty,payment_details.unite_price,parts.part_name,parts.part_brand from payment inner join payment_details on payment.payment_id = payment_details.payment_id inner join parts on payment_details.part_id = parts.part_id where payment.payment_date ='"+date+"'");
        while(rst.next())
        {
            today_list.add(new Opperation(rst.getString("payment_id"), rst.getString("part_id"), rst.getInt("qty"), rst.getInt("unite_price"),rst.getString("part_name"), rst.getString("part_brand")));
        }
        return today_list;
    }

    @Override
    public boolean add(Opperation t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Opperation t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Opperation find(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Opperation> findall() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
