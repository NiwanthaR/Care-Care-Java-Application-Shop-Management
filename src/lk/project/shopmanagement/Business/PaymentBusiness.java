/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.project.shopmanagement.Business;

import java.sql.Connection;
import lk.project.shopmanagement.Controller.Parts_Controller;
import lk.project.shopmanagement.Controller.Payment_DetailsController;
import lk.project.shopmanagement.DAO.Custom.PaymentDAO;
import lk.project.shopmanagement.DAO.DAOFactory;
import lk.project.shopmanagement.DB.DBConnection;
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
    
    public static boolean addPayment(PaymentDTO paymentDTO) throws Exception
    {
        Connection connection = DBConnection.getConnection();
        try
        {
            connection.setAutoCommit(false);
            boolean isPaymentAdded =  paymentDAO.add(new Payment(paymentDTO.getPayment_id(), paymentDTO.getPayment_date(), paymentDTO.getPayment_cost(), paymentDTO.getVehical_no()));
            
            if(isPaymentAdded)
            {
                boolean isPaymentDetailsAdded = Payment_DetailsController.addPayment_Details(paymentDTO.getPaymentDetails());
                if(isPaymentAdded)
                {
                    boolean parts_Update = Parts_Controller.updateQuantity(paymentDTO.getPaymentDetails());
                    if(parts_Update)
                    {
                        connection.commit();
                        return true;
                    }
                    
                }
               
            }
        return false;
            
        }finally{
            connection.setAutoCommit(true);
        }
    }
    
}
