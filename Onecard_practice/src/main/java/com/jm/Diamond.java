package com.jm;

public class Diamond extends Card {
    public Diamond() {
    }

    public Diamond(int number) {
        super(number);
    }

    @Override
    public String toString() {
        return "Diamond " + this.getNumber() +
                "입니다.";
    }
}
