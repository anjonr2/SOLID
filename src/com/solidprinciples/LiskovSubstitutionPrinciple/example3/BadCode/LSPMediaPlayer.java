package com.solidprinciples.LiskovSubstitutionPrinciple.example3.BadCode;

/*In this example as we can see when replaced parent class object with child class
it throws an exception. Which violates LSP*/
public class LSPMediaPlayer {
    public static void main(String []args){
        MediaPlayer player = new AudioPlayer();
        player.playVideo("test.mp4"); // This will throw an exception
    }
}

/*
* 1.What's wrong here? Clients of MediaPlayer expect to be able to play both audio and video files
* without any issues. However, when they use an AudioPlayer, it throws an exception
* So By throwing an exception AudioPlayer violates the Liskov Substitution Principle
*
* To resolve this , we separate concerns using interfaces. Instead of forcing every media player to
* support both audio and video, we can define dedicated interfaces
* for each capability. This way, an AudiPlayer only implements the audio capability
* ensuring that when a client uses the object it only calls the method it actually supports.
* */