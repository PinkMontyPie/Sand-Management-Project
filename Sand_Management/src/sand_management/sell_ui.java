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
import static sand_management.employee_new.getRandomNumberString;

/**
 *
 * @author Pai
 */
public class sell_ui extends javax.swing.JFrame {
    SimpleDateFormat timeFormat;
    SimpleDateFormat dateFormat;
    String time;
    String date;
    private All_Data user; 
    
    public sell_ui(All_Data a1) {
        initComponents();
        this.setTitle("Sand Management Program | Sell");
        this.user = a1;
        Start();
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
            ResultSet rs1 = stmt.executeQuery("SELECT * FROM sell_data");
            right_table.setModel(DbUtils.resultSetToTableModel(rs1));
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
        sale_date = new javax.swing.JTextField();
        TitleTxtRightLabel1 = new javax.swing.JLabel();
        name_emp = new javax.swing.JTextField();
        TitleTxtLeftLabel2 = new javax.swing.JLabel();
        name_con = new javax.swing.JTextField();
        TitleTxtRightLabel2 = new javax.swing.JLabel();
        phone_con = new javax.swing.JTextField();
        TitleTxtLabel1 = new javax.swing.JLabel();
        address_con = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        left_table = new javax.swing.JTable();
        TxtPtotalLabel1 = new javax.swing.JLabel();
        TextField6 = new javax.swing.JTextField();
        TxtVATLabel2 = new javax.swing.JLabel();
        TextField7 = new javax.swing.JTextField();
        TxtTotalLabel1 = new javax.swing.JLabel();
        TextField8 = new javax.swing.JTextField();
        DelButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        BgPanelRightop = new javax.swing.JPanel();
        Search_Button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        searchbox = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        right_table = new javax.swing.JTable();

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
        jLabelProgram.setText("Sell");

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 882, Short.MAX_VALUE)
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
        TitleLeftLabel1.setText("รายละเอียดการขายสินค้า");

        TitleTxtLeftLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtLeftLabel1.setText("วันที่ขายสินค้า");

