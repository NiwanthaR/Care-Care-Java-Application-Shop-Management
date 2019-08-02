/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.project.shopmanagement.DAO.Custom;

import lk.project.shopmanagement.DAO.CrudDAO;
import lk.project.shopmanagement.entity.Parts;

/**
 *
 * @author NIWANTHA
 */
public interface PartsDAO extends CrudDAO<Parts,String>{
    public boolean updateupdateQuantity(String code, int qty) throws Exception;
    
}
