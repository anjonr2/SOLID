package com.solidprinciples.LiskovSubstitutionPrinciple.example3.GoodCode;

public class MultiMediaPlayer implements AudioPlayable, VideoPlayable{
    @Override
    public void playAudio(String audioFile) {
        System.out.println("Playing audio file:"+audioFile);
    }

    @Override
    public void playVideo(String videoFile) {
        System.out.println("Playing video file"+ videoFile);
    }
}
