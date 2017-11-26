/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agile1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Tea Evon
 */
public class FMenuItem extends javax.swing.JFrame {    

    FConfirm orderConfirm = new FConfirm();
    
    /**
     * Creates new form JFMenuItem
     */
    public FMenuItem() {
        initComponents();   
    }
    
    ArrayList<Order> orderL = new ArrayList();
    Order order;
    int qua1 = 0;
    int qua2 = 0;
    int qua3 = 0;
    int qua4 = 0;
//    public ArrayList<Order> OrderList()
//    {
//        ArrayList<Order> orderL = new ArrayList();
//        
//        
//        return orderL;
//    }
    
    public void setRes(String res)
    {
        this.jlResName.setText(res);
    }
    public String getRes()
    {
        return this.jlResName.getText();
    }

    public void getMenu(String res)
    {
        orderConfirm.setRes(res);
        int resID=0;
        try{
            
            String host = "jdbc:derby://localhost:1527/collegedb";
            String username = "nbuser";
            String password = "nbuser";
            Connection con = DriverManager.getConnection(host, username, password);
            PreparedStatement pstmt = con.prepareStatement("Select * from restaurant where resName=?");
            
            pstmt.setString(1,res);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next())
            {
                resID=rs.getInt(1);
                jLabel1.setText(String.valueOf(resID));
            }
//            ArrayList<String> itemList = new ArrayList<String>();
//            ArrayList<Double> priceList = new ArrayList<Double>();   
//            PreparedStatement pstmtItem = con.prepareStatement("Select itemName, itemPrise from item where resID=?");
//            pstmtItem.setInt(1,resID);
//            
//            ResultSet rsItem = pstmtItem.executeQuery();
//            for(int i=0; rsItem.next(); i++)
//            if(rsItem.next())
//            {
//                itemList.add(rsItem.getString(1));
//                priceList.add(rsItem.getDouble(2));
        if(resID==111)
        {
            jLabel1.setText("Spicy Dry Noodle");
            jlPrise1.setText("10.00");
            jLabel2.setText("Fried Rice with Chinese Sausage");
            jlPrise2.setText("11.00");
            jLabel3.setText("Special Dumping Soup (4 pcs)");
            jlPrise3.setText(" 8.00");
            jLabel4.setText("Lo Han Guo Herba Tea");
            jlPrise4.setText(" 4.00");   
        }
        else if(resID==112)
        {
            jLabel1.setText("Sushi Set (salmon, maguro, ebi,anago)");
            jlPrise1.setText("22.00");
            jLabel2.setText("Ramen Soup");
            jlPrise2.setText("18.00");
            jLabel3.setText("Chicken Teriyaki Bento");
            jlPrise3.setText("20.00");
            jLabel4.setText("Tropicana Twister Orange Juice");
            jlPrise4.setText(" 6.00");
        }
        
        else if(resID==113)
        {
            jLabel1.setText("Honey Roaster Chicken");
            jlPrise1.setText("20.00");
            jLabel2.setText("Spicy Roaster Chicken");
            jlPrise2.setText("20.00");
            jLabel3.setText("Glutinous Oil Rice");
            jlPrise3.setText(" 4.00");
            jLabel4.setText("Pepsi");
            jlPrise4.setText(" 5.00");
        }
        
        else if(resID==114)
        {
            jLabel1.setText("Nasi Lemak with Egg");
            jlPrise1.setText("10.00");
            jLabel2.setText("Nasi Lemak with Fried Chicken");
            jlPrise2.setText("12.00");
            jLabel3.setText("Nasi Lemak with Currry Chicken");
            jlPrise3.setText("15.00");
            jLabel4.setText("Bentong Cincau");
            jlPrise4.setText(" 5.00");
        }
        
        else if(resID==115)
        {
         jLabel1.setText("Special Dry Noodle");
            jlPrise1.setText(" 8.00");
            jLabel2.setText("Special Noodle Soup");
            jlPrise2.setText(" 9.00");
            jLabel3.setText("Spicy Noodle Soup");
            jlPrise3.setText("10.00");
            jLabel4.setText("Honey Lemon Tea");
            jlPrise4.setText(" 4.00");   
        }
        
        else if(resID==116)
        {
            jLabel1.setText("Salted Fish Pork Rice");
            jlPrise1.setText("12.00");
            jLabel2.setText("Shrimp Fried Rice");
            jlPrise2.setText("11.00");
            jLabel3.setText("Sweet and Sour Pork Rice");
            jlPrise3.setText(" 8.00");
            jLabel4.setText("Chinese Tea");
            jlPrise4.setText(" 3.00");
        }
        
        else if(resID==117)
        {
            jLabel1.setText("Special Spaghetti");
            jlPrise1.setText("11.00");
            jLabel2.setText("Baked Cheese Spaghetti");
            jlPrise2.setText("15.00");
            jLabel3.setText("Spaghetti Bolognese");
            jlPrise3.setText("13.00");
            jLabel4.setText("Lemon Tea");
            jlPrise4.setText(" 5.00");
        }
        
        else if(resID==118)
        {
            jLabel1.setText("Homemade Pork Chop");
            jlPrise1.setText("15.00");
            jLabel2.setText("Black Peper Chicken Chop");
            jlPrise2.setText("13.00");
            jLabel3.setText("Fried Rice");
            jlPrise3.setText(" 7.00");
            jLabel4.setText("Red Tea");
            jlPrise4.setText(" 4.00");
        }
        
                
//            }
//            jLabel1.setText(String.valueOf(itemList));
//            jlPrise1.setText(String.valueOf(priceList));
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            //Logger.getLongger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
//        return menu;
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
        jlResName = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jlPrise1 = new javax.swing.JLabel();
        jlPrise2 = new javax.swing.JLabel();
        jlPrise3 = new javax.swing.JLabel();
        jlPrise4 = new javax.swing.JLabel();
        jbGoBack = new javax.swing.JButton();
        jbOrder = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(275, 53));

