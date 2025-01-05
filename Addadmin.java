
import Project.Conn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class Addadmin extends javax.swing.JInternalFrame {

    /**
     * Creates new form Addadmin
     */
    public Addadmin() {
        initComponents();
        this.setSize(652, 379+22);
        Autoid();
    }
 public void Autoid()
    {
        try {
            Connection con=Conn.getCon();
            PreparedStatement pre;
            pre=con.prepareStatement("Select MAX(Adminid) from Admin");
            ResultSet rs=pre.executeQuery();
            rs.next();
            if(rs.getString("MAX(Adminid)")==null)
            {
                adminid.setText("AD001");
            }
            else
            {
                long id=Long.parseLong(rs.getString("MAX(Adminid)").substring(2,rs.getString("MAX(Adminid)").length()));
                id++;
                adminid.setText("AD"+String.format("%03d",id));
            }
           } catch (SQLException ex) {
            Logger.getLogger(Addpassenger.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        adminid = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setText("Welcome to the Admin Panel");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 300, 44));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Last Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 116, 72, 33));

        firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameActionPerformed(evt);
            }
        });
        jPanel1.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 81, 67, -1));

        jLabel3.setText("First Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 76, 72, 33));

        jLabel4.setText("Admin ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 36, 72, 33));

        adminid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminidActionPerformed(evt);
            }
        });
        jPanel1.add(adminid, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 40, 67, -1));

        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });
        jPanel1.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 121, 67, -1));

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 41, 67, -1));

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 81, 67, -1));

        jLabel5.setText("Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 76, 72, 33));

        jLabel6.setText("Username");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 36, 72, 33));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 360, 160));

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, -1));

        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Downloads\\download (18).jpg")); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -310, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameActionPerformed

    private void adminidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminidActionPerformed

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String Adminid=adminid.getText();
        String Firstname=firstname.getText();
        String Lastname=lastname.getText();
        String Username=username.getText();
        String Password=password.getText();
        
        try {
            Connection con=Conn.getCon();
             PreparedStatement pre;
            pre=con.prepareStatement("insert into admin(Adminid,Firstname,"
                    +"Lastname,Username,Password)"
                    + "values(?,?,?,?,?)");
            pre.setString(1,Adminid);
            pre.setString(2,Firstname);
            pre.setString(3,Lastname);
            pre.setString(4,Username);
            pre.setString(5,Password);
            
            pre.executeUpdate();
            JOptionPane.showMessageDialog(null,"Admin Added Successfully");
            
        } catch (SQLException ex) {
            Logger.getLogger(Addadmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adminid;
    private javax.swing.JTextField firstname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastname;
    private javax.swing.JTextField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
