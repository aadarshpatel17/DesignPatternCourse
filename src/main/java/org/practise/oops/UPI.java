package org.practise.oops;

public class UPI implements PaymentMethod {

    private String upiId;

    UPI(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay() {
        System.out.println("Making Payment via UPI " + upiId);
    }

}
