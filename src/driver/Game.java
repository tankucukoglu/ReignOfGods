package driver;

import graphics.ImageAssets;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class Game implements Runnable{
	
	private Display display;
	private String title;
	private int width, height;
		
	private boolean running = false;
	private Thread thread; // game class separation
	
	private BufferStrategy buf;
	private Graphics g;

	public Game(String dTitle, int dWidth, int dHeight){
		
		title = dTitle;
		width = dWidth;
		height = dHeight;
	}
	private void init(){
		
		// initialize images
		ImageAssets imageAssets = new ImageAssets();
		imageAssets.init();
		
		// create display
		display = new Display(title, width, height);
		
	}
	private void update(){
		
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
		
		// draw end
		buf.show();
		g.dispose();
	}

	public void run(){
		init();
		
		while(running){
			update();
			render();
		}
		stop();
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
