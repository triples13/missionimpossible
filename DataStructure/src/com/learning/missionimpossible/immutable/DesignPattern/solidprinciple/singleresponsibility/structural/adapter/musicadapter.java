package com.learning.missionimpossible.immutable.DesignPattern.solidprinciple.singleresponsibility.structural.adapter;

public class musicadapter implements  musicplayer {

    private advancedmusicplayer advancedmusicplayer;


    @Override
    public void play(String audioType, String fileName) {

        if(audioType.equalsIgnoreCase("mp4")) {
            advancedmusicplayer = new mp4player();
            advancedmusicplayer.play(fileName);
        }

        else if(audioType.equalsIgnoreCase("mpeg")) {
            advancedmusicplayer = new mp4player();
            advancedmusicplayer.play(fileName);
        }
        else{
           musicplayer musicplay1 = new mp3player();
           musicplay1.play("mp3",fileName);

        }
    }
}
