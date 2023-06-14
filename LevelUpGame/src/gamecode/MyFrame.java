package gamecode;

import gamecode.GamePanel;
import gamecode.MapMouseListener;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{
    public MyFrame(GamePanel gamePanel){
        this.add(gamePanel);
        gamePanel.addMouseListener(new MapMouseListener(gamePanel.map));
        this.setTitle("CityBuilder");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.pack();
        this.setVisible(true);

    }

}
