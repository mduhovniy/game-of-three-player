package com.takeaway.player.model;

import com.takeaway.player.model.enums.AddedNumber;

public record GameEvent(String originName, String counterpartName, int initialNumber, AddedNumber addedNumber, int resultingNumber, int moveCount) {
}
