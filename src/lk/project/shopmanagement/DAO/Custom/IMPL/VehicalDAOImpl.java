/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.project.shopmanagement.DAO.Custom.IMPL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import lk.project.shopmanagement.DAO.Custom.VehicalDAO;
import lk.project.shopmanagement.DB.DBConnection;
import lk.project.shopmanagement.entity.Vehical;

/**
 *
 * @author NIWANTHA
 */
public class VehicalDAOImpl implements VehicalDAO{
    
    @Override
    public boolean add(Vehical vehical) throws Exception
    {
        Connection connection = DBConnection.getConnection();
        PreparedStatement pstm = connection.prepareStatement("INSERT INTO Vehical VALUES(?, ?, ?, ?, ?, ?)");
        pstm.setObject(1, vehical.getVehical_no());
        pstm.setObject(2, vehical.getVehical_model());
        pstm.setObject(3, vehical.getVehical_brand());
        pstm.setObject(4, vehical.getOwner_name());
        pstm.setObject(5, vehical.getOwner_address());
        pstm.setObject(6, vehical.getOwner_contact());
        return pstm.executeUpdate()>0; 
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Vehical t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vehical find(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Vehical> findall() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
