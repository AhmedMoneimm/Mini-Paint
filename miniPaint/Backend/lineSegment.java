package miniPaint.Backend;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Color;

public class lineSegment extends ShapeBase{
    
    public Point p2=new Point();
    
    public lineSegment(Point p1,Point p2,Color BoarderColor){
        super(p1, BoarderColor, null);
        this.p2.x=p2.x; 
        this.p2.y=p2.y;
    }
    
    @Override
    public void drawShape(Graphics canvas, int x, int y, int x2, int y2) {
        canvas.drawLine(position.x, position.y, p2.x, p2.y);
    }

    @Override
    public void fillShape(Graphics canvas, int x, int y, int length, int width) {
        
    }    
}
