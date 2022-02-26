package com.tetris;


import java.awt.image.BufferedImage;

/**
 * 俄罗斯方块中的最小单位：方格
 * 属性：
 *  row --行号
 *  col--列号
 *  image--对应的图片
 * 
 * 方法：
 *   left()
 *   right()
 *   drop();
 */
public class Cell {
	private int row;
	private int col;
	private BufferedImage image;
	public Cell() {}    //空构造方法
	public Cell(int row, int col, BufferedImage image) {
		super();
		this.row = row;
		this.col = col;
		this.image = image;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getCol() {
		return col;
	}
	public void setCol(int col) {
		this.col = col;
	}
	public BufferedImage getImage() {
		return image;
	}
	public void setImage(BufferedImage image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "(" + row + ", " + col + ")";
	}
	
	/*左右移动*/
	public void left() {
		col--;
	}   //左移
	public void right() {
		col++;
	}   //右移
	public void drop() {
		row++;
	}   //下落
}




