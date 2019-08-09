/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.project.shopmanagement.DAO.Custom;

import java.util.ArrayList;
import lk.project.shopmanagement.DAO.CrudDAO;
import lk.project.shopmanagement.entity.PaymentList;

/**
 *
 * @author NIWANTHA
 */
public interface PaymentListDAO extends CrudDAO<PaymentList, String>{
    
    public ArrayList<PaymentList> findby_number(String number) throws Exception;
    public ArrayList<PaymentList> findby_Date(String date) throws Exception;
    public ArrayList<PaymentList> findby_both(String number,String date) throws Exception;
}
