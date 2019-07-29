/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.project.shopmanagement.Controller;

import lk.project.shopmanagement.Business.VehicalBusiness;
import lk.project.shopmanagement.DTO.VehicalDTO;

/**
 *
 * @author NIWANTHA
 */
public class Vehical_Controller {
    
    public static boolean addVehical(VehicalDTO vehicalDTO) throws Exception {
        return VehicalBusiness.addCustomer(vehicalDTO);
    }
    
}
