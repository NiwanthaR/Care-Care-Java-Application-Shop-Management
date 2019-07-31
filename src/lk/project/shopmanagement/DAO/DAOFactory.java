/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.project.shopmanagement.DAO;

import lk.project.shopmanagement.DAO.Custom.IMPL.PartsDAOImpl;
import lk.project.shopmanagement.DAO.Custom.IMPL.VehicalDAOImpl;



/**
 *
 * @author NIWANTHA
 */
public class DAOFactory {
    
    private static DAOFactory dAOFactory;

    private DAOFactory() {
    }
 
    public static DAOFactory getInstance(){
     if(dAOFactory==null)
            dAOFactory = new DAOFactory();
        return dAOFactory;
    }
 
    public enum DAOTypes {
        VEHICAL, PARTS, SERVICES    
    }
    
    public SuperDAO getDAO(DAOTypes daoTypes) {
        switch(daoTypes) {
            case VEHICAL : return new  VehicalDAOImpl();
            case PARTS : return new PartsDAOImpl();
            //case QUERY : return new QueryDAOImpl();
            //case ORDER : return new OrderDAOImpl();
            //case ITEM_DETAIL : return new ItemDetailDAOImpl();
            default : return null;
        }
    }
    
 
}
