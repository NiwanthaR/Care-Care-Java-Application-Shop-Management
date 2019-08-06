/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.project.shopmanagement.Business;

import java.util.ArrayList;
import lk.project.shopmanagement.DAO.Custom.PaymentListDAO;
import lk.project.shopmanagement.DAO.DAOFactory;
import lk.project.shopmanagement.DTO.PaymentListDTO;
import lk.project.shopmanagement.entity.PaymentList;

/**
 *
 * @author NIWANTHA
 */
public class PaymentListBusiness {
    
    private static PaymentListDAO paymentList =   (PaymentListDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.PAYMENTLIST);
    
    public static ArrayList<PaymentListDTO> findAllList() throws Exception
    {
        ArrayList<PaymentListDTO> paymentListDTOs = new ArrayList<>();
        ArrayList<PaymentList> paymentLists = paymentList.findall();
        
        for(PaymentList paymentList: paymentLists )
        {
            paymentListDTOs.add(new PaymentListDTO(paymentList.getPayment_id(), paymentList.getPayment_date(), paymentList.getPayment_cost(), paymentList.getVehical_no()));
        }
        return  paymentListDTOs;
    }
}
