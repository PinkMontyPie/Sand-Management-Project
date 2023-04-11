/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sand_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.*;
import java.util.*;

/**
 *
 * @author Pai
 */
public class main_ui extends javax.swing.JFrame {
    SimpleDateFormat timeFormat;
    SimpleDateFormat dateFormat;
    String time;
    String date;
    private All_Data user; 
    
    public main_ui(All_Data a1) {
        initComponents();
        this.user = a1;
        permission();
        Start();
    }
    
    public void permission(){
        Connection c = null;
        Statement stmt = null;
                try {
                    Class.forName("org.sqlite.JDBC");
                    c = DriverManager.getConnection("jdbc:sqlite:user.db");
                    c.setAutoCommit(false);
                    stmt = c.createStatement();
                    String a1 = user.getUser();
                    ResultSet rs = stmt.executeQuery( "SELECT * FROM user WHERE username = '"+a1+"'" );
                    String position1 = rs.getString("position");
                    System.out.println(position1);
                    if (position1.equals("IT")){
                    }
                    else if(position1.equals("CEO")){
                    }
                    else if(position1.equals("Secretary")){
                        Button_Employee.setVisible(false);
                    }
                    else if(position1.equals("Employee")){
                        Button_Employee.setVisible(false);
                        Button_Storage.setVisible(false);
                        Button_Purchase.setVisible(false);
                        Button_Sell.setVisible(false);
                        Button_Report.setVisible(false);
                    }
                    else {
                        Button_Employee.setVisible(false);
                        Button_Storage.setVisible(false);
                        Button_Purchase.setVisible(false);
                        Button_Sell.setVisible(false);
                        Button_Delivery.setVisible(false);
                        Button_Report.setVisible(false);
                    }
                    rs.close();
                    stmt.close();
                    c.close();
                } 
                catch ( Exception b ) {
                   System.err.println( b.getClass().getName() + ": " + b.getMessage() );
                   System.exit(0);
                }
    }
    
    public void Start(){
        setDate();
        setTime();
    }
    
    public void setDate() {
        dateFormat = new SimpleDateFormat("EEEE dd MMMMM yyyy");
        date = dateFormat.format(Calendar.getInstance().getTime());
        jLabelDate.setText(date);
    }

