 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class NewJFrame extends javax.swing.JFrame {

    
    public NewJFrame() {
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        button3 = new java.awt.Button();
        button4 = new java.awt.Button();
        jLabel4 = new javax.swing.JLabel();
        textField1 = new java.awt.TextField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        button5 = new java.awt.Button();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        jPasswordField1.setText("jPasswordField1");

        jScrollPane1.setViewportView(jTextPane1);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 237, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 69, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 287, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 81, Short.MAX_VALUE)
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jTextField1.setText("jTextField1");

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setText("Railway Reservation System");

        button1.setLabel("button1");

        button2.setLabel("button2");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Imprint MT Shadow", 3, 36)); // NOI18N
        jLabel2.setText("Railway Ticket Booking System");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 30, 540, -1));

        button3.setBackground(new java.awt.Color(255, 0, 255));
        button3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button3.setFont(new java.awt.Font("Georgia", 3, 24)); // NOI18N
        button3.setLabel("Login\n");
        button3.setName("Login\n"); // NOI18N
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        jPanel2.add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 460, 120, 50));

        button4.setBackground(new java.awt.Color(0, 102, 255));
        button4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button4.setFont(new java.awt.Font("Georgia", 3, 24)); // NOI18N
        button4.setLabel("Register");
        button4.setName("Register"); // NOI18N
        button4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewJFrame1(evt);
            }
        });
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        jPanel2.add(button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 730, 130, 50));

        jLabel4.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        jLabel4.setText("UserName OR E-mail");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, -1, -1));

        textField1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        textField1.setName("username"); // NOI18N
        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });
        jPanel2.add(textField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(727, 225, 270, 40));

        jLabel3.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        jLabel3.setText("Password");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 150, -1));

        jPasswordField2.setFont(new java.awt.Font("Times New Roman", 3, 30)); // NOI18N
        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 320, 270, 40));

        jLabel5.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        jLabel5.setText("Are You a New User    ?  ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 740, -1, -1));

        button5.setBackground(new java.awt.Color(255, 255, 102));
        button5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button5.setFont(new java.awt.Font("Georgia", 3, 24)); // NOI18N
        button5.setLabel("Back");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });
        jPanel2.add(button5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1386, 10, 110, 50));
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 307, 107, 15));

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Georgia", 3, 24)); // NOI18N
        jButton1.setText("Reset");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, 130, 50));

        jLabel9.setText("Show Password");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 390, 176, -1));

        jCheckBox1.setText("jCheckBox1");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 390, 23, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/train2 (1).jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1520, 1000));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1520, 1000));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        String a=textField1.getText();
        String p=jPasswordField2.getText();
        if(a.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "UserName is Mandatory:");
                }
        else if(p.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Password is Mandatory:");
        }
        else
        {
            try 
        {
            Class<?> forName = Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection con=null;
        try
       {
            
           con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Train", "root", "");
       }
       catch (SQLException e)
       {
           System.out.println("OOPS,Error");
           e.printStackTrace();
       }
                   
                                       
                    
        String query = " select * from regid where email=? and ps =?;";
        PreparedStatement s=null;
            try {
                s = con.prepareStatement(query);
            } catch (SQLException ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        try
        {
            s.setString(1,textField1.getText());
        }catch (SQLException ex) 
        {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        try
        {
            s.setString(2,jPasswordField2.getText());
        }
        catch (SQLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        try
        {
            ResultSet rs =s.executeQuery();
            if(rs.next())
            {
                JOptionPane.showMessageDialog(null,"Login SuccessFull");
             new Choice().setVisible(true);
            dispose();
               
            }
            else
            {
               JOptionPane.showMessageDialog(null,"UserName or Password MisMatch");
               textField1.setText("");
               jPasswordField2.setText("");
            }
            
        }
        catch (SQLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
      
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        NewJFrame1 a=new NewJFrame1();
        a.setVisible(true);
        NewJFrame v=new NewJFrame();
        this.dispose();
       
    }//GEN-LAST:event_button4ActionPerformed

    private void NewJFrame1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewJFrame1
        // TODO add your handling code here:
    }//GEN-LAST:event_NewJFrame1

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField1ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        new Admin().setVisible(true);
        dispose();
    }//GEN-LAST:event_button5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        textField1.setText("");
        jPasswordField2.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
       if(jCheckBox1.isSelected())
       {
           jPasswordField2.setEchoChar('\u0000');
           
       }
       else
       {
           jPasswordField2.setEchoChar('*');
       }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private java.awt.Button button5;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables
}
