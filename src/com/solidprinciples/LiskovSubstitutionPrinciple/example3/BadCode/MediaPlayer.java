package com.solidprinciples.LiskovSubstitutionPrinciple.example3.BadCode;

public class MediaPlayer {
    public void playAudio(String audioFile){
        System.out.println("Playing audio file:"+audioFile);
    }
    public void playVideo(String videoFile){
        System.out.println("Playing video file: "+videoFile);
    }
}
