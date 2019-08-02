/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.project.shopmanagement.Business;

import lk.project.shopmanagement.DAO.Custom.PaymentDAO;
import lk.project.shopmanagement.DAO.DAOFactory;
import lk.project.shopmanagement.DTO.PaymentDTO;
import lk.project.shopmanagement.entity.Payment;

/**
 *
 * @author NIWANTHA
 */
public class PaymentBusiness {
    
    private static PaymentDAO paymentDAO = (PaymentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.PAYMENT);
    
    public static String generateOrderID() throws Exception {       
        return paymentDAO.generateOrderID();
    }
    
    public static boolean addPayment(PaymentDTO paymrntDTO) throws Exception
    {
        return paymentDAO.add(new Payment(paymrntDTO.getPayment_id(), paymrntDTO.getPayment_date(), paymrntDTO.getPayment_cost(), paymrntDTO.getVehical_no()));
    }
    
}
