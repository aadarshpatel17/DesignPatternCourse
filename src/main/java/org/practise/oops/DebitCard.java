package org.practise.oops;

public class DebitCard extends Card {

    public DebitCard(String username, int cardNo) {
        super(username, cardNo);
    }

    @Override
    public void pay() {
        System.out.println(username + " is making payment via credit-card-no: " + cardNo);
    }
}
