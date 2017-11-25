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
//import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Tea Evon
 */
public class FMenuItem extends javax.swing.JFrame {    

    /**
     * Creates new form JFMenuItem
     */
    public FMenuItem() {
        initComponents();
        
    }
    
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
//        String menu = "";
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
            jlPrise3.setText("8.00");
            jLabel4.setText("Lo Han Guo Herba Tea");
            jlPrise4.setText("4.00");   
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
            jlPrise4.setText("6.00");
        }
        
        else if(resID==113)
        {
            jLabel1.setText("Honey Roaster Chicken");
            jlPrise1.setText("20.00");
            jLabel2.setText("Spicy Roaster Chicken");
            jlPrise2.setText("20.00");
            jLabel3.setText("Glutinous Oil Rice");
            jlPrise3.setText("4.00");
            jLabel4.setText("Pepsi");
            jlPrise4.setText("5.00");
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
            jlPrise4.setText("5.00");
        }
        
        else if(resID==115)
        {
         jLabel1.setText("Special Dry Noodle");
            jlPrise1.setText("8.00");
            jLabel2.setText("Special Noodle Soup");
            jlPrise2.setText("9.00");
            jLabel3.setText("Spicy Noodle Soup");
            jlPrise3.setText("10.00");
            jLabel4.setText("Honey Lemon Tea");
            jlPrise4.setText("4.00");   
        }
        
        else if(resID==116)
        {
            jLabel1.setText("Salted Fish Pork Rice");
            jlPrise1.setText("12.00");
            jLabel2.setText("Shrimp Fried Rice");
            jlPrise2.setText("11.00");
            jLabel3.setText("Sweet and Sour Pork Rice");
            jlPrise3.setText("8.00");
            jLabel4.setText("Chinese Tea");
            jlPrise4.setText("3.00");
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
            jlPrise4.setText("5.00");
        }
        
        else if(resID==118)
        {
            jLabel1.setText("Homemade Pork Chop");
            jlPrise1.setText("15.00");
            jLabel2.setText("Black Peper Chicken Chop");
            jlPrise2.setText("13.00");
            jLabel3.setText("Fried Rice");
            jlPrise3.setText("7.00");
            jLabel4.setText("Red Tea");
            jlPrise4.setText("4.00");
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
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 210, 30));

        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 210, 30));

        jLabel3.setText("jLabel2");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 210, 30));

        jLabel4.setText("jLabel2");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 210, 30));

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tea Evon\\Documents\\NetBeansProjects\\Agile\\src\\image\\add.jpg")); // NOI18N
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tea Evon\\Documents\\NetBeansProjects\\Agile\\src\\image\\add.jpg")); // NOI18N
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 30, 30));

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tea Evon\\Documents\\NetBeansProjects\\Agile\\src\\image\\add.jpg")); // NOI18N
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 30, 30));

        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tea Evon\\Documents\\NetBeansProjects\\Agile\\src\\image\\add.jpg")); // NOI18N
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 30, 30));

        jlPrise1.setText("jLabel2");
        jPanel2.add(jlPrise1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 120, 30));

        jlPrise2.setText("jLabel2");
        jPanel2.add(jlPrise2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 120, 30));

        jlPrise3.setText("jLabel2");
        jPanel2.add(jlPrise3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 120, 30));

        jlPrise4.setText("jLabel2");
        jPanel2.add(jlPrise4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlPrise1;
    private javax.swing.JLabel jlPrise2;
    private javax.swing.JLabel jlPrise3;
    private javax.swing.JLabel jlPrise4;
    private javax.swing.JLabel jlResName;
    // End of variables declaration//GEN-END:variables
}
