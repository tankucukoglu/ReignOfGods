package driver;

import graphics.ImageLoader;
import graphics.SpriteManage;
import characters.Character;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;

public class Driver extends Canvas implements Runnable{
	
	private static final long serialVersionUID = 1L;
	public static final int WIDTH = 360, HEIGHT = 240, SCALE = 2;
	public static boolean running = false;
	public Thread gameThread;
	
	private BufferedImage spriteSheet;
	
	private Character player;
	
	public void init(){
		ImageLoader loader = new ImageLoader();
		spriteSheet = loader.load("res/images/warrior_m.png");
		
		SpriteManage sm = new SpriteManage(spriteSheet);

		player = new Character(0, 0, sm);
		this.addKeyListener(player);
	}
	
	private void tick(){
		player.tick();
	}
	private void render(){
		BufferStrategy buf = this.getBufferStrategy();
		if(buf == null){
			createBufferStrategy(3);
			return;
		}
		Graphics g = buf.getDrawGraphics();
		
		// render
		
		g.fillRect(0, 0, WIDTH * SCALE, HEIGHT * SCALE);
		player.render(g);
		
		g.dispose();
		buf.show();
	}
	
	public synchronized void start(){
		if(running)return;
		running = true;
		gameThread = new Thread(this);
		gameThread.start();
		
	}
	public synchronized void stop(){
		if(!running)
			return;
		running = false;
		try{
			gameThread.join();
		}catch(InterruptedException e){ e.printStackTrace(); }
	}
	
	@Override
	public void run(){
		
		init();
		
		long lastTime = System.nanoTime();
		final double amountOfTicks = 60D;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		
		while(running){
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			if(delta >= 1){
				tick();
				delta--;
			}
			render();
		}
		stop();
	}
	public static void main(String[] args){
		
		Driver game = new Driver();
		game.setPreferredSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
		game.setMaximumSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
		game.setMinimumSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
		
		JFrame frame = new JFrame("RPGjava");
		frame.setSize(WIDTH * SCALE, HEIGHT * SCALE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.add(game);
		frame.setVisible(true);
		
		game.start();
		game.requestFocus();
	}
}
