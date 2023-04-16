/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sand_management;

import java.lang.Object;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.*;
import java.util.*;
import javax.swing.JFileChooser;

/**
 *
 * @author Pai
 */
public class report_ui extends javax.swing.JFrame {
    SimpleDateFormat timeFormat;
    SimpleDateFormat dateFormat;
    String time;
    String date;
    private All_Data user; 
    
    public report_ui(All_Data a1) {
        initComponents();
        this.setTitle("Sand Management Program | Report");
        this.user = a1;
        Start();
    }
    
    public void Start(){
        setDate();
        setTime();
        BgPanelLeft_delivery.setVisible(true);
        BgPanelLeft_purchase.setVisible(false);
        BgPanelLeft_sell.setVisible(false);
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
    
    public String Path(){
        JFileChooser fileChooser = new JFileChooser();
        int response = fileChooser.showSaveDialog(null);
        String files = null;
        if (response == JFileChooser.APPROVE_OPTION) {
            files = new String(fileChooser.getSelectedFile().getAbsolutePath());
            System.out.println(files);
        }
        return files;
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
        BgPanelLeft_delivery = new javax.swing.JPanel();
        TitleLeftLabel2 = new javax.swing.JLabel();
        TitleTxtLeftLabel3 = new javax.swing.JLabel();
        TextField6 = new javax.swing.JTextField();
        TitleTxtRightLabel3 = new javax.swing.JLabel();
        TextField7 = new javax.swing.JTextField();
        TitleTxtLeftLabel4 = new javax.swing.JLabel();
        TextField8 = new javax.swing.JTextField();
        TitleTxtRightLabel4 = new javax.swing.JLabel();
        TextField11 = new javax.swing.JTextField();
        TextField9 = new javax.swing.JTextField();
        TitleTxtLeftLabel9 = new javax.swing.JLabel();
        TitleTxtLeftLabel10 = new javax.swing.JLabel();
        TextField10 = new javax.swing.JTextField();
        TitleTxtLeftLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton_pdf_delivery = new javax.swing.JButton();
        BgPanelLeft_purchase = new javax.swing.JPanel();
        TitleLeftLabel5 = new javax.swing.JLabel();
        TitleTxtLeftLabel12 = new javax.swing.JLabel();
        TextField12 = new javax.swing.JTextField();
        TitleTxtRightLabel9 = new javax.swing.JLabel();
        TextField13 = new javax.swing.JTextField();
        TitleTxtLeftLabel13 = new javax.swing.JLabel();
        TextField14 = new javax.swing.JTextField();
        TitleTxtRightLabel10 = new javax.swing.JLabel();
        TextField21 = new javax.swing.JTextField();
        TextField29 = new javax.swing.JTextField();
        TitleTxtLeftLabel14 = new javax.swing.JLabel();
        TitleTxtLeftLabel15 = new javax.swing.JLabel();
        TextField30 = new javax.swing.JTextField();
        TitleTxtLeftLabel16 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton_pdf_purchase = new javax.swing.JButton();
        BgPanelLeft_sell = new javax.swing.JPanel();
        TitleLeftLabel6 = new javax.swing.JLabel();
        TitleTxtLeftLabel17 = new javax.swing.JLabel();
        TextField31 = new javax.swing.JTextField();
        TitleTxtRightLabel11 = new javax.swing.JLabel();
        TextField32 = new javax.swing.JTextField();
        TitleTxtLeftLabel18 = new javax.swing.JLabel();
        TextField33 = new javax.swing.JTextField();
        TitleTxtRightLabel12 = new javax.swing.JLabel();
        TextField34 = new javax.swing.JTextField();
        TextField35 = new javax.swing.JTextField();
        TitleTxtLeftLabel19 = new javax.swing.JLabel();
        TitleTxtLeftLabel20 = new javax.swing.JLabel();
        TextField36 = new javax.swing.JTextField();
        TitleTxtLeftLabel21 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jButton_pdf_sell = new javax.swing.JButton();
        BgPanelRightop = new javax.swing.JPanel();
        Titledropdown = new javax.swing.JLabel();
        dropdownlist01 = new javax.swing.JComboBox<>();
        TextSearchField1 = new javax.swing.JTextField();
        TitleSearch = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        Titledropdown1 = new javax.swing.JLabel();
        dropdownlist2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
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
        jLabelProgram.setText("Report");

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelProgram)
                        .addGap(727, 727, 727)
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

        BgPanelLeft_delivery.setBackground(new java.awt.Color(204, 204, 204));

        TitleLeftLabel2.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        TitleLeftLabel2.setText("รายละเอียดจัดส่งสินค้า");

        TitleTxtLeftLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtLeftLabel3.setText("ชื่อพนักงานขับรถ");

        TextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField6ActionPerformed(evt);
            }
        });

        TitleTxtRightLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtRightLabel3.setText("ชื่อลูกค้า");

        TextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField7ActionPerformed(evt);
            }
        });

        TitleTxtLeftLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtLeftLabel4.setText("วันที่การจัดส่งสินค้า");

        TextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField8ActionPerformed(evt);
            }
        });

        TitleTxtRightLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtRightLabel4.setText("เบอร์ติดต่อ");

        TextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField11ActionPerformed(evt);
            }
        });

        TextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField9ActionPerformed(evt);
            }
        });

        TitleTxtLeftLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtLeftLabel9.setText("วันที่การจัดส่งสินค้า");

        TitleTxtLeftLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtLeftLabel10.setText("สถานที่จัดส่ง");

        TextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField10ActionPerformed(evt);
            }
        });

        TitleTxtLeftLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtLeftLabel11.setText("รายงานปัญหา");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jButton_pdf_delivery.setText("Save PDF");
        jButton_pdf_delivery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_pdf_deliveryMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BgPanelLeft_deliveryLayout = new javax.swing.GroupLayout(BgPanelLeft_delivery);
        BgPanelLeft_delivery.setLayout(BgPanelLeft_deliveryLayout);
        BgPanelLeft_deliveryLayout.setHorizontalGroup(
            BgPanelLeft_deliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgPanelLeft_deliveryLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(BgPanelLeft_deliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BgPanelLeft_deliveryLayout.createSequentialGroup()
                        .addGroup(BgPanelLeft_deliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TitleTxtLeftLabel9)
                            .addComponent(TitleTxtLeftLabel10)
                            .addComponent(TitleTxtLeftLabel11))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgPanelLeft_deliveryLayout.createSequentialGroup()
                        .addGroup(BgPanelLeft_deliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(BgPanelLeft_deliveryLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton_pdf_delivery, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TextField9)
                            .addGroup(BgPanelLeft_deliveryLayout.createSequentialGroup()
                                .addGroup(BgPanelLeft_deliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TitleTxtLeftLabel4)
                                    .addComponent(TitleTxtLeftLabel3)
                                    .addComponent(TitleLeftLabel2)
                                    .addComponent(TextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                                    .addComponent(TextField8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addGroup(BgPanelLeft_deliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TitleTxtRightLabel3)
                                    .addComponent(TitleTxtRightLabel4)
                                    .addComponent(TextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                                    .addComponent(TextField11)))
                            .addComponent(TextField10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(54, 54, 54))))
        );
        BgPanelLeft_deliveryLayout.setVerticalGroup(
            BgPanelLeft_deliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgPanelLeft_deliveryLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(TitleLeftLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(BgPanelLeft_deliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BgPanelLeft_deliveryLayout.createSequentialGroup()
                        .addComponent(TitleTxtRightLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BgPanelLeft_deliveryLayout.createSequentialGroup()
                        .addComponent(TitleTxtLeftLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(BgPanelLeft_deliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BgPanelLeft_deliveryLayout.createSequentialGroup()
                        .addGroup(BgPanelLeft_deliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TitleTxtLeftLabel4)
                            .addComponent(TitleTxtRightLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(TitleTxtLeftLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TitleTxtLeftLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TitleTxtLeftLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addComponent(jButton_pdf_delivery, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        BgPanelLeft_purchase.setBackground(new java.awt.Color(204, 204, 204));

        TitleLeftLabel5.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        TitleLeftLabel5.setText("รายละเอียดจัดสั่งชื้อสินค้า");

        TitleTxtLeftLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtLeftLabel12.setText("ชื่อพนักงานขับรถ");

        TextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField12ActionPerformed(evt);
            }
        });

        TitleTxtRightLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtRightLabel9.setText("ชื่อลูกค้า");

        TextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField13ActionPerformed(evt);
            }
        });

        TitleTxtLeftLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtLeftLabel13.setText("วันที่การจัดส่งสินค้า");

        TextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField14ActionPerformed(evt);
            }
        });

        TitleTxtRightLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtRightLabel10.setText("เบอร์ติดต่อ");

        TextField21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField21ActionPerformed(evt);
            }
        });

        TextField29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField29ActionPerformed(evt);
            }
        });

        TitleTxtLeftLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtLeftLabel14.setText("วันที่การจัดส่งสินค้า");

        TitleTxtLeftLabel15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtLeftLabel15.setText("สถานที่จัดส่ง");

        TextField30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField30ActionPerformed(evt);
            }
        });

        TitleTxtLeftLabel16.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtLeftLabel16.setText("รายงานปัญหา");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        jButton_pdf_purchase.setText("Save PDF");
        jButton_pdf_purchase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_pdf_purchaseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BgPanelLeft_purchaseLayout = new javax.swing.GroupLayout(BgPanelLeft_purchase);
        BgPanelLeft_purchase.setLayout(BgPanelLeft_purchaseLayout);
        BgPanelLeft_purchaseLayout.setHorizontalGroup(
            BgPanelLeft_purchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgPanelLeft_purchaseLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(BgPanelLeft_purchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BgPanelLeft_purchaseLayout.createSequentialGroup()
                        .addGroup(BgPanelLeft_purchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TitleTxtLeftLabel14)
                            .addComponent(TitleTxtLeftLabel15)
                            .addComponent(TitleTxtLeftLabel16))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgPanelLeft_purchaseLayout.createSequentialGroup()
                        .addGroup(BgPanelLeft_purchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(BgPanelLeft_purchaseLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton_pdf_purchase, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextField29)
                            .addGroup(BgPanelLeft_purchaseLayout.createSequentialGroup()
                                .addGroup(BgPanelLeft_purchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TitleTxtLeftLabel13)
                                    .addComponent(TitleTxtLeftLabel12)
                                    .addComponent(TitleLeftLabel5)
                                    .addComponent(TextField12, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                                    .addComponent(TextField14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addGroup(BgPanelLeft_purchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TitleTxtRightLabel9)
                                    .addComponent(TitleTxtRightLabel10)
                                    .addComponent(TextField13, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                                    .addComponent(TextField21)))
                            .addComponent(TextField30, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(54, 54, 54))))
        );
        BgPanelLeft_purchaseLayout.setVerticalGroup(
            BgPanelLeft_purchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgPanelLeft_purchaseLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(TitleLeftLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(BgPanelLeft_purchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BgPanelLeft_purchaseLayout.createSequentialGroup()
                        .addComponent(TitleTxtRightLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BgPanelLeft_purchaseLayout.createSequentialGroup()
                        .addComponent(TitleTxtLeftLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(BgPanelLeft_purchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BgPanelLeft_purchaseLayout.createSequentialGroup()
                        .addGroup(BgPanelLeft_purchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TitleTxtLeftLabel13)
                            .addComponent(TitleTxtRightLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(TitleTxtLeftLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TitleTxtLeftLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TitleTxtLeftLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addComponent(jButton_pdf_purchase, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        BgPanelLeft_sell.setBackground(new java.awt.Color(204, 204, 204));

        TitleLeftLabel6.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        TitleLeftLabel6.setText("รายละเอียดขายสินค้า");

        TitleTxtLeftLabel17.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtLeftLabel17.setText("ชื่อพนักงานขับรถ");

        TextField31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField31ActionPerformed(evt);
            }
        });

        TitleTxtRightLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtRightLabel11.setText("ชื่อลูกค้า");

        TextField32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField32ActionPerformed(evt);
            }
        });

        TitleTxtLeftLabel18.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtLeftLabel18.setText("วันที่การจัดส่งสินค้า");

        TextField33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField33ActionPerformed(evt);
            }
        });

        TitleTxtRightLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtRightLabel12.setText("เบอร์ติดต่อ");

        TextField34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField34ActionPerformed(evt);
            }
        });

        TextField35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField35ActionPerformed(evt);
            }
        });

        TitleTxtLeftLabel19.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtLeftLabel19.setText("วันที่การจัดส่งสินค้า");

        TitleTxtLeftLabel20.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtLeftLabel20.setText("สถานที่จัดส่ง");

        TextField36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField36ActionPerformed(evt);
            }
        });

        TitleTxtLeftLabel21.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtLeftLabel21.setText("รายงานปัญหา");

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane4.setViewportView(jTextArea3);

        jButton_pdf_sell.setText("Save PDF");
        jButton_pdf_sell.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_pdf_sellMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BgPanelLeft_sellLayout = new javax.swing.GroupLayout(BgPanelLeft_sell);
        BgPanelLeft_sell.setLayout(BgPanelLeft_sellLayout);
        BgPanelLeft_sellLayout.setHorizontalGroup(
            BgPanelLeft_sellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgPanelLeft_sellLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(BgPanelLeft_sellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BgPanelLeft_sellLayout.createSequentialGroup()
                        .addGroup(BgPanelLeft_sellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TitleTxtLeftLabel19)
                            .addComponent(TitleTxtLeftLabel20)
                            .addComponent(TitleTxtLeftLabel21))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgPanelLeft_sellLayout.createSequentialGroup()
                        .addGroup(BgPanelLeft_sellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TextField35)
                            .addGroup(BgPanelLeft_sellLayout.createSequentialGroup()
                                .addGroup(BgPanelLeft_sellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TitleTxtLeftLabel18)
                                    .addComponent(TitleTxtLeftLabel17)
                                    .addComponent(TitleLeftLabel6)
                                    .addComponent(TextField31, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                                    .addComponent(TextField33))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addGroup(BgPanelLeft_sellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TitleTxtRightLabel11)
                                    .addComponent(TitleTxtRightLabel12)
                                    .addComponent(TextField32, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                                    .addComponent(TextField34)))
                            .addComponent(TextField36, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BgPanelLeft_sellLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton_pdf_sell, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(54, 54, 54))))
        );
        BgPanelLeft_sellLayout.setVerticalGroup(
            BgPanelLeft_sellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgPanelLeft_sellLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(TitleLeftLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(BgPanelLeft_sellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BgPanelLeft_sellLayout.createSequentialGroup()
                        .addComponent(TitleTxtRightLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BgPanelLeft_sellLayout.createSequentialGroup()
                        .addComponent(TitleTxtLeftLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(BgPanelLeft_sellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BgPanelLeft_sellLayout.createSequentialGroup()
                        .addGroup(BgPanelLeft_sellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TitleTxtLeftLabel18)
                            .addComponent(TitleTxtRightLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(TitleTxtLeftLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TitleTxtLeftLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TitleTxtLeftLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addComponent(jButton_pdf_sell, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout BgPanelLeftLayout = new javax.swing.GroupLayout(BgPanelLeft);
        BgPanelLeft.setLayout(BgPanelLeftLayout);
        BgPanelLeftLayout.setHorizontalGroup(
            BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BgPanelLeft_delivery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(BgPanelLeft_purchase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(BgPanelLeft_sell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BgPanelLeftLayout.setVerticalGroup(
            BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BgPanelLeft_delivery, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(BgPanelLeft_purchase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(BgPanelLeft_sell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BgPanelRightop.setBackground(new java.awt.Color(204, 204, 204));

        Titledropdown.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Titledropdown.setText("หมวดหมู่");

        dropdownlist01.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Name", "Phone" }));

        TitleSearch.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        TitleSearch.setText("ค้นหา");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("ค้นหา");
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
                .addGap(27, 27, 27)
                .addGroup(BgPanelRightopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dropdownlist01, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Titledropdown))
                .addGap(42, 42, 42)
                .addGroup(BgPanelRightopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextSearchField1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TitleSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        BgPanelRightopLayout.setVerticalGroup(
            BgPanelRightopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgPanelRightopLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
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
                        .addGap(31, 31, 31))))
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
        jScrollPane1.setViewportView(jTable1);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        Titledropdown1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Titledropdown1.setText("ตาราง | Table");

        dropdownlist2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Delivery", "Purchase", "Sell" }));
        dropdownlist2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dropdownlist2MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                dropdownlist2MouseReleased(evt);
            }
        });
        dropdownlist2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropdownlist2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Titledropdown1)
                .addGap(32, 32, 32)
                .addComponent(dropdownlist2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dropdownlist2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Titledropdown1))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BgPanelLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(BgPanelRightop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

    private void jBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBackMouseClicked
        // TODO add your handling code here:
        String a1 = user.getUser();
        All_Data account = new All_Data();
        account.setUser(a1);
        main_ui main = new main_ui(account);
        main.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBackMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField6ActionPerformed

    private void TextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField7ActionPerformed

    private void TextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField8ActionPerformed

    private void TextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField11ActionPerformed

    private void dropdownlist2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dropdownlist2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dropdownlist2MouseClicked

    private void dropdownlist2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dropdownlist2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_dropdownlist2MouseReleased

    private void dropdownlist2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropdownlist2ActionPerformed
        // TODO add your handling code here:
        String type = dropdownlist2.getSelectedItem().toString();
        System.out.println(type);
        if(type == "Delivery"){
            BgPanelLeft_delivery.setVisible(true);
            BgPanelLeft_purchase.setVisible(false);
            BgPanelLeft_sell.setVisible(false);
        }
        if(type == "Purchase"){
            BgPanelLeft_delivery.setVisible(false);
            BgPanelLeft_purchase.setVisible(true);
            BgPanelLeft_sell.setVisible(false);
        }
        if(type == "Sell"){
            BgPanelLeft_delivery.setVisible(false);
            BgPanelLeft_purchase.setVisible(false);
            BgPanelLeft_sell.setVisible(true);
        }
    }//GEN-LAST:event_dropdownlist2ActionPerformed

    private void TextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField9ActionPerformed

    private void TextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField10ActionPerformed

    private void TextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField12ActionPerformed

    private void TextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField13ActionPerformed

    private void TextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField14ActionPerformed

    private void TextField21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField21ActionPerformed

    private void TextField29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField29ActionPerformed

    private void TextField30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField30ActionPerformed

    private void TextField31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField31ActionPerformed

    private void TextField32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField32ActionPerformed

    private void TextField33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField33ActionPerformed

    private void TextField34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField34ActionPerformed

    private void TextField35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField35ActionPerformed

    private void TextField36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField36ActionPerformed

    private void jButton_pdf_sellMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_pdf_sellMouseClicked
        // TODO add your handling code here:
        InvoiceGenerator pdf = new InvoiceGenerator();
        pdf.setPath(Path());
    }//GEN-LAST:event_jButton_pdf_sellMouseClicked

    private void jButton_pdf_purchaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_pdf_purchaseMouseClicked
        // TODO add your handling code here:
        InvoiceGenerator pdf = new InvoiceGenerator();
        pdf.setPath(Path());
    }//GEN-LAST:event_jButton_pdf_purchaseMouseClicked

    private void jButton_pdf_deliveryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_pdf_deliveryMouseClicked
        // TODO add your handling code here:
        InvoiceGenerator pdf = new InvoiceGenerator();
        pdf.setPath(Path());
    }//GEN-LAST:event_jButton_pdf_deliveryMouseClicked

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
            java.util.logging.Logger.getLogger(report_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(report_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(report_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(report_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new report_ui(new All_Data()).setVisible(true);
            }
        });
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BgPanelLeft;
    private javax.swing.JPanel BgPanelLeft_delivery;
    private javax.swing.JPanel BgPanelLeft_purchase;
    private javax.swing.JPanel BgPanelLeft_sell;
    private javax.swing.JPanel BgPanelRightop;
    private javax.swing.JTextField TextField10;
    private javax.swing.JTextField TextField11;
    private javax.swing.JTextField TextField12;
    private javax.swing.JTextField TextField13;
    private javax.swing.JTextField TextField14;
    private javax.swing.JTextField TextField21;
    private javax.swing.JTextField TextField29;
    private javax.swing.JTextField TextField30;
    private javax.swing.JTextField TextField31;
    private javax.swing.JTextField TextField32;
    private javax.swing.JTextField TextField33;
    private javax.swing.JTextField TextField34;
    private javax.swing.JTextField TextField35;
    private javax.swing.JTextField TextField36;
    private javax.swing.JTextField TextField6;
    private javax.swing.JTextField TextField7;
    private javax.swing.JTextField TextField8;
    private javax.swing.JTextField TextField9;
    private javax.swing.JTextField TextSearchField1;
    private javax.swing.JLabel TitleLeftLabel2;
    private javax.swing.JLabel TitleLeftLabel5;
    private javax.swing.JLabel TitleLeftLabel6;
    private javax.swing.JLabel TitleSearch;
    private javax.swing.JLabel TitleTxtLeftLabel10;
    private javax.swing.JLabel TitleTxtLeftLabel11;
    private javax.swing.JLabel TitleTxtLeftLabel12;
    private javax.swing.JLabel TitleTxtLeftLabel13;
    private javax.swing.JLabel TitleTxtLeftLabel14;
    private javax.swing.JLabel TitleTxtLeftLabel15;
    private javax.swing.JLabel TitleTxtLeftLabel16;
    private javax.swing.JLabel TitleTxtLeftLabel17;
    private javax.swing.JLabel TitleTxtLeftLabel18;
    private javax.swing.JLabel TitleTxtLeftLabel19;
    private javax.swing.JLabel TitleTxtLeftLabel20;
    private javax.swing.JLabel TitleTxtLeftLabel21;
    private javax.swing.JLabel TitleTxtLeftLabel3;
    private javax.swing.JLabel TitleTxtLeftLabel4;
    private javax.swing.JLabel TitleTxtLeftLabel9;
    private javax.swing.JLabel TitleTxtRightLabel10;
    private javax.swing.JLabel TitleTxtRightLabel11;
    private javax.swing.JLabel TitleTxtRightLabel12;
    private javax.swing.JLabel TitleTxtRightLabel3;
    private javax.swing.JLabel TitleTxtRightLabel4;
    private javax.swing.JLabel TitleTxtRightLabel9;
    private javax.swing.JLabel Titledropdown;
    private javax.swing.JLabel Titledropdown1;
    private javax.swing.JComboBox<String> dropdownlist01;
    private javax.swing.JComboBox<String> dropdownlist2;
    private javax.swing.JLabel jBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_pdf_delivery;
    private javax.swing.JButton jButton_pdf_purchase;
    private javax.swing.JButton jButton_pdf_sell;
    private javax.swing.JButton jButtonlogout;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelProgram;
    private javax.swing.JLabel jLabelTime;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JLabel jfirstname_lastname;
    // End of variables declaration//GEN-END:variables

    private void path() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
