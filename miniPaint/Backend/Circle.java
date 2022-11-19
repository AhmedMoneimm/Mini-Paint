package miniPaint.Backend;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Color;

public class Circle extends ShapeBase 
{  
    public Circle(Point p,Color BoarderColor, Color fillColor,int radius)
    {
        super(p, BoarderColor, fillColor);
        length=2*radius;
    }
    
    @Override
    public void drawShape(Graphics canvas,int x ,int y,int length,int temp)
    {
        canvas.drawOval(x ,y,length,length);
    }
    
    @Override
    public void fillShape(Graphics canvas,int x ,int y,int length,int temp)
    {
        canvas.fillOval(x ,y,length,length);
    }
}
