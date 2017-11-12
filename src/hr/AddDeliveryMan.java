/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr;

import com.sun.glass.events.KeyEvent;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.sql.*;
/**
 *
 * @author YUNNI
 */
public class AddDeliveryMan extends javax.swing.JFrame {

    private Connection conn;
    private PreparedStatement stmt;
    private String sqlStr;
    private ResultSet rs;
    private Integer Dstatus = 0;
    
    public AddDeliveryMan() {
        initComponents();
        rbNo.setSelected(false);
        cbReason.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnSearchName = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblIC = new javax.swing.JLabel();
        jcGender = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblReason = new javax.swing.JLabel();
        cbReason = new javax.swing.JComboBox();
        rbYes = new javax.swing.JRadioButton();
        rbNo = new javax.swing.JRadioButton();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtIc = new javax.swing.JTextField();
        lblPicture = new javax.swing.JLabel();
        cbGender = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        BtnUpdate = new javax.swing.JButton();
        lblOffday = new javax.swing.JLabel();
        cbOffday = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        lblContactNo = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        txtHomeTel = new javax.swing.JTextField();
        lblTel = new javax.swing.JLabel();
        cbState = new javax.swing.JComboBox();
        lblState = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        txtCityy = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Picturebox = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtBirthdate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Delivery Man");
        setPreferredSize(new java.awt.Dimension(1000, 730));

        BtnSearchName.setBackground(new java.awt.Color(255, 255, 255));
        BtnSearchName.setPreferredSize(new java.awt.Dimension(1000, 730));

        lblTitle.setFont(new java.awt.Font("Franklin Gothic Book", 0, 24)); // NOI18N
        lblTitle.setText("Delivery Man");

        lblID.setText("Delivery Man ID :");

        lblName.setText("Name :");

        lblIC.setText("IC No. :");

        jcGender.setText("Gender :");

        lblStatus.setText("Status :");
        lblStatus.setToolTipText("");

        lblReason.setText("Reason :");

        cbReason.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "Resign", "Retire", "Others" }));

        rbYes.setSelected(true);
        rbYes.setText("Yes");
        rbYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbYesActionPerformed(evt);
            }
        });

        rbNo.setSelected(true);
        rbNo.setText("No");
        rbNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNoActionPerformed(evt);
            }
        });

        txtId.setEnabled(false);

        txtIc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIcKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIcKeyTyped(evt);
            }
        });

        lblPicture.setText("Picture :");

        cbGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\images.png")); // NOI18N
        jButton1.setText("Search");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\add.jpg")); // NOI18N
        jButton2.setText("Add");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\Find01-512.png")); // NOI18N
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        BtnUpdate.setBackground(new java.awt.Color(255, 255, 255));
        BtnUpdate.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\update.png")); // NOI18N
        BtnUpdate.setText("Update");
        BtnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdateActionPerformed(evt);
            }
        });

        lblOffday.setText("Off Day :");

        cbOffday.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" }));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblContactNo.setText("Contact No. :");

        txtContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContactKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContactKeyTyped(evt);
            }
        });

        lblAddress.setText("Address :");

        txtHomeTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHomeTelKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHomeTelKeyTyped(evt);
            }
        });

        lblTel.setText("Home Tel :");
        lblTel.setToolTipText("");

        cbState.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kuala Lumpur", "Johor", "Kedah", "Kelantan", "Malacca", "Negeri Sembilan", "Pahang", "Perak", "Perlis", "Penang", "Sabah", "Sarawak", "Selangor", "Terengganu" }));

        lblState.setText("State :");

        lblCity.setText("City :");

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 0, 15)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\phoe.png")); // NOI18N
        jLabel1.setText("Contact Info.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblContactNo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblState, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAddress, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCity, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbState, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtHomeTel)
                    .addComponent(txtContact)
                    .addComponent(txtAddress)
                    .addComponent(txtCityy, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContactNo)
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHomeTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTel))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblState))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCityy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCity))
                .addGap(38, 38, 38))
        );

        Picturebox.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton5.setText("Upload");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel2.setText("Birth Date :");

        txtBirthdate.setToolTipText("");
        txtBirthdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBirthdateActionPerformed(evt);
            }
        });
        txtBirthdate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBirthdateKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBirthdateKeyTyped(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("(Format : DDMMYYYY)");

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\reset.png")); // NOI18N
        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BtnSearchNameLayout = new javax.swing.GroupLayout(BtnSearchName);
        BtnSearchName.setLayout(BtnSearchNameLayout);
        BtnSearchNameLayout.setHorizontalGroup(
            BtnSearchNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnSearchNameLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(BtnSearchNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle)
                    .addGroup(BtnSearchNameLayout.createSequentialGroup()
                        .addGroup(BtnSearchNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(BtnSearchNameLayout.createSequentialGroup()
                                .addGroup(BtnSearchNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(BtnSearchNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblID)
                                        .addComponent(lblName, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblIC, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGroup(BtnSearchNameLayout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(lblPicture)))
                                .addGap(18, 18, 18)
                                .addGroup(BtnSearchNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(BtnSearchNameLayout.createSequentialGroup()
                                        .addComponent(Picturebox, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(jButton5))
                                    .addGroup(BtnSearchNameLayout.createSequentialGroup()
                                        .addGroup(BtnSearchNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cbOffday, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(BtnSearchNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtId)
                                                .addComponent(txtName)
                                                .addComponent(txtIc)
                                                .addComponent(txtBirthdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cbGender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(BtnSearchNameLayout.createSequentialGroup()
                                .addGroup(BtnSearchNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jcGender)
                                    .addComponent(lblOffday)
                                    .addComponent(jLabel2))
                                .addGap(284, 284, 284)))
                        .addGroup(BtnSearchNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BtnSearchNameLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BtnSearchNameLayout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addGroup(BtnSearchNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblStatus)
                                    .addComponent(lblReason))
                                .addGap(18, 18, 18)
                                .addGroup(BtnSearchNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbReason, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(BtnSearchNameLayout.createSequentialGroup()
                                        .addComponent(rbYes)
                                        .addGap(30, 30, 30)
                                        .addComponent(rbNo))))))
                    .addGroup(BtnSearchNameLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)))
                .addGap(0, 183, Short.MAX_VALUE))
        );
        BtnSearchNameLayout.setVerticalGroup(
            BtnSearchNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnSearchNameLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(BtnSearchNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(BtnSearchNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BtnSearchNameLayout.createSequentialGroup()
                        .addGroup(BtnSearchNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblID)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(BtnSearchNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(BtnSearchNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblName)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(BtnSearchNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIC)
                            .addComponent(txtIc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(BtnSearchNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(BtnSearchNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcGender))
                        .addGap(18, 18, 18)
                        .addGroup(BtnSearchNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOffday)
                            .addComponent(cbOffday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(BtnSearchNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Picturebox, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPicture)
                            .addComponent(jButton5))
                        .addGap(188, 188, 188))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BtnSearchNameLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(BtnSearchNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStatus)
                            .addComponent(rbYes)
                            .addComponent(rbNo))
                        .addGap(18, 18, 18)
                        .addGroup(BtnSearchNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblReason)
                            .addComponent(cbReason, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnSearchName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnSearchName, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
       
    public ImageIcon ResizeImage(String ImagePath)
    {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(Picturebox.getWidth(), Picturebox.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", ".jpg", ".gif", ".PNG");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            Picturebox.setIcon(ResizeImage(path));
            
        }
        else if(result == JFileChooser.CANCEL_OPTION)
        {
            JOptionPane.showMessageDialog(null, "No file selected.","Warning", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtIcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIcKeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACKSPACE)||c==KeyEvent.VK_DELETE)){
            JOptionPane.showMessageDialog(null, "Invalid input.","Warning", JOptionPane.INFORMATION_MESSAGE);
            evt.consume();
        }
    }//GEN-LAST:event_txtIcKeyTyped

    private void txtBirthdateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBirthdateKeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACKSPACE)||c==KeyEvent.VK_DELETE)){
            JOptionPane.showMessageDialog(null, "Invalid input.","Warning", JOptionPane.INFORMATION_MESSAGE);
            evt.consume();
        }
    }//GEN-LAST:event_txtBirthdateKeyTyped

    private void txtContactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactKeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACKSPACE)||c==KeyEvent.VK_DELETE)){
            JOptionPane.showMessageDialog(null, "Invalid input.","Warning", JOptionPane.INFORMATION_MESSAGE);
            evt.consume();
        }
    }//GEN-LAST:event_txtContactKeyTyped

    private void txtHomeTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHomeTelKeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACKSPACE)||c==KeyEvent.VK_DELETE)){
            JOptionPane.showMessageDialog(null, "Invalid input.","Warning", JOptionPane.INFORMATION_MESSAGE);
            evt.consume();
        }
    }//GEN-LAST:event_txtHomeTelKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        int i = Validation();
        
        if(i == -1)
        {
            JOptionPane.showMessageDialog(null, "Mandatory field must no be blank.","Warning", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(i == 0)
        {
            insertData();
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void rbNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNoActionPerformed
        if(rbNo.isSelected())
        {
            rbYes.setSelected(false);
            cbReason.setEnabled(true);
        }
    }//GEN-LAST:event_rbNoActionPerformed

    private void rbYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbYesActionPerformed
        if(rbYes.isSelected())
        {
            rbNo.setSelected(false);
            cbReason.setEnabled(false);
            cbReason.setSelectedIndex(0);
        }
        
    }//GEN-LAST:event_rbYesActionPerformed

    private void txtIcKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIcKeyPressed
        if(txtIc.getText().length()>=12)
        {
            txtIc.setText(txtIc.getText().substring(0, 11));
        }
    }//GEN-LAST:event_txtIcKeyPressed

    private void txtBirthdateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBirthdateKeyPressed
        if(txtBirthdate.getText().length()>=8)
        {
            txtBirthdate.setText(txtBirthdate.getText().substring(0, 7));
        }
    }//GEN-LAST:event_txtBirthdateKeyPressed

    private void txtContactKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactKeyPressed
        if(txtContact.getText().length()>= 11)
        {
            txtContact.setText(txtContact.getText().substring(0, 10));
        }  
    }//GEN-LAST:event_txtContactKeyPressed

    private void txtHomeTelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHomeTelKeyPressed
        if(txtHomeTel.getText().length()>=9)
        {
            txtHomeTel.setText(txtHomeTel.getText().substring(0, 8));
        }  
    }//GEN-LAST:event_txtHomeTelKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        if(txtName.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please enter name before search.","Warning", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            SelectData();
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdateActionPerformed
        
        if(txtId.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Don't play play","Warning", JOptionPane.INFORMATION_MESSAGE);
        
        }
        else
        {
            updateData();
            clearData();
        }
    }//GEN-LAST:event_BtnUpdateActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        clearData();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtBirthdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBirthdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBirthdateActionPerformed
    
    public void clearData()
    {
        txtId.setText("");
        txtName.setText("");
        txtIc.setText("");
        txtBirthdate.setText("");
        txtContact.setText("");
        txtHomeTel.setText("");
        txtAddress.setText("");
        txtCityy.setText("");
        cbReason.setSelectedIndex(0);
        cbOffday.setSelectedIndex(0);
        cbGender.setSelectedIndex(0);
        cbState.setSelectedIndex(0);
        rbYes.setSelected(true);
        rbNo.setSelected(false);
    }
    
    public int Validation()
    {
        int re = 0;
        if(txtName.getText().isEmpty())
        {
            re = -1;
        }
        else if(txtIc.getText().isEmpty())
        {
            re = -1;
        }
        else if(txtBirthdate.getText().isEmpty())
        {
            re = -1;
        }
        else if(txtContact.getText().isEmpty())
        {
            re = -1;
        }
        else if(txtHomeTel.getText().isEmpty())
        {
            re = -1;
        }
        else if(txtAddress.getText().isEmpty())
        {
            re = -1;
        }
        else if(txtCityy.getText().isEmpty())
        {
            re = -1;
        }
        
        return re;
    }
    
    public void insertData(){
        
        if(rbNo.isSelected())
        {
            Dstatus = 1;
        }
        else
        {
            Dstatus = 0;
        }
  
        try{            
            String host = "jdbc:derby://localhost:1527/collegedb";
            String user = "collegedb";
            String password = "collegedb";
        
            conn = DriverManager.getConnection(host,user,password);
            String sqlStr = "Insert into DELIVERYMAN (Name,IC,GENDER,BIRTHDATE,CONTACTNO,HOMETEL,ADDRESS,STATE,CITY,STATUS,REASON,OFFDAY) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
                        
            stmt = conn.prepareStatement(sqlStr);
            stmt.setString(1, txtName.getText());
            stmt.setString(2, txtIc.getText());
            stmt.setString(3, String.valueOf(cbGender.getSelectedItem()));
            stmt.setString(4, txtBirthdate.getText());
            stmt.setString(5, txtContact.getText());
            stmt.setString(6, txtHomeTel.getText());
            stmt.setString(7, txtAddress.getText());
            stmt.setString(8, String.valueOf(cbState.getSelectedItem()));
            stmt.setString(9, txtCityy.getText());
            stmt.setInt(10, Dstatus);
            stmt.setString(11, String.valueOf(cbReason.getSelectedItem()));
            stmt.setString(12, String.valueOf(cbOffday.getSelectedItem()));
            //stmt.setString(13, Picturebox.getText());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Insert Successful." );
            clearData();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Fail Insert. " + e.getMessage(),"Warning", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void SelectData(){
        try{
            String host = "jdbc:derby://localhost:1527/collegedb";
            String user = "collegedb";
            String password = "collegedb";
            
            conn = DriverManager.getConnection(host, user, password);
            stmt = conn.prepareStatement("SELECT * FROM DELIVERYMAN WHERE NAME = ?");
            stmt.setString(1, txtName.getText()); 
            
            rs = stmt.executeQuery();
            if(rs.next())
            {
                txtId.setText(rs.getString(1));
                txtName.setText(rs.getString(2));
                txtIc.setText(rs.getString(3));
                cbGender.setSelectedItem(rs.getString(4));
                txtBirthdate.setText(rs.getString(5));
                txtContact.setText(rs.getString(6));
                txtHomeTel.setText(rs.getString(7));
                txtAddress.setText(rs.getString(8));
                cbState.setSelectedItem(rs.getString(9));
                txtCityy.setText(rs.getString(10));
                int Status = rs.getInt(11);
                if(Status == 0)
                {
                    rbYes.setSelected(true);
                    rbNo.setSelected(false);
                }
                else
                {
                    rbNo.setSelected(true);
                    rbYes.setSelected(false);
                }
                cbReason.setSelectedItem(rs.getString(12));
                cbOffday.setSelectedItem(rs.getString(13));
            }
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Failed. " + e.getMessage(),"Warning", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void updateData(){
        
        if(rbNo.isSelected())
        {
            Dstatus = 1;
        }
        else
        {
            Dstatus = 0;
        }
  
        try{            
            String host = "jdbc:derby://localhost:1527/collegedb";
            String user = "collegedb";
            String password = "collegedb";
        
            conn = DriverManager.getConnection(host,user,password);
            String sqlStr = "Update DELIVERYMAN set Name='"+txtName.getText()+"',IC='"+txtIc.getText()+"',GENDER='"+cbGender.getSelectedItem()+"'"
                    + ",BIRTHDATE='"+ txtBirthdate.getText() +"', CONTACTNO='"+txtContact.getText()+"', HOMETEL='"+txtHomeTel.getText()+"'"
                    + ",Address='"+txtAddress.getText()+"', STATE='"+ cbState.getSelectedItem()+"', CITY='"+txtCityy.getText()+"'"
                    + ",STATUS=?, REASON='"+cbReason.getSelectedItem()+"', OFFDAY='"+cbOffday.getSelectedItem()+"' where DELIVERYMANID=?";
                        
            stmt = conn.prepareStatement(sqlStr);
            stmt.setInt(1, Dstatus); 
            stmt.setString(2, txtId.getText()); 
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Updated." );
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Fail Insert. " + e.getMessage(),"Warning", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void ImagePath()
    {
        

    }
    
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
            java.util.logging.Logger.getLogger(AddDeliveryMan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDeliveryMan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDeliveryMan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDeliveryMan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDeliveryMan().setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtnSearchName;
    private javax.swing.JButton BtnUpdate;
    private javax.swing.JLabel Picturebox;
    private javax.swing.JComboBox cbGender;
    private javax.swing.JComboBox cbOffday;
    private javax.swing.JComboBox cbReason;
    private javax.swing.JComboBox cbState;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jcGender;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblContactNo;
    private javax.swing.JLabel lblIC;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOffday;
    private javax.swing.JLabel lblPicture;
    private javax.swing.JLabel lblReason;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTel;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JRadioButton rbNo;
    private javax.swing.JRadioButton rbYes;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBirthdate;
    private javax.swing.JTextField txtCityy;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtHomeTel;
    private javax.swing.JTextField txtIc;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

}
