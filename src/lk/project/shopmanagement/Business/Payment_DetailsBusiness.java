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
    
}
