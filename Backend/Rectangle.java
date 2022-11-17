import java.awt.Graphics;
import java.awt.Point;
import java.awt.Color;

public class Rectangle extends ShapeBase
{
    public Rectangle(Point p, int length, int width,Color BoarderColor, Color fillColor)
    {
        super(p, BoarderColor, fillColor);
        this.length=length;
        this.width=width;
    }

    @Override
    public void drawShape(Graphics canvas, int x, int y, int length, int width) {
        canvas.drawRect(x, y, width, width);
    }

    @Override
    public void fillShape(Graphics canvas, int x, int y, int length, int width) {
        canvas.fillRect(x, y, width, width);
        
    }
    
}
