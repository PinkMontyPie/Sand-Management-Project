/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sand_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Pai
 */
public class delivery_ui extends javax.swing.JFrame {
    SimpleDateFormat timeFormat;
    SimpleDateFormat dateFormat;
    String time;
    String date;
    private All_Data user; 
    
    public delivery_ui(All_Data a1) {
        initComponents();
        this.setTitle("Sand Management Program | Sell");
        this.user = a1;
        Start();
    }
    
    public void Start(){
        fetchitemDetailsCS();
        setDate();
        setTime();
    }
    
    public void fetchitemDetailsCS() {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:database.db");
            stmt = c.createStatement();
            ResultSet rs1 = stmt.executeQuery("SELECT * FROM delivery_data");
            jTable1.setModel(DbUtils.resultSetToTableModel(rs1));
        } catch (Exception b) {
            JOptionPane.showMessageDialog(null, b);
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
        jBack = new javax.swing.JLabel();
        BgPanelLeft = new javax.swing.JPanel();
        TitleLeftLabel1 = new javax.swing.JLabel();
        TitleTxtLeftLabel1 = new javax.swing.JLabel();
        TextField1 = new javax.swing.JTextField();
        TitleTxtRightLabel1 = new javax.swing.JLabel();
        TextField2 = new javax.swing.JTextField();
        TitleTxtLeftLabel2 = new javax.swing.JLabel();
        TextField3 = new javax.swing.JTextField();
        TitleTxtRightLabel2 = new javax.swing.JLabel();
        TextField4 = new javax.swing.JTextField();
        TitleTxtLabel1 = new javax.swing.JLabel();
        TextField5 = new javax.swing.JTextField();
        DelButton1 = new javax.swing.JButton();
        AddButton2 = new javax.swing.JButton();
        TextField10 = new javax.swing.JTextField();
        TitleTxtLabel3 = new javax.swing.JLabel();
        TitleTxtLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        BgPanelRightop = new javax.swing.JPanel();
        Titledropdown = new javax.swing.JLabel();
        dropdownlist01 = new javax.swing.JComboBox<>();
        TextSearchField1 = new javax.swing.JTextField();
        TitleSearch = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

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
        jLabelProgram.setText("Delivery");

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
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelTime)
                        .addGap(29, 29, 29)
                        .addComponent(jLabelDate))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 807, Short.MAX_VALUE)
                        .addComponent(jLabelProgram)
                        .addGap(689, 689, 689)
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

        BgPanelLeft.setBackground(new java.awt.Color(204, 204, 204));

        TitleLeftLabel1.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        TitleLeftLabel1.setForeground(new java.awt.Color(51, 51, 51));
        TitleLeftLabel1.setText("รายละเอียดจัดส่งสินค้า");

        TitleTxtLeftLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtLeftLabel1.setForeground(new java.awt.Color(51, 51, 51));
        TitleTxtLeftLabel1.setText("ชื่อพนักงานขับรถ");

        TextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextField1MouseClicked(evt);
            }
        });
        TextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField1ActionPerformed(evt);
            }
        });

        TitleTxtRightLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtRightLabel1.setForeground(new java.awt.Color(51, 51, 51));
        TitleTxtRightLabel1.setText("ชื่อลูกค้า");

        TextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField2ActionPerformed(evt);
            }
        });

        TitleTxtLeftLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtLeftLabel2.setForeground(new java.awt.Color(51, 51, 51));
        TitleTxtLeftLabel2.setText("วันที่การจัดส่งสินค้า");

        TextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField3ActionPerformed(evt);
            }
        });

        TitleTxtRightLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtRightLabel2.setForeground(new java.awt.Color(51, 51, 51));
        TitleTxtRightLabel2.setText("เบอร์ติดต่อ");

        TextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField4ActionPerformed(evt);
            }
        });

        TitleTxtLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtLabel1.setForeground(new java.awt.Color(51, 51, 51));
        TitleTxtLabel1.setText("รหัสสินค้า");

        TextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField5ActionPerformed(evt);
            }
        });

        DelButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DelButton1.setText("ลบข้อมูล");
        DelButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DelButton1MouseClicked(evt);
            }
        });
        DelButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelButton1ActionPerformed(evt);
            }
        });

        AddButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AddButton2.setText("บันทึกข้อมูล");
        AddButton2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                AddButton2MouseDragged(evt);
            }
        });
        AddButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButton2ActionPerformed(evt);
            }
        });

        TextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField10ActionPerformed(evt);
            }
        });

        TitleTxtLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtLabel3.setForeground(new java.awt.Color(51, 51, 51));
        TitleTxtLabel3.setText("สถานที่จัดส่ง");

        TitleTxtLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtLabel4.setForeground(new java.awt.Color(51, 51, 51));
        TitleTxtLabel4.setText("รายงานปัญหา");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        javax.swing.GroupLayout BgPanelLeftLayout = new javax.swing.GroupLayout(BgPanelLeft);
        BgPanelLeft.setLayout(BgPanelLeftLayout);
        BgPanelLeftLayout.setHorizontalGroup(
            BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgPanelLeftLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BgPanelLeftLayout.createSequentialGroup()
                        .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TitleTxtLeftLabel1)
                            .addComponent(TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(BgPanelLeftLayout.createSequentialGroup()
                                .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TitleTxtLeftLabel2)
                                    .addComponent(TextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(87, 87, 87)
                                .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TitleTxtRightLabel2)
                                    .addComponent(TitleTxtRightLabel1)
                                    .addComponent(TextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(TitleLeftLabel1))
                        .addContainerGap(45, Short.MAX_VALUE))
                    .addGroup(BgPanelLeftLayout.createSequentialGroup()
                        .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TitleTxtLabel4)
                            .addComponent(TitleTxtLabel3)
                            .addComponent(TextField10, javax.swing.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE)
                            .addComponent(TitleTxtLabel1)
                            .addComponent(TextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgPanelLeftLayout.createSequentialGroup()
                                .addComponent(DelButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(AddButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        BgPanelLeftLayout.setVerticalGroup(
            BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgPanelLeftLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(TitleLeftLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BgPanelLeftLayout.createSequentialGroup()
                        .addComponent(TitleTxtRightLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BgPanelLeftLayout.createSequentialGroup()
                        .addComponent(TitleTxtLeftLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BgPanelLeftLayout.createSequentialGroup()
                        .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TitleTxtLeftLabel2)
                            .addComponent(TitleTxtRightLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(TitleTxtLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TitleTxtLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TitleTxtLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DelButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );

        BgPanelRightop.setBackground(new java.awt.Color(204, 204, 204));

        Titledropdown.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Titledropdown.setText("หมวดหมู่");

        dropdownlist01.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PRODUCT ID", "NAME DRIVER", "CONTACT NUMBER", " ", " ", " ", " " }));
        dropdownlist01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropdownlist01ActionPerformed(evt);
            }
        });

        TitleSearch.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        TitleSearch.setText("ค้นหา");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("ค้นหา");
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

        javax.swing.GroupLayout BgPanelRightopLayout = new javax.swing.GroupLayout(BgPanelRightop);
        BgPanelRightop.setLayout(BgPanelRightopLayout);
        BgPanelRightopLayout.setHorizontalGroup(
            BgPanelRightopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgPanelRightopLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(BgPanelRightopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dropdownlist01, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Titledropdown))
                .addGap(56, 56, 56)
                .addGroup(BgPanelRightopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TitleSearch)
                    .addComponent(TextSearchField1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        BgPanelRightopLayout.setVerticalGroup(
            BgPanelRightopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgPanelRightopLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(BgPanelRightopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgPanelRightopLayout.createSequentialGroup()
                        .addGroup(BgPanelRightopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Titledropdown)
                            .addComponent(TitleSearch))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BgPanelRightopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dropdownlist01, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextSearchField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Date", "Contact Name", "Contact Adress", "Contact Number"
            }
        ));
        jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1911, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BgPanelLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(BgPanelRightop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BgPanelRightop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE))
                    .addComponent(BgPanelLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    ResultSet rs = stmt.executeQuery( "SELECT * FROM user_data WHERE username = '"+a1+"'" );
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

    private void TextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField1ActionPerformed
        //วันที่รับค่าตัวเลข
        
    }//GEN-LAST:event_TextField1ActionPerformed

    private void TextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField2ActionPerformed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_TextField2ActionPerformed

    private void TextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField3ActionPerformed

    private void TextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField4ActionPerformed

    private void TextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField5ActionPerformed

    private void DelButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DelButton1ActionPerformed

    private void AddButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField10ActionPerformed

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1AncestorAdded

    private void dropdownlist01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropdownlist01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dropdownlist01ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        Connection c = null;
        Statement stmt = null;
        String type = dropdownlist01.getSelectedItem().toString();
        String search = TextSearchField1.getText();
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:database.db");
            stmt = c.createStatement();
            if (type.equals("PRODUCT ID ")) {
                ResultSet rs = stmt.executeQuery("SELECT * FROM delivery_data WHERE PRODUCT_ID = '" + search + "'");
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                rs.close();
            }
            if (type.equals("NAME DRIVER")) {
                ResultSet rs = stmt.executeQuery("SELECT * FROM delivery_data WHERE NAME_DRIVER = '" + search + "'");
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                rs.close();
            }
            if (type.equals("CONTACT NUMBER")) {
                ResultSet rs = stmt.executeQuery("SELECT * FROM delivery_data WHERE CONTACT_NUMBER = '" + search + "'");
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                rs.close();
            }
            stmt.close();
            c.close();

        } catch (Exception e) {
            e.printStackTrace();
        }   
    }//GEN-LAST:event_jButton1MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        try {
            TextField1.setText(model.getValueAt(row, 2).toString());
            TextField2.setText(model.getValueAt(row, 3).toString());
            TextField3.setText(model.getValueAt(row, 4).toString());
            TextField4.setText(model.getValueAt(row, 5).toString());
            TextField5.setText(model.getValueAt(row, 1).toString());
            TextField10.setText(model.getValueAt(row, 6).toString());
        } catch (Exception b) {
            JOptionPane.showMessageDialog(null, b);
            
        }
    }//GEN-LAST:event_jTable1MouseClicked
    private void TextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextField1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TextField1MouseClicked

    private void DelButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DelButton1MouseClicked
        Connection conn = null;
        PreparedStatement pat = null;
        int row = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:database.db");
            String delete = "DELETE FROM delivery_data WHERE ID = ?";
            pat = conn.prepareStatement(delete);
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
     
    }//GEN-LAST:event_DelButton1MouseClicked

    private void AddButton2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButton2MouseDragged
        // TODO add your handling code here:
        Connection con = null;
        PreparedStatement pat = null;
        int row =jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        try{
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:database.db");
            String emp = TextField1.getText();
            String user = TextField2.getText();
            String datee = TextField3.getText();
            String contactt = TextField4.getText();
            String pdid = TextField5.getText();
            
            
            String update = "UPDATE delivery_data SET NAME_DRIVER =  '"+emp+"' , CONTACT_NAME = '"+user+"' , DATE = '"+contactt+"', CONTACT_ADDRESS = '"+datee+"'" + "PRODUCT_ID ='"+pdid+"'";
            
            pat = con.prepareStatement(update);
            
            pat.execute();
            
            JOptionPane.showMessageDialog(null, "Item Updated Successfully");
            fetchitemDetailsCS();
            
        }catch(Exception b){
            JOptionPane.showMessageDialog(null, b);   
        }
    }//GEN-LAST:event_AddButton2MouseDragged

    
    
    
    
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
            java.util.logging.Logger.getLogger(delivery_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(delivery_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(delivery_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(delivery_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new delivery_ui(new All_Data()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton2;
    private javax.swing.JPanel BgPanelLeft;
    private javax.swing.JPanel BgPanelRightop;
    private javax.swing.JButton DelButton1;
    private javax.swing.JTextField TextField1;
    private javax.swing.JTextField TextField10;
    private javax.swing.JTextField TextField2;
    private javax.swing.JTextField TextField3;
    private javax.swing.JTextField TextField4;
    private javax.swing.JTextField TextField5;
    private javax.swing.JTextField TextSearchField1;
    private javax.swing.JLabel TitleLeftLabel1;
    private javax.swing.JLabel TitleSearch;
    private javax.swing.JLabel TitleTxtLabel1;
    private javax.swing.JLabel TitleTxtLabel3;
    private javax.swing.JLabel TitleTxtLabel4;
    private javax.swing.JLabel TitleTxtLeftLabel1;
    private javax.swing.JLabel TitleTxtLeftLabel2;
    private javax.swing.JLabel TitleTxtRightLabel1;
    private javax.swing.JLabel TitleTxtRightLabel2;
    private javax.swing.JLabel Titledropdown;
    private javax.swing.JComboBox<String> dropdownlist01;
    private javax.swing.JLabel jBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonlogout;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelProgram;
    private javax.swing.JLabel jLabelTime;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel jfirstname_lastname;
    // End of variables declaration//GEN-END:variables
}
