package org.example.example4;

public class Cash implements PaymentMethod {

    @Override
    public void paymentMethod(double amount) {
        System.out.println("Cash:amount="+amount);
    }
}
