/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.project.shopmanagement.Business;

import java.util.ArrayList;
import lk.project.shopmanagement.DAO.Custom.VehicalDAO;
import lk.project.shopmanagement.DAO.DAOFactory;
import lk.project.shopmanagement.DTO.VehicalDTO;
import lk.project.shopmanagement.entity.Vehical;

/**
 *
 * @author NIWANTHA
 */
public class VehicalBusiness {
    
    private static VehicalDAO vehicalDAO = (VehicalDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.VEHICAL);

    public static boolean addVehical(VehicalDTO vehicalDTO) throws Exception {
        return vehicalDAO.add(new Vehical(vehicalDTO.getVehical_number(), vehicalDTO.getVehical_model(), vehicalDTO.getVehical_brand(), vehicalDTO.getOwner_name(), vehicalDTO.getOwner_address(), vehicalDTO.getOwner_contact()));
       
    }
    
    public static boolean deleteVehical(String id) throws Exception
    {
        return vehicalDAO.delete(id);
    }
    
    public static boolean updateVehicsl(VehicalDTO vehicalDTO) throws Exception
    {
        return vehicalDAO.update(new Vehical(vehicalDTO.getVehical_number(), vehicalDTO.getVehical_model(), vehicalDTO.getVehical_brand(), vehicalDTO.getOwner_name(), vehicalDTO.getOwner_address(), vehicalDTO.getOwner_contact()));
    }
    
    public static VehicalDTO searchVehical(String id) throws Exception
    {
        Vehical vehical = vehicalDAO.find(id);
        return vehical!=null? new VehicalDTO(vehical.getVehical_no(),vehical.getVehical_model(),vehical.getVehical_brand(),vehical.getOwner_name(),vehical.getOwner_address(),vehical.getOwner_contact()):null;
    }
    
    public static ArrayList<VehicalDTO> searchAll() throws Exception
    {
        ArrayList<VehicalDTO> vehicalDTOList = new ArrayList<>();
        ArrayList<Vehical> vehicalList = vehicalDAO.findall();
        
        for(Vehical vehical : vehicalList)
        {
            vehicalDTOList.add(new VehicalDTO(vehical.getVehical_no(),vehical.getVehical_model(),vehical.getVehical_brand(),vehical.getOwner_name(),vehical.getOwner_address(),vehical.getOwner_contact()));
        }
        return vehicalDTOList;
    }
    
}
