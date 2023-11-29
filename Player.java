

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Player extends GameObject implements KeyListener{
	private BufferedImage image;
	
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(this.image, this.getX(), this.getY(), this.getWidth(),this.getHeight(), null);
	}

	@Override
	public void keyPressed(KeyEvent keyEvent) {
		System.out.println("KeyCode: " + keyEvent.getKeyCode());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



}
