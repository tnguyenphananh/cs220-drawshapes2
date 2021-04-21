package knox.drawshapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Polygon extends AbstractShape{

	private int length;
	public Polygon(Color color, Point center, int length) {
		super(center, color);
		boundingBox = new BoundingBox(center.x-length/2,center.x+length/2,(int) (center.y-length*Math.sqrt(3)/2),(int) (center.y+length*Math.sqrt(3)/2));
		this.length=length;
	}

	@Override
	public void draw(Graphics g) {
		if(isSelected()) {
			g.setColor(getColor().darker());
		} else
			g.setColor(getColor());
		int[] xPoint = new int[] {(int)getAnchorPoint().getX()-length/2,(int)getAnchorPoint().getX()-length/2,(int)getAnchorPoint().getX(),(int)getAnchorPoint().getX()+length/2,(int)getAnchorPoint().getX()+length/2,(int)getAnchorPoint().getX()};
		int[] yPoint = new int[] {(int) ((int)getAnchorPoint().getY()+length*Math.sqrt(3)/6),(int) (((int)getAnchorPoint().getY()-length*Math.sqrt(3)/9)),(int) ((int)getAnchorPoint().getY()-length*Math.sqrt(3)/4),(int) (((int)getAnchorPoint().getY()-length*Math.sqrt(3)/9)),(int) ((int)getAnchorPoint().getY()+length*Math.sqrt(3)/6),(int) ((int)getAnchorPoint().getY()+length*Math.sqrt(3)/3)};
		g.fillPolygon(xPoint,yPoint,6);
	}
	
	public String toString() {
		return String.format("POLYGON %d %d %d %d %s %s",
				this.getAnchorPoint().x,
				this.getAnchorPoint().y,
				this.length,
				Util.colorToString(this.getColor()),
				this.isSelected());
	}
	
	@Override
	public void scale(double factor) {
		this.length=(int)(factor*this.length);
	}
	
}