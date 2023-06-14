package gamecode;

import gamecode.Game;
import gamecode.GamePanel;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        //tar in gamepanel i game, exceptions för musik spelning
        GamePanel gp = new GamePanel();
        Game g1 = new Game(gp);

        //gp.startMusic();
        //gp.initializeErrorSound();
        //gp.initializeClickSound();


        final Action doOneStep = new AbstractAction(){ // live update för räkna coins och resources
            public void actionPerformed(ActionEvent e){

                gp.update();

            }
        };
        final Timer clockTimer = new Timer(1000, doOneStep); //time
        clockTimer.setCoalesce(true);
        clockTimer.start();
    }


}