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
import javax.swing.JOptionPane;
import net.proteanit.sql.*;

/**
 *
 * @author Pai
 */
public class purchase_ui extends javax.swing.JFrame {

    SimpleDateFormat timeFormat;
    SimpleDateFormat dateFormat;
    String time;
    String date;
    private All_Data user;

    public purchase_ui(All_Data a1) {
        initComponents();
        this.setTitle("Sand Management Program | Sell");
        this.user = a1;
        Start();
    }

    public static String getRandomNumberString() {
        Random rnd = new Random();
        int number = rnd.nextInt(999999);
        return String.format("%06d", number);
    }

    public void Start() {
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
            ResultSet rs1 = stmt.executeQuery("SELECT * FROM purchase_data");
            purchaseTable1.setModel(DbUtils.resultSetToTableModel(rs1));
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
        DateTextField1 = new javax.swing.JTextField();
        TitleTxtRightLabel1 = new javax.swing.JLabel();
        CompanyTextField2 = new javax.swing.JTextField();
        TitleTxtLeftLabel2 = new javax.swing.JLabel();
        ContactTextField3 = new javax.swing.JTextField();
        TitleTxtRightLabel2 = new javax.swing.JLabel();
        ContactNumTextField4 = new javax.swing.JTextField();
        TitleTxtLabel1 = new javax.swing.JLabel();
        AdressTextField5 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        TxtPtotalLabel1 = new javax.swing.JLabel();
        TextField6 = new javax.swing.JTextField();
        TxtVATLabel2 = new javax.swing.JLabel();
        TextField7 = new javax.swing.JTextField();
        TxtTotalLabel1 = new javax.swing.JLabel();
        TextField8 = new javax.swing.JTextField();
        DelButton1 = new javax.swing.JButton();
        AddButton2 = new javax.swing.JButton();
        BgPanelRightop = new javax.swing.JPanel();
        Titledropdown = new javax.swing.JLabel();
        dropdownlist01 = new javax.swing.JComboBox<>();
        TextSearchField1 = new javax.swing.JTextField();
        TitleSearch = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        purchaseTable1 = new javax.swing.JTable();

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
        jLabelProgram.setText("Purchase");

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 784, Short.MAX_VALUE)
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
        TitleLeftLabel1.setText("รายละเอียดสั่งซื้อสินค้า");

        TitleTxtLeftLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtLeftLabel1.setForeground(new java.awt.Color(51, 51, 51));
        TitleTxtLeftLabel1.setText("วันที่สั่งซื้อ");

        DateTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateTextField1ActionPerformed(evt);
            }
        });

        TitleTxtRightLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtRightLabel1.setForeground(new java.awt.Color(51, 51, 51));
        TitleTxtRightLabel1.setText("บริษัท/ร้านตัวแทนจำหน่าย");

        CompanyTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompanyTextField2ActionPerformed(evt);
            }
        });

        TitleTxtLeftLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtLeftLabel2.setForeground(new java.awt.Color(51, 51, 51));
        TitleTxtLeftLabel2.setText("ชื่อผู้ติดต่อ");

        ContactTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContactTextField3ActionPerformed(evt);
            }
        });

        TitleTxtRightLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtRightLabel2.setForeground(new java.awt.Color(51, 51, 51));
        TitleTxtRightLabel2.setText("เบอร์ติดต่อ");

        ContactNumTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContactNumTextField4ActionPerformed(evt);
            }
        });

        TitleTxtLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtLabel1.setForeground(new java.awt.Color(51, 51, 51));
        TitleTxtLabel1.setText("ที่อยู่จัดส่งสินค้า");

        AdressTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdressTextField5ActionPerformed(evt);
            }
        });

        jTable2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No.", "Item", "Quantity", "Unit price", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        TxtPtotalLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TxtPtotalLabel1.setForeground(new java.awt.Color(51, 51, 51));
        TxtPtotalLabel1.setText("รวมราคาสินค้า");

        TextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField6ActionPerformed(evt);
            }
        });

        TxtVATLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TxtVATLabel2.setForeground(new java.awt.Color(51, 51, 51));
        TxtVATLabel2.setText("ภาษีมูลค่าเพิ่ม 7% VAT");

        TextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField7ActionPerformed(evt);
            }
        });

        TxtTotalLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TxtTotalLabel1.setForeground(new java.awt.Color(51, 51, 51));
        TxtTotalLabel1.setText("รวมเงินทั้งสิ้น TOTAL");

        TextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField8ActionPerformed(evt);
            }
        });

        DelButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DelButton1.setText("ลบข้อมูล");
        DelButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelButton1ActionPerformed(evt);
            }
        });

        AddButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AddButton2.setText("เพิ่มข้อมูล");
        AddButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButton2ActionPerformed(evt);
            }
        });

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
                            .addComponent(DateTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(BgPanelLeftLayout.createSequentialGroup()
                                .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TitleTxtLeftLabel2)
                                    .addComponent(ContactTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(87, 87, 87)
                                .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ContactNumTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TitleTxtRightLabel2)
                                    .addComponent(TitleTxtRightLabel1)
                                    .addComponent(CompanyTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(TitleLeftLabel1))
                        .addContainerGap(45, Short.MAX_VALUE))
                    .addGroup(BgPanelLeftLayout.createSequentialGroup()
                        .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TitleTxtLabel1)
                            .addComponent(AdressTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE)
                            .addGroup(BgPanelLeftLayout.createSequentialGroup()
                                .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtPtotalLabel1)
                                    .addComponent(TextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(BgPanelLeftLayout.createSequentialGroup()
                                        .addComponent(TxtVATLabel2)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(TextField7))
                                .addGap(18, 18, 18)
                                .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtTotalLabel1)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgPanelLeftLayout.createSequentialGroup()
                                .addComponent(DelButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(AddButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        BgPanelLeftLayout.setVerticalGroup(
            BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgPanelLeftLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(TitleLeftLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BgPanelLeftLayout.createSequentialGroup()
                        .addComponent(TitleTxtRightLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CompanyTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BgPanelLeftLayout.createSequentialGroup()
                        .addComponent(TitleTxtLeftLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DateTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ContactNumTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BgPanelLeftLayout.createSequentialGroup()
                        .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TitleTxtLeftLabel2)
                            .addComponent(TitleTxtRightLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ContactTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(TitleTxtLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AdressTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtVATLabel2)
                    .addComponent(TxtPtotalLabel1)
                    .addComponent(TxtTotalLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DelButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        BgPanelRightop.setBackground(new java.awt.Color(204, 204, 204));

        Titledropdown.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Titledropdown.setForeground(new java.awt.Color(51, 51, 51));
        Titledropdown.setText("หมวดหมู่");

        dropdownlist01.setBackground(new java.awt.Color(255, 255, 255));
        dropdownlist01.setForeground(new java.awt.Color(51, 51, 51));
        dropdownlist01.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Name" }));

        TextSearchField1.setBackground(new java.awt.Color(255, 255, 255));

        TitleSearch.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        TitleSearch.setForeground(new java.awt.Color(51, 51, 51));
        TitleSearch.setText("ค้นหา");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 255));
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
                .addGap(33, 33, 33))
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
                            .addComponent(TextSearchField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgPanelRightopLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );

        purchaseTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        purchaseTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Date", "Contact Name", "Contact Adress", "Contact Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(purchaseTable1);

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
                        .addComponent(jScrollPane1))
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

    private void DateTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateTextField1ActionPerformed
        //วันที่รับค่าตัวเลข
    }//GEN-LAST:event_DateTextField1ActionPerformed

    private void CompanyTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompanyTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CompanyTextField2ActionPerformed

    private void ContactTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContactTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContactTextField3ActionPerformed

    private void ContactNumTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContactNumTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContactNumTextField4ActionPerformed

    private void AdressTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdressTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdressTextField5ActionPerformed

    private void TextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField6ActionPerformed

    private void TextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField7ActionPerformed

    private void TextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField8ActionPerformed

    private void DelButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DelButton1ActionPerformed

    private void AddButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButton2ActionPerformed
// TODO add your handling code here:
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:database.db");
            conn.setAutoCommit(false);
            stmt = conn.createStatement();
            String p1 = DateTextField1.getText();
            String p2 = CompanyTextField2.getText();
            String p3 = ContactTextField3.getText();
            String p4 = ContactNumTextField4.getText();
            String p5 = AdressTextField5.getText();
            String p6 = getRandomNumberString();
            ResultSet rs = stmt.executeQuery("SELECT * FROM sqlite_master WHERE type='table' AND name='purchase'");
            if (!rs.next()) {
                System.out.println("Table does not exist");
                return;
            }
            rs.close();

            rs = stmt.executeQuery("SELECT * FROM purchase_data WHERE ID = '" + p6 + "'");
            while (rs.next()) {
                p6 = getRandomNumberString();
                rs = stmt.executeQuery("SELECT * FROM purchase_data WHERE ID = '" + p6 + "'");
            }
            rs.close();

            String sql = "INSERT INTO purchase_data(ID,Date,Company,ContactName,ContactAdress,PhoneNumber) VALUES('" + p6 + "','" + p1 + "','" + p2 + "',"
                    + "'" + p3 + "','" + p4 + "','" + p5 + "')";
            stmt.executeUpdate(sql);
            stmt.close();
            conn.commit();

        } catch (Exception b) {
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (Exception ex) {
                }
            }
            System.err.println(b.getClass().getName() + ": " + b.getMessage());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception ex) {
                }
            }
        }
    }//GEN-LAST:event_AddButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        // Search
        /yay
        Connection conn = null;
        Statement stmt = null;
        String type = dropdownlist01.getSelectedItem().toString();
        String search = TextSearchField1.getText();
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:purchase_data.db");
            stmt = conn.createStatement();
            if (type.equals("Company")) {
                ResultSet rs = stmt.executeQuery("SELECT * FROM purchase WHERE Company = '" + search + "'");
                purchaseTable1.setModel(DbUtils.resultSetToTableModel(rs));
                rs.close();
            }
            if (type.equals("Contact Name")) {
                ResultSet rs = stmt.executeQuery("SELECT * FROM purchase WHERE ContactName = '" + search + "'");
                purchaseTable1.setModel(DbUtils.resultSetToTableModel(rs));
                rs.close();
            }
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(purchase_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(purchase_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(purchase_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(purchase_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new purchase_ui(new All_Data()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton2;
    private javax.swing.JTextField AdressTextField5;
    private javax.swing.JPanel BgPanelLeft;
    private javax.swing.JPanel BgPanelRightop;
    private javax.swing.JTextField CompanyTextField2;
    private javax.swing.JTextField ContactNumTextField4;
    private javax.swing.JTextField ContactTextField3;
    private javax.swing.JTextField DateTextField1;
    private javax.swing.JButton DelButton1;
    private javax.swing.JTextField TextField6;
    private javax.swing.JTextField TextField7;
    private javax.swing.JTextField TextField8;
    private javax.swing.JTextField TextSearchField1;
    private javax.swing.JLabel TitleLeftLabel1;
    private javax.swing.JLabel TitleSearch;
    private javax.swing.JLabel TitleTxtLabel1;
    private javax.swing.JLabel TitleTxtLeftLabel1;
    private javax.swing.JLabel TitleTxtLeftLabel2;
    private javax.swing.JLabel TitleTxtRightLabel1;
    private javax.swing.JLabel TitleTxtRightLabel2;
    private javax.swing.JLabel Titledropdown;
    private javax.swing.JLabel TxtPtotalLabel1;
    private javax.swing.JLabel TxtTotalLabel1;
    private javax.swing.JLabel TxtVATLabel2;
    private javax.swing.JComboBox<String> dropdownlist01;
    private javax.swing.JLabel jBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonlogout;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelProgram;
    private javax.swing.JLabel jLabelTime;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel jfirstname_lastname;
    private javax.swing.JTable purchaseTable1;
    // End of variables declaration//GEN-END:variables
}
