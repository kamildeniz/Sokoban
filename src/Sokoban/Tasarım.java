package Sokoban;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import java.util.ArrayList;

import javax.lang.model.element.NestingKind;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tasarým extends JPanel {
    Image kul,kut;
	Image duv,hed;

	static Tasarým oyuncu=new Tasarým();
	public int kut_x,kut_y;
	public int kul_x,kul_y;
	public int duv_x,duv_y;	
	public int hed_x,hed_y;
	String ad;
	static ArrayList<Tasarým> nesnelerimiz=new ArrayList<Tasarým>();
	
	public Tasarým(){
		super();
            kut=Toolkit.getDefaultToolkit().getImage(getClass().getResource("kutu.png"));
            kul=Toolkit.getDefaultToolkit().getImage(getClass().getResource("Adam.png"));
			duv=Toolkit.getDefaultToolkit().getImage(getClass().getResource("duvar.png"));
			hed=Toolkit.getDefaultToolkit().getImage(getClass().getResource("para.png"));
			
	}
	
	
	
	public void paint(Graphics g){
		super.paint(g);
		for(Tasarým i:nesnelerimiz){
			if(i.ad=="duvar"){
				g.drawImage(duv, i.duv_x, i.duv_y, 25, 25, null);
				repaint();
			}
			if(i.ad=="kutu"){
				g.drawImage(kut, i.kut_x, i.kut_y, 25, 25, null);
				repaint();
			}
			if(i.ad=="hedef"){
				g.drawImage(hed, i.hed_x, i.hed_y, 25, 25, null );
				repaint();
			}
			 if(i.ad=="oyuncu"){
				g.drawImage(kul, i.kul_x, i.kul_y, 25, 25, null);
				repaint();
			}
			 repaint();
		}
		
		
		
		
		
	}
	

	


}
