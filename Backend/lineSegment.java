import java.awt.Graphics;
import java.awt.Point;
import java.awt.Color;

public class lineSegment extends ShapeBase
{
    int x2,y2;
    public lineSegment(Point p1,Point p2,Color BoarderColor)
    {
        super(p1, BoarderColor, null);
        this.x2=p2.x; this.y2=p2.y;
    }
    
    @Override
    public void drawShape(Graphics canvas, int x, int y, int x2, int y2) {
        canvas.drawLine(x, y, x2, y2);
        
    }

    @Override
    public void fillShape(Graphics canvas, int x, int y, int length, int width) {
        // TODO Auto-generated method stub
        
    }
    
}
