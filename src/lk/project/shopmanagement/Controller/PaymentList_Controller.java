/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.project.shopmanagement.Controller;

import java.util.ArrayList;
import lk.project.shopmanagement.Business.PaymentListBusiness;
import lk.project.shopmanagement.DTO.PaymentListDTO;

/**
 *
 * @author NIWANTHA
 */
public class PaymentList_Controller {
    
    public static ArrayList<PaymentListDTO> loadAllPayment() throws Exception
    {
        return PaymentListBusiness.findAllList();
    }
}
