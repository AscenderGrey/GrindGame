package gamecode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import java.util.Objects;

public class GamePanel extends JPanel implements ActionListener, MouseListener {

    public final static int TILE_SIZE = 50;
    public static int SCREEN_WIDTH;
    public static int SCREEN_HEIGHT;
    public int charPosX;
    public int charPosY;
    public Character character;
    private List<GameListener> listOfListeners = new ArrayList<>();
//    public static final int SCREEN_WIDTH = 600;
//    public static final int SCREEN_HEIGHT = 600;

    public Map map = new Map(100, 100);

    public int cameraX;
    public int cameraY;




    //Image grassImage = new ImageIcon(getClass().getResource("images/grass.png")).getImage();
    Image grassImage = new ImageIcon("C:\\Users\\admin\\Downloads\\pixil-frame-0.png").getImage();
    Image pyramideImage = new ImageIcon("C:\\Users\\admin\\Downloads\\pyramide.png").getImage();
    public GamePanel(){
        character = new Character(1, 10, 10, 10, 10, "none", Type.UP);
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();
        Dimension screenSize = gd.getDefaultConfiguration().getBounds().getSize();
        SCREEN_WIDTH = screenSize.width;
        SCREEN_HEIGHT = screenSize.height;
        this.charPosX = (SCREEN_WIDTH/TILE_SIZE)/ 2 ;
        this.charPosY = (SCREEN_HEIGHT/TILE_SIZE)/2;
        this.charPosX = (SCREEN_WIDTH/TILE_SIZE)/2 ;
        this.charPosY = (SCREEN_HEIGHT/TILE_SIZE)/2;
        this.cameraX = charPosX - (SCREEN_WIDTH / (2 * TILE_SIZE));
        this.cameraY = charPosY - (SCREEN_HEIGHT / (2 * TILE_SIZE));
        this.setPreferredSize(new Dimension(SCREEN_WIDTH , SCREEN_HEIGHT));
        KeyListener keyListener = new MyKeyListener(this);
        this.addKeyListener(keyListener);
        //this.setBackground(Color.GREEN);
        this.addMouseListener(this);
        this.setFocusable(true);
        this.requestFocusInWindow();
    }
    public void update() {
        this.repaint();

    }
        public void paintComponent(Graphics g) { // ritar till alla olika bilder
            super.paintComponent(g);
            for (int x = 0; x < SCREEN_WIDTH / TILE_SIZE; x++) {
                for (int y = 0; y < SCREEN_HEIGHT / TILE_SIZE; y++) {
                    Tile tile = map.getTile(x, y);
                    int tileX = TILE_SIZE * x;
                    int tileY = TILE_SIZE * y;


                    if (tile.getType() == Type.GRASS) {
                        g.drawImage(grassImage, tileX, tileY, TILE_SIZE, TILE_SIZE, this);
                        update();
                        //System.out.println("testdraw");
                    }
                    if (x == charPosX && y == charPosY) {
                        if (character.direction.equals(Type.RIGHT)) {
                            g.drawImage(pyramideImage, charPosX * TILE_SIZE, charPosY * TILE_SIZE, TILE_SIZE, TILE_SIZE, this);
                            update();
                        }
                        if (character.direction.equals(Type.LEFT)) {
                            g.drawImage(pyramideImage, charPosX * TILE_SIZE, charPosY * TILE_SIZE, TILE_SIZE, TILE_SIZE, this);
                            update();
                        }
                        if (character.direction.equals(Type.UP)) {
                            g.drawImage(pyramideImage, charPosX * TILE_SIZE, charPosY * TILE_SIZE, TILE_SIZE, TILE_SIZE, this);
                            update();
                        }
                        if (character.direction.equals(Type.DOWN)) {
                            g.drawImage(pyramideImage, charPosX * TILE_SIZE, charPosY * TILE_SIZE, TILE_SIZE, TILE_SIZE, this);
                            update();
                        }

                        //System.out.println(x+" "+y);
                    }


                }
            }



            }





    public void addGameListener(GameListener gl) {
        listOfListeners.add(gl);
    }


    private void notifyListeners() {
        for (GameListener gl : listOfListeners) {
            gl.gameChanged();
        }
    }


    public void moveRight(){
        System.out.println("testhöger");
        charPosX++;
        notifyListeners();
        character.setDirection(Type.RIGHT);
    }
    public void moveLeft(){
        charPosX--;
        notifyListeners();
        character.setDirection(Type.LEFT);
    }

    public void moveUp(){
        charPosY--;
        notifyListeners();
        character.setDirection(Type.UP);

    }
    public void moveDown(){
        charPosY++;
        notifyListeners();
        character.setDirection(Type.DOWN);

    }
        @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // get the x and y coordinates of the click
        int x = e.getX() / TILE_SIZE;
        int y = e.getY() / TILE_SIZE;
        System.out.println(map.getTile(x, y).getType());
        System.out.println(x + " " + y);
    }

    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        switch (keyCode) {
            case KeyEvent.VK_W:
                moveUp();
                break;
            case KeyEvent.VK_A:
                moveLeft();
                break;
            case KeyEvent.VK_D:
                moveRight();
                break;
        }}
    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
