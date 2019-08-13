/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.project.shopmanagement.Controller;

import java.util.ArrayList;
import lk.project.shopmanagement.Business.OpperationBusiness;
import lk.project.shopmanagement.DTO.OpperetionDTO;

/**
 *
 * @author NIWANTHA
 */
public class Opperation_Controller {
    
    public static ArrayList<OpperetionDTO> findby_opperation_list(String date) throws Exception
    {
        return OpperationBusiness.find_today_list(date);
    }
    
}
