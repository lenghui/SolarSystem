package com.evan.util;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * �������ര�ڣ��ṩ���ش��ڵķ���
 * @author Administrator
 *
 */
public class MyFrame extends Frame{
	
	public void launch(){
		setSize(Constant.FRAMEWIDTH, Constant.FRAMEHEIGTH);
		setLocation(Constant.FRAMELOCATIONX, Constant.FRAMELOCATIONY);
		setVisible(true);
		
		// �����߳�
		new paintThreat().start();
		// ���ô��ڼ��
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
			}
			
		});
		
	}
	
	// ����߳��࣬ÿ��50�����ػ�һ��
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
