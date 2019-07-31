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
public class Parts {
    
    private String part_id;
    private String part_model;
    private String part_brand;
    private String part_name;
    private String part_getprice;
    private String part_soldprice;
    private String part_qty;

    public Parts() {
    }

    public Parts(String part_id, String part_model, String part_brand, String part_name, String part_getprice, String part_soldprice, String part_qty) {
        this.part_id = part_id;
        this.part_model = part_model;
        this.part_brand = part_brand;
        this.part_name = part_name;
        this.part_getprice = part_getprice;
        this.part_soldprice = part_soldprice;
        this.part_qty = part_qty;
    }

    public String getPart_id() {
        return part_id;
    }

    public void setPart_id(String part_id) {
        this.part_id = part_id;
    }

    public String getPart_model() {
        return part_model;
    }

    public void setPart_model(String part_model) {
        this.part_model = part_model;
    }

    public String getPart_brand() {
        return part_brand;
    }

    public void setPart_brand(String part_brand) {
        this.part_brand = part_brand;
    }

    public String getPart_name() {
        return part_name;
    }

    public void setPart_name(String part_name) {
        this.part_name = part_name;
    }

    public String getPart_getprice() {
        return part_getprice;
    }

    public void setPart_getprice(String part_getprice) {
        this.part_getprice = part_getprice;
    }

    public String getPart_soldprice() {
        return part_soldprice;
    }

    public void setPart_soldprice(String part_soldprice) {
        this.part_soldprice = part_soldprice;
    }

    public String getPart_qty() {
        return part_qty;
    }

    public void setPart_qty(String part_qty) {
        this.part_qty = part_qty;
    }

    @Override
    public String toString() {
        return "Parts{" + "part_id=" + part_id + ", part_model=" + part_model + ", part_brand=" + part_brand + ", part_name=" + part_name + ", part_getprice=" + part_getprice + ", part_soldprice=" + part_soldprice + ", part_qty=" + part_qty + '}';
    }
    
    
}
