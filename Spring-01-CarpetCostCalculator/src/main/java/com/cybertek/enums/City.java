package com.cybertek.enums;

public enum City {
    Dallas("Dallas"),Austin("Austin"),SanAntonio("San Antonio"),
    Arlington("Arlington"),Fairfax("Fairfax"),McLean("McLean");

    private final String value;
    City(String value) {
        this.value = value;
    }
}
