/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.project.shopmanagement.Controller;

import java.util.ArrayList;
import lk.project.shopmanagement.Business.PartsBusiness;
import lk.project.shopmanagement.DTO.PartsDTO;
import lk.project.shopmanagement.DTO.Payment_DetailsDTO;

/**
 *
 * @author NIWANTHA
 */
public class Parts_Controller {
    
    public static boolean addparts(PartsDTO partsDTO) throws Exception
    {
        return PartsBusiness.addParst(partsDTO);
    }
    
    public static boolean deleteparts(String id) throws Exception
    {
        return PartsBusiness.deleteParts(id);
    }
    
    public static PartsDTO searchparts(String id) throws Exception
    {
        return PartsBusiness.searchParts(id);
    }
    
    public static boolean updateparts(PartsDTO partsDTO) throws Exception
    {
        return PartsBusiness.updateParts(partsDTO);
    }
    
    public static ArrayList<PartsDTO> searchallparts() throws Exception
    {
        return PartsBusiness.searchAllParts();
    }
    
    public static boolean updateQuantity(ArrayList<Payment_DetailsDTO> payment_DetailsDTOs) throws Exception
    {
        for(Payment_DetailsDTO payment_DetailsDTO : payment_DetailsDTOs)
        {
            boolean isUpdate = Parts_Controller.updateQuantity(payment_DetailsDTO.getPart_id(), payment_DetailsDTO.getQty());
            if(!isUpdate)
                return  false;
        }
        return true;
    }

    private static boolean updateQuantity(String code, int qty) throws Exception {
        return PartsBusiness.updateQuantity(code, qty);   
    }
    
}
