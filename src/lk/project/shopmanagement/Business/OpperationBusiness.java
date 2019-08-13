/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.project.shopmanagement.Business;

import java.util.ArrayList;
import lk.project.shopmanagement.DAO.Custom.OpperationDAO;
import lk.project.shopmanagement.DAO.DAOFactory;
import lk.project.shopmanagement.DTO.OpperetionDTO;
import lk.project.shopmanagement.entity.Opperation;

/**
 *
 * @author NIWANTHA
 */
public class OpperationBusiness {
    
    private static OpperationDAO opperationDAO =   (OpperationDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.OPPERATION);
    
     public static ArrayList<OpperetionDTO> find_today_list(String date) throws Exception
     {
         ArrayList<OpperetionDTO> today_list = new ArrayList<>();
         ArrayList<Opperation> search_list = opperationDAO.find_today_list(date);
         
         for(Opperation opperation : search_list)
         {
             today_list.add(new OpperetionDTO(opperation.getPayment_id(),opperation.getPart_id(), opperation.getQty(), opperation.getUnite_price(), opperation.getPart_name(), opperation.getPart_brand()));
         }
         return today_list;
     }
}
