package com.evan.util;

import java.awt.Image;

import javax.swing.ImageIcon;

/**
 * �����࣬���ͼƬ�Ļ�ȡ�ȷ���
 * @author Administrator
 *
 */
public class FrameUtil {
	public static Image getImage(String path){
		Image image = new ImageIcon(path).getImage();
		return image;
	}
}