        jlResName.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlResName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlResName, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
        );

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("jLabel2");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 260, 30));

        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 210, 30));

        jLabel3.setText("jLabel2");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 210, 30));

        jLabel4.setText("jLabel2");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 210, 30));

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tea Evon\\Documents\\NetBeansProjects\\Agile\\src\\image\\add.jpg")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 20));

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tea Evon\\Documents\\NetBeansProjects\\Agile\\src\\image\\add.jpg")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 20, 20));

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tea Evon\\Documents\\NetBeansProjects\\Agile\\src\\image\\add.jpg")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 20, 20));

        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tea Evon\\Documents\\NetBeansProjects\\Agile\\src\\image\\add.jpg")); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 20, 20));

        jlPrise1.setText("jLabel2");
        jPanel2.add(jlPrise1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 90, 30));

        jlPrise2.setText("jLabel2");
        jPanel2.add(jlPrise2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 90, 30));

        jlPrise3.setText("jLabel2");
        jPanel2.add(jlPrise3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 90, 30));

        jlPrise4.setText("jLabel2");
        jPanel2.add(jlPrise4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 90, 30));

        jbGoBack.setText("Go Back");
        jbGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGoBackActionPerformed(evt);
            }
        });
        jPanel2.add(jbGoBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jbOrder.setText("Order");
        jbOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbOrderActionPerformed(evt);
            }
        });
        jPanel2.add(jbOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, -1, -1));

        jLabel5.setText("jLabel5");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        jLabel6.setText("RM");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 30, 30));

        jLabel7.setText("RM");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 30, 30));

        jLabel8.setText("RM");
        jLabel8.setToolTipText("");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 30, 30));

        jLabel9.setText("RM");
        jLabel9.setToolTipText("");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 30, 30));

        jLabel10.setText("jLabel10");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGoBackActionPerformed
        // TODO add your handling code here:
        FRestaurant resFrame = new FRestaurant();
        resFrame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbGoBackActionPerformed
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String item = jLabel1.getText();
        qua1 ++;
        jLabel5.setText(String.valueOf(qua1));

        double price = Double.parseDouble(jlPrise1.getText());
        order = new Order(item,qua1,price);
        orderL.add(order);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String item = jLabel2.getText();
        qua2++;
        jLabel10.setText(String.valueOf(qua2));

        double price = Double.parseDouble(jlPrise2.getText());
        order = new Order(item,qua2,price);
        orderL.add(order);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String item = jLabel3.getText();
        qua3++;
        //jLabel10.setText(String.valueOf(qua2));

        double price = Double.parseDouble(jlPrise3.getText());
        order = new Order(item,qua3,price);
        orderL.add(order);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String item = jLabel4.getText();
        qua4++;
        //jLabel10.setText(String.valueOf(qua2));

        double price = Double.parseDouble(jlPrise4.getText());
        order = new Order(item,qua4,price);
        orderL.add(order);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jbOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOrderActionPerformed
        // TODO add your handling code here:
        orderConfirm.setVisible(true);
        this.setVisible(false);
//        FConfirm orderCon = new FConfirm();
        orderConfirm(orderL);
    }//GEN-LAST:event_jbOrderActionPerformed

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
            java.util.logging.Logger.getLogger(FMenuItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FMenuItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FMenuItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FMenuItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FMenuItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbGoBack;
    private javax.swing.JButton jbOrder;
    private javax.swing.JLabel jlPrise1;
    private javax.swing.JLabel jlPrise2;
    private javax.swing.JLabel jlPrise3;
    private javax.swing.JLabel jlPrise4;
    private javax.swing.JLabel jlResName;
    // End of variables declaration//GEN-END:variables

    private void orderConfirm(ArrayList<Order> orderL) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
