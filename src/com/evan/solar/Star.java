package com.evan.solar;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;

import com.evan.util.FrameUtil;

/**
 * �����࣬�ص�����̶�
 * @author Administrator
 *
 */
public class Star {
	double x, y ;
	Image image;
	
	public void draw(Graphics g){
		g.drawImage(image, (int)x, (int)y, null);
		
	}
	
	public Star(String path, double x, double y){
		this.image = FrameUtil.getImage(path);
		this.x = x;
		this.y = y;				
	}
	
	public Star(){
		
	}
}
