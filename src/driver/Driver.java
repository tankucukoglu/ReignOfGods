package driver;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;

import components.Skill;
import database.SkillCollection;

public class Driver {

	private static JFrame frame;

	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable(){ 
//			public void run(){
//				try{
//					Driver window = new Driver();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//		
//		frame = new JFrame();
//		frame.setBounds(100, 100, 640, 480);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// testing skills file
		
		SkillCollection skills = new SkillCollection();
		
		ArrayList<Skill> test = skills.getSkills();
		
		for(int i = 0; i < test.size(); i++){
			System.out.println(test.get(i));
		}
	}
}
