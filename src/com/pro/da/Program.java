package com.pro.da;

import com.pro.da.entity.Ball;
import com.pro.da.entity.Basketball;
import com.pro.da.entity.Caremboard;
import com.pro.da.entity.Football;
import com.pro.da.entity.Ludo;
import com.pro.da.entity.Playable;
import com.pro.da.entity.Volleyball;
import com.pro.da.util.Player;

public class Program{
    public static void main(String[] args) {
        Player player=new Player(new Football());
        player.doPlay();
        player.setGame(new Ludo());
        player.doPlay();
    }
}