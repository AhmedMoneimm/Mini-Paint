//Frontend is made using netBeans
package miniPaint.Frontend;

import miniPaint.Backend.DrawingEngine;
import miniPaint.Backend.Shape;
import java.awt.Graphics;
import java.util.ArrayList;

public class PaintScreen extends javax.swing.JPanel implements DrawingEngine
{

    ArrayList<Shape> shapes = new ArrayList<>();
    int counter=0;

    public PaintScreen()
    {
       initComponents();
    }
           
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        for(Shape s: shapes)
        {
            s.draw(g);
        }
    }
    @Override
    public void addShape(Shape shape) 
    {
        shapes.add(shape);
    }

    @Override
    public void removeShape(Shape shape) 
    {
        for(int i=0;i<shapes.size();i++)
        {
            if(shapes.get(i).equals(shape))
            shapes.remove(shapes.get(i));
        }
    }

    @Override
    public Shape[] getShapes() 
    {
        Shape[] shapesArr = new Shape[shapes.size()];
        return shapes.toArray(shapesArr);
    }

    @Override
    public void refresh(Graphics canvas) 
    {
        this.repaint();
    }

    private void initComponents() 
    {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 343, Short.MAX_VALUE)
        );
    }
}
