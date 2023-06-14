package gamecode;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyKeyListener implements KeyListener {
    private GamePanel gamePanel;

    public MyKeyListener(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        System.out.println(keyCode);

        switch (keyCode) {
            case KeyEvent.VK_W:
                gamePanel.moveUp();
                System.out.println("uptest");
                break;
            case KeyEvent.VK_A:
                gamePanel.moveLeft();
                break;
            case KeyEvent.VK_D:
                gamePanel.moveRight();
                break;
            case KeyEvent.VK_S:
                gamePanel.moveDown();
                break;
            default:
                break;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
