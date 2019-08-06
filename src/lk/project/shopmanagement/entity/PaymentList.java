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
public class PaymentList {
    
    private String payment_id;
    private String payment_date;
    private int payment_cost;
    private String vehical_no;

    public PaymentList() {
    }

    public PaymentList(String payment_id, String payment_date, int payment_cost, String vehical_no) {
        this.payment_id = payment_id;
        this.payment_date = payment_date;
        this.payment_cost = payment_cost;
        this.vehical_no = vehical_no;
    }

    public String getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(String payment_id) {
        this.payment_id = payment_id;
    }

    public String getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(String payment_date) {
        this.payment_date = payment_date;
    }

    public int getPayment_cost() {
        return payment_cost;
    }

    public void setPayment_cost(int payment_cost) {
        this.payment_cost = payment_cost;
    }

    public String getVehical_no() {
        return vehical_no;
    }

    public void setVehical_no(String vehical_no) {
        this.vehical_no = vehical_no;
    }

    @Override
    public String toString() {
        return "PaymentList{" + "payment_id=" + payment_id + ", payment_date=" + payment_date + ", payment_cost=" + payment_cost + ", vehical_no=" + vehical_no + '}';
    }
    
    
}
