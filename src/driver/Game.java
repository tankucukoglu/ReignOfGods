package driver;

import graphics.ImageAssets;
import states.GameState;
import states.MenuState;
import states.State;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import management.KeyManager;

public class Game implements Runnable{
	
	private Display display;
	private String title;
	private int width, height;
		
	private boolean running = false;
	private Thread thread; // game class separation
	
	private BufferStrategy buf;
	private Graphics g;
	
	private State gameState;
	private State menuState;
	
	private KeyManager keyManager;

	public Game(String dTitle, int dWidth, int dHeight){
		
		title = dTitle;
		width = dWidth;
		height = dHeight;
		keyManager = new KeyManager();
	}
	private void init(){
		
		// create display
		display = new Display(title, width, height);
		
		// initialize input
		display.getFrame().addKeyListener(keyManager);
		
		// initialize images
		ImageAssets.init();
		
		gameState = new GameState(this);
		menuState = new MenuState(this);
		State.setState(gameState);
		
	}
	private void update(){
		keyManager.update();
		
		if(State.getState() != null){
			State.getState().update();
		}
	}
	private void render(){
		buf = display.getCanvas().getBufferStrategy();
		if(buf == null){
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g = buf.getDrawGraphics();
		
		// clear screen
		g.clearRect(0, 0, width, height);
		// draw here
		
		//g.fillRect(0, 0, width, height);	
		if(State.getState() != null){
			State.getState().render(g);
		}
		
		// draw end
		buf.show();
		g.dispose();
	}

	public void run(){
		init();
		
		int fps = 60;
		double timePerUpdate = 1000000000 / fps;
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();
		
		long timer = 0;
		int ticks = 0;
		
		while(running){
			now = System.nanoTime();
			delta += (now - lastTime) / timePerUpdate;
			timer += now - lastTime;
			lastTime = now;
			
			if(delta >= 1){
				update();
				render();
				ticks++;
				delta--;
			}
			if(timer >= 1000000000){
				System.out.println("Frames per second: " + ticks);
				ticks = 0;
				timer = 0;
			}
			
		}
		stop();
	}
	public KeyManager getKeyManager(){
		return keyManager;
	}
	
	public synchronized void start(){
		if(!running){
			running = true;
			thread = new Thread(this);
			thread.start();	
		}
	}
	public synchronized void stop(){
		if(running){
			running = false;
			try{
				thread.join();
			}catch (InterruptedException e){e.printStackTrace();}
		}
	}
}
