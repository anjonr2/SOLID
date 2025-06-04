package com.solidprinciples.LiskovSubstitutionPrinciple.example3.BadCode;

public class AudioPlayer extends MediaPlayer{
    @Override
    public void playVideo(String videoFile){
        throw new UnsupportedOperationException("AudioPlayer cannot play video files.");
    }
}
