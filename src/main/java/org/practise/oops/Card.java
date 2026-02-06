package org.practise.oops;

abstract class Card implements PaymentMethod {

    protected String username;
    protected int cardNo;

    public Card(String username, int cardNo) {
        this.username = username;
        this.cardNo = cardNo;
    }

    public String getUsername() {
        return this.username;
    }

    public int getCardNo() {
        return this.cardNo;
    }

}
