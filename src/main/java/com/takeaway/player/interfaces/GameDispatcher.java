package com.takeaway.player.interfaces;

public interface GameDispatcher extends Runnable {

    void startTheGame();
    void winTheGame();
    void loseTheGame();
}
