package org.example.example4;

public class PayPal implements PaymentMethod {
    @Override
    public void paymentMethod(double amount) {
        System.out.println("PayPal:amount="+amount);
    }
}
