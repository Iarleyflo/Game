import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Player extends GameObject implements KeyListener {
    private BufferedImage image;
    private int speed = 20; // Adjust the speed as needed

    public Player() {
        this.setX(320);
        this.setY(300);
        this.setHeight(150);
        this.setWidth(72);
        loadImage();
    }

    private void loadImage() {
        File file = new File("spacecraft.png");
        try {
            image = ImageIO.read(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update() {
        // TODO: Implement movement logic here if needed
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(this.image, this.getX(), this.getY(), this.getWidth(), this.getHeight(), null);
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();

        if (keyCode == KeyEvent.VK_UP || keyCode == KeyEvent.VK_W) {
            this.setY(this.getY() - speed);
        } 
        else if (keyCode == KeyEvent.VK_DOWN || keyCode == KeyEvent.VK_S) {
            this.setY(this.getY() + speed);
        } 
        else if (keyCode == KeyEvent.VK_LEFT || keyCode == KeyEvent.VK_A) {
            this.setX(this.getX() - speed);
        } 
        else if (keyCode == KeyEvent.VK_RIGHT || keyCode == KeyEvent.VK_D) {
            this.setX(this.getX() + speed);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO: Implement if needed
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO: Implement if needed
    }
}
