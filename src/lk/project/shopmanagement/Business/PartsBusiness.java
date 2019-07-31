/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.project.shopmanagement.Business;

import java.util.ArrayList;
import lk.project.shopmanagement.DAO.Custom.PartsDAO;
import lk.project.shopmanagement.DAO.DAOFactory;
import lk.project.shopmanagement.DTO.PartsDTO;
import lk.project.shopmanagement.entity.Parts;

/**
 *
 * @author NIWANTHA
 */
public class PartsBusiness {
    
    private static PartsDAO partsDAO = (PartsDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.PARTS);
    
    public static boolean addParst(PartsDTO partsDTO) throws Exception
    {
        return partsDAO.add(new Parts(partsDTO.getPart_id(),partsDTO.getVehical_model(),partsDTO.getVehical_brand(),partsDTO.getPart_name(),partsDTO.getGet_price(),partsDTO.getSold_price(),partsDTO.getPart_qty()));
    }
    
    public static boolean deleteParts(String id) throws Exception
    {
        return partsDAO.delete(id);
    }
    
    public static boolean updateParts(PartsDTO partsDTO) throws Exception
    {
        return partsDAO.update(new Parts(partsDTO.getPart_id(),partsDTO.getVehical_model(),partsDTO.getVehical_brand(),partsDTO.getPart_name(),partsDTO.getGet_price(),partsDTO.getSold_price(),partsDTO.getPart_qty()));
    }
    
    public static PartsDTO searchParts(String id) throws Exception
    {
        Parts parts = partsDAO.find(id);
        return parts!=null? new PartsDTO(parts.getPart_id(),parts.getPart_model(),parts.getPart_brand(),parts.getPart_name(),parts.getPart_getprice(),parts.getPart_soldprice(),parts.getPart_qty()):null;
    }
    
    public static ArrayList<PartsDTO> searchAllParts() throws Exception
    {
        ArrayList<PartsDTO> partsDTOList = new ArrayList<>();
        ArrayList<Parts> partsList = partsDAO.findall();
        
        for(Parts parts :partsList)
        {
            partsDTOList.add(new PartsDTO(parts.getPart_id(), parts.getPart_model(), parts.getPart_brand(), parts.getPart_name(), parts.getPart_getprice(), parts.getPart_soldprice(), parts.getPart_qty()));
        }
        return partsDTOList;
        
    }
    
}
