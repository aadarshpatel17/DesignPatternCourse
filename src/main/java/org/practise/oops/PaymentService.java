package org.practise.oops;

import java.util.HashMap;

public class PaymentService {

    // storing + making payment
    private HashMap<String, PaymentMethod> paymentMethodHashMap;

    PaymentService() {
        paymentMethodHashMap = new HashMap<>();
    }

    // add payment user + method
    public void addPaymentMethod(String username, PaymentMethod paymentMethod) {
        paymentMethodHashMap.put(username, paymentMethod);
    }

    // making payment
    public void makePayment(String username) {
        // get payment method for username from hashmap
        PaymentMethod paymentMethod = paymentMethodHashMap.get(username);
        paymentMethod.pay(); // runtime polymorphism
    }

}
