/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.project.shopmanagement.Controller;

import lk.project.shopmanagement.Business.PaymentBusiness;
import lk.project.shopmanagement.DTO.PaymentDTO;

/**
 *
 * @author NIWANTHA
 */
public class Payment_Controller {
    
    public static String generateOrderID() throws Exception {
        return PaymentBusiness.generateOrderID();
    }
    
    public static boolean addPayment(PaymentDTO paymentDTO) throws Exception
    {
        return PaymentBusiness.addPayment(paymentDTO);
    }
}
