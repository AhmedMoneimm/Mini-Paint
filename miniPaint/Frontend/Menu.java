//Frontend is made using netBeans
package miniPaint.Frontend;

public class Menu extends javax.swing.JFrame 
{

    public Menu() 
    {
        super("Vector Drawing Application");
        initComponents();
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() 
    {

        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        startbutton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Tempus Sans ITC", 2, 48)); 
        title.setForeground(new java.awt.Color(204, 204, 0));
        title.setText("AI Painter ");
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        startbutton.setBackground(new java.awt.Color(255, 255, 102));
        startbutton.setFont(new java.awt.Font("Tempus Sans ITC", 2, 24)); 
        startbutton.setText("Start painting ");
        startbutton.addMouseListener(new java.awt.event.MouseAdapter()
         {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) 
            {
                startbuttonMouseClicked(evt);
            }
        });
        jPanel1.add(startbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 343, 250, 50));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniPaint/Frontend/backgorund.jpg")));
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 620, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void startbuttonMouseClicked(java.awt.event.MouseEvent evt) 
    {
        new Painter();
        this.dispose();
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) 
        {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            @Override
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JLabel background;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton startbutton;
    private javax.swing.JLabel title;
    // End of variables declaration
}