    public void setTime() {
        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        Timer timer = new Timer();
        TimerTask task = new TimerTask() { // TimerTask is an abstract class .
            @Override
            public void run() {
                time = timeFormat.format(Calendar.getInstance().getTime());
                jLabelTime.setText(time);
            }
        };
        timer.scheduleAtFixedRate(task, 0, 1000);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelProgram = new javax.swing.JLabel();
        jLabelDate = new javax.swing.JLabel();
        jLabelTime = new javax.swing.JLabel();
        jButtonlogout = new javax.swing.JButton();
        jfirstname_lastname = new javax.swing.JLabel();
        Button_Employee = new javax.swing.JButton();
        Button_Delivery = new javax.swing.JButton();
        Button_Storage = new javax.swing.JButton();
        Button_Purchase = new javax.swing.JButton();
        Button_Report = new javax.swing.JButton();
        Button_Sell = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 190));

        jLabelProgram.setBackground(new java.awt.Color(255, 255, 255));
        jLabelProgram.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabelProgram.setForeground(new java.awt.Color(255, 255, 255));
        jLabelProgram.setText("SAND Management Progarm");

        jLabelDate.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabelDate.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDate.setText("Date");

        jLabelTime.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabelTime.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTime.setText("Time");

        jButtonlogout.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButtonlogout.setForeground(new java.awt.Color(255, 51, 51));
        jButtonlogout.setText("Logout");
        jButtonlogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonlogoutMouseClicked(evt);
            }
        });

        jfirstname_lastname.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jfirstname_lastname.setForeground(new java.awt.Color(255, 255, 255));
        jfirstname_lastname.setText("User");
        jfirstname_lastname.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jfirstname_lastnameAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabelProgram)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelTime)
                                .addGap(29, 29, 29)
                                .addComponent(jLabelDate))
                            .addComponent(jfirstname_lastname, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTime)
                    .addComponent(jLabelDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jfirstname_lastname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelProgram, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        Button_Employee.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        Button_Employee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sand_management/picture/group_1.png"))); // NOI18N
        Button_Employee.setText("ประวัติพนักงาน");
        Button_Employee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_EmployeeMouseClicked(evt);
            }
        });
        Button_Employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_EmployeeActionPerformed(evt);
            }
        });

        Button_Delivery.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        Button_Delivery.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sand_management/picture/delivery_1.png"))); // NOI18N
        Button_Delivery.setText("การจัดส่งสินค้า");
        Button_Delivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_DeliveryActionPerformed(evt);
            }
        });

        Button_Storage.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        Button_Storage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sand_management/picture/storage-box_1.png"))); // NOI18N
        Button_Storage.setText("คลังสินค้า");
        Button_Storage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_StorageActionPerformed(evt);
            }
        });

        Button_Purchase.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        Button_Purchase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sand_management/picture/payment-method_1.png"))); // NOI18N
        Button_Purchase.setText("สั่งซื้อสินค้า");
        Button_Purchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_PurchaseActionPerformed(evt);
            }
        });

        Button_Report.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        Button_Report.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sand_management/picture/report_1.png"))); // NOI18N
        Button_Report.setText("รายงาน");
        Button_Report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ReportActionPerformed(evt);
            }
        });

        Button_Sell.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        Button_Sell.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sand_management/picture/trade_1.png"))); // NOI18N
        Button_Sell.setText("ขายสินค้า");
        Button_Sell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_SellActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1911, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(Button_Employee, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button_Purchase, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Delivery, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button_Report, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Sell, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(Button_Storage, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Employee, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Storage, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Purchase, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Sell, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Delivery, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Report, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 167, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonlogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonlogoutMouseClicked
        // TODO add your handling code here:
        login_ui show = new login_ui();
        show.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonlogoutMouseClicked

    private void jfirstname_lastnameAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jfirstname_lastnameAncestorAdded
        // TODO add your handling code here:
        Connection c = null;
        Statement stmt = null;
                try {
                    Class.forName("org.sqlite.JDBC");
                    c = DriverManager.getConnection("jdbc:sqlite:user.db");
                    c.setAutoCommit(false);
                    stmt = c.createStatement();
                    String a1 = user.getUser();
                    ResultSet rs = stmt.executeQuery( "SELECT * FROM user WHERE username = '"+a1+"'" );
                    String  first = rs.getString("first_name");
                    String  last = rs.getString("last_name");
                    jfirstname_lastname.setText(first + " " + last);
                    rs.close();
                    stmt.close();
                    c.close();
                } 
                catch ( Exception b ) {
                   System.err.println( b.getClass().getName() + ": " + b.getMessage() );
                   System.exit(0);
                }
    }//GEN-LAST:event_jfirstname_lastnameAncestorAdded

    private void Button_EmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_EmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_EmployeeActionPerformed

    private void Button_DeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_DeliveryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_DeliveryActionPerformed

    private void Button_StorageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_StorageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_StorageActionPerformed

    private void Button_PurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_PurchaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_PurchaseActionPerformed

    private void Button_ReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_ReportActionPerformed

    private void Button_SellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_SellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_SellActionPerformed

    private void Button_EmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_EmployeeMouseClicked
        // TODO add your handling code here:
        String a1 = user.getUser();
        All_Data account = new All_Data();
        account.setUser(a1);
        Employee_History employee = new Employee_History(account);
        employee.setVisible(true);
        dispose();
    }//GEN-LAST:event_Button_EmployeeMouseClicked

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
            java.util.logging.Logger.getLogger(main_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main_ui(new All_Data()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Delivery;
    private javax.swing.JButton Button_Employee;
    private javax.swing.JButton Button_Purchase;
    private javax.swing.JButton Button_Report;
    private javax.swing.JButton Button_Sell;
    private javax.swing.JButton Button_Storage;
    private javax.swing.JButton jButtonlogout;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelProgram;
    private javax.swing.JLabel jLabelTime;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jfirstname_lastname;
    // End of variables declaration//GEN-END:variables
}
