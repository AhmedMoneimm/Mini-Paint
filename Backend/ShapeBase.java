import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public abstract class ShapeBase implements Shape
{
    protected int x,y;
    protected Color BoarderColor;
    protected Color fillColor;
    protected Point position;
    protected int length;
    protected int width;
    
    public ShapeBase(Point p,Color BoarderColor, Color fillColor)
    {
        this.x=p.x;
        this.y=p.y;
        this.BoarderColor=BoarderColor;
        this.fillColor=fillColor;
    }

    @Override
    public void setPosition(Point position) {
        this.position=position;
    }

    @Override
    public Point getPosition() {
        return position;
    }

    @Override
    public void setColor(Color BoarderColor) {
        this.BoarderColor=BoarderColor;
    }

    @Override
    public Color getColor() {
        return BoarderColor;
    }

    @Override
    public void setFillColor(Color fillColor) {
        this.fillColor=fillColor;
    }

    @Override
    public Color getFillColor() {
        return fillColor;
    }

    public abstract void drawShape(Graphics canvas, int x, int y, int length, int width);
    public abstract void fillShape(Graphics canvas, int x, int y, int length, int width);
    
    @Override
    public void draw(Graphics canvas)
    {
        Color originalColor=getColor();
        // bounds' color
        canvas.setColor(BoarderColor);
        drawShape(canvas,position.x ,position.y,length,width);
        // colour inside
        canvas.setColor(fillColor);
        fillShape(canvas,position.x ,position.y,length,width);
        // reset
        canvas.setColor(originalColor);
    }

}
