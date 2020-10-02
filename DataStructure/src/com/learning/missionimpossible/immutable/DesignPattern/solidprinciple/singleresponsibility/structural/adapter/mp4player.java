package com.learning.missionimpossible.immutable.DesignPattern.solidprinciple.singleresponsibility.structural.adapter;

public class mp4player implements advancedmusicplayer {
    @Override
    public void play(String fileName) {

        System.out.println("playing mp4");
    }
}
