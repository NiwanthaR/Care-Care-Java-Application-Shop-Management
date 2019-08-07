/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.project.shopmanagement.Controller;

import java.util.ArrayList;
import lk.project.shopmanagement.Business.Payment_DetailsBusiness;
import lk.project.shopmanagement.DTO.Payment_DetailsDTO;

/**
 *
 * @author NIWANTHA
 */
public class Payment_DetailsController {
    
    public static boolean addPayment_Details(ArrayList<Payment_DetailsDTO> payment_DetailsDTO) throws Exception
    {
        return Payment_DetailsBusiness.addPayment_Details(payment_DetailsDTO);
    }
    
    public static ArrayList<Payment_DetailsDTO> findbillItem(String bill_no) throws Exception
    {
        return Payment_DetailsBusiness.findBillItem(bill_no);
    }
    
}
