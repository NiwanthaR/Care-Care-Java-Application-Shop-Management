/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.project.shopmanagement.entity;

/**
 *
 * @author NIWANTHA
 */
public class Vehical {
    
    private String vehical_no;
    private String vehical_model;
    private String vehical_brand;
    private String owner_name;
    private String owner_address;
    private String owner_contact;

    public Vehical() {
    }

    public Vehical(String vehical_no, String vehical_model, String vehical_brand, String owner_name, String owner_address, String owner_contact) {
        this.vehical_no = vehical_no;
        this.vehical_model = vehical_model;
        this.vehical_brand = vehical_brand;
        this.owner_name = owner_name;
        this.owner_address = owner_address;
        this.owner_contact = owner_contact;
    }

    public String getVehical_no() {
        return vehical_no;
    }

    public void setVehical_no(String vehical_no) {
        this.vehical_no = vehical_no;
    }

    public String getVehical_model() {
        return vehical_model;
    }

    public void setVehical_model(String vehical_model) {
        this.vehical_model = vehical_model;
    }

    public String getVehical_brand() {
        return vehical_brand;
    }

    public void setVehical_brand(String vehical_brand) {
        this.vehical_brand = vehical_brand;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public String getOwner_address() {
        return owner_address;
    }

    public void setOwner_address(String owner_address) {
        this.owner_address = owner_address;
    }

    public String getOwner_contact() {
        return owner_contact;
    }

    public void setOwner_contact(String owner_contact) {
        this.owner_contact = owner_contact;
    }

    @Override
    public String toString() {
        return "Vehical{" + "vehical_no=" + vehical_no + ", vehical_model=" + vehical_model + ", vehical_brand=" + vehical_brand + ", owner_name=" + owner_name + ", owner_address=" + owner_address + ", owner_contact=" + owner_contact + '}';
    }
    
    
    
}
