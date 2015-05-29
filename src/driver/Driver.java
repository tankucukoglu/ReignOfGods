package driver;

//import java.awt.BorderLayout;
//import java.awt.Graphics;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.IOException;
//import java.util.ArrayList;
//
//import javax.imageio.ImageIO;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//
//import components.Skill;
//import database.SkillCollection;
//import components.Item;
//import database.ItemCollection;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class Driver{

	public static void main(String[] args){
		
		// testing skills and items files
		
//		SkillCollection skills = new SkillCollection();
//		ItemCollection items = new ItemCollection();
//		
//		ArrayList<Skill> test = skills.getSkills();
//		ArrayList<Item> test2 = items.getItems();
//		
//		for(int i = 0; i < test2.size(); i++){
//			System.out.println(test2.get(i));
//		}
//		System.out.println();
//		for(int i = 0; i < test.size(); i++){
//			System.out.println(test.get(i));
//		}
		
//		final BufferedImage img = ImageIO.read(new File("database/images/map.png"));
//		
//		JFrame frame = new JFrame("RPG");
//		JLabel label = new JLabel(){
//			@Override
//            protected void paintComponent(Graphics g){
//                super.paintComponent(g);
//                g.drawImage(img, 0, 0, null);
//            }
//		};
//
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		frame.getContentPane().add(label, BorderLayout.CENTER);
//		frame.setSize(640, 480);
//		//frame.pack(); //resize window according to frame contents
//		frame.setVisible(true);
		
		try {
			Display.setDisplayMode(new DisplayMode(640, 480));
			Display.setTitle("A fresh display!");
			Display.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
			Display.destroy();
			System.exit(1);
		}
		while(!Display.isCloseRequested()) {
			Display.update();
			Display.sync(30);
		}
		Display.destroy();
		System.exit(0);		
	}
}
