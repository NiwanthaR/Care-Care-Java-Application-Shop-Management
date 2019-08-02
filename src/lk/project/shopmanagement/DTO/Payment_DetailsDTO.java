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
public class Payment_DetailsDTO {
    
    private String payment_id;
    private String part_id;
    private int unite_price;
    private int qty;
    private int total_cost;

    public Payment_DetailsDTO() {
    }

    public Payment_DetailsDTO(String payment_id, String part_id, int unite_price, int qty, int total_cost) {
        this.payment_id = payment_id;
        this.part_id = part_id;
        this.unite_price = unite_price;
        this.qty = qty;
        this.total_cost = total_cost;
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

    public int getUnite_price() {
        return unite_price;
    }

    public void setUnite_price(int unite_price) {
        this.unite_price = unite_price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getTotal_cost() {
        return total_cost;
    }

    public void setTotal_cost(int total_cost) {
        this.total_cost = total_cost;
    }

    @Override
    public String toString() {
        return "Payment_DetailsDTO{" + "payment_id=" + payment_id + ", part_id=" + part_id + ", unite_price=" + unite_price + ", qty=" + qty + ", total_cost=" + total_cost + '}';
    }
    
    
}
