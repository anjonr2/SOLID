package com.solidprinciples.LiskovSubstitutionPrinciple.example3.GoodCode;

public class AudioPlayer implements AudioPlayable{
    @Override
    public void playAudio(String audioFile) {
        System.out.println("Playing audio file"+ audioFile);
    }
}
