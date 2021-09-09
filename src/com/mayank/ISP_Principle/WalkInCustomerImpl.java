package com.mayank.ISP_Principle;


public class WalkInCustomerImpl implements OrderInterface, PaymentInterface {

    @Override
    public void placeOrder() {
        System.out.println("Order is Placed");
    }

    @Override
    public void payForOrder() {
        System.out.println("Bill is Paid");
    }
}
