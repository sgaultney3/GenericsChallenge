package com.SamuelGaultney;

/**
 * Created by Samuel on 3/28/2017.
 */
public abstract class Player {
    private String playerName;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }
}
