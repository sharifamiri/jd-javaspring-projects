package com.cybertek.enums;

public enum City {
    DALLAS("Dallas"), AUSTIN("Austin"), SAN_ANTONIO("San Antonio"),
    ARLINGTON("Arlington"), FAIRFAX("Fairfax"), MC_LEAN("McLean");

    private final String value;
    City(String value) {
        this.value = value;
    }
}
