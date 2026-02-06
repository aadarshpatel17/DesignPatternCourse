package org.practise.oops;

public class Client {

    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.addPaymentMethod("testCC", new CreditCard("testCC", 123456));
        paymentService.addPaymentMethod("testDC", new DebitCard("testDC", 789789));
        paymentService.addPaymentMethod("testUPI", new UPI( "982374"));

        paymentService.makePayment("testCC");
        paymentService.makePayment("testDC");
        paymentService.makePayment("testUPI");
    }

}