        sale_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sale_dateActionPerformed(evt);
            }
        });

        TitleTxtRightLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtRightLabel1.setText("ชื่อพนักงานขาย");

        name_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_empActionPerformed(evt);
            }
        });

        TitleTxtLeftLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtLeftLabel2.setText("ชื่อลูกค้า");

        name_con.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_conActionPerformed(evt);
            }
        });

        TitleTxtRightLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtRightLabel2.setText("เบอร์โทรศัพท์ลูกค้า");

        phone_con.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phone_conActionPerformed(evt);
            }
        });

        TitleTxtLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtLabel1.setText("ที่อยู่จัดส่งสินค้า");

        address_con.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                address_conActionPerformed(evt);
            }
        });

        left_table.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        left_table.setModel(new javax.swing.table.DefaultTableModel(
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
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(left_table);
        if (left_table.getColumnModel().getColumnCount() > 0) {
            left_table.getColumnModel().getColumn(4).setResizable(false);
        }

        TxtPtotalLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TxtPtotalLabel1.setText("รวมราคาสินค้า");

        TextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField6ActionPerformed(evt);
            }
        });

        TxtVATLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TxtVATLabel2.setText("ภาษีมูลค่าเพิ่ม 7% VAT");

        TextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField7ActionPerformed(evt);
            }
        });

        TxtTotalLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TxtTotalLabel1.setText("รวมเงินทั้งสิ้น TOTAL");

        TextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField8ActionPerformed(evt);
            }
        });

        DelButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DelButton.setText("ลบข้อมูล");
        DelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DelButtonMouseClicked(evt);
            }
        });
        DelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelButtonActionPerformed(evt);
            }
        });

        AddButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AddButton.setText("เพิ่มข้อมูล");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
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
                            .addComponent(sale_date, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(BgPanelLeftLayout.createSequentialGroup()
                                .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TitleTxtLeftLabel2)
                                    .addComponent(name_con, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(87, 87, 87)
                                .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(phone_con, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TitleTxtRightLabel2)
                                    .addComponent(TitleTxtRightLabel1)
                                    .addComponent(name_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(TitleLeftLabel1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(BgPanelLeftLayout.createSequentialGroup()
                        .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TitleTxtLabel1)
                            .addComponent(address_con, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgPanelLeftLayout.createSequentialGroup()
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
                                .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TxtTotalLabel1))
                                    .addGroup(BgPanelLeftLayout.createSequentialGroup()
                                        .addComponent(DelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49)
                                        .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(BgPanelLeftLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
        );
        BgPanelLeftLayout.setVerticalGroup(
            BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgPanelLeftLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(TitleLeftLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BgPanelLeftLayout.createSequentialGroup()
                        .addComponent(TitleTxtRightLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BgPanelLeftLayout.createSequentialGroup()
                        .addComponent(TitleTxtLeftLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sale_date, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(phone_con, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BgPanelLeftLayout.createSequentialGroup()
                        .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TitleTxtLeftLabel2)
                            .addComponent(TitleTxtRightLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name_con, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(TitleTxtLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(address_con, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        BgPanelRightop.setBackground(new java.awt.Color(204, 204, 204));

        Search_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Search_Button.setText("ค้นหา");
        Search_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Search_ButtonMouseClicked(evt);
            }
        });
        Search_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_ButtonActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Category");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Product ID", "Sale date", "Name contact" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        searchbox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        searchbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchboxKeyReleased(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Search");

        javax.swing.GroupLayout BgPanelRightopLayout = new javax.swing.GroupLayout(BgPanelRightop);
        BgPanelRightop.setLayout(BgPanelRightopLayout);
        BgPanelRightopLayout.setHorizontalGroup(
            BgPanelRightopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgPanelRightopLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(BgPanelRightopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(BgPanelRightopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Search_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        BgPanelRightopLayout.setVerticalGroup(
            BgPanelRightopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgPanelRightopLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(BgPanelRightopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BgPanelRightopLayout.createSequentialGroup()
                        .addGroup(BgPanelRightopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(BgPanelRightopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Search_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        right_table.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        right_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Date", "Sale Employee", "Contact Name", "Contact Number", "Contact Adress", "Product List"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(right_table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1911, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BgPanelLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(BgPanelRightop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1)))
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
                        .addGap(18, 18, 18)
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
        account.setFirst(a2);;
        main_ui main = new main_ui(account);
        main.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBackMouseClicked

    private void sale_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sale_dateActionPerformed
        //วันที่รับค่าตัวเลข
    }//GEN-LAST:event_sale_dateActionPerformed

    private void name_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_empActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_empActionPerformed

    private void name_conActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_conActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_conActionPerformed

    private void phone_conActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phone_conActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phone_conActionPerformed

    private void address_conActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_address_conActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_address_conActionPerformed

    private void TextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField6ActionPerformed

    private void TextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField7ActionPerformed

    private void TextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField8ActionPerformed

    private void DelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DelButtonActionPerformed

    private void Search_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Search_ButtonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void searchboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchboxKeyReleased
        // TODO add your handling code here:

        System.out.print(searchbox.getText());
        if (searchbox.getText() == null) {
            System.out.println(searchbox.getText());
            fetchitemDetailsCS();
        }
    }//GEN-LAST:event_searchboxKeyReleased

    private void Search_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_ButtonMouseClicked
        // TODO add your handling code here:
        // Search
        Connection c = null;
        Statement stmt = null;
        String type = jComboBox1.getSelectedItem().toString();
        String search = searchbox.getText();
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:database.db");
            stmt = c.createStatement();
            if (type.equals("Product ID")) {
                ResultSet rs = stmt.executeQuery("SELECT * FROM sell_data WHERE Product_id = '" + search + "'");
                right_table.setModel(DbUtils.resultSetToTableModel(rs));
                rs.close();
            }
            if (type.equals("Sale date")) {
                ResultSet rs = stmt.executeQuery("SELECT * FROM sell_data WHERE Sale_date = '" + search + "'");
                right_table.setModel(DbUtils.resultSetToTableModel(rs));
                rs.close();
            }
            if (type.equals("Name contact")) {
                ResultSet rs = stmt.executeQuery("SELECT * FROM sell_data WHERE Cotact_name = '" + search + "'");
                right_table.setModel(DbUtils.resultSetToTableModel(rs));
                rs.close();
            }
            stmt.close();
            c.close();

        } catch (Exception e) {
            e.printStackTrace();
        }   
    }//GEN-LAST:event_Search_ButtonMouseClicked

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:
        // add data sell
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:database.db");
            c.setAutoCommit(false);
            stmt = c.createStatement();
            String saledete = sale_date.getText();
            String nameemp = name_emp.getText();
            String namecon = name_con.getText();
            String phonecon = phone_con.getText();
            String addresscon = address_con.getText();
            String sql = "INSERT INTO sell_data(Sale_date,Sale_employee,Contact_name,Contact_phone,Contact_address) VALUES('" + saledete + "','" + nameemp + "','" + namecon + "','" + phonecon + "','" + addresscon + "')";
            stmt.executeUpdate(sql);
            String user1 = user.getUser();
            All_Data account = new All_Data();
            account.setUser(user1);
            stmt.close();
            c.commit();
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
            JOptionPane.showMessageDialog(null, "Add Sell Complete.", "ALERT", JOptionPane.INFORMATION_MESSAGE);
            fetchitemDetailsCS();
        }
    }//GEN-LAST:event_AddButtonActionPerformed

    private void DelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DelButtonMouseClicked
        // TODO add your handling code here:
        Connection c = null;
        PreparedStatement pat = null;
        int row = right_table.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) right_table.getModel();

        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:database.db");
            String delete = "DELETE FROM sell_data WHERE Product_id = ?";
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
    }//GEN-LAST:event_DelButtonMouseClicked

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
            java.util.logging.Logger.getLogger(sell_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sell_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sell_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sell_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new sell_ui(new All_Data()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JPanel BgPanelLeft;
    private javax.swing.JPanel BgPanelRightop;
    private javax.swing.JButton DelButton;
    private javax.swing.JButton Search_Button;
    private javax.swing.JTextField TextField6;
    private javax.swing.JTextField TextField7;
    private javax.swing.JTextField TextField8;
    private javax.swing.JLabel TitleLeftLabel1;
    private javax.swing.JLabel TitleTxtLabel1;
    private javax.swing.JLabel TitleTxtLeftLabel1;
    private javax.swing.JLabel TitleTxtLeftLabel2;
    private javax.swing.JLabel TitleTxtRightLabel1;
    private javax.swing.JLabel TitleTxtRightLabel2;
    private javax.swing.JLabel TxtPtotalLabel1;
    private javax.swing.JLabel TxtTotalLabel1;
    private javax.swing.JLabel TxtVATLabel2;
    private javax.swing.JTextField address_con;
    private javax.swing.JLabel jBack;
    private javax.swing.JButton jButtonlogout;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelProgram;
    private javax.swing.JLabel jLabelTime;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jfirstname_lastname;
    private javax.swing.JTable left_table;
    private javax.swing.JTextField name_con;
    private javax.swing.JTextField name_emp;
    private javax.swing.JTextField phone_con;
    private javax.swing.JTable right_table;
    private javax.swing.JTextField sale_date;
    private javax.swing.JTextField searchbox;
    // End of variables declaration//GEN-END:variables
}
