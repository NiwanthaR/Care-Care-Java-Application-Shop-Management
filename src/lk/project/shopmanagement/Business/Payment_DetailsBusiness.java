/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.project.shopmanagement.Business;

import java.util.ArrayList;
import lk.project.shopmanagement.DAO.Custom.Payment_DetailsDAO;
import lk.project.shopmanagement.DAO.DAOFactory;
import lk.project.shopmanagement.DTO.Payment_DetailsDTO;
import lk.project.shopmanagement.entity.Payment_Details;

/**
 *
 * @author NIWANTHA
 */
public class Payment_DetailsBusiness {
    
    private static Payment_DetailsDAO payment_DetailsDAO = (Payment_DetailsDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.PAYMENTdETAILS);
    
    public static boolean addPayment_Details(ArrayList<Payment_DetailsDTO> payment_DetailsDTOs) throws Exception
    {
        for(Payment_DetailsDTO payment_DetailsDTO : payment_DetailsDTOs)
        {
            boolean isItemAdded = payment_DetailsDAO.add(new Payment_Details(payment_DetailsDTO.getPayment_id(), payment_DetailsDTO.getPart_id(), payment_DetailsDTO.getUnite_price(), payment_DetailsDTO.getQty(), payment_DetailsDTO.getTotal_cost()));
            if(!isItemAdded)
                return false;
        }
        return true;
    }
    
    public static ArrayList<Payment_DetailsDTO> findBillItem(String billno) throws Exception
    {
        ArrayList<Payment_DetailsDTO> payment_DetailsDTOs = new ArrayList<>();
        ArrayList<Payment_Details> payment_Details = payment_DetailsDAO.findBillItem(billno);
        
        for(Payment_Details payment_Details1 :payment_Details)
        {
            payment_DetailsDTOs.add(new Payment_DetailsDTO(payment_Details1.getPayment_id(),payment_Details1.getPart_id(), payment_Details1.getUnite_price(), payment_Details1.getQty(), payment_Details1.getTotal_cost()));
        }
        return payment_DetailsDTOs;
    }
}
