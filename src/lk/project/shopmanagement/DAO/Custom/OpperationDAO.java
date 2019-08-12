/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.project.shopmanagement.DAO.Custom;

import java.util.ArrayList;
import lk.project.shopmanagement.DAO.CrudDAO;
import lk.project.shopmanagement.entity.Opperation;

/**
 *
 * @author NIWANTHA
 */
public interface OpperationDAO extends CrudDAO<Opperation,String>{
    public ArrayList<Opperation> find_today_list(String date) throws Exception;
    
}
