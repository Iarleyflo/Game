import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Game extends JPanel implements ActionListener{
	private static final long serialVersionUID = 1L;
	private Player player;
	private Ball ball;
	private Timer timer;
	
	
	public Game(Dimension dim) {
		this.setPreferredSize(dim);
		this.setMinimumSize(dim);
		this.setMaximumSize(dim);
		this.setBackground(Color.BLACK);
		this.setDoubleBuffered(true);
		this.setFocusable(true);
		init();
	
		timer = new Timer(20,this);
		timer.start();
	}
	
	public void init() {
		player = new Player();
		this.addKeyListener(player);
		ball = new Ball(-10,100,50,Color.blue);
	}
	
	public void update() {
		ball.update();
	}
	
	public void render(Graphics g) {
		ball.render(g);
		player.render(g);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		render(g);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		update();
		repaint();
	}

}
