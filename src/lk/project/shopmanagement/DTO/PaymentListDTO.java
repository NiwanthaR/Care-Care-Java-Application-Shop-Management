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
public class PaymentListDTO {
    
    private String paymentID;
    private String paymentDATE;
    private int paymentCOST;
    private String vehicalNO;

    public PaymentListDTO() {
    }

    public PaymentListDTO(String paymentID, String paymentDATE, int paymentCOST, String vehicalNO) {
        this.paymentID = paymentID;
        this.paymentDATE = paymentDATE;
        this.paymentCOST = paymentCOST;
        this.vehicalNO = vehicalNO;
    }

    public String getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    public String getPaymentDATE() {
        return paymentDATE;
    }

    public void setPaymentDATE(String paymentDATE) {
        this.paymentDATE = paymentDATE;
    }

    public int getPaymentCOST() {
        return paymentCOST;
    }

    public void setPaymentCOST(int paymentCOST) {
        this.paymentCOST = paymentCOST;
    }

    public String getVehicalNO() {
        return vehicalNO;
    }

    public void setVehicalNO(String vehicalNO) {
        this.vehicalNO = vehicalNO;
    }

    @Override
    public String toString() {
        return "PaymentListDTO{" + "paymentID=" + paymentID + ", paymentDATE=" + paymentDATE + ", paymentCOST=" + paymentCOST + ", vehicalNO=" + vehicalNO + '}';
    }
    
    
    
}
