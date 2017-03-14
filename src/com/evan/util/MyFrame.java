package com.evan.util;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 创建父类窗口，提供加载窗口的方法
 * @author Administrator
 *
 */
public class MyFrame extends Frame{
	
	public void launch(){
		setSize(Constant.FRAMEWIDTH, Constant.FRAMEHEIGTH);
		setLocation(Constant.FRAMELOCATIONX, Constant.FRAMELOCATIONY);
		setVisible(true);
		
		// 启动线程
		new paintThreat().start();
		// 设置窗口监控
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
			}
			
		});
		
	}
	
	// 添加线程类，每隔50毫秒重画一次
	class paintThreat extends Thread{
		public void run(){
			while(true){
				repaint();
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		}
	}
}
