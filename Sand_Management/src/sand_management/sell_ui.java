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
        vat.setText("7");
        total_amount.setText("0");
        calculate_vate();
    }
    
    public void calculate_vate(){
        String amount = total_amount.getText();
        String vate1 = vat.getText();
        int amount1 =Integer.parseInt(amount);  
        int vate2 =Integer.parseInt(vate1);  
        int convert = amount1 / 100;
        int sum = convert * vate2;
        int total = amount1 + sum;
        String sum_string = Integer.toString(total);
        String texttotal = sum_string;
        totalText.setText(texttotal);
    }

    public void fetchitemDetailsCS() {
        Connection c = null;
        Statement stmt = null;
        name_con.setEditable(true);
        DefaultTableModel dtm = (DefaultTableModel) right_table.getModel();
        dtm.setRowCount(0);
        jDateChooser1.setText("");
        name_emp.setText("");
        name_con.setText("");
        phone_con.setText("");
        address_con.setText("");
        item_sell.setText("");
        total_amount.setText("");
        vat.setText("");
        totalText.setText("");
        String d1 = "Do not fill out";
        String d2 = "-";
        String d3 = "0";
        String table_data1[] = {d1, d2, d3, d3, d1};
        String table_data2[] = {d1, d2, d3, d3, d1};
        String table_data3[] = {d1, d2, d3, d3, d1};
        String table_data4[] = {d1, d2, d3, d3, d1};
        String table_data5[] = {d1, d2, d3, d3, d1};
        DefaultTableModel tblModel = (DefaultTableModel) left_table.getModel();
        tblModel.setRowCount(0);
        tblModel.addRow(table_data1);
        tblModel.addRow(table_data2);
        tblModel.addRow(table_data3);
        tblModel.addRow(table_data4);
        tblModel.addRow(table_data5);
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:database.db");
            stmt = c.createStatement();
            ResultSet rs1 = stmt.executeQuery("SELECT * FROM sell_data");
            while(rs1.next()){
                String s1 = rs1.getString("PRODUCT_ID");
                String s2 = rs1.getString("SALE_DATE");
                String s3 = rs1.getString("SALE_EMPLOYEE");
                String s4 = rs1.getString("CONTACT_NAME");
                String s5 = rs1.getString("CONTACT_PHONE");
                String s6 = rs1.getString("CONTACT_ADDRESS");
                String s7 = rs1.getString("PRODUCT_LIST");
                String table_data[] = {s1, s2, s3, s4, s5, s6, s7};
                DefaultTableModel tblModel1 = (DefaultTableModel) right_table.getModel();
                tblModel1.addRow(table_data);
            }
        } catch (Exception b) {
            JOptionPane.showMessageDialog(null, b);
        }
    }
    
    public static String getRandomNumberString() {
        Random rnd = new Random();
        int number = rnd.nextInt(999999);
        return String.format("%05d", number);
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
        total_amount = new javax.swing.JTextField();
        TxtVATLabel2 = new javax.swing.JLabel();
        vat = new javax.swing.JTextField();
        TxtTotalLabel1 = new javax.swing.JLabel();
        totalText = new javax.swing.JTextField();
        DelButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        jDateChooser1 = new javax.swing.JTextField();
        TitleTxtLabel2 = new javax.swing.JLabel();
        item_sell = new javax.swing.JTextField();
        Refresh = new javax.swing.JLabel();
        DelButton1 = new javax.swing.JButton();
        calculate_button = new javax.swing.JButton();
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
        TitleLeftLabel1.setForeground(new java.awt.Color(51, 51, 51));
        TitleLeftLabel1.setText("รายละเอียดการขายสินค้า");

        TitleTxtLeftLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtLeftLabel1.setForeground(new java.awt.Color(51, 51, 51));
        TitleTxtLeftLabel1.setText("วันที่ขายสินค้า");

        TitleTxtRightLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtRightLabel1.setForeground(new java.awt.Color(51, 51, 51));
        TitleTxtRightLabel1.setText("ชื่อพนักงานขาย");

        name_emp.setBackground(new java.awt.Color(255, 255, 255));
        name_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_empActionPerformed(evt);
            }
        });

        TitleTxtLeftLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtLeftLabel2.setForeground(new java.awt.Color(51, 51, 51));
        TitleTxtLeftLabel2.setText("ชื่อลูกค้า");

        name_con.setBackground(new java.awt.Color(255, 255, 255));
        name_con.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_conActionPerformed(evt);
            }
        });

        TitleTxtRightLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtRightLabel2.setForeground(new java.awt.Color(51, 51, 51));
        TitleTxtRightLabel2.setText("เบอร์โทรศัพท์ลูกค้า");

        phone_con.setBackground(new java.awt.Color(255, 255, 255));
        phone_con.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phone_conActionPerformed(evt);
            }
        });

        TitleTxtLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtLabel1.setForeground(new java.awt.Color(51, 51, 51));
        TitleTxtLabel1.setText("ที่อยู่จัดส่งสินค้า");

        address_con.setBackground(new java.awt.Color(255, 255, 255));
        address_con.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                address_conActionPerformed(evt);
            }
        });

        left_table.setBackground(new java.awt.Color(255, 255, 255));
        left_table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        left_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Item", "Quantity", "Unit price", "Amount"
            }
        ));
        left_table.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                left_tableMouseMoved(evt);
            }
        });
        jScrollPane2.setViewportView(left_table);

        TxtPtotalLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TxtPtotalLabel1.setForeground(new java.awt.Color(51, 51, 51));
        TxtPtotalLabel1.setText("รวมราคาสินค้า");

        total_amount.setBackground(new java.awt.Color(255, 255, 255));
        total_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_amountActionPerformed(evt);
            }
        });

        TxtVATLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TxtVATLabel2.setForeground(new java.awt.Color(51, 51, 51));
        TxtVATLabel2.setText("ภาษีมูลค่าเพิ่ม 7% VAT");

        vat.setBackground(new java.awt.Color(255, 255, 255));
        vat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vatActionPerformed(evt);
            }
        });

        TxtTotalLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TxtTotalLabel1.setForeground(new java.awt.Color(51, 51, 51));
        TxtTotalLabel1.setText("รวมเงินทั้งสิ้น TOTAL");

        totalText.setBackground(new java.awt.Color(255, 255, 255));
        totalText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalTextActionPerformed(evt);
            }
        });

        DelButton.setBackground(new java.awt.Color(255, 255, 255));
        DelButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DelButton.setForeground(new java.awt.Color(51, 51, 51));
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

        AddButton.setBackground(new java.awt.Color(255, 255, 255));
        AddButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AddButton.setForeground(new java.awt.Color(51, 51, 51));
        AddButton.setText("เพิ่มข้อมูล");
        AddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddButtonMouseClicked(evt);
            }
        });
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        jDateChooser1.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDateChooser1ActionPerformed(evt);
            }
        });

        TitleTxtLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TitleTxtLabel2.setForeground(new java.awt.Color(51, 51, 51));
        TitleTxtLabel2.setText("สินค้าที่ขาย");

        item_sell.setBackground(new java.awt.Color(255, 255, 255));
        item_sell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_sellActionPerformed(evt);
            }
        });

        Refresh.setForeground(new java.awt.Color(0, 0, 0));
        Refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sand_management/picture/refresh-button.png"))); // NOI18N
        Refresh.setText("Refresh");
        Refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RefreshMouseClicked(evt);
            }
        });

        DelButton1.setBackground(new java.awt.Color(255, 255, 255));
        DelButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DelButton1.setForeground(new java.awt.Color(51, 51, 51));
        DelButton1.setText("เเก้ไขข้อมูล");
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

        calculate_button.setBackground(new java.awt.Color(255, 255, 255));
        calculate_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        calculate_button.setForeground(new java.awt.Color(51, 51, 51));
        calculate_button.setText("คำนวณราคา");
        calculate_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calculate_buttonMouseClicked(evt);
            }
        });
        calculate_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculate_buttonActionPerformed(evt);
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
                            .addGroup(BgPanelLeftLayout.createSequentialGroup()
                                .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TitleTxtLeftLabel2)
                                    .addComponent(name_con, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(87, 87, 87)
                                .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(phone_con, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TitleTxtRightLabel2)
                                    .addComponent(TitleTxtRightLabel1)
                                    .addComponent(name_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(45, Short.MAX_VALUE))
                    .addGroup(BgPanelLeftLayout.createSequentialGroup()
                        .addComponent(TitleLeftLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Refresh)
                        .addGap(54, 54, 54))
                    .addGroup(BgPanelLeftLayout.createSequentialGroup()
                        .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TitleTxtLabel2)
                            .addComponent(item_sell, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TitleTxtLabel1)
                                .addComponent(address_con, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgPanelLeftLayout.createSequentialGroup()
                                    .addComponent(DelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(DelButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgPanelLeftLayout.createSequentialGroup()
                                    .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(BgPanelLeftLayout.createSequentialGroup()
                                            .addComponent(TxtPtotalLabel1)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(total_amount))
                                    .addGap(18, 18, 18)
                                    .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(BgPanelLeftLayout.createSequentialGroup()
                                            .addComponent(TxtVATLabel2)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(vat))
                                    .addGap(18, 18, 18)
                                    .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TxtTotalLabel1)
                                        .addGroup(BgPanelLeftLayout.createSequentialGroup()
                                            .addComponent(totalText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(27, 27, 27)
                                            .addComponent(calculate_button))))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        BgPanelLeftLayout.setVerticalGroup(
            BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgPanelLeftLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TitleLeftLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Refresh))
                .addGap(27, 27, 27)
                .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TitleTxtRightLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TitleTxtLeftLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TitleTxtLeftLabel2)
                    .addComponent(TitleTxtRightLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_con, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phone_con, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TitleTxtLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(address_con, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TitleTxtLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item_sell, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtVATLabel2)
                    .addComponent(TxtPtotalLabel1)
                    .addComponent(TxtTotalLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calculate_button))
                .addGap(18, 18, 18)
                .addGroup(BgPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DelButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        BgPanelRightop.setBackground(new java.awt.Color(204, 204, 204));

        Search_Button.setBackground(new java.awt.Color(255, 255, 255));
        Search_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Search_Button.setForeground(new java.awt.Color(0, 153, 255));
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

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Product ID", "Sale date", "Name contact" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        searchbox.setBackground(new java.awt.Color(255, 255, 255));
        searchbox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        searchbox.setForeground(new java.awt.Color(51, 51, 51));
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
                .addGap(33, 33, 33)
                .addGroup(BgPanelRightopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(BgPanelRightopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Search_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        BgPanelRightopLayout.setVerticalGroup(
            BgPanelRightopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgPanelRightopLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(BgPanelRightopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgPanelRightopLayout.createSequentialGroup()
                        .addGroup(BgPanelRightopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(BgPanelRightopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgPanelRightopLayout.createSequentialGroup()
                        .addComponent(Search_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
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
        right_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                right_tableMouseClicked(evt);
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE))
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

    private void total_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_total_amountActionPerformed

    private void vatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vatActionPerformed

    private void totalTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalTextActionPerformed

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
        DefaultTableModel dtm = (DefaultTableModel) right_table.getModel();
        dtm.setRowCount(0);
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:database.db");
            stmt = c.createStatement();
            if (type.equals("Product ID")) {
                ResultSet rs = stmt.executeQuery("SELECT * FROM sell_data WHERE Product_id = '" + search + "'");
                while (rs.next()) {
                    String s1 = rs.getString("PRODUCT_ID");
                    String s2 = rs.getString("SALE_DATE");
                    String s3 = rs.getString("SALE_EMPLOYEE");
                    String s4 = rs.getString("CONTACT_NAME");
                    String s5 = rs.getString("CONTACT_PHONE");
                    String s6 = rs.getString("CONTACT_ADDRESS");
                    String s7 = rs.getString("PRODUCT_LIST");
                    String table_data[] = {s1, s2, s3, s4, s5, s6, s7};
                    DefaultTableModel tblModel = (DefaultTableModel) right_table.getModel();
                    tblModel.addRow(table_data);
                }
                rs.close();
            }
            if (type.equals("Sale date")) {
                ResultSet rs = stmt.executeQuery("SELECT * FROM sell_data WHERE Sale_date = '" + search + "'");
                while (rs.next()) {
                    String s1 = rs.getString("PRODUCT_ID");
                    String s2 = rs.getString("SALE_DATE");
                    String s3 = rs.getString("SALE_EMPLOYEE");
                    String s4 = rs.getString("CONTACT_NAME");
                    String s5 = rs.getString("CONTACT_PHONE");
                    String s6 = rs.getString("CONTACT_ADDRESS");
                    String s7 = rs.getString("PRODUCT_LIST");
                    String table_data[] = {s1, s2, s3, s4, s5, s6, s7};
                    DefaultTableModel tblModel = (DefaultTableModel) right_table.getModel();
                    tblModel.addRow(table_data);
                }
                rs.close();
            }
            if (type.equals("Name contact")) {
                ResultSet rs = stmt.executeQuery("SELECT * FROM sell_data WHERE Contact_name = '" + search + "'");
                while (rs.next()) {
                    String s1 = rs.getString("PRODUCT_ID");
                    String s2 = rs.getString("SALE_DATE");
                    String s3 = rs.getString("SALE_EMPLOYEE");
                    String s4 = rs.getString("CONTACT_NAME");
                    String s5 = rs.getString("CONTACT_PHONE");
                    String s6 = rs.getString("CONTACT_ADDRESS");
                    String s7 = rs.getString("PRODUCT_LIST");
                    String table_data[] = {s1, s2, s3, s4, s5, s6, s7};
                    DefaultTableModel tblModel = (DefaultTableModel) right_table.getModel();
                    tblModel.addRow(table_data);
                }
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
    }//GEN-LAST:event_AddButtonActionPerformed

    private void DelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DelButtonMouseClicked
        // TODO add your handling code here:
        Connection c = null;
        PreparedStatement pat = null;
        PreparedStatement pat1 = null;
        int row = right_table.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) right_table.getModel();
        DefaultTableModel model1 = (DefaultTableModel) left_table.getModel();
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:database.db");
            String delete = "DELETE FROM sell_data WHERE Product_id = ?";
            pat = c.prepareStatement(delete);
            pat.setString(1, model.getValueAt(row, 0).toString());
            String delete1 = "DELETE FROM product_data WHERE Product_id = ?";
            pat1 = c.prepareStatement(delete1);
            pat1.setString(1, model1.getValueAt(row, 0).toString());
            pat1.execute();
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

    private void right_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_right_tableMouseClicked
        // TODO add your handling code here:
        Connection conn = null;
        Statement stmt = null;
        DefaultTableModel dtm = (DefaultTableModel) left_table.getModel();
        dtm.setRowCount(0);
        int row = right_table.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) right_table.getModel();
        jDateChooser1.setText(model.getValueAt(row, 1).toString());
        name_emp.setText(model.getValueAt(row, 2).toString());
        name_con.setText(model.getValueAt(row, 3).toString());
        phone_con.setText(model.getValueAt(row, 4).toString());
        address_con.setText(model.getValueAt(row, 5).toString());
        item_sell.setText(model.getValueAt(row, 6).toString());
        String contact = name_con.getText();
        String pro_id = model.getValueAt(row, 0).toString();
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:database.db");
            conn.setAutoCommit(false);
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT * FROM sell_data WHERE CONTACT_NAME = '"+contact+"'" );
            String total = rs.getString("TOTAL");
            String text_total = total + " บาท";
            totalText.setText(text_total);
            ResultSet rs1 = stmt.executeQuery( "SELECT * FROM product_data WHERE PRODUCT_ID = '"+pro_id+"'" );
        
            String s1 = rs.getString("PRODUCT_ID");
            String s2 = rs1.getString("ITEM1");
            String s3 = rs1.getString("QUANTITY1");
            String s4 = rs1.getString("UNIT1");
            String s5 = rs1.getString("AMOUNT1");
            String s6 = rs1.getString("ITEM2");
            String s7 = rs1.getString("QUANTITY2");
            String s8 = rs1.getString("UNIT2");
            String s9 = rs1.getString("AMOUNT2");
            String s10 = rs1.getString("ITEM3");
            String s11 = rs1.getString("QUANTITY3");
            String s12 = rs1.getString("UNIT3");
            String s13 = rs1.getString("AMOUNT3");
            String s14 = rs1.getString("ITEM4");
            String s15 = rs1.getString("QUANTITY4");
            String s16 = rs1.getString("UNIT4");
            String s17 = rs1.getString("AMOUNT4");
            String s18 = rs1.getString("ITEM5");
            String s19 = rs1.getString("QUANTITY5");
            String s20 = rs1.getString("UNIT5");
            String s21 = rs1.getString("AMOUNT5");
            
            String table_data1[] = {s1, s2, s3, s4, s5};
            String table_data2[] = {s1, s6, s7, s8, s9};
            String table_data3[] = {s1, s10, s11, s12, s13};
            String table_data4[] = {s1, s14, s15, s16, s17};
            String table_data5[] = {s1, s18, s19, s20, s21};
            DefaultTableModel tblModel = (DefaultTableModel) left_table.getModel();
            tblModel.addRow(table_data1);
            tblModel.addRow(table_data2);
            tblModel.addRow(table_data3);
            tblModel.addRow(table_data4);
            tblModel.addRow(table_data5);
            
            int num1 = Integer.parseInt(s5);
            int num2 = Integer.parseInt(s9);
            int num3 = Integer.parseInt(s13);
            int num4 = Integer.parseInt(s17);
            int num5 = Integer.parseInt(s21);
            
            int total_sum = num1+num2+num3+num4+num5;
            String sum_string = Integer.toString(total_sum);
            total_amount.setText(sum_string);
            name_con.setEditable(false);
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception b) {
            JOptionPane.showMessageDialog(null, b);
        }
    }//GEN-LAST:event_right_tableMouseClicked

    private void AddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseClicked
        // TODO add your handling code here:
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:database.db");
            c.setAutoCommit(false);
            stmt = c.createStatement();
            DefaultTableModel model = (DefaultTableModel) left_table.getModel();
            String num_text1 = model.getValueAt(0, 2).toString();
            String num_text2 = model.getValueAt(0, 3).toString();
            String num_text3 = model.getValueAt(1, 2).toString();
            String num_text4 = model.getValueAt(1, 3).toString();
            String num_text5 = model.getValueAt(2, 2).toString();
            String num_text6 = model.getValueAt(2, 3).toString();
            String num_text7 = model.getValueAt(3, 2).toString();
            String num_text8 = model.getValueAt(3, 3).toString();
            String num_text9 = model.getValueAt(4, 2).toString();
            String num_text10 = model.getValueAt(4, 3).toString();
            int num1 = Integer.parseInt(num_text1);
            int num2 = Integer.parseInt(num_text2);
            int num3 = Integer.parseInt(num_text3);
            int num4 = Integer.parseInt(num_text4);
            int num5 = Integer.parseInt(num_text5);
            int num6 = Integer.parseInt(num_text6);
            int num7 = Integer.parseInt(num_text7);
            int num8 = Integer.parseInt(num_text8);
            int num9 = Integer.parseInt(num_text9);
            int num10 = Integer.parseInt(num_text10);
            int sum_num1 = num1 * num2;
            int sum_num2 = num3 * num4;
            int sum_num3 = num5 * num6;
            int sum_num4 = num7 * num8;
            int sum_num5 = num9 * num10;
            String sum_string1 = Integer.toString(sum_num1);
            String sum_string2 = Integer.toString(sum_num2);
            String sum_string3 = Integer.toString(sum_num3);
            String sum_string4 = Integer.toString(sum_num4);
            String sum_string5 = Integer.toString(sum_num5);
            String saledete = jDateChooser1.getText();
            String nameemp = name_emp.getText();
            String namecon = name_con.getText();
            String phonecon = phone_con.getText();
            String addresscon = address_con.getText();
            String item_list = item_sell.getText();
            String total = totalText.getText();
            String random_id = getRandomNumberString();
            ResultSet rs1 = stmt.executeQuery("SELECT * FROM sell_data WHERE Contact_Name = '" + namecon + "'");
            String id_product = rs1.getString("PRODUCT_ID");
            String contact_name = rs1.getString("CONTACT_NAME");
            rs1.close();
            
            while (random_id.equals(id_product)) {
                random_id = getRandomNumberString();
                if (!random_id.equals(id_product)) {
                    break;
                }
            }
            if (!namecon.equals(contact_name)) {
                String sql = "INSERT INTO sell_data(PRODUCT_ID,Sale_date,Sale_employee,Contact_name,Contact_phone,Contact_address,Product_list,Total) VALUES('" + random_id + "','" + saledete + "','" + nameemp + "','" + namecon + "','" + phonecon + "','" + addresscon + "','" + item_list + "','" + total + "')";
                stmt.executeUpdate(sql);

                String table_sql = "INSERT INTO product_data(PRODUCT_ID,ITEM1,QUANTITY1,UNIT1,AMOUNT1,ITEM2,QUANTITY2,UNIT2,AMOUNT2,ITEM3,QUANTITY3,UNIT3,AMOUNT3,ITEM4,QUANTITY4,UNIT4,AMOUNT4,ITEM5,QUANTITY5,UNIT5,AMOUNT5) "
                        + "VALUES('" + random_id + "','" + model.getValueAt(0, 1).toString() + "','" + model.getValueAt(0, 2).toString() + "','" + model.getValueAt(0, 3).toString() + "','" + sum_string1 + "',"
                        + "'" + model.getValueAt(1, 1).toString() + "','" + model.getValueAt(1, 2).toString() + "','" + model.getValueAt(1, 3).toString() + "','" + sum_string2 + "',"
                        + "'" + model.getValueAt(2, 1).toString() + "','" + model.getValueAt(2, 2).toString() + "','" + model.getValueAt(2, 3).toString() + "','" + sum_string3 + "',"
                        + "'" + model.getValueAt(3, 1).toString() + "','" + model.getValueAt(3, 2).toString() + "','" + model.getValueAt(3, 3).toString() + "','" + sum_string4 + "',"
                        + "'" + model.getValueAt(4, 1).toString() + "','" + model.getValueAt(4, 2).toString() + "','" + model.getValueAt(4, 3).toString() + "','" + sum_string5 + "')";
                stmt.executeUpdate(table_sql);
                String user1 = user.getUser();
                All_Data account = new All_Data();
                account.setUser(user1);
                stmt.close();
                c.commit();
                int a = JOptionPane.showConfirmDialog(null, "Please confirm your input:", "Alert", JOptionPane.INFORMATION_MESSAGE);
                if (a == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "Add Sell Complete.", "ALERT", JOptionPane.INFORMATION_MESSAGE);
                    fetchitemDetailsCS();
                    vat.setText("7");
                }
            } else if (namecon.equals(contact_name)) {
                JOptionPane.showMessageDialog(null, "This information could not be added because this person's name already exists in the database.", "ALERT", JOptionPane.ERROR_MESSAGE);
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
        
    }//GEN-LAST:event_AddButtonMouseClicked

    private void jDateChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDateChooser1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser1ActionPerformed

    private void item_sellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_sellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item_sellActionPerformed

    private void RefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RefreshMouseClicked
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) left_table.getModel();
        dtm.setRowCount(0);
        fetchitemDetailsCS();
        vat.setText("7");
        total_amount.setText("0");
    }//GEN-LAST:event_RefreshMouseClicked
    private int count = 0;
    
    private void DelButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DelButton1MouseClicked
        // TODO add your handling code here:
        Connection c = null;
        Statement stmt = null;
        Statement stmt1 = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:database.db");
            c.setAutoCommit(false);
            stmt = c.createStatement();
            stmt1 = c.createStatement();
            DefaultTableModel model = (DefaultTableModel) left_table.getModel();
            String num_text1 = model.getValueAt(0, 2).toString();
            String num_text2 = model.getValueAt(0, 3).toString();
            String num_text3 = model.getValueAt(1, 2).toString();
            String num_text4 = model.getValueAt(1, 3).toString();
            String num_text5 = model.getValueAt(2, 2).toString();
            String num_text6 = model.getValueAt(2, 3).toString();
            String num_text7 = model.getValueAt(3, 2).toString();
            String num_text8 = model.getValueAt(3, 3).toString();
            String num_text9 = model.getValueAt(4, 2).toString();
            String num_text10 = model.getValueAt(4, 3).toString();
            int num1 = Integer.parseInt(num_text1);
            int num2 = Integer.parseInt(num_text2);
            int num3 = Integer.parseInt(num_text3);
            int num4 = Integer.parseInt(num_text4);
            int num5 = Integer.parseInt(num_text5);
            int num6 = Integer.parseInt(num_text6);
            int num7 = Integer.parseInt(num_text7);
            int num8 = Integer.parseInt(num_text8);
            int num9 = Integer.parseInt(num_text9);
            int num10 = Integer.parseInt(num_text10);
            int sum_num1 = num1 * num2;
            int sum_num2 = num3 * num4;
            int sum_num3 = num5 * num6;
            int sum_num4 = num7 * num8;
            int sum_num5 = num9 * num10;
            String sum_string1 = Integer.toString(sum_num1);
            String sum_string2 = Integer.toString(sum_num2);
            String sum_string3 = Integer.toString(sum_num3);
            String sum_string4 = Integer.toString(sum_num4);
            String sum_string5 = Integer.toString(sum_num5);
            String saledete = jDateChooser1.getText();
            String nameemp = name_emp.getText();
            String namecon = name_con.getText();
            String phonecon = phone_con.getText();
            String addresscon = address_con.getText();
            String item_list = item_sell.getText();
            String total = totalText.getText();
            String random_id = getRandomNumberString();
            ResultSet rs1 = stmt.executeQuery("SELECT * FROM sell_data WHERE Contact_Name = '" + namecon + "'");
            String id_product = rs1.getString("PRODUCT_ID");
            rs1.close();

            while (random_id.equals(id_product)) {
                random_id = getRandomNumberString();
                if (!random_id.equals(id_product)) {
                    break;
                }
            }
            
            String sql = ("UPDATE sell_data SET Sale_date = '" + saledete + "',Sale_employee = '" + nameemp + "',Contact_phone = '" + phonecon + "',Contact_address = '" + addresscon + "',Product_list = '" + item_list + "' ,Total = '" + total + "' WHERE Contact_Name = '"+namecon+"'");
            stmt.executeUpdate(sql);

            String table_sql = ("UPDATE product_data SET ITEM1 = '" + model.getValueAt(0, 1).toString() + "',QUANTITY1 = '" + model.getValueAt(0, 2).toString() + "',UNIT1 = '" + model.getValueAt(0, 3).toString() + "',AMOUNT1 = '" + sum_string1 + "',"
                    + "ITEM2 = '" + model.getValueAt(1, 1).toString() + "',QUANTITY2 = '" + model.getValueAt(1, 2).toString() + "',UNIT2 = '" + model.getValueAt(1, 3).toString() + "',AMOUNT2 = '" + sum_string2 + "',"
                    + "ITEM3 = '" + model.getValueAt(2, 1).toString() + "',QUANTITY3 = '" + model.getValueAt(2, 2).toString() + "',UNIT3 = '" + model.getValueAt(2, 3).toString() + "',AMOUNT3 = '" + sum_string3 + "',"
                    + "ITEM4 = '" + model.getValueAt(3, 1).toString() + "',QUANTITY4 = '" + model.getValueAt(3, 2).toString() + "',UNIT4 = '" + model.getValueAt(3, 3).toString() + "',AMOUNT4 = '" + sum_string4 + "',"
                    + "ITEM5 = '" + model.getValueAt(4, 1).toString() + "',QUANTITY5 = '" + model.getValueAt(4, 2).toString() + "',UNIT5 = '" + model.getValueAt(4, 3).toString() + "',AMOUNT5 = '" + sum_string5 + "' WHERE PRODUCT_ID = '"+model.getValueAt(0, 0).toString()+"'");
            stmt1.executeUpdate(table_sql);
            String user1 = user.getUser();
            All_Data account = new All_Data();
            account.setUser(user1);
            stmt.close();
            stmt1.close();
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
            JOptionPane.showMessageDialog(null, "Update Sell Complete.", "ALERT", JOptionPane.INFORMATION_MESSAGE);
            fetchitemDetailsCS();
            vat.setText("7");
        }
    }//GEN-LAST:event_DelButton1MouseClicked

    private void DelButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DelButton1ActionPerformed

    private void calculate_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculate_buttonMouseClicked
        // TODO add your handling code here:
        calculate_vate();
    }//GEN-LAST:event_calculate_buttonMouseClicked

    private void calculate_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculate_buttonActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_calculate_buttonActionPerformed

    private void left_tableMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_left_tableMouseMoved
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) left_table.getModel();
        String num_text1 = model.getValueAt(0, 2).toString();
        String num_text2 = model.getValueAt(0, 3).toString();
        String num_text3 = model.getValueAt(1, 2).toString();
        String num_text4 = model.getValueAt(1, 3).toString();
        String num_text5 = model.getValueAt(2, 2).toString();
        String num_text6 = model.getValueAt(2, 3).toString();
        String num_text7 = model.getValueAt(3, 2).toString();
        String num_text8 = model.getValueAt(3, 3).toString();
        String num_text9 = model.getValueAt(4, 2).toString();
        String num_text10 = model.getValueAt(4, 3).toString();
        int num1 = Integer.parseInt(num_text1);
        int num2 = Integer.parseInt(num_text2);
        int num3 = Integer.parseInt(num_text3);
        int num4 = Integer.parseInt(num_text4);
        int num5 = Integer.parseInt(num_text5);
        int num6 = Integer.parseInt(num_text6);
        int num7 = Integer.parseInt(num_text7);
        int num8 = Integer.parseInt(num_text8);
        int num9 = Integer.parseInt(num_text9);
        int num10 = Integer.parseInt(num_text10);
        int sum_num1 = num1 * num2;
        int sum_num2 = num3 * num4;
        int sum_num3 = num5 * num6;
        int sum_num4 = num7 * num8;
        int sum_num5 = num9 * num10;
        String sum_string1 = Integer.toString(sum_num1);
        String sum_string2 = Integer.toString(sum_num2);
        String sum_string3 = Integer.toString(sum_num3);
        String sum_string4 = Integer.toString(sum_num4);
        String sum_string5 = Integer.toString(sum_num5);
        String d1 = model.getValueAt(0, 0).toString();
        String d2 = model.getValueAt(0, 1).toString();
        String d3 = model.getValueAt(0, 2).toString();
        String d4 = model.getValueAt(0, 3).toString();
        String d5 = model.getValueAt(1, 1).toString();
        String d6 = model.getValueAt(1, 2).toString();
        String d7 = model.getValueAt(1, 3).toString();
        String d8 = model.getValueAt(2, 1).toString();
        String d9 = model.getValueAt(2, 2).toString();
        String d10 = model.getValueAt(2, 3).toString();
        String d11 = model.getValueAt(3, 1).toString();
        String d12 = model.getValueAt(3, 2).toString();
        String d13 = model.getValueAt(3, 3).toString();
        String d14 = model.getValueAt(4, 1).toString();
        String d15 = model.getValueAt(4, 2).toString();
        String d16 = model.getValueAt(4, 3).toString();
        String table_data1[] = {d1, d2, d3, d4,sum_string1};
        String table_data2[] = {d1, d5, d6, d7,sum_string2};
        String table_data3[] = {d1, d8, d9, d10,sum_string3};
        String table_data4[] = {d1, d11, d12, d13,sum_string4};
        String table_data5[] = {d1, d14, d15, d16,sum_string5};
        DefaultTableModel tblModel = (DefaultTableModel) left_table.getModel();
        tblModel.setRowCount(0);
        tblModel.addRow(table_data1);
        tblModel.addRow(table_data2);
        tblModel.addRow(table_data3);
        tblModel.addRow(table_data4);
        tblModel.addRow(table_data5);
        int total_sum = sum_num1 + sum_num2 + sum_num3 + sum_num4 + sum_num5;
        String sum_string = Integer.toString(total_sum);
        total_amount.setText(sum_string);
    }//GEN-LAST:event_left_tableMouseMoved

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
    private javax.swing.JButton DelButton1;
    private javax.swing.JLabel Refresh;
    private javax.swing.JButton Search_Button;
    private javax.swing.JLabel TitleLeftLabel1;
    private javax.swing.JLabel TitleTxtLabel1;
    private javax.swing.JLabel TitleTxtLabel2;
    private javax.swing.JLabel TitleTxtLeftLabel1;
    private javax.swing.JLabel TitleTxtLeftLabel2;
    private javax.swing.JLabel TitleTxtRightLabel1;
    private javax.swing.JLabel TitleTxtRightLabel2;
    private javax.swing.JLabel TxtPtotalLabel1;
    private javax.swing.JLabel TxtTotalLabel1;
    private javax.swing.JLabel TxtVATLabel2;
    private javax.swing.JTextField address_con;
    private javax.swing.JButton calculate_button;
    private javax.swing.JTextField item_sell;
    private javax.swing.JLabel jBack;
    private javax.swing.JButton jButtonlogout;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JTextField jDateChooser1;
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
    private javax.swing.JTextField searchbox;
    private javax.swing.JTextField totalText;
    private javax.swing.JTextField total_amount;
    private javax.swing.JTextField vat;
    // End of variables declaration//GEN-END:variables
}
