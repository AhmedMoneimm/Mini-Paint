public interface DrawingEngine 
{
    /* manage shapes objects */
    void addShape(Shape shape);
    void removeShape(Shape shape);
    /* return the created shapes objects */
    Shape[] getShapes();
    /* redraw all shapes on the canvas */
    void refresh(java.awt.Graphics canvas);
}
