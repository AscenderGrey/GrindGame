package gamecode;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class GameComponent extends JComponent implements GameListener {
    private GamePanel gamePanel;

    public GameComponent(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
        keyBind();
    }

    public void keyBind() {
        System.out.println("keybinds");
        InputMap inputMap = this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap actionMap = this.getActionMap();
        getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "moveRight");
        getActionMap().put("moveRight",  new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gamePanel.moveRight();
            }
        });

        getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "moveLeft");
        getActionMap().put("moveLeft",  new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gamePanel.moveLeft();
            }
        });

        getInputMap().put(KeyStroke.getKeyStroke("UP"), "moveUp");
        getActionMap().put("moveUp", new AbstractAction(){
            @Override public void actionPerformed(final ActionEvent e) {
                gamePanel.moveUp();
            }
        });

        getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "moveDown");
        getActionMap().put("moveDown", new AbstractAction(){
            @Override public void actionPerformed(final ActionEvent e) {
                gamePanel.moveDown();
            }
        });
    }


    @Override
    public void gameChanged() {
        repaint();
    }
}
