package com.mayank.ISP_Principle;

public class CallClass {
    public static void main(String[] args) {
        OnlineCustomerImpl OCI=new OnlineCustomerImpl();
        OCI.payForOrder();
        OCI.placeOrder();
    }
}
