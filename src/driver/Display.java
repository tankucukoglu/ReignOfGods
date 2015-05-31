package driver;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Display{
	
	private JFrame frame;
	private Canvas canvas;
	
	private String title;
	private int width, height;
	
	public Display(String fTitle, int fWidth, int fHeight){
		
		title = fTitle;
		width = fWidth;
		height = fHeight;
		
		createDisplay();
	}
	private void createDisplay(){
		
		frame = new JFrame(title);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(width, height));
		canvas.setMaximumSize(new Dimension(width, height));
		canvas.setMinimumSize(new Dimension(width, height));
		
		frame.add(canvas);
		frame.pack();
	}
	public Canvas getCanvas(){
		return canvas;
	}
}
