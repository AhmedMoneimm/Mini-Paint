//Frontend is made using netBeans
package miniPaint.Frontend;

import miniPaint.Backend.*;
import java.awt.Color;
import java.awt.Point;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;


public class Painter extends javax.swing.JFrame
{
    int counter=0;
    public Painter() 
    {
        initComponents();
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() 
    {

        jPanel1 = new javax.swing.JPanel();
        rectanglelabel = new javax.swing.JLabel();
        circleButton = new javax.swing.JButton();
        squareButton = new javax.swing.JButton();
        rectangleButton = new javax.swing.JButton();
        linesegmentButton = new javax.swing.JButton();
        squarelabel = new javax.swing.JLabel();
        linesegmentlabel = new javax.swing.JLabel();
        circlelabel = new javax.swing.JLabel();
        ChooseShape = new javax.swing.JComboBox<>();
        selectshapelabel = new javax.swing.JLabel();
        colorizebutton = new javax.swing.JButton();
        deletebutton = new javax.swing.JButton();
        paintScreen1 = new miniPaint.Frontend.PaintScreen();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rectanglelabel.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12));
        rectanglelabel.setForeground(new java.awt.Color(204, 204, 0));
        rectanglelabel.setText("Rectangle");
        jPanel1.add(rectanglelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, 60, 20));

        circleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frontend/circle.jpeg")));
        circleButton.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                circleButtonActionPerformed(evt);
            }
        });
        jPanel1.add(circleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 30, 30));

        squareButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frontend/square.png")));
        squareButton.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                squareButtonActionPerformed(evt);
            }
        });
        jPanel1.add(squareButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(601, 20, 30, -1));

        rectangleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frontend/rectangle.jpeg")));
        rectangleButton.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                rectangleButtonActionPerformed(evt);
            }
        });
        jPanel1.add(rectangleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(656, 20, 50, 30));

        linesegmentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frontend/line segment.jpeg")));
        linesegmentButton.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                linesegmentButtonActionPerformed(evt);
            }
        });
        jPanel1.add(linesegmentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 50, 30));

        squarelabel.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12));
        squarelabel.setForeground(new java.awt.Color(204, 204, 0));
        squarelabel.setText("Square");
        jPanel1.add(squarelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, -1, -1));

        linesegmentlabel.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12));
        linesegmentlabel.setForeground(new java.awt.Color(204, 204, 0));
        linesegmentlabel.setText("Line segment");
        jPanel1.add(linesegmentlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, -1, -1));

        circlelabel.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12));
        circlelabel.setForeground(new java.awt.Color(204, 204, 0));
        circlelabel.setText("Circle");
        jPanel1.add(circlelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, -1, -1));

        ChooseShape.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose shape" }));
        jPanel1.add(ChooseShape, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 160, -1));

        selectshapelabel.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18));
        selectshapelabel.setForeground(new java.awt.Color(204, 204, 0));
        selectshapelabel.setText("Select shape");
        jPanel1.add(selectshapelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 107, 100, 30));

        colorizebutton.setText("Colorize");
        colorizebutton.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                colorizebuttonActionPerformed(evt);
            }
        });
        jPanel1.add(colorizebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        deletebutton.setText("Delete");
        deletebutton.addActionListener(new java.awt.event.ActionListener()
         {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                deletebuttonActionPerformed(evt);
            }
        });
        jPanel1.add(deletebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        paintScreen1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout paintScreen1Layout = new javax.swing.GroupLayout(paintScreen1);
        paintScreen1.setLayout(paintScreen1Layout);
        paintScreen1Layout.setHorizontalGroup(
            paintScreen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        paintScreen1Layout.setVerticalGroup(
            paintScreen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        jPanel1.add(paintScreen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 580, 490));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frontend/backgorund.jpg")));
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 790, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void circleButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {
        Point p =new Point();
        p.x=Integer.parseInt(JOptionPane.showInputDialog("Enter x-coordintes of the center  :"));
        p.y=Integer.parseInt(JOptionPane.showInputDialog("Enter y-coordintes of the center  :"));
        int r = Integer.parseInt(JOptionPane.showInputDialog("Enter radius :"));
        Circle c=new Circle(p, Color.darkGray, Color.yellow, r);
        paintScreen1.addShape(c);
        paintScreen1.repaint();
        paintScreen1.counter++;
        ChooseShape.addItem("Circle " + paintScreen1.counter);
        
    }

    private void squareButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {
        Point p =new Point();
        p.x=Integer.parseInt(JOptionPane.showInputDialog("Enter x-coordintes of the center  :"));
        p.y=Integer.parseInt(JOptionPane.showInputDialog("Enter y-coordintes of the center  :"));
        int l = Integer.parseInt(JOptionPane.showInputDialog("Enter length :"));
        Rectangle rec=new Rectangle(p, l, l, Color.darkGray, Color.yellow);
        paintScreen1.addShape(rec);
        paintScreen1.repaint();
        paintScreen1.counter++;
        ChooseShape.addItem("Square " + paintScreen1.counter);
    }

    private void rectangleButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Enter x-coordintes of the center  :"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Enter y-coordintes of the center  :"));
        int l = Integer.parseInt(JOptionPane.showInputDialog("Enter length :"));
        int w = Integer.parseInt(JOptionPane.showInputDialog("Enter width :"));
        Point p=new Point(x, y);
        Rectangle rec=new Rectangle(p, l, w, Color.darkGray, Color.yellow);
        paintScreen1.addShape(rec);
        paintScreen1.repaint();
        paintScreen1.counter++;
        ChooseShape.addItem("Rectangle " + paintScreen1.counter);
    }

    private void linesegmentButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {
        Point p =new Point();
        Point p1 =new Point();
        p.x=Integer.parseInt(JOptionPane.showInputDialog("Enter x-coordintes of the start point :"));
        p.y=Integer.parseInt(JOptionPane.showInputDialog("Enter y-coordintes of the start point :"));
        p1.x=Integer.parseInt(JOptionPane.showInputDialog("Enter x-coordintes of the end point :"));
        p1.y=Integer.parseInt(JOptionPane.showInputDialog("Enter y-coordintes of the end point :"));
        lineSegment ls=new lineSegment(p, p1, Color.darkGray);
        paintScreen1.addShape(ls);
        paintScreen1.repaint();
        paintScreen1.counter++;
        ChooseShape.addItem("LineSegment " + paintScreen1.counter);
        
    }

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) 
    {
        if (ChooseShape.getSelectedIndex()>0){
            paintScreen1.removeShape(paintScreen1.shapes.get(ChooseShape.getSelectedIndex() - 1));
            ChooseShape.removeItemAt(ChooseShape.getSelectedIndex());
            paintScreen1.counter--;
            int n=1;
            for(int i=1;i<=paintScreen1.counter;i++){
                String s[]=ChooseShape.getItemAt(n).split(" ");
                ChooseShape.addItem(s[0]+" "+i);
                ChooseShape.removeItemAt(n);
            }
            paintScreen1.removeAll();
            paintScreen1.repaint();
        }
        else
             JOptionPane.showMessageDialog(this,"Nothing to delete ","NO SHAPES",JOptionPane.INFORMATION_MESSAGE);
    }

    private void colorizebuttonActionPerformed(java.awt.event.ActionEvent evt)
    {
        if (ChooseShape.getSelectedIndex() > 0) {
            Color chosenColor = JColorChooser.showDialog(null, "Select a color", Color.white);
            Color chosenFillColor = JColorChooser.showDialog(null, "Select a filling color", Color.white);
            Shape temp = paintScreen1.shapes.get(ChooseShape.getSelectedIndex() - 1);
            temp.setFillColor(chosenFillColor);
            temp.setColor(chosenColor);
            paintScreen1.repaint();
        }
        else 
            JOptionPane.showMessageDialog(this,"Nothing to colorize ","NO SHAPES",JOptionPane.INFORMATION_MESSAGE);
    }
    public static void main(String args[]) 
    {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
             {
                if ("Nimbus".equals(info.getName())) 
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) 
        {
            java.util.logging.Logger.getLogger(Painter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) 
        {
            java.util.logging.Logger.getLogger(Painter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) 
        {
            java.util.logging.Logger.getLogger(Painter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) 
        {
            java.util.logging.Logger.getLogger(Painter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new Painter().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JComboBox<String> ChooseShape;
    private javax.swing.JLabel background;
    private javax.swing.JButton circleButton;
    private javax.swing.JLabel circlelabel;
    private javax.swing.JButton colorizebutton;
    private javax.swing.JButton deletebutton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton linesegmentButton;
    private javax.swing.JLabel linesegmentlabel;
    private miniPaint.Frontend.PaintScreen paintScreen1;
    private javax.swing.JButton rectangleButton;
    private javax.swing.JLabel rectanglelabel;
    private javax.swing.JLabel selectshapelabel;
    private javax.swing.JButton squareButton;
    private javax.swing.JLabel squarelabel;
    // End of variables declaration
}
