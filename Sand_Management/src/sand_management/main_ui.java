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
        this.setTitle("Sand Management Program | Menu");
        this.user = a1;
        permission();
        setDate();
        setTime();
    }

    public void permission() {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:database.db");
            c.setAutoCommit(false);
            stmt = c.createStatement();
            String a1 = user.getUser();
            ResultSet rs = stmt.executeQuery("SELECT * FROM user_data WHERE username = '" + a1 + "'");
            String position1 = rs.getString("position");
            if (position1.equals("IT")) {
            } else if (position1.equals("CEO")) {
            } else if (position1.equals("Secretary") || position1.equals("เลขานุการ")) {
                Button_Employee.setVisible(false);
            } else if (position1.equals("Employee") || position1.equals("พนักงาน") || position1.equals("พนักงานขนส่ง")) {
                Button_Purchase.setVisible(false);
                Button_Customer.setVisible(false);
                Button_Dealer.setVisible(false);
                Button_Employee.setVisible(false);
                Button_Storage.setVisible(false);
                Button_Customer.setVisible(false);
                Button_Sell.setVisible(false);
                Button_Report.setVisible(false);
            } else {
                Button_Purchase.setVisible(false);
                Button_Customer.setVisible(false);
                Button_Dealer.setVisible(false);
                Button_Employee.setVisible(false);
                Button_Storage.setVisible(false);
                Button_Customer.setVisible(false);
                Button_Sell.setVisible(false);
                Button_Delivery.setVisible(false);
                Button_Report.setVisible(false);
            }

            rs.close();
            stmt.close();
            c.close();

        } catch (Exception b) {
            System.err.println(b.getClass().getName() + ": " + b.getMessage());
            System.exit(0);
        }
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
        jLabelTime = new javax.swing.JLabel();
        jLabelDate = new javax.swing.JLabel();
        jButtonlogout = new javax.swing.JButton();
        jfirstname_lastname = new javax.swing.JLabel();
        jLabelProgram = new javax.swing.JLabel();
        Button_Employee = new javax.swing.JButton();
        Button_Delivery = new javax.swing.JButton();
        Button_Storage = new javax.swing.JButton();
        Button_Customer = new javax.swing.JButton();
        Button_Report = new javax.swing.JButton();
        Button_Sell = new javax.swing.JButton();
        label_id_employee = new javax.swing.JLabel();
        Button_Purchase = new javax.swing.JButton();
        Button_Dealer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 190));

        jLabelTime.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabelTime.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTime.setText("Time");

        jLabelDate.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabelDate.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDate.setText("Date");

        jButtonlogout.setBackground(new java.awt.Color(255, 255, 255));
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

        jLabelProgram.setBackground(new java.awt.Color(255, 255, 255));
        jLabelProgram.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabelProgram.setForeground(new java.awt.Color(255, 255, 255));
        jLabelProgram.setText("SAND Management Progarm");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabelProgram)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jfirstname_lastname, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelTime)
                        .addGap(29, 29, 29)
                        .addComponent(jLabelDate))
                    .addComponent(jButtonlogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTime)
                    .addComponent(jLabelDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jfirstname_lastname)
                .addGap(12, 12, 12)
                .addComponent(jButtonlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
            .addComponent(jLabelProgram, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Button_Employee.setBackground(new java.awt.Color(255, 255, 255));
        Button_Employee.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        Button_Employee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sand_management/picture/group_1.png"))); // NOI18N
        Button_Employee.setText("ประวัติพนักงาน");
        Button_Employee.setAlignmentY(0.1F);
        Button_Employee.setIconTextGap(20);
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

        Button_Delivery.setBackground(new java.awt.Color(255, 255, 255));
        Button_Delivery.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        Button_Delivery.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sand_management/picture/delivery_1.png"))); // NOI18N
        Button_Delivery.setText("การจัดส่งสินค้า");
        Button_Delivery.setIconTextGap(20);
        Button_Delivery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_DeliveryMouseClicked(evt);
            }
        });
        Button_Delivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_DeliveryActionPerformed(evt);
            }
        });

        Button_Storage.setBackground(new java.awt.Color(255, 255, 255));
        Button_Storage.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        Button_Storage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sand_management/picture/storage-box_1.png"))); // NOI18N
        Button_Storage.setText("คลังสินค้า");
        Button_Storage.setIconTextGap(20);
        Button_Storage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_StorageMouseClicked(evt);
            }
        });
        Button_Storage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_StorageActionPerformed(evt);
            }
        });

        Button_Customer.setBackground(new java.awt.Color(255, 255, 255));
        Button_Customer.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        Button_Customer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sand_management/picture/customer_1.png"))); // NOI18N
        Button_Customer.setText("ลูกค้า");
        Button_Customer.setIconTextGap(20);
        Button_Customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_CustomerMouseClicked(evt);
            }
        });
        Button_Customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CustomerActionPerformed(evt);
            }
        });

        Button_Report.setBackground(new java.awt.Color(255, 255, 255));
        Button_Report.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        Button_Report.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sand_management/picture/report_1.png"))); // NOI18N
        Button_Report.setText("รายงาน");
        Button_Report.setIconTextGap(20);
        Button_Report.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_ReportMouseClicked(evt);
            }
        });
        Button_Report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ReportActionPerformed(evt);
            }
        });

        Button_Sell.setBackground(new java.awt.Color(255, 255, 255));
        Button_Sell.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        Button_Sell.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sand_management/picture/trade_1.png"))); // NOI18N
        Button_Sell.setText("ขายสินค้า");
        Button_Sell.setIconTextGap(20);
        Button_Sell.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_SellMouseClicked(evt);
            }
        });
        Button_Sell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_SellActionPerformed(evt);
            }
        });

        label_id_employee.setFont(new java.awt.Font("Leelawadee UI", 0, 36)); // NOI18N
        label_id_employee.setText("id_employee");
        label_id_employee.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                label_id_employeeAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        Button_Purchase.setBackground(new java.awt.Color(255, 255, 255));
        Button_Purchase.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        Button_Purchase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sand_management/picture/payment-method_1.png"))); // NOI18N
        Button_Purchase.setText("สั่งซื้อสินค้า");
        Button_Purchase.setIconTextGap(20);
        Button_Purchase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_PurchaseMouseClicked(evt);
            }
        });
        Button_Purchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_PurchaseActionPerformed(evt);
            }
        });

        Button_Dealer.setBackground(new java.awt.Color(255, 255, 255));
        Button_Dealer.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        Button_Dealer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sand_management/picture/Dealer_1.png"))); // NOI18N
        Button_Dealer.setText("ตัวแทนจำหน่าย");
        Button_Dealer.setIconTextGap(20);
        Button_Dealer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_DealerMouseClicked(evt);
            }
        });
        Button_Dealer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_DealerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1911, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Button_Employee, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Sell, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Button_Purchase, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Dealer, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button_Customer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Delivery, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button_Report, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Storage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(176, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_id_employee)
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Employee, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Customer, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Storage, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Dealer, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Report, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Delivery, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Sell, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Purchase, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addComponent(label_id_employee)
                .addGap(23, 23, 23))
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
            c = DriverManager.getConnection("jdbc:sqlite:database.db");
            c.setAutoCommit(false);
            stmt = c.createStatement();
            String a1 = user.getUser();
            ResultSet rs = stmt.executeQuery("SELECT * FROM user_data WHERE username = '" + a1 + "'");
            String first = rs.getString("first_name");
            String last = rs.getString("last_name");
            jfirstname_lastname.setText(first + " " + last);
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception b) {
            System.err.println(b.getClass().getName() + ": " + b.getMessage());
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

    private void Button_CustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_CustomerActionPerformed

    private void Button_ReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_ReportActionPerformed

    private void Button_SellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_SellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_SellActionPerformed

    private void Button_EmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_EmployeeMouseClicked
        // TODO add your handling code here:
        String a1 = user.getUser();
        String a2 = user.getFirst();
        All_Data account = new All_Data();
        account.setUser(a1);
        account.setFirst(a2);
        employee_history_ui employee = new employee_history_ui(account);
        employee.setVisible(true);
        dispose();
    }//GEN-LAST:event_Button_EmployeeMouseClicked

    private void Button_CustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_CustomerMouseClicked
        // TODO add your handling code here:
        String a1 = user.getUser();
        String a2 = user.getFirst();
        All_Data account = new All_Data();
        account.setUser(a1);
        account.setFirst(a2);
        customer_ui customer = new customer_ui(account);
        customer.setVisible(true);
        dispose();
    }//GEN-LAST:event_Button_CustomerMouseClicked

    private void Button_SellMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_SellMouseClicked
        // TODO add your handling code here:
        String a1 = user.getUser();
        String a2 = user.getFirst();
        All_Data account = new All_Data();
        account.setUser(a1);
        account.setFirst(a2);
        sell_ui sell = new sell_ui(account);
        sell.setVisible(true);
        dispose();
    }//GEN-LAST:event_Button_SellMouseClicked

    private void Button_StorageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_StorageMouseClicked
        // TODO add your handling code here:
        String a1 = user.getUser();
        String a2 = user.getFirst();
        All_Data account = new All_Data();
        account.setUser(a1);
        account.setFirst(a2);
        storage_ui stock = new storage_ui(account);
        stock.setVisible(true);
        dispose();
    }//GEN-LAST:event_Button_StorageMouseClicked

    private void Button_DeliveryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_DeliveryMouseClicked
        // TODO add your handling code here:
        String a1 = user.getUser();
        String a2 = user.getFirst();
        All_Data account = new All_Data();
        account.setUser(a1);
        account.setFirst(a2);
        delivery_ui delivery = new delivery_ui(account);
        delivery.setVisible(true);
        dispose();
    }//GEN-LAST:event_Button_DeliveryMouseClicked

    private void Button_ReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_ReportMouseClicked
        // TODO add your handling code here:
        String a1 = user.getUser();
        String a2 = user.getFirst();
        All_Data account = new All_Data();
        account.setUser(a1);
        account.setFirst(a2);
        report_ui report = new report_ui(account);
        report.setVisible(true);
        dispose();
    }//GEN-LAST:event_Button_ReportMouseClicked

    private void label_id_employeeAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_label_id_employeeAncestorAdded
        // TODO add your handling code here:
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:database.db");
            c.setAutoCommit(false);
            stmt = c.createStatement();
            String a1 = user.getFirst();
            ResultSet rs = stmt.executeQuery("SELECT * FROM employee_data WHERE first_name = '" + a1 + "'");
            String id = rs.getString("id_employee");
            label_id_employee.setText("ID Employee : " + id);
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception b) {
            System.err.println(b.getClass().getName() + ": " + b.getMessage());
            System.exit(0);
        }
    }//GEN-LAST:event_label_id_employeeAncestorAdded

    private void Button_PurchaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_PurchaseMouseClicked
        // TODO add your handling code here:
        String a1 = user.getUser();
        String a2 = user.getFirst();
        All_Data account = new All_Data();
        account.setUser(a1);
        account.setFirst(a2);
        purchase_ui buy = new purchase_ui(account);
        buy.setVisible(true);
        dispose();
    }//GEN-LAST:event_Button_PurchaseMouseClicked

    private void Button_PurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_PurchaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_PurchaseActionPerformed

    private void Button_DealerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_DealerMouseClicked
        // TODO add your handling code here:
        String a1 = user.getUser();
        String a2 = user.getFirst();
        All_Data account = new All_Data();
        account.setUser(a1);
        account.setFirst(a2);
        dealer_ui deal = new dealer_ui(account);
        deal.setVisible(true);
        dispose();
    }//GEN-LAST:event_Button_DealerMouseClicked

    private void Button_DealerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_DealerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_DealerActionPerformed

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
    private javax.swing.JButton Button_Customer;
    private javax.swing.JButton Button_Dealer;
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
    private javax.swing.JLabel label_id_employee;
    // End of variables declaration//GEN-END:variables
}
