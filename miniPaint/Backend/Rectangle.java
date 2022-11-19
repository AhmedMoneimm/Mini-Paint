package miniPaint.Backend;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Color;

public class Rectangle extends ShapeBase implements Shape{
    
    public Rectangle(Point p, int length, int width,Color BoarderColor, Color fillColor){
        super(p, BoarderColor, fillColor);
        this.length=length;
        this.width=width;
    }

    @Override
    public void drawShape(Graphics canvas, int x, int y, int length, int width) {
        canvas.drawRect(x, y, length, width);
    }

    @Override
    public void fillShape(Graphics canvas, int x, int y, int length, int width) {
        canvas.fillRect(x, y, length, width);
        
    }
    
}
