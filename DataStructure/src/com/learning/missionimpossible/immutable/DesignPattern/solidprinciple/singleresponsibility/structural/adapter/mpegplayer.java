package com.learning.missionimpossible.immutable.DesignPattern.solidprinciple.singleresponsibility.structural.adapter;

public class mpegplayer implements  advancedmusicplayer {
    @Override
    public void play(String fileName) {
        System.out.println("play mpeg player");
    }
}
