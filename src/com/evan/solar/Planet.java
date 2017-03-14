package com.evan.solar;

import java.awt.Color;
import java.awt.Graphics;

import com.evan.util.FrameUtil;

/**
 * �����࣬�ص㣺Χ�ƺ�����Բ��ת��ӵ�г�����ᣬ�ٶȣ��Ƕȵ�����
 * �̳�Star���Image����������
 * @author Administrator
 *
 */
public class Planet extends Star{
	double longAxis,shortAxis,degree,speed;
	Star center;
	boolean moon;
	
	@Override
	public void draw(Graphics g) {
		super.draw(g);		
		move();
		if(moon){
			drawTrace(g);
		}
		
	}
	
	// �켣
	public void drawTrace(Graphics g){
		double ovalX,ovalY,ovalWidth,ovalHeight;
		ovalX = center.x + image.getWidth(null)/2 - longAxis;
		ovalY = center.y + image.getHeight(null)/2 - shortAxis;
		ovalWidth = longAxis*2;
		ovalHeight = shortAxis*2;
		g.setColor(Color.blue);
		g.drawOval((int)ovalX, (int)ovalY, (int)ovalWidth, (int)ovalHeight);
	
	}
	
	// ���з���
	public void move(){
		x = center.x + longAxis * Math.cos(degree);
		y = center.y + shortAxis * Math.sin(degree);
		degree += speed;
	}
	
	public Planet(String path, double x, double y) {
		super(path, x, y);
	}

	public Planet(String path, double longAxis, double shortAxis, double speed, Star center) {
		this.image = FrameUtil.getImage(path);
		this.x = center.x-longAxis+image.getWidth(null)/2;
		this.y = center.y-shortAxis+image.getWidth(null)/2;
		this.longAxis = longAxis;
		this.shortAxis = shortAxis;
		this.speed = speed;
		this.center = center;
	}
	
	public Planet(String path, double longAxis, double shortAxis, double speed, Star center, boolean moon) {
		this.image = FrameUtil.getImage(path);
		this.x = center.x-longAxis+image.getWidth(null)/2;
		this.y = center.y-shortAxis+image.getWidth(null)/2;
		this.longAxis = longAxis;
		this.shortAxis = shortAxis;
		this.speed = speed;
		this.center = center;
		this.moon = moon;
	}
	
	
	
}
