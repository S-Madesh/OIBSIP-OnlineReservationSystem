

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ACER LAPTOP
 */
public class upda extends javax.swing.JFrame {

    /**
     * Creates new form 
     */
    public upda() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1543, 1051));

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(1543, 1051));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Madurai");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Thiruchirapalli");

        jCheckBox3.setText("Kovilpatti");

        jCheckBox7.setText("Villupuram");

        jCheckBox5.setText("Virudhunagar");

        jCheckBox4.setText("Sattur");

        jLabel4.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel4.setText("From Station");

        jLabel3.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel3.setText("Train Name");

        jLabel5.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel5.setText("To Station");

        jLabel6.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel6.setText("Stoppings");

        jLabel7.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel7.setText("Available Days:");

        jCheckBox13.setText("Sunday");

        jCheckBox6.setText("Monday");

        jCheckBox8.setText("Tuesday");
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });

        jCheckBox9.setText("Wednesday");

        jCheckBox12.setText("Saturday");
        jCheckBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox12ActionPerformed(evt);
            }
        });

        jCheckBox11.setText("Friday");

        jCheckBox10.setText("Thursday");

        jButton1.setBackground(new java.awt.Color(0, 0, 255));
        jButton1.setFont(new java.awt.Font("Georgia", 3, 24)); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(102, 255, 0));
        jButton4.setFont(new java.awt.Font("Georgia", 3, 24)); // NOI18N
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 153));
        jButton5.setFont(new java.awt.Font("Georgia", 3, 24)); // NOI18N
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Imprint MT Shadow", 3, 36)); // NOI18N
        jLabel1.setText("UPDATING DETAILS");

        jLabel8.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel8.setText("Train No to Modify:");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("New Details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(447, 447, 447)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(548, 548, 548)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(157, 157, 157)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(175, 175, 175)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBox13)
                                            .addComponent(jCheckBox10))
                                        .addGap(51, 51, 51)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jCheckBox8)
                                        .addGap(51, 51, 51)
                                        .addComponent(jCheckBox9))
                                    .addComponent(jCheckBox12)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(188, 188, 188)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(175, 314, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton5))
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox7))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jCheckBox13)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox8)
                    .addComponent(jCheckBox9))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox10)
                    .addComponent(jCheckBox11)
                    .addComponent(jCheckBox12))
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addGap(349, 349, 349))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1506, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1067, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String a=jTextField1.getText();
        String e,f,g,h,i,j,k,l,m,n,o,p,q;
        String b=jTextField4.getText();
        String c=jTextField2.getText();
        String d=jTextField3.getText();
        if(jCheckBox1.isSelected())
        {
             e=jCheckBox1.getText();
        }
        else
        {
             e="null";
        }
         if(jCheckBox2.isSelected())
        {
            f=jCheckBox2.getText();
        }
        else
        {
            f="null";
        }
          if(jCheckBox3.isSelected())
        {
           g=jCheckBox3.getText();
        }
        else
        {
             g="null";
        }
           if(jCheckBox4.isSelected())
        {
             h=jCheckBox4.getText();
        }
        else
        {
             h="null";
        }
            if(jCheckBox5.isSelected())
        {
            i=jCheckBox5.getText();
        }
        else
        {
            i="null";
        }
             if(jCheckBox7.isSelected())
        {
            j=jCheckBox7.getText();
        }
        else
        {
            j="null";
        }
              if(jCheckBox6.isSelected())
        {
            k=jCheckBox6.getText();
        }
        else
        {
            k="null";
        }
               if(jCheckBox8.isSelected())
        {
            l=jCheckBox8.getText();
        }
        else
        {
           l="null";
        }
                if(jCheckBox9.isSelected())
        {
           m=jCheckBox9.getText();
        }
        else
        {
             m="null";
        }
                 if(jCheckBox10.isSelected())
        {
             n=jCheckBox10.getText();
        }
        else
        {
             n="null";
        }
                  if(jCheckBox11.isSelected())
        {
             o=jCheckBox11.getText();
        }
        else
        {
             o="null";
        }
                   if(jCheckBox12.isSelected())
        {
            p=jCheckBox12.getText();
        }
        else
        {
            p="null";
        }
                    if(jCheckBox13.isSelected())
        {
            q=jCheckBox13.getText();
        }
        else
        {
            q="null";
             
        }
        if(a.equals(""))
        {
            JOptionPane.showMessageDialog(null, "TrainNo is Mandatory");
        }
        else if(b.equals(""))
        {
            JOptionPane.showMessageDialog(null, "TrainName is Mandatory");
        }
        else if(c.equals(""))
        {
            JOptionPane.showMessageDialog(null, "From Station is Mandatory");
        }
        else if(d.equals(""))
        {
            JOptionPane.showMessageDialog(null, "To Station is Mandatory");
        }

        else              
        {
            JOptionPane.showMessageDialog(null, "Train Details updated Successfully");

            new AdChoice().setVisible(true);
            dispose();

            try
            {
                Class<?> forName = Class.forName("com.mysql.cj.jdbc.Driver");
            }
            catch (ClassNotFoundException ex) {
                Logger.getLogger(TrainDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
            Connection con=null;
            try
            {

                con= (Connection) DriverManager.getConnection( "jdbc:mysql://localhost:3306/Train","root","");
            }
            catch (SQLException v)
            {
                System.out.println("OOPS,Error");
                v.printStackTrace();
            }
            
            String query;
            query = "UPDATE trdet set tno=?, tname=? ,fs=? ,ts=? ,s1=?, s2=?, s3=?, s4=?, s5=?, s6=? ,d1=?, d2=?, d3=?, d4=?, d5=?, d6=? ,d7=? where tno="+a;
    
            PreparedStatement s=null;
            try {
                s = con.prepareStatement(query);
            } catch (SQLException ex) {
                Logger.getLogger(upda.class.getName()).log(Level.SEVERE, null, ex);
            }
            try
            {
                s.setString(1,jTextField1.getText());
            }catch (SQLException ex)
            {
                Logger.getLogger(TrainDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
            try
            {
                s.setString(2,jTextField4.getText());
            }catch (SQLException ex)
            {
                Logger.getLogger(TrainDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try
            {
                s.setString(3,jTextField2.getText());
            }
            catch (SQLException ex) {
                Logger.getLogger(TrainDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
            try
            {
                s.setString(4,jTextField3.getText());
            }
            catch (SQLException ex) {
                Logger.getLogger(TrainDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
            try
            {
                if(jCheckBox1.isSelected())
                {
                    s.setString(5,jCheckBox1.getText());
                }
                else
                {
                    s.setString(5,"null");
                }}
                catch (SQLException ex) {
                    Logger.getLogger(TrainDetails.class.getName()).log(Level.SEVERE, null, ex);
                }

                try {
                    if(jCheckBox2.isSelected())
                    {
                        s.setString(6,jCheckBox2.getText());
                    }
                    else
                    {
                        s.setString(6,"null");
                    }}
                    catch (SQLException ex){
                        Logger.getLogger(TrainDetails.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    try {
                        if(jCheckBox3.isSelected()){
                            s.setString(7,jCheckBox3.getText());
                        }
                        else
                        {
                            s.setString(7,"null");
                        }
                    }
                    catch (SQLException ex){
                        Logger.getLogger(TrainDetails.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    try
                    {
                        if(jCheckBox4.isSelected())
                        {
                            s.setString(8,jCheckBox4.getText());
                        }
                        else
                        {
                            s.setString(8,"null");
                        }}
                        catch (SQLException ex) {
                            Logger.getLogger(TrainDetails.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try
                        {
                            if(jCheckBox5.isSelected()){
                                s.setString(9,jCheckBox5.getText());
                            }
                            else
                            {
                                s.setString(9,"null");
                            }}
                            catch (SQLException ex) {
                                Logger.getLogger(TrainDetails.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            try
                            {
                                if(jCheckBox7.isSelected())
                                {
                                    s.setString(10,jCheckBox7.getText());
                                }
                                else
                                {
                                    s.setString(10,"null");
                                }}

                                catch (SQLException ex) {
                                    Logger.getLogger(TrainDetails.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                try
                                {
                                    if(jCheckBox6.isSelected())
                                    {
                                        s.setString(11,jCheckBox6.getText());

                                    }
                                    else
                                    {
                                        s.setString(11,"null");
                                    }}
                                    catch (SQLException ex) {
                                        Logger.getLogger(TrainDetails.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    try
                                    {
                                        if(jCheckBox8.isSelected())
                                        {
                                            s.setString(12,jCheckBox8.getText());

                                        }
                                        else
                                        {
                                            s.setString(12,"null");
                                        }}
                                        catch (SQLException ex) {
                                            Logger.getLogger(TrainDetails.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                        try
                                        {
                                            if(jCheckBox9.isSelected())
                                            {
                                                s.setString(13,jCheckBox9.getText());

                                            }
                                            else
                                            {
                                                s.setString(13,"null");
                                            }}
                                            catch (SQLException ex) {
                                                Logger.getLogger(TrainDetails.class.getName()).log(Level.SEVERE, null, ex);
                                            }
                                            try
                                            {
                                                if(jCheckBox10.isSelected())
                                                {
                                                    s.setString(14,jCheckBox10.getText());

                                                }
                                                else
                                                {
                                                    s.setString(14,"null");
                                                }}
                                                catch (SQLException ex) {
                                                    Logger.getLogger(TrainDetails.class.getName()).log(Level.SEVERE, null, ex);
                                                }
                                                try
                                                {
                                                    if(jCheckBox11.isSelected())
                                                    {
                                                        s.setString(15,jCheckBox11.getText());

                                                    }
                                                    else
                                                    {
                                                        s.setString(15,"null");
                                                    }}
                                                    catch (SQLException ex) {
                                                        Logger.getLogger(TrainDetails.class.getName()).log(Level.SEVERE, null, ex);
                                                    }
                                                    try
                                                    {
                                                        if(jCheckBox12.isSelected()){
                                                            s.setString(16,jCheckBox12.getText());

                                                        }
                                                        else
                                                        {
                                                            s.setString(16,"null");
                                                        }}
                                                        catch (SQLException ex) {
                                                            Logger.getLogger(TrainDetails.class.getName()).log(Level.SEVERE, null, ex);
                                                        }
                                                        try
                                                        {
                                                            if(jCheckBox13.isSelected())
                                                            {
                                                                s.setString(17,jCheckBox13.getText());

                                                            }
                                                            else
                                                            {
                                                                s.setString(17,"null");
                                                            }}
                                                            catch (SQLException ex) {
                                                                Logger.getLogger(TrainDetails.class.getName()).log(Level.SEVERE, null, ex);
                                                            }
                                                            try
                                                            {
                                                                s.execute();
                                                            }
                                                            catch (SQLException ex) {
                                                                Logger.getLogger(TrainDetails.class.getName()).log(Level.SEVERE, null, ex);
                                                            }

            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(upda.class.getName()).log(Level.SEVERE, null, ex);
            }
                                                        
        }
                                                        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");

        /*if(jCheckBox1.isSelected())
        {
            jComboBox1.removeItem("");
        }*/

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new AdChoice().setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jCheckBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox12ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(upda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(upda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(upda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(upda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new upda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
