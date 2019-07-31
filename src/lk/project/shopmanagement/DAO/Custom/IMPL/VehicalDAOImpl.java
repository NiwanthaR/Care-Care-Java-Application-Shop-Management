/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.project.shopmanagement.DAO.Custom.IMPL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        return DBConnection.getConnection().createStatement().executeUpdate("DELETE FROM Vehical WHERE vehical_no='"+id+"'")>0;
    }

    @Override
    public boolean update(Vehical vehical) throws Exception {
        return DBConnection.getConnection().createStatement().executeUpdate("UPDATE VEHICAL SET vehical_model='"+vehical.getVehical_model()+"' ,vehical_brand='"+vehical.getVehical_brand()+"', owner_name='"+vehical.getOwner_name()+"' ,owner_address='"+vehical.getOwner_address()+"', owner_contact='"+vehical.getOwner_contact()+"' WHERE vehical_no='"+vehical.getVehical_no()+"'")>0;
    }

    @Override
    public Vehical find(String id) throws Exception {
        ResultSet rst = DBConnection.getConnection().createStatement().executeQuery("SELECT * FROM VEHICAL WHERE vehical_no='"+id+"'");
        return rst.next()? new Vehical(rst.getString("vehical_no"),rst.getString("vehical_model"),rst.getString("vehical_brand"),rst.getString("owner_name"),rst.getString("owner_address"),rst.getString("owner_contact")): null;
    }

    @Override
    public ArrayList<Vehical> findall() throws Exception {
    
        ArrayList<Vehical> vehicalList = new ArrayList<>();
        ResultSet rst = DBConnection.getConnection().createStatement().executeQuery("SELECT * FROM vehical");
        while(rst.next())
        {
            vehicalList.add(new Vehical(rst.getString("vehical_no"),rst.getString("vehical_model"),rst.getString("vehical_brand"),rst.getString("owner_name"),rst.getString("owner_address"),rst.getString("owner_contact")));
        }
        return vehicalList;
    }
    
}
