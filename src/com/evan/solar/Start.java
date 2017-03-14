package com.evan.solar;

import java.awt.Graphics;
import java.awt.Image;

import org.omg.CORBA.MARSHAL;

import com.evan.util.FrameUtil;
import com.evan.util.MyFrame;

/**
 * 主程序开始类
 * @author Administrator
 *
 */
public class Start extends MyFrame{
	
	Star sun = 
			new Star("C:\\Users\\Administrator\\Desktop\\JAVA\\images\\stars\\sun.jpg", 450, 300);
		Planet Mercury = 
			new Planet("C:\\Users\\Administrator\\Desktop\\JAVA\\images\\stars\\Mercury.jpg", 50, 30, 0.5, sun,true);
		Planet Venus = 
			new Planet("C:\\Users\\Administrator\\Desktop\\JAVA\\images\\stars\\Venus.jpg", 150, 60, 0.2, sun,true);
		Planet earth = 
			new Planet("C:\\Users\\Administrator\\Desktop\\JAVA\\images\\stars\\earth.jpg", 200, 90, 0.1, sun,true);
		Planet moon = 
			new Planet("C:\\Users\\Administrator\\Desktop\\JAVA\\images\\stars\\moon.jpg", 25, 20, 0.2, earth, false);
		Planet mars = 
			new Planet("C:\\Users\\Administrator\\Desktop\\JAVA\\images\\stars\\mars.jpg", 250, 140, 0.25, sun,true);
		Planet Jupiter = 
			new Planet("C:\\Users\\Administrator\\Desktop\\JAVA\\images\\stars\\Jupiter.jpg", 300, 180, 0.15, sun,true);
		Planet Saturn = new 
			Planet("C:\\Users\\Administrator\\Desktop\\JAVA\\images\\stars\\Saturn.jpg", 350, 200, 0.05, sun,true);
		Planet Uranus = new 
			Planet("C:\\Users\\Administrator\\Desktop\\JAVA\\images\\stars\\Uranus.jpg", 400, 230, 0.03, sun,true);
		Planet Neptune = new 
			Planet("C:\\Users\\Administrator\\Desktop\\JAVA\\images\\stars\\Neptune.jpg", 460, 280, 0.04, sun,true);

	@Override
	public void paint(Graphics g) {
		
		sun.draw(g);
		Mercury.draw(g);
		Venus.draw(g);
		earth.draw(g);
		moon.draw(g);
		mars.draw(g);
		Jupiter.draw(g);
		Saturn.draw(g);
		Uranus.draw(g);
		Neptune.draw(g);
	}

	public static void main(String[] args) {
		// 子类调用父类的方法，且能隐式调用重写的方法
		new Start().launch();
	}
}
