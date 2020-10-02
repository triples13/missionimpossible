package com.learning.missionimpossible.immutable.DesignPattern.solidprinciple.singleresponsibility.structural.adapter;

public class mp3player implements  musicplayer {
    @Override
    public void play(String audioType, String fileName) {
        System.out.println("playing mp3");
    }
}
