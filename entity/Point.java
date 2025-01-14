/**
* @author  Batuhan Kaynak
* @version 1.1
* Created: 11/02/2017 
*/
package entity;
public class Point{
	private int x;
	private int y;
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	@Override
	public String toString(){
		return "x: " + x + " y: " + y;
	}
}