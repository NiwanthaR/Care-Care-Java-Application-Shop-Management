/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.project.shopmanagement.Business;

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

    public static boolean addCustomer(VehicalDTO vehicalDTO) throws Exception {
        return vehicalDAO.add(new Vehical(vehicalDTO.getVehical_number(), vehicalDTO.getVehical_model(), vehicalDTO.getVehical_brand(), vehicalDTO.getOwner_name(), vehicalDTO.getOwner_address(), vehicalDTO.getOwner_contact()));
       
    }
    
}
