

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends GameObject{
		private Color color;
		private int diameter;
	
		
	public Ball(int x, int y, int diameter, Color color) {
		this.setX(x);
		this.setY(y);
		this.setColor(color);
		this.setDiameter(diameter);
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
		this.setHeight(diameter);
		this.setWidth(diameter);
	}

	@Override
	public void render(Graphics g) {
		
		g.setColor(this.getColor());
		g.fillOval(this.getX(), this.getY(), this.getWidth(), this.getHeight());
		
	}

	@Override
	public void update() {
		if(this.getX()< 640) {
			this.setX(this.getX()+10);
		}else {
			this.setX(-20);
		}
	}



}
