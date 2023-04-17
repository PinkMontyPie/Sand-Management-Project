/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sand_management;

import java.lang.Object;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.*;
import java.util.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

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
        fetchitemDetails("delivery_data");
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

    public String Path() {
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
        TitleTxtLeftLabel14 = new javax.swing.JLabel();
        TitleTxtLeftLabel15 = new javax.swing.JLabel();
        TextField30 = new javax.swing.JTextField();
        jButton_pdf_purchase = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        PriceTable2 = new javax.swing.JTable();
        TxtPtotalLabel1 = new javax.swing.JLabel();
        TxtVATLabel2 = new javax.swing.JLabel();
        TxtTotalLabel1 = new javax.swing.JLabel();
        TextField15 = new javax.swing.JTextField();
        TextField16 = new javax.swing.JTextField();
        TextField17 = new javax.swing.JTextField();
        BgPanelLeft_sell = new javax.swing.JPanel();
        TitleLeftLabel6 = new javax.swing.JLabel();
        TitleTxtLeftLabel17 = new javax.swing.JLabel();
        TextField_sell_1 = new javax.swing.JTextField();
        TitleTxtRightLabel11 = new javax.swing.JLabel();
        TextField_sell_2 = new javax.swing.JTextField();
        TitleTxtLeftLabel18 = new javax.swing.JLabel();
        TextField_sell_3 = new javax.swing.JTextField();
        TitleTxtRightLabel12 = new javax.swing.JLabel();
        TextField_sell_4 = new javax.swing.JTextField();
        TextField_sell_5 = new javax.swing.JTextField();
        TitleTxtLeftLabel19 = new javax.swing.JLabel();
        jButton_pdf_sell = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        PriceTable3 = new javax.swing.JTable();
        TxtPtotalLabel2 = new javax.swing.JLabel();
        TextField_sell_6 = new javax.swing.JTextField();
        TextField_sell_7 = new javax.swing.JTextField();
        TxtVATLabel3 = new javax.swing.JLabel();
        TextField_sell_8 = new javax.swing.JTextField();
        TxtTotalLabel2 = new javax.swing.JLabel();
        BgPanelRightop = new javax.swing.JPanel();
        TextSearchField1 = new javax.swing.JTextField();
        TitleSearch = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        dropdownlist2 = new javax.swing.JComboBox<>();
        Titledropdown1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Delivery = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable_Purchase = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable_Sell = new javax.swing.JTable();

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
        TitleLeftLabel2.setForeground(new java.awt.Color(51, 51, 51));
        TitleLeftLabel2.setText("รายละเอียดจัดส่งสินค้า");

        TitleTxtLeftLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtLeftLabel3.setForeground(new java.awt.Color(51, 51, 51));
        TitleTxtLeftLabel3.setText("ชื่อพนักงานขับรถ");

        TextField6.setEditable(false);
        TextField6.setBackground(new java.awt.Color(255, 255, 255));
        TextField6.setForeground(new java.awt.Color(51, 51, 51));
        TextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField6ActionPerformed(evt);
            }
        });

        TitleTxtRightLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtRightLabel3.setForeground(new java.awt.Color(51, 51, 51));
        TitleTxtRightLabel3.setText("ชื่อลูกค้า");

        TextField7.setEditable(false);
        TextField7.setBackground(new java.awt.Color(255, 255, 255));
        TextField7.setForeground(new java.awt.Color(51, 51, 51));
        TextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField7ActionPerformed(evt);
            }
        });

        TitleTxtLeftLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtLeftLabel4.setForeground(new java.awt.Color(51, 51, 51));
        TitleTxtLeftLabel4.setText("วันที่การจัดส่งสินค้า");

        TextField8.setEditable(false);
        TextField8.setBackground(new java.awt.Color(255, 255, 255));
        TextField8.setForeground(new java.awt.Color(51, 51, 51));
        TextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField8ActionPerformed(evt);
            }
        });

        TitleTxtRightLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtRightLabel4.setForeground(new java.awt.Color(51, 51, 51));
        TitleTxtRightLabel4.setText("เบอร์ติดต่อ");

        TextField11.setEditable(false);
        TextField11.setBackground(new java.awt.Color(255, 255, 255));
        TextField11.setForeground(new java.awt.Color(51, 51, 51));
        TextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField11ActionPerformed(evt);
            }
        });

        TextField9.setEditable(false);
        TextField9.setBackground(new java.awt.Color(255, 255, 255));
        TextField9.setForeground(new java.awt.Color(51, 51, 51));
        TextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField9ActionPerformed(evt);
            }
        });

        TitleTxtLeftLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtLeftLabel9.setForeground(new java.awt.Color(51, 51, 51));
        TitleTxtLeftLabel9.setText("วันที่การจัดส่งสินค้า");

        TitleTxtLeftLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtLeftLabel10.setForeground(new java.awt.Color(51, 51, 51));
        TitleTxtLeftLabel10.setText("สถานที่จัดส่ง");

        TextField10.setEditable(false);
        TextField10.setBackground(new java.awt.Color(255, 255, 255));
        TextField10.setForeground(new java.awt.Color(51, 51, 51));
        TextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField10ActionPerformed(evt);
            }
        });

        TitleTxtLeftLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtLeftLabel11.setForeground(new java.awt.Color(51, 51, 51));
        TitleTxtLeftLabel11.setText("รายงานปัญหา");

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(51, 51, 51));
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jButton_pdf_delivery.setBackground(new java.awt.Color(255, 255, 255));
        jButton_pdf_delivery.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_pdf_delivery.setForeground(new java.awt.Color(51, 51, 51));
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
        BgPanelLeft_purchase.setForeground(new java.awt.Color(51, 51, 51));

        TitleLeftLabel5.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        TitleLeftLabel5.setForeground(new java.awt.Color(51, 51, 51));
        TitleLeftLabel5.setText("รายละเอียดจัดสั่งชื้อสินค้า");

        TitleTxtLeftLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtLeftLabel12.setForeground(new java.awt.Color(51, 51, 51));
        TitleTxtLeftLabel12.setText("ชื่อพนักงานขับรถ");

        TextField12.setEditable(false);
        TextField12.setBackground(new java.awt.Color(255, 255, 255));
        TextField12.setForeground(new java.awt.Color(51, 51, 51));
        TextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField12ActionPerformed(evt);
            }
        });

        TitleTxtRightLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtRightLabel9.setForeground(new java.awt.Color(51, 51, 51));
        TitleTxtRightLabel9.setText("ชื่อลูกค้า");

        TextField13.setEditable(false);
        TextField13.setBackground(new java.awt.Color(255, 255, 255));
        TextField13.setForeground(new java.awt.Color(51, 51, 51));
        TextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField13ActionPerformed(evt);
            }
        });

        TitleTxtLeftLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtLeftLabel13.setForeground(new java.awt.Color(51, 51, 51));
        TitleTxtLeftLabel13.setText("วันที่การจัดส่งสินค้า");

        TextField14.setEditable(false);
        TextField14.setBackground(new java.awt.Color(255, 255, 255));
        TextField14.setForeground(new java.awt.Color(51, 51, 51));
        TextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField14ActionPerformed(evt);
            }
        });

        TitleTxtRightLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtRightLabel10.setForeground(new java.awt.Color(51, 51, 51));
        TitleTxtRightLabel10.setText("เบอร์ติดต่อ");

        TextField21.setEditable(false);
        TextField21.setBackground(new java.awt.Color(255, 255, 255));
        TextField21.setForeground(new java.awt.Color(51, 51, 51));
        TextField21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField21ActionPerformed(evt);
            }
        });

        TitleTxtLeftLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtLeftLabel14.setForeground(new java.awt.Color(51, 51, 51));

        TitleTxtLeftLabel15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtLeftLabel15.setForeground(new java.awt.Color(51, 51, 51));
        TitleTxtLeftLabel15.setText("สถานที่จัดส่ง");

        TextField30.setEditable(false);
        TextField30.setBackground(new java.awt.Color(255, 255, 255));
        TextField30.setForeground(new java.awt.Color(51, 51, 51));
        TextField30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField30ActionPerformed(evt);
            }
        });

        jButton_pdf_purchase.setBackground(new java.awt.Color(255, 255, 255));
        jButton_pdf_purchase.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_pdf_purchase.setForeground(new java.awt.Color(51, 51, 51));
        jButton_pdf_purchase.setText("Save PDF");
        jButton_pdf_purchase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_pdf_purchaseMouseClicked(evt);
            }
        });

        PriceTable2.setBackground(new java.awt.Color(255, 255, 255));
        PriceTable2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PriceTable2.setForeground(new java.awt.Color(51, 51, 51));
        PriceTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Item", "Quantity", "Unit price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        PriceTable2.setGridColor(new java.awt.Color(0, 0, 0));
        PriceTable2.setRowHeight(30);
        PriceTable2.setSelectionBackground(new java.awt.Color(255, 255, 255));
        PriceTable2.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane7.setViewportView(PriceTable2);

        TxtPtotalLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TxtPtotalLabel1.setForeground(new java.awt.Color(0, 0, 0));
        TxtPtotalLabel1.setText("รวมราคาสินค้า");

        TxtVATLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TxtVATLabel2.setForeground(new java.awt.Color(0, 0, 0));
        TxtVATLabel2.setText("ภาษีมูลค่าเพิ่ม 7% VAT");

        TxtTotalLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TxtTotalLabel1.setForeground(new java.awt.Color(0, 0, 0));
        TxtTotalLabel1.setText("รวมเงินทั้งสิ้น TOTAL");

        TextField15.setBackground(new java.awt.Color(255, 153, 0));
        TextField15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TextField15.setForeground(new java.awt.Color(51, 51, 51));
        TextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField15ActionPerformed(evt);
            }
        });

        TextField16.setBackground(new java.awt.Color(255, 255, 255));
        TextField16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TextField16.setForeground(new java.awt.Color(51, 51, 51));
        TextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField16ActionPerformed(evt);
            }
        });

        TextField17.setBackground(new java.awt.Color(255, 255, 255));
        TextField17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TextField17.setForeground(new java.awt.Color(51, 51, 51));
        TextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField17ActionPerformed(evt);
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
                        .addComponent(TitleTxtLeftLabel15)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(BgPanelLeft_purchaseLayout.createSequentialGroup()
                        .addComponent(TitleTxtLeftLabel14)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgPanelLeft_purchaseLayout.createSequentialGroup()
                        .addGroup(BgPanelLeft_purchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TextField30, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BgPanelLeft_purchaseLayout.createSequentialGroup()
                                .addGroup(BgPanelLeft_purchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtPtotalLabel1)
                                    .addComponent(TextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(BgPanelLeft_purchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtVATLabel2)
                                    .addComponent(TextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(BgPanelLeft_purchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(BgPanelLeft_purchaseLayout.createSequentialGroup()
                                        .addComponent(TxtTotalLabel1)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(TextField15)))
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
                            .addGroup(BgPanelLeft_purchaseLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton_pdf_purchase, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING))
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
                .addGroup(BgPanelLeft_purchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TitleTxtLeftLabel13)
                    .addComponent(TitleTxtRightLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BgPanelLeft_purchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(TitleTxtLeftLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TitleTxtLeftLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(BgPanelLeft_purchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtVATLabel2)
                    .addComponent(TxtPtotalLabel1)
                    .addComponent(TxtTotalLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BgPanelLeft_purchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(jButton_pdf_purchase, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        BgPanelLeft_sell.setBackground(new java.awt.Color(204, 204, 204));

        TitleLeftLabel6.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        TitleLeftLabel6.setForeground(new java.awt.Color(51, 51, 51));
        TitleLeftLabel6.setText("รายละเอียดขายสินค้า");

        TitleTxtLeftLabel17.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtLeftLabel17.setForeground(new java.awt.Color(51, 51, 51));
        TitleTxtLeftLabel17.setText("ชื่อพนักงานขับรถ");

        TextField_sell_1.setEditable(false);
        TextField_sell_1.setBackground(new java.awt.Color(255, 255, 255));
        TextField_sell_1.setForeground(new java.awt.Color(51, 51, 51));
        TextField_sell_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_sell_1ActionPerformed(evt);
            }
        });

        TitleTxtRightLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtRightLabel11.setForeground(new java.awt.Color(51, 51, 51));
        TitleTxtRightLabel11.setText("ชื่อลูกค้า");

        TextField_sell_2.setEditable(false);
        TextField_sell_2.setBackground(new java.awt.Color(255, 255, 255));
        TextField_sell_2.setForeground(new java.awt.Color(51, 51, 51));
        TextField_sell_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_sell_2ActionPerformed(evt);
            }
        });

        TitleTxtLeftLabel18.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtLeftLabel18.setForeground(new java.awt.Color(51, 51, 51));
        TitleTxtLeftLabel18.setText("วันที่การจัดส่งสินค้า");

        TextField_sell_3.setEditable(false);
        TextField_sell_3.setBackground(new java.awt.Color(255, 255, 255));
        TextField_sell_3.setForeground(new java.awt.Color(51, 51, 51));
        TextField_sell_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_sell_3ActionPerformed(evt);
            }
        });

        TitleTxtRightLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtRightLabel12.setForeground(new java.awt.Color(51, 51, 51));
        TitleTxtRightLabel12.setText("เบอร์โทรศัพท์ลูกค้า");

        TextField_sell_4.setEditable(false);
        TextField_sell_4.setBackground(new java.awt.Color(255, 255, 255));
        TextField_sell_4.setForeground(new java.awt.Color(51, 51, 51));
        TextField_sell_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_sell_4ActionPerformed(evt);
            }
        });

        TextField_sell_5.setEditable(false);
        TextField_sell_5.setBackground(new java.awt.Color(255, 255, 255));
        TextField_sell_5.setForeground(new java.awt.Color(51, 51, 51));
        TextField_sell_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_sell_5ActionPerformed(evt);
            }
        });

        TitleTxtLeftLabel19.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtLeftLabel19.setForeground(new java.awt.Color(51, 51, 51));
        TitleTxtLeftLabel19.setText("ที่อยู่จัดส่งสินค้า");

        jButton_pdf_sell.setBackground(new java.awt.Color(255, 255, 255));
        jButton_pdf_sell.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_pdf_sell.setForeground(new java.awt.Color(51, 51, 51));
        jButton_pdf_sell.setText("Save PDF");
        jButton_pdf_sell.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_pdf_sellMouseClicked(evt);
            }
        });

        PriceTable3.setBackground(new java.awt.Color(255, 255, 255));
        PriceTable3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PriceTable3.setForeground(new java.awt.Color(51, 51, 51));
        PriceTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Item", "Quantity", "Unit price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        PriceTable3.setGridColor(new java.awt.Color(0, 0, 0));
        PriceTable3.setRowHeight(30);
        PriceTable3.setSelectionBackground(new java.awt.Color(255, 255, 255));
        PriceTable3.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane8.setViewportView(PriceTable3);

        TxtPtotalLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TxtPtotalLabel2.setForeground(new java.awt.Color(0, 0, 0));
        TxtPtotalLabel2.setText("รวมราคาสินค้า");

        TextField_sell_6.setBackground(new java.awt.Color(255, 255, 255));
        TextField_sell_6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TextField_sell_6.setForeground(new java.awt.Color(51, 51, 51));
        TextField_sell_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_sell_6ActionPerformed(evt);
            }
        });

        TextField_sell_7.setBackground(new java.awt.Color(255, 255, 255));
        TextField_sell_7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TextField_sell_7.setForeground(new java.awt.Color(51, 51, 51));
        TextField_sell_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_sell_7ActionPerformed(evt);
            }
        });

        TxtVATLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TxtVATLabel3.setForeground(new java.awt.Color(0, 0, 0));
        TxtVATLabel3.setText("ภาษีมูลค่าเพิ่ม 7% VAT");

        TextField_sell_8.setBackground(new java.awt.Color(73, 189, 128));
        TextField_sell_8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TextField_sell_8.setForeground(new java.awt.Color(51, 51, 51));
        TextField_sell_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_sell_8ActionPerformed(evt);
            }
        });

        TxtTotalLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TxtTotalLabel2.setForeground(new java.awt.Color(0, 0, 0));
        TxtTotalLabel2.setText("รวมเงินทั้งสิ้น TOTAL");

        javax.swing.GroupLayout BgPanelLeft_sellLayout = new javax.swing.GroupLayout(BgPanelLeft_sell);
        BgPanelLeft_sell.setLayout(BgPanelLeft_sellLayout);
        BgPanelLeft_sellLayout.setHorizontalGroup(
            BgPanelLeft_sellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgPanelLeft_sellLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(BgPanelLeft_sellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BgPanelLeft_sellLayout.createSequentialGroup()
                        .addComponent(TitleTxtLeftLabel19)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgPanelLeft_sellLayout.createSequentialGroup()
                        .addGroup(BgPanelLeft_sellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TextField_sell_5)
                            .addGroup(BgPanelLeft_sellLayout.createSequentialGroup()
                                .addGroup(BgPanelLeft_sellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TitleTxtLeftLabel18)
                                    .addComponent(TitleTxtLeftLabel17)
                                    .addComponent(TitleLeftLabel6)
                                    .addComponent(TextField_sell_1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                                    .addComponent(TextField_sell_3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addGroup(BgPanelLeft_sellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TitleTxtRightLabel11)
                                    .addComponent(TitleTxtRightLabel12)
                                    .addComponent(TextField_sell_2, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                                    .addComponent(TextField_sell_4)))
                            .addGroup(BgPanelLeft_sellLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton_pdf_sell, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BgPanelLeft_sellLayout.createSequentialGroup()
                                .addGroup(BgPanelLeft_sellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtPtotalLabel2)
                                    .addComponent(TextField_sell_6, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(BgPanelLeft_sellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtVATLabel3)
                                    .addComponent(TextField_sell_7, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(BgPanelLeft_sellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(BgPanelLeft_sellLayout.createSequentialGroup()
                                        .addComponent(TxtTotalLabel2)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(TextField_sell_8)))
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.LEADING))
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
                        .addComponent(TextField_sell_2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BgPanelLeft_sellLayout.createSequentialGroup()
                        .addComponent(TitleTxtLeftLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextField_sell_1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(BgPanelLeft_sellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextField_sell_4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BgPanelLeft_sellLayout.createSequentialGroup()
                        .addGroup(BgPanelLeft_sellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TitleTxtLeftLabel18)
                            .addComponent(TitleTxtRightLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextField_sell_3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(TitleTxtLeftLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextField_sell_5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(BgPanelLeft_sellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtVATLabel3)
                    .addComponent(TxtPtotalLabel2)
                    .addComponent(TxtTotalLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BgPanelLeft_sellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField_sell_8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextField_sell_7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextField_sell_6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
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

        TextSearchField1.setBackground(new java.awt.Color(255, 255, 255));
        TextSearchField1.setForeground(new java.awt.Color(51, 51, 51));

        TitleSearch.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        TitleSearch.setForeground(new java.awt.Color(51, 51, 51));
        TitleSearch.setText("ค้นหา ID");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 255));
        jButton1.setText("ค้นหา");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        dropdownlist2.setBackground(new java.awt.Color(255, 255, 255));
        dropdownlist2.setForeground(new java.awt.Color(51, 51, 51));
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

        Titledropdown1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Titledropdown1.setForeground(new java.awt.Color(51, 51, 51));
        Titledropdown1.setText("ตาราง");

        javax.swing.GroupLayout BgPanelRightopLayout = new javax.swing.GroupLayout(BgPanelRightop);
        BgPanelRightop.setLayout(BgPanelRightopLayout);
        BgPanelRightopLayout.setHorizontalGroup(
            BgPanelRightopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgPanelRightopLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(BgPanelRightopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dropdownlist2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Titledropdown1))
                .addGap(27, 27, 27)
                .addGroup(BgPanelRightopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextSearchField1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TitleSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 242, Short.MAX_VALUE)
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
                            .addComponent(TitleSearch)
                            .addComponent(Titledropdown1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BgPanelRightopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextSearchField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dropdownlist2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgPanelRightopLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jTable_Delivery.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable_Delivery.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable_Delivery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_DeliveryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Delivery);

        jTable_Purchase.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "2", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable_Purchase);

        jTable_Sell.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable_Sell.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_SellMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTable_Sell);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1042, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 1042, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE))
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
                    .addComponent(BgPanelRightop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        String a = "delivery_data";
        String b = "purchase_data";
        String c = "sell_data";
        if (type == "Delivery") {
            BgPanelLeft_delivery.setVisible(true);
            BgPanelLeft_purchase.setVisible(false);
            BgPanelLeft_sell.setVisible(false);
            jScrollPane1.setVisible(true);
            jScrollPane5.setVisible(false);
            jScrollPane6.setVisible(false);
            fetchitemDetails(a);
        }
        if (type == "Purchase") {
            BgPanelLeft_delivery.setVisible(false);
            BgPanelLeft_purchase.setVisible(true);
            BgPanelLeft_sell.setVisible(false);
            jScrollPane1.setVisible(false);
            jScrollPane5.setVisible(true);
            jScrollPane6.setVisible(false);
            fetchitemDetails(b);
        }
        if (type == "Sell") {
            BgPanelLeft_delivery.setVisible(false);
            BgPanelLeft_purchase.setVisible(false);
            BgPanelLeft_sell.setVisible(true);
            jScrollPane1.setVisible(false);
            jScrollPane5.setVisible(false);
            jScrollPane6.setVisible(true);
            fetchitemDetails(c);
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

    private void TextField30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField30ActionPerformed

    private void TextField_sell_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_sell_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_sell_1ActionPerformed

    private void TextField_sell_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_sell_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_sell_2ActionPerformed

    private void TextField_sell_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_sell_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_sell_3ActionPerformed

    private void TextField_sell_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_sell_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_sell_4ActionPerformed

    private void TextField_sell_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_sell_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_sell_5ActionPerformed

    private void jButton_pdf_sellMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_pdf_sellMouseClicked
        // TODO add your handling code here:
        int row =jTable_Sell.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)jTable_Sell.getModel();
        InvoiceGenerator pdf = new InvoiceGenerator();
        pdf.genpdf(Path(),"sell_data",model.getValueAt(row, 0).toString());
    }//GEN-LAST:event_jButton_pdf_sellMouseClicked

    private void jButton_pdf_purchaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_pdf_purchaseMouseClicked
        // TODO add your handling code here:
        int row =jTable_Purchase.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)jTable_Purchase.getModel();
        InvoiceGenerator pdf = new InvoiceGenerator();
        pdf.genpdf(Path(),"","");
    }//GEN-LAST:event_jButton_pdf_purchaseMouseClicked

    private void jButton_pdf_deliveryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_pdf_deliveryMouseClicked
        // TODO add your handling code here:
        int row =jTable_Delivery.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)jTable_Delivery.getModel();
        InvoiceGenerator pdf = new InvoiceGenerator();
        pdf.genpdf(Path(),"sell_data","10001");
    }//GEN-LAST:event_jButton_pdf_deliveryMouseClicked

    private void TextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField15ActionPerformed

    private void TextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField16ActionPerformed

    private void TextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField17ActionPerformed

    private void TextField_sell_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_sell_6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_sell_6ActionPerformed

    private void TextField_sell_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_sell_7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_sell_7ActionPerformed

    private void TextField_sell_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_sell_8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_sell_8ActionPerformed

    private void jTable_DeliveryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_DeliveryMouseClicked
        // TODO add your handling code here:
        //int row = jTable_Sell.getSelectedRow();
        //DefaultTableModel model = (DefaultTableModel) jTable_Sell.getModel();
        //try {
            //TextField_sell_1.setText(model.getValueAt(row, 1).toString());
            //TextField_sell_2.setText(model.getValueAt(row, 2).toString());
            //TextField_sell_3.setText(model.getValueAt(row, 3).toString());
            //TextField_sell_4.setText(model.getValueAt(row, 4).toString());
            //TextField_sell_5.setText(model.getValueAt(row, 5).toString());
        //} catch (Exception b) {
           // JOptionPane.showMessageDialog(null, b);
        //}
    }//GEN-LAST:event_jTable_DeliveryMouseClicked

    private void jTable_SellMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_SellMouseClicked
        // TODO add your handling code here:
        int row = jTable_Sell.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable_Sell.getModel();
        try {
            TextField_sell_1.setText(model.getValueAt(row, 1).toString());
            TextField_sell_2.setText(model.getValueAt(row, 2).toString());
            TextField_sell_3.setText(model.getValueAt(row, 3).toString());
            TextField_sell_4.setText(model.getValueAt(row, 4).toString());
            TextField_sell_5.setText(model.getValueAt(row, 5).toString());
        } catch (Exception b) {
            JOptionPane.showMessageDialog(null, b);
        }
    }//GEN-LAST:event_jTable_SellMouseClicked

    public void fetchitemDetails(String s) {
        System.out.println();
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:database.db");
            stmt = c.createStatement();
            ResultSet rs1 = stmt.executeQuery("SELECT * FROM "+s+"");
            if(s =="delivery_data"){
                jTable_Delivery.setModel(DbUtils.resultSetToTableModel(rs1));
            }
            if(s =="purchase_data"){
                jTable_Purchase.setModel(DbUtils.resultSetToTableModel(rs1));
            }
            if(s =="sell_data"){
                jTable_Sell.setModel(DbUtils.resultSetToTableModel(rs1));
            }
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
    private javax.swing.JTable PriceTable2;
    private javax.swing.JTable PriceTable3;
    private javax.swing.JTextField TextField10;
    private javax.swing.JTextField TextField11;
    private javax.swing.JTextField TextField12;
    private javax.swing.JTextField TextField13;
    private javax.swing.JTextField TextField14;
    private javax.swing.JTextField TextField15;
    private javax.swing.JTextField TextField16;
    private javax.swing.JTextField TextField17;
    private javax.swing.JTextField TextField21;
    private javax.swing.JTextField TextField30;
    private javax.swing.JTextField TextField6;
    private javax.swing.JTextField TextField7;
    private javax.swing.JTextField TextField8;
    private javax.swing.JTextField TextField9;
    private javax.swing.JTextField TextField_sell_1;
    private javax.swing.JTextField TextField_sell_2;
    private javax.swing.JTextField TextField_sell_3;
    private javax.swing.JTextField TextField_sell_4;
    private javax.swing.JTextField TextField_sell_5;
    private javax.swing.JTextField TextField_sell_6;
    private javax.swing.JTextField TextField_sell_7;
    private javax.swing.JTextField TextField_sell_8;
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
    private javax.swing.JLabel TitleTxtLeftLabel17;
    private javax.swing.JLabel TitleTxtLeftLabel18;
    private javax.swing.JLabel TitleTxtLeftLabel19;
    private javax.swing.JLabel TitleTxtLeftLabel3;
    private javax.swing.JLabel TitleTxtLeftLabel4;
    private javax.swing.JLabel TitleTxtLeftLabel9;
    private javax.swing.JLabel TitleTxtRightLabel10;
    private javax.swing.JLabel TitleTxtRightLabel11;
    private javax.swing.JLabel TitleTxtRightLabel12;
    private javax.swing.JLabel TitleTxtRightLabel3;
    private javax.swing.JLabel TitleTxtRightLabel4;
    private javax.swing.JLabel TitleTxtRightLabel9;
    private javax.swing.JLabel Titledropdown1;
    private javax.swing.JLabel TxtPtotalLabel1;
    private javax.swing.JLabel TxtPtotalLabel2;
    private javax.swing.JLabel TxtTotalLabel1;
    private javax.swing.JLabel TxtTotalLabel2;
    private javax.swing.JLabel TxtVATLabel2;
    private javax.swing.JLabel TxtVATLabel3;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable jTable_Delivery;
    private javax.swing.JTable jTable_Purchase;
    private javax.swing.JTable jTable_Sell;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel jfirstname_lastname;
    // End of variables declaration//GEN-END:variables

    private void path() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
