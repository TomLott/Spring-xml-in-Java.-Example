package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cont = new ClassPathXmlApplicationContext("applicationContext.xml");


        ClassicalMusic classicalMusic = cont.getBean("musicBean", ClassicalMusic.class);

        System.out.println(classicalMusic.getSong());
        //Music music = cont.getBean("musicBean", Music.class);

        //MusicPlayer musicPlayer = new MusicPlayer(music);
//
//        MusicPlayer firstMusicPlayer = cont.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = cont.getBean("musicPlayer", MusicPlayer.class);
//        firstMusicPlayer.playMusic();
//        System.out.println(firstMusicPlayer.getName());
//        System.out.println(firstMusicPlayer.getVolume());
        cont.close();
    }
}
