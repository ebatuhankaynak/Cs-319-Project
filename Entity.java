/**
* @author  Batuhan Kaynak
* @version 1.0
* Created: 10/14/2017 
*/
import java.awt.image.BufferedImage;

public class Entity{
	
	private BufferedImage image;
	
	public Entity(){
		
	}
	
	public void setImage(BufferedImage image){
		this.image = image;
	}
	
	public BufferedImage getImage(){
		return image;
	}
}