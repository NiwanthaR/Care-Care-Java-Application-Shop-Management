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
public class Opperation {
    
    private String payment_id;
    private String part_id;
    private int qty;
    private int unite_price;
    private String part_name;
    private String part_brand;

    public Opperation() {
    }

    public Opperation(String payment_id, String part_id, int qty, int unite_price, String part_name, String part_brand) {
        this.payment_id = payment_id;
        this.part_id = part_id;
        this.qty = qty;
        this.unite_price = unite_price;
        this.part_name = part_name;
        this.part_brand = part_brand;
    }

    public String getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(String payment_id) {
        this.payment_id = payment_id;
    }

    public String getPart_id() {
        return part_id;
    }

    public void setPart_id(String part_id) {
        this.part_id = part_id;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getUnite_price() {
        return unite_price;
    }

    public void setUnite_price(int unite_price) {
        this.unite_price = unite_price;
    }

    public String getPart_name() {
        return part_name;
    }

    public void setPart_name(String part_name) {
        this.part_name = part_name;
    }

    public String getPart_brand() {
        return part_brand;
    }

    public void setPart_brand(String part_brand) {
        this.part_brand = part_brand;
    }

    @Override
    public String toString() {
        return "Oppretion{" + "payment_id=" + payment_id + ", part_id=" + part_id + ", qty=" + qty + ", unite_price=" + unite_price + ", part_name=" + part_name + ", part_brand=" + part_brand + '}';
    }
    
    
}
