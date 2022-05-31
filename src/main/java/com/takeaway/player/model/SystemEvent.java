package com.takeaway.player.model;

import com.takeaway.player.model.enums.PlayerStatus;

public record SystemEvent(PlayerStatus status, String originName, String counterpartName, int score) {
}
