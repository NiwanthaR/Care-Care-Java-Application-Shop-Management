/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.project.shopmanagement.DTO;

/**
 *
 * @author NIWANTHA
 */
public class PartsDTO {
    
    private String part_id;
    private String vehical_model;
    private String vehical_brand;
    private String part_name;
    private String get_price;
    private String sold_price;
    private String part_qty;

    public PartsDTO() {
    }

    public PartsDTO(String part_id, String vehical_model, String vehical_brand, String part_name, String get_price, String sold_price, String part_qty) {
        this.part_id = part_id;
        this.vehical_model = vehical_model;
        this.vehical_brand = vehical_brand;
        this.part_name = part_name;
        this.get_price = get_price;
        this.sold_price = sold_price;
        this.part_qty = part_qty;
    }

    public String getPart_id() {
        return part_id;
    }

    public void setPart_id(String part_id) {
        this.part_id = part_id;
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

    public String getPart_name() {
        return part_name;
    }

    public void setPart_name(String part_name) {
        this.part_name = part_name;
    }

    public String getGet_price() {
        return get_price;
    }

    public void setGet_price(String get_price) {
        this.get_price = get_price;
    }

    public String getSold_price() {
        return sold_price;
    }

    public void setSold_price(String sold_price) {
        this.sold_price = sold_price;
    }

    public String getPart_qty() {
        return part_qty;
    }

    public void setPart_qty(String part_qty) {
        this.part_qty = part_qty;
    }

    @Override
    public String toString() {
        return "StoreDTO{" + "part_id=" + part_id + ", vehical_model=" + vehical_model + ", vehical_brand=" + vehical_brand + ", part_name=" + part_name + ", get_price=" + get_price + ", sold_price=" + sold_price + ", part_qty=" + part_qty + '}';
    }
    
    
    
}
