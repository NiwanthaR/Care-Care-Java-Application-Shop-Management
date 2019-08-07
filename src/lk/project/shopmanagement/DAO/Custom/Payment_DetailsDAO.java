/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.project.shopmanagement.DAO.Custom;

import java.util.ArrayList;
import lk.project.shopmanagement.DAO.CrudDAO;
import lk.project.shopmanagement.entity.Payment_Details;

/**
 *
 * @author NIWANTHA
 */
public interface Payment_DetailsDAO extends CrudDAO<Payment_Details, String>{
    public ArrayList<Payment_Details> findBillItem(String bill_no) throws Exception;
    
}
