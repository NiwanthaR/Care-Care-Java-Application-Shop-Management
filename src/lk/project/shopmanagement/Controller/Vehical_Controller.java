/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.project.shopmanagement.Controller;

import java.util.ArrayList;
import lk.project.shopmanagement.Business.VehicalBusiness;
import lk.project.shopmanagement.DTO.VehicalDTO;

/**
 *
 * @author NIWANTHA
 */
public class Vehical_Controller {
    
    public static boolean addVehical(VehicalDTO vehicalDTO) throws Exception {
        return VehicalBusiness.addVehical(vehicalDTO);
    }
    
    public static boolean deleteVehical(String id) throws Exception
    {
        return VehicalBusiness.deleteVehical(id);
    }
    
    public static boolean updateVehical(VehicalDTO vehicalDTO) throws Exception
    {
        return VehicalBusiness.updateVehicsl(vehicalDTO);
    }
    
    public static VehicalDTO searchVehical(String id) throws Exception
    {
        return VehicalBusiness.searchVehical(id);
    }
    
    public static ArrayList<VehicalDTO> searchAll() throws Exception
    {
        return VehicalBusiness.searchAll();
    }
    
}
