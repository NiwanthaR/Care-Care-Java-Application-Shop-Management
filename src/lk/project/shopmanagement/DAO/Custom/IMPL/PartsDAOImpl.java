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
import lk.project.shopmanagement.DAO.Custom.PartsDAO;
import lk.project.shopmanagement.DB.DBConnection;
import lk.project.shopmanagement.entity.Parts;

/**
 *
 * @author NIWANTHA
 */
public class PartsDAOImpl implements PartsDAO{

    @Override
    public boolean add(Parts parts) throws Exception {
        Connection connection = DBConnection.getConnection();
        PreparedStatement pstm = connection.prepareStatement("INSERT INTO Vehical VALUES(?, ?, ?, ?, ?, ?, ?)");
        pstm.setObject(1, parts.getPart_id());
        pstm.setObject(2, parts.getPart_model());
        pstm.setObject(3, parts.getPart_brand());
        pstm.setObject(4, parts.getPart_name());
        pstm.setObject(5, parts.getPart_getprice());
        pstm.setObject(6, parts.getPart_soldprice());
        pstm.setObject(7, parts.getPart_qty());
        return pstm.executeUpdate()>0;
    }

    @Override
    public boolean delete(String id) throws Exception {
        return DBConnection.getConnection().createStatement().executeUpdate("DELETE FROM PARTS WHERE part_id ='"+id+"'")>0;
    }

    @Override
    public boolean update(Parts parts) throws Exception {
        return DBConnection.getConnection().createStatement().executeUpdate("UPDATE PARTS SET part_model='"+parts.getPart_model()+"',part_brand='"+parts.getPart_brand()+"',part_name='"+parts.getPart_name()+"',part_getprice='"+parts.getPart_getprice()+"',part_soldprice='"+parts.getPart_soldprice()+"',part_qty='"+parts.getPart_qty()+"' WHERE part_id='"+parts.getPart_id()+"'")>0;
    }

    @Override
    public Parts find(String id) throws Exception {
        ResultSet rst = DBConnection.getConnection().createStatement().executeQuery("SELECT * FROM PARTS WHERE part_id='"+id+"'");
        return rst.next()? new Parts(rst.getString("part_id"),rst.getString("part_model"),rst.getString("part_brand"),rst.getString("part_name"),rst.getInt("part_getprice"),rst.getInt("part_soldprice"),rst.getInt("part_qty")):null;
    }

    @Override
    public ArrayList<Parts> findall() throws Exception {
        ArrayList<Parts> partsList = new ArrayList<>();
        ResultSet rst = DBConnection.getConnection().createStatement().executeQuery("SELECT * FROM PARTS");
        if(rst.next())
        {
            partsList.add(new Parts(rst.getString("part_id"),rst.getString("part_model"),rst.getString("part_brand"),rst.getString("part_name"),rst.getInt("part_getprice"),rst.getInt("part_soldprice"),rst.getInt("part_qty")));
        }
        return partsList;
    }
    
}
