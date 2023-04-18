package sand_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.text.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import static sand_management.employee_new.getRandomNumberString;

/**
 *
 * @author Pai
 */
public class storage_ui extends javax.swing.JFrame {

    SimpleDateFormat timeFormat;
    SimpleDateFormat dateFormat;
    String time;
    String date;
    private All_Data user;

    public storage_ui(All_Data a1) {
        initComponents();
        this.setTitle("Sand Management Program | Stock");
        this.user = a1;
        Start();
    }

    public void Start() {
        setDate();
        setTime();
        fetchitemDetailsCS();
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
        jBack = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtname_i = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        txtqua = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButtonadd = new javax.swing.JButton();
        jButtonadd1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablestorage = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 190));

        jLabelTime.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabelTime.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTime.setText("Time");

        jLabelDate.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabelDate.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDate.setText("Date");

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
        jLabelProgram.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabelProgram.setForeground(new java.awt.Color(255, 255, 255));
        jLabelProgram.setText("Stock");

        jBack.setFont(new java.awt.Font("Leelawadee UI", 0, 36)); // NOI18N
        jBack.setForeground(new java.awt.Color(255, 255, 255));
        jBack.setText("Back");
        jBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(1779, Short.MAX_VALUE)
                        .addComponent(jLabelTime)
                        .addGap(29, 29, 29)
                        .addComponent(jLabelDate))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 818, Short.MAX_VALUE)
                        .addComponent(jLabelProgram)
                        .addGap(718, 718, 718)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jfirstname_lastname, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonlogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jfirstname_lastname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelProgram, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBack, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Product Detail");

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Name Item");

        txtname_i.setBackground(new java.awt.Color(255, 255, 255));
        txtname_i.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtname_i.setForeground(new java.awt.Color(51, 51, 51));

        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Type");

        jComboBox2.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sand1", "Sand2" }));

        jSpinner1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jSpinner1.setName(""); // NOI18N

        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("1Ton. = Price");

        txtqua.setBackground(new java.awt.Color(255, 255, 255));
        txtqua.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtqua.setForeground(new java.awt.Color(51, 51, 51));

        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Quantity");

        jButtonadd.setBackground(new java.awt.Color(255, 255, 255));
        jButtonadd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonadd.setForeground(new java.awt.Color(255, 51, 0));
        jButtonadd.setText("Delete");
        jButtonadd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonaddMouseClicked(evt);
            }
        });
        jButtonadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonaddActionPerformed(evt);
            }
        });

        jButtonadd1.setBackground(new java.awt.Color(255, 255, 255));
        jButtonadd1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonadd1.setForeground(new java.awt.Color(51, 204, 0));
        jButtonadd1.setText("Add Stock");
        jButtonadd1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonadd1MouseClicked(evt);
            }
        });
        jButtonadd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonadd1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(txtname_i, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                            .addComponent(jSpinner1))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(378, 378, 378))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButtonadd, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonadd1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.LEADING, 0, 340, Short.MAX_VALUE)
                                        .addComponent(txtqua, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtname_i, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtqua, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonadd1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonadd, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 51, 51));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Name" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 255));
        jButton1.setText("Search");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Category");

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Search");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jTablestorage.setBackground(new java.awt.Color(204, 204, 204));
        jTablestorage.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTablestorage.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Date", "Type", "Name", "Price[unit]", "In Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTablestorage.setMinimumSize(new java.awt.Dimension(150, 0));
        jScrollPane1.setViewportView(jTablestorage);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1911, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)))
                .addContainerGap())
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

    private void jBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBackMouseClicked
        // TODO add your handling code here:
        String a1 = user.getUser();
        String a2 = user.getFirst();
        All_Data account = new All_Data();
        account.setUser(a1);
        account.setFirst(a2);
        main_ui main = new main_ui(account);
        main.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBackMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonaddActionPerformed

    private void jButtonadd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonadd1ActionPerformed
        // TODO add your handling code here:
        // add stock
    }//GEN-LAST:event_jButtonadd1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // Search
        Connection c = null;
        Statement stmt = null;
        String type = jComboBox1.getSelectedItem().toString();
        String search = jTextField1.getText();
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:database.db");
            stmt = c.createStatement();
            if (type.equals("ID")) {
                ResultSet rs = stmt.executeQuery("SELECT * FROM storage_data WHERE id_item = '" + search + "'");
                jTablestorage.setModel(DbUtils.resultSetToTableModel(rs));
                rs.close();
            }
            if (type.equals("Name")) {
                ResultSet rs = stmt.executeQuery("SELECT * FROM storage_data WHERE Name_i = '" + search + "'");
                jTablestorage.setModel(DbUtils.resultSetToTableModel(rs));
                rs.close();
            }
            stmt.close();
            c.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton1MouseClicked

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:

        System.out.print(jTextField1.getText());
        if (jTextField1.getText() == null) {
            System.out.println(jTextField1.getText());
            fetchitemDetailsCS();
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButtonaddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonaddMouseClicked
        // TODO add your handling code here:
        Connection c = null;
        PreparedStatement pat = null;
        int row = jTablestorage.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTablestorage.getModel();

        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:database.db");
            String delete = "DELETE FROM storage_data WHERE Id_item = ?";
            pat = c.prepareStatement(delete);
            pat.setString(1, model.getValueAt(row, 0).toString());
            pat.execute();

            int a = JOptionPane.showConfirmDialog(null, "Are you sure to delete this item? : " + model.getValueAt(row, 2).toString(), "Alert", JOptionPane.INFORMATION_MESSAGE);
            if (a == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "This item has been deleted");
                fetchitemDetailsCS();
            }
        } catch (Exception b) {
            JOptionPane.showMessageDialog(null, b);
        }
    }//GEN-LAST:event_jButtonaddMouseClicked

    private void jButtonadd1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonadd1MouseClicked
        // TODO add your handling code here:
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:database.db");
            c.setAutoCommit(false);
            stmt = c.createStatement();
            String nameitem = txtname_i.getText();
            String type = String.valueOf(jComboBox2.getSelectedItem());
            String tonitem = jSpinner1.getValue().toString();
            String quantity = txtqua.getText();
            String iditem = getRandomNumberString();
            ResultSet rs = stmt.executeQuery("SELECT * FROM storage_data WHERE Name_i = '" + nameitem + "'");
            String name = rs.getString("Name_i");
            String Quan = rs.getString("Quantity_i");
            String spin = jSpinner1.getValue().toString();
            String quan1 = txtqua.getText();
            int inquan = Integer.parseInt(Quan);
            int inquan1 = Integer.parseInt(quan1);
            int total2 = inquan + inquan1;
            String quan_total = Integer.toString(total2);
            if (!nameitem.equals(name)){
                ResultSet rs1 = stmt.executeQuery("SELECT * FROM storage_data WHERE id_item = '" + iditem + "'");
                String id_item = null;
                while (rs1.next()) {
                    id_item = rs1.getString("id_item");
                }
                while (iditem.equals(id_item)) {
                    iditem = getRandomNumberString();
                    rs1 = stmt.executeQuery("SELECT * FROM storage_data WHERE id_item = '" + iditem + "'");
                    if (!rs1.next()) {
                        break;
                    }
                }
                String sql = "INSERT INTO storage_data(Name_i,Type_i,H_many_ton_i,Quantity_i,id_item,Date) VALUES('" + nameitem + "','" + type + "','" + tonitem + "',"
                        + "'" + quantity + "','" + iditem + "','" + date + "')";
                stmt.executeUpdate(sql);
                String user1 = user.getUser();
                String first = user.getFirst();
                All_Data account = new All_Data();
                account.setUser(user1);
                account.setFirst(first);
                stmt.close();
                c.commit();
            }
            else if (nameitem.equals(name)) {
                String sql = ("UPDATE storage_data SET H_many_ton_i = '" + spin + "',Quantity_i = '" + quan_total + "',Date = '" + date + "',Type_i = '" + type + "' WHERE Name_i = '" + nameitem + "'");
                stmt.executeUpdate(sql);
                String user1 = user.getUser();
                String first = user.getFirst();
                All_Data account = new All_Data();
                account.setUser(user1);
                account.setFirst(first);
                stmt.close();
                c.commit();
                System.out.println("commit complete");
            }
        } catch (Exception b) {
            if (c != null) {
                try {
                    c.rollback();
                } catch (Exception ex) {
                }
            }
            System.err.println(b.getClass().getName() + ": " + b.getMessage());
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (Exception ex) {
                }
            }
            if (c != null) {
                try {
                    c.close();
                } catch (Exception ex) {
                }
            }
        }
        int a = JOptionPane.showConfirmDialog(null, "Please confirm your input:", "Alert", JOptionPane.INFORMATION_MESSAGE);
        if (a == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Add Stock Complete.", "ALERT", JOptionPane.INFORMATION_MESSAGE);
            fetchitemDetailsCS();
        }
        
    }//GEN-LAST:event_jButtonadd1MouseClicked

    public void fetchitemDetailsCS() {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:database.db");
            stmt = c.createStatement();
            ResultSet rs1 = stmt.executeQuery("SELECT * FROM storage_data");
            jTablestorage.setModel(DbUtils.resultSetToTableModel(rs1));
        } catch (Exception b) {
            JOptionPane.showMessageDialog(null, b);
        }
    }

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
            java.util.logging.Logger.getLogger(storage_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(storage_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(storage_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(storage_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new storage_ui(new All_Data()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonadd;
    private javax.swing.JButton jButtonadd1;
    private javax.swing.JButton jButtonlogout;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelProgram;
    private javax.swing.JLabel jLabelTime;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTablestorage;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jfirstname_lastname;
    private javax.swing.JTextField txtname_i;
    private javax.swing.JTextField txtqua;
    // End of variables declaration//GEN-END:variables
}
