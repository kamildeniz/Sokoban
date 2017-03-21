package Sokoban;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame{


	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		JFrame f=new JFrame("Sokoban");
			
		
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(0, 0, 1000, 1000);
		f.add(new Tasarým());
		f.add(new level());
		f.addKeyListener(new Harekat());
		f.setVisible(true);
		
		
		
	
	
	}

}
