import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public interface Shape
{
    /* set position */
    void setPosition(Point position);
    Point getPosition();
    /* colorize */
    void setColor(Color color);
    Color getColor();
    void setFillColor(Color color);
    Color getFillColor();
    /* redraw the shape on the canvas */
    void draw(Graphics canvas);
}