package com.takeaway.player.model.enums;

public enum AddedNumber {
    ONE_UP(1),
    UNCHANGED(0),
    ONE_DOWN(-1);

    private final int addedNumber;

    AddedNumber(int addedNumber) {
        this.addedNumber = addedNumber;
    }

    public int get() {
        return addedNumber;
    }
}
