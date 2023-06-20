package org.example.example4;

public class CreditCard implements PaymentMethod {
    @Override
    public void paymentMethod(double amount) {
        System.out.println("CreditCard:amount="+amount);
    }
}
