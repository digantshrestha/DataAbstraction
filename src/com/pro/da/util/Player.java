package com.pro.da.util;

import com.pro.da.entity.Playable;

public class Player{
    private Playable game;

    public Player(Playable game){
        this.game=game;
    }

    public void setGame(Playable game) {
        this.game = game;
    }

    public void doPlay(){
        game.play();
    }
}