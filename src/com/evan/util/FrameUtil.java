package com.evan.util;

import java.awt.Image;

import javax.swing.ImageIcon;

/**
 * 工具类，添加图片的获取等方法
 * @author Administrator
 *
 */
public class FrameUtil {
	public static Image getImage(String path){
		Image image = new ImageIcon(path).getImage();
		return image;
	}
}
