/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.project.shopmanagement.Business;

import lk.project.shopmanagement.DAO.Custom.PaymentDAO;
import lk.project.shopmanagement.DAO.DAOFactory;

/**
 *
 * @author NIWANTHA
 */
public class PaymentBusiness {
    
    private static PaymentDAO paymentDAO = (PaymentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.PAYMENT);
    
    public static String generateOrderID() throws Exception {       
        return paymentDAO.generateOrderID();
    }
    
}
