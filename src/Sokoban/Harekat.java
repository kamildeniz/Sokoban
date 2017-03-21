package Sokoban;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;


public class Harekat extends Tasarým implements KeyListener {
	static int kutu_ref=0;

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
			if(kutuylakarsilastir(oyuncu.kul_x+25, oyuncu.kul_y)){
				if(!(duvarlakarsilastir(nesnelerimiz.get(kutu_ref).kut_x+25 , nesnelerimiz.get(kutu_ref).kut_y)
				|| kutuylakarsilastir(nesnelerimiz.get(kutu_ref).kut_x+25, nesnelerimiz.get(kutu_ref).kut_y))){
						
						nesnelerimiz.get(kutu_ref).kut_x+=25;
						oyuncu.kul_x+=25;
						if(hedefkontrol()){
							level nesne=new level();
						}
					}
				}
				else if(!duvarlakarsilastir(oyuncu.kul_x+25, oyuncu.kul_y)){
					oyuncu.kul_x+=25;
				}
		}
		if (e.getKeyCode()==KeyEvent.VK_LEFT){
			if(kutuylakarsilastir(oyuncu.kul_x-25, oyuncu.kul_y)){
				if(!(duvarlakarsilastir(nesnelerimiz.get(kutu_ref).kut_x-25 , nesnelerimiz.get(kutu_ref).kut_y)
				|| kutuylakarsilastir(nesnelerimiz.get(kutu_ref).kut_x-25, nesnelerimiz.get(kutu_ref).kut_y))){
					
					nesnelerimiz.get(kutu_ref).kut_x-=25;
					oyuncu.kul_x-=25;
					if(hedefkontrol()){
						level nesne=new level();
					}
				}
			}
			else if(!duvarlakarsilastir(oyuncu.kul_x-25, oyuncu.kul_y)){
				oyuncu.kul_x-=25;
			}
			
		}
		if (e.getKeyCode()==KeyEvent.VK_DOWN){
			if(kutuylakarsilastir(oyuncu.kul_x, oyuncu.kul_y+25)){
				if(!(duvarlakarsilastir(nesnelerimiz.get(kutu_ref).kut_x , nesnelerimiz.get(kutu_ref).kut_y+25)
				|| kutuylakarsilastir(nesnelerimiz.get(kutu_ref).kut_x, nesnelerimiz.get(kutu_ref).kut_y+25))){
					
					nesnelerimiz.get(kutu_ref).kut_y+=25;
					oyuncu.kul_y+=25;
					if(hedefkontrol()){
						level nesne=new level();
					}
				}
			}
			else if(!duvarlakarsilastir(oyuncu.kul_x, oyuncu.kul_y+25)){
				oyuncu.kul_y+=25;
			}
			
		}
		if (e.getKeyCode()==KeyEvent.VK_UP){
			
			if(kutuylakarsilastir(oyuncu.kul_x, oyuncu.kul_y-25)){
				if(!(duvarlakarsilastir(nesnelerimiz.get(kutu_ref).kut_x , nesnelerimiz.get(kutu_ref).kut_y-25)
				|| kutuylakarsilastir(nesnelerimiz.get(kutu_ref).kut_x, nesnelerimiz.get(kutu_ref).kut_y-25))){
					
					nesnelerimiz.get(kutu_ref).kut_y-=25;
					oyuncu.kul_y-=25;
					if(hedefkontrol()){
						level nesne=new level();
					}
				}
			}
			else if(!duvarlakarsilastir(oyuncu.kul_x, oyuncu.kul_y-25)){
				oyuncu.kul_y-=25;
			}
			
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	public  boolean kutuylakarsilastir(int x,int y){
		int sayac=0;
		for(Tasarým i:nesnelerimiz){
		
			if((i.kut_x==x)&&(i.kut_y==y)){
				kutu_ref=sayac;
				return true;
			}
			sayac++;
		}
		return false;
		
	}
	public  boolean duvarlakarsilastir(int x,int y){
		
		for(Tasarým i:nesnelerimiz){
		
			if((i.duv_x==x)&&(i.duv_y==y)){
				return true;
			}			
		}
		return false;
	}
	public boolean hedefkontrol(){
		int sayac1=0;
		int sayac2=0;
		for(Tasarým i:nesnelerimiz){
			if(i.ad=="hedef"){
				sayac1++;
				for(Tasarým j:nesnelerimiz){
					if(j.ad=="kutu"){
						if((i.hed_x==j.kut_x)&&(i.hed_y==j.kut_y)){
							sayac2++;
						}
					}
					
				}
			}
			
			
		}
		if(sayac2==sayac1){
			return true;
		}
		else{
			return false;
		}
		
	}

}
