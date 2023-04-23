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
/**
 *
 * @author theet
 */
public class employee_search extends javax.swing.JFrame {
    SimpleDateFormat timeFormat;
    SimpleDateFormat dateFormat;
    String time;
    String date;
    private All_Data user;
    /**
     * Creates new form employee_search
     */
    public employee_search(All_Data a1) {
        initComponents();
        this.user = a1;
        search();
        Start();
        //Setvisible_False();
    }
    
    public void Start(){
        setDate();
        setTime();
    }
    
    public void search(){
        String a1 = user.getID();
        Search_id_employee.setText(a1);
        search_enable();
    }
    
    public void search_enable(){
        Connection c = null;
        Statement stmt = null;
        Button_save_profile.setVisible(false);
        Button_edit_profile.setVisible(true);
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:database.db");
            c.setAutoCommit(false);
            stmt = c.createStatement();
            String id_employ1 = Search_id_employee.getText();
            ResultSet rs = stmt.executeQuery( "SELECT * FROM employee_data WHERE id_employee = '"+id_employ1+"'" );
            String  first = rs.getString("first_name");
            String  last = rs.getString("last_name");
            String nick = rs.getString("nick_name");
            String  posi = rs.getString("position");
            String  age1 = rs.getString("age");
            String  eth = rs.getString("ethnicity");
            String  nation = rs.getString("nationality");
            String  reli = rs.getString("religion");
            String  birthday1 = rs.getString("birthday");
            String  card = rs.getString("id_card");
            String  current = rs.getString("current_address");
            String  dis_1 = rs.getString("district_1");
            String  dis_2 = rs.getString("district_2");
            String  phone = rs.getString("phone_number");
            String  pro = rs.getString("province");
            String  fname = rs.getString("father_name");
            String  fage = rs.getString("father_age");
            String  feth = rs.getString("father_ethnicity");
            String  fnation = rs.getString("father_nationality");
            String  foccu = rs.getString("father_occupation");
            String  mname = rs.getString("mother_name");
            String  mage = rs.getString("mother_age");
            String  meth = rs.getString("mother_ethnicity");
            String  mnation = rs.getString("mother_nationality");
            String  moccu = rs.getString("mother_occupation");
            String  howname = rs.getString("husband_or_wife_name");
            String  howage = rs.getString("husband_or_wife_age");
            String  howeth = rs.getString("husband_or_wife_ethnicity");
            String  howphone = rs.getString("husband_or_wife_phone");
            String  hownation = rs.getString("husband_or_wife_nationality");
            String  howoccu = rs.getString("husband_or_wife_occupation");
            String  howwork = rs.getString("husband_or_wife_workplace");
            String  howposi = rs.getString("husband_or_wife_position");
            String  glvl = rs.getString("graduated_level");
            String  nopog = rs.getString("name_of_place_of_graduation");
            String  gsof = rs.getString("graduated_subject_or_field");
            String  workhis = rs.getString("work_history");
            String  offname = rs.getString("office_name");
            String  oldposi = rs.getString("old_position");
            String  start1 = rs.getString("start");
            String  stop1 = rs.getString("stop");
            String  reason_re = rs.getString("reason_for_resignation");
            String  reason_wan = rs.getString("reasons_for_wanting_to_work_here");
            String  id_employ = rs.getString("id_employee");
            if(id_employ1.equals(id_employ)){
                    //Setvisible_True();
                    first_name.setText(first);
                    last_name.setText(last);
                    nickname.setText(nick);
                    position.setSelectedItem(posi);
                    age.setText(age1);
                    ethnicity.setText(eth);
                    nationality.setText(nation);
                    religion.setText(reli);
                    birthday.setText(birthday1);
                    id_card.setText(card);
                    current_address.setText(current);
                    district_1.setText(dis_1);
                    district_2.setText(dis_2);
                    phone_number.setText(phone);
                    province.setText(pro);
                    father_name.setText(fname);
                    father_age.setText(fage);
                    father_ethnicity.setText(feth);
                    father_nationality.setText(fnation);
                    father_occupation.setText(foccu);
                    mother_name.setText(mname);
                    mother_age.setText(mage);
                    mother_ethnicity.setText(meth);
                    mother_nationality.setText(mnation);
                    mother_occupation.setText(moccu);
                    husband_or_wife_name.setText(howname);
                    husband_or_wife_age.setText(howage);
                    husband_or_wife_ethnicity.setText(howeth);
                    husband_or_wife_phone.setText(howphone);
                    husband_or_wife_nationality.setText(hownation);
                    husband_or_wife_occupation.setText(howoccu);
                    husband_or_wife_workplace.setText(howwork);
                    husband_or_wife_position.setText(howposi);
                    education_level.setText(glvl);
                    name_place_graduated.setText(nopog);
                    graduated_subject.setText(gsof);
                    work_history.setText(workhis);
                    office_name.setText(offname);
                    old_position.setText(oldposi);
                    start.setText(start1);
                    stop.setText(stop1);
                    reason_for_resignation.setText(reason_re);
                    reason_for_wanting_to_work_here.setText(reason_wan);
                    edit_disable();
                    rs.close();
                    stmt.close();
                    c.close();
            }
            else{
                    JOptionPane.showMessageDialog(null, "This id_card has not been registered.",
                        "ALERT", JOptionPane.WARNING_MESSAGE);
            }
        }
        catch ( Exception b ) {
            System.err.println( b.getClass().getName() + ": " + b.getMessage() );
            System.exit(0);
        }
    }
    
    /*public void Setvisible_False(){
        first_name.setVisible(false);
        last_name.setVisible(false);
        nickname.setVisible(false);
        position.setVisible(false);
        age.setVisible(false);
        ethnicity.setVisible(false);
        nationality.setVisible(false);
        religion.setVisible(false);
        birthday.setVisible(false);
        id_card.setVisible(false);
        current_address.setVisible(false);
        district_1.setVisible(false);
        district_2.setVisible(false);
        phone_number.setVisible(false);
        province.setVisible(false);
        father_name.setVisible(false);
        father_age.setVisible(false);
        father_ethnicity.setVisible(false);
        father_nationality.setVisible(false);
        father_occupation.setVisible(false);
        mother_name.setVisible(false);
        mother_age.setVisible(false);
        mother_ethnicity.setVisible(false);
        mother_nationality.setVisible(false);
        mother_occupation.setVisible(false);
        husband_or_wife_name.setVisible(false);
        husband_or_wife_age.setVisible(false);
        husband_or_wife_ethnicity.setVisible(false);
        husband_or_wife_phone.setVisible(false);
        husband_or_wife_nationality.setVisible(false);
        husband_or_wife_occupation.setVisible(false);
        husband_or_wife_workplace.setVisible(false);
        husband_or_wife_position.setVisible(false);
        education_level.setVisible(false);
        name_place_graduated.setVisible(false);
        graduated_subject.setVisible(false);
        work_history.setVisible(false);
        office_name.setVisible(false);
        old_position.setVisible(false);
        start.setVisible(false);
        stop.setVisible(false);
        reason_for_resignation.setVisible(false);
        reason_for_wanting_to_work_here.setVisible(false);
        Button_edit_profile.setVisible(false);
        Button_save_profile.setVisible(false);
        label1.setVisible(false);
        label2.setVisible(false);
        label3.setVisible(false);
        label4.setVisible(false);
        label5.setVisible(false);
        label6.setVisible(false);
        label7.setVisible(false);
        label8.setVisible(false);
        label9.setVisible(false);
        label10.setVisible(false);
        label11.setVisible(false);
        label12.setVisible(false);
        label13.setVisible(false);
        label14.setVisible(false);
        label15.setVisible(false);
        label16.setVisible(false);
        label17.setVisible(false);
        label18.setVisible(false);
        label19.setVisible(false);
        label20.setVisible(false);
        label21.setVisible(false);
        label22.setVisible(false);
        label23.setVisible(false);
        label24.setVisible(false);
        label25.setVisible(false);
        label26.setVisible(false);
        label27.setVisible(false);
        label28.setVisible(false);
        label29.setVisible(false);
        label30.setVisible(false);
        label31.setVisible(false);
        label32.setVisible(false);
        label33.setVisible(false);
        label34.setVisible(false);
        label35.setVisible(false);
        label36.setVisible(false);
        label37.setVisible(false);
        label38.setVisible(false);
        label39.setVisible(false);
        label40.setVisible(false);
        label41.setVisible(false);
        label42.setVisible(false);
        label43.setVisible(false);
        label44.setVisible(false);
    }*/
    
    /*public void Setvisible_True(){
        first_name.setVisible(true);
        last_name.setVisible(true);
        nickname.setVisible(true);
        position.setVisible(true);
        age.setVisible(true);
        ethnicity.setVisible(true);
        nationality.setVisible(true);
        religion.setVisible(true);
        birthday.setVisible(true);
        id_card.setVisible(true);
        current_address.setVisible(true);
        district_1.setVisible(true);
        district_2.setVisible(true);
        phone_number.setVisible(true);
        province.setVisible(true);
        father_name.setVisible(true);
        father_age.setVisible(true);
        father_ethnicity.setVisible(true);
        father_nationality.setVisible(true);
        father_occupation.setVisible(true);
        mother_name.setVisible(true);
        mother_age.setVisible(true);
        mother_ethnicity.setVisible(true);
        mother_nationality.setVisible(true);
        mother_occupation.setVisible(true);
        husband_or_wife_name.setVisible(true);
        husband_or_wife_age.setVisible(true);
        husband_or_wife_ethnicity.setVisible(true);
        husband_or_wife_phone.setVisible(true);
        husband_or_wife_nationality.setVisible(true);
        husband_or_wife_occupation.setVisible(true);
        husband_or_wife_workplace.setVisible(true);
        husband_or_wife_position.setVisible(true);
        education_level.setVisible(true);
        name_place_graduated.setVisible(true);
        graduated_subject.setVisible(true);
        work_history.setVisible(true);
        office_name.setVisible(true);
        old_position.setVisible(true);
        start.setVisible(true);
        stop.setVisible(true);
        reason_for_resignation.setVisible(true);
        reason_for_wanting_to_work_here.setVisible(true);
        Button_edit_profile.setVisible(true);
        label1.setVisible(true);
        label2.setVisible(true);
        label3.setVisible(true);
        label4.setVisible(true);
        label5.setVisible(true);
        label6.setVisible(true);
        label7.setVisible(true);
        label8.setVisible(true);
        label9.setVisible(true);
        label10.setVisible(true);
        label11.setVisible(true);
        label12.setVisible(true);
        label13.setVisible(true);
        label14.setVisible(true);
        label15.setVisible(true);
        label16.setVisible(true);
        label17.setVisible(true);
        label18.setVisible(true);
        label19.setVisible(true);
        label20.setVisible(true);
        label21.setVisible(true);
        label22.setVisible(true);
        label23.setVisible(true);
        label24.setVisible(true);
        label25.setVisible(true);
        label26.setVisible(true);
        label27.setVisible(true);
        label28.setVisible(true);
        label29.setVisible(true);
        label30.setVisible(true);
        label31.setVisible(true);
        label32.setVisible(true);
        label33.setVisible(true);
        label34.setVisible(true);
        label35.setVisible(true);
        label36.setVisible(true);
        label37.setVisible(true);
        label38.setVisible(true);
        label39.setVisible(true);
        label40.setVisible(true);
        label41.setVisible(true);
        label42.setVisible(true);
        label43.setVisible(true);
        label44.setVisible(true);
    }*/
    
    public void edit_disable(){
        first_name.setEditable(false);
        last_name.setEditable(false);
        nickname.setEditable(false);
        position.setEditable(false);
        position.setEnabled(false);
        age.setEditable(false);
        ethnicity.setEditable(false);
        nationality.setEditable(false);
        religion.setEditable(false);
        birthday.setEditable(false);
        id_card.setEditable(false);
        current_address.setEditable(false);
        district_1.setEditable(false);
        district_2.setEditable(false);
        phone_number.setEditable(false);
        province.setEditable(false);
        father_name.setEditable(false);
        father_age.setEditable(false);
        father_ethnicity.setEditable(false);
        father_nationality.setEditable(false);
        father_occupation.setEditable(false);
        mother_name.setEditable(false);
        mother_age.setEditable(false);
        mother_ethnicity.setEditable(false);
        mother_nationality.setEditable(false);
        mother_occupation.setEditable(false);
        husband_or_wife_name.setEditable(false);
        husband_or_wife_age.setEditable(false);
        husband_or_wife_ethnicity.setEditable(false);
        husband_or_wife_phone.setEditable(false);
        husband_or_wife_nationality.setEditable(false);
        husband_or_wife_occupation.setEditable(false);
        husband_or_wife_workplace.setEditable(false);
        husband_or_wife_position.setEditable(false);
        education_level.setEditable(false);
        name_place_graduated.setEditable(false);
        graduated_subject.setEditable(false);
        work_history.setEditable(false);
        office_name.setEditable(false);
        old_position.setEditable(false);
        start.setEditable(false);
        stop.setEditable(false);
        reason_for_resignation.setEditable(false);
        reason_for_wanting_to_work_here.setEditable(false);
    }
    
     public void edit_enable(){
        nickname.setEditable(true);
        position.setEditable(true);
        position.setEnabled(true);
        age.setEditable(true);
        ethnicity.setEditable(true);
        nationality.setEditable(true);
        religion.setEditable(true);
        birthday.setEditable(true);
        current_address.setEditable(true);
        district_1.setEditable(true);
        district_2.setEditable(true);
        phone_number.setEditable(true);
        province.setEditable(true);
        father_name.setEditable(true);
        father_age.setEditable(true);
        father_ethnicity.setEditable(true);
        father_nationality.setEditable(true);
        father_occupation.setEditable(true);
        mother_name.setEditable(true);
        mother_age.setEditable(true);
        mother_ethnicity.setEditable(true);
        mother_nationality.setEditable(true);
        mother_occupation.setEditable(true);
        husband_or_wife_name.setEditable(true);
        husband_or_wife_age.setEditable(true);
        husband_or_wife_ethnicity.setEditable(true);
        husband_or_wife_phone.setEditable(true);
        husband_or_wife_nationality.setEditable(true);
        husband_or_wife_occupation.setEditable(true);
        husband_or_wife_workplace.setEditable(true);
        husband_or_wife_position.setEditable(true);
        education_level.setEditable(true);
        name_place_graduated.setEditable(true);
        graduated_subject.setEditable(true);
        work_history.setEditable(true);
        office_name.setEditable(true);
        old_position.setEditable(true);
        start.setEditable(true);
        stop.setEditable(true);
        reason_for_resignation.setEditable(true);
        reason_for_wanting_to_work_here.setEditable(true);
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
                jLabelTime1.setText(time);
            }
        };
        timer.scheduleAtFixedRate(task, 0, 1000);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabelProgram = new javax.swing.JLabel();
        jLabelTime1 = new javax.swing.JLabel();
        jLabelDate = new javax.swing.JLabel();
        jfirstname_lastname = new javax.swing.JLabel();
        jButtonlogout = new javax.swing.JButton();
        jBack = new javax.swing.JLabel();
        Search_id_employee = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        label37 = new javax.swing.JLabel();
        stop = new javax.swing.JTextField();
        label38 = new javax.swing.JLabel();
        reason_for_resignation = new javax.swing.JTextField();
        label39 = new javax.swing.JLabel();
        label41 = new javax.swing.JLabel();
        label42 = new javax.swing.JLabel();
        label43 = new javax.swing.JLabel();
        reason_for_wanting_to_work_here = new javax.swing.JTextField();
        label3 = new javax.swing.JLabel();
        first_name = new javax.swing.JTextField();
        label2 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        last_name = new javax.swing.JTextField();
        ethnicity = new javax.swing.JTextField();
        nationality = new javax.swing.JTextField();
        label4 = new javax.swing.JLabel();
        religion = new javax.swing.JTextField();
        label5 = new javax.swing.JLabel();
        birthday = new javax.swing.JTextField();
        label6 = new javax.swing.JLabel();
        id_card = new javax.swing.JTextField();
        label7 = new javax.swing.JLabel();
        current_address = new javax.swing.JTextField();
        label8 = new javax.swing.JLabel();
        district_1 = new javax.swing.JTextField();
        label9 = new javax.swing.JLabel();
        district_2 = new javax.swing.JTextField();
        label10 = new javax.swing.JLabel();
        label11 = new javax.swing.JLabel();
        label12 = new javax.swing.JLabel();
        label14 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        phone_number = new javax.swing.JTextField();
        province = new javax.swing.JTextField();
        father_name = new javax.swing.JTextField();
        mother_name = new javax.swing.JTextField();
        label13 = new javax.swing.JLabel();
        father_age = new javax.swing.JTextField();
        label15 = new javax.swing.JLabel();
        mother_age = new javax.swing.JTextField();
        label16 = new javax.swing.JLabel();
        father_ethnicity = new javax.swing.JTextField();
        label17 = new javax.swing.JLabel();
        mother_ethnicity = new javax.swing.JTextField();
        label18 = new javax.swing.JLabel();
        father_nationality = new javax.swing.JTextField();
        label19 = new javax.swing.JLabel();
        mother_nationality = new javax.swing.JTextField();
        label20 = new javax.swing.JLabel();
        label21 = new javax.swing.JLabel();
        label22 = new javax.swing.JLabel();
        label23 = new javax.swing.JLabel();
        husband_or_wife_name = new javax.swing.JTextField();
        husband_or_wife_age = new javax.swing.JTextField();
        father_occupation = new javax.swing.JTextField();
        mother_occupation = new javax.swing.JTextField();
        label24 = new javax.swing.JLabel();
        husband_or_wife_ethnicity = new javax.swing.JTextField();
        label25 = new javax.swing.JLabel();
        husband_or_wife_phone = new javax.swing.JTextField();
        label26 = new javax.swing.JLabel();
        husband_or_wife_nationality = new javax.swing.JTextField();
        label29 = new javax.swing.JLabel();
        husband_or_wife_occupation = new javax.swing.JTextField();
        label27 = new javax.swing.JLabel();
        husband_or_wife_workplace = new javax.swing.JTextField();
        label30 = new javax.swing.JLabel();
        husband_or_wife_position = new javax.swing.JTextField();
        label31 = new javax.swing.JLabel();
        label32 = new javax.swing.JLabel();
        label28 = new javax.swing.JLabel();
        education_level = new javax.swing.JTextField();
        name_place_graduated = new javax.swing.JTextField();
        graduated_subject = new javax.swing.JTextField();
        work_history = new javax.swing.JTextField();
        label33 = new javax.swing.JLabel();
        office_name = new javax.swing.JTextField();
        label34 = new javax.swing.JLabel();
        old_position = new javax.swing.JTextField();
        label35 = new javax.swing.JLabel();
        label40 = new javax.swing.JLabel();
        label36 = new javax.swing.JLabel();
        start = new javax.swing.JTextField();
        Button_save_profile = new javax.swing.JButton();
        Button_edit_profile = new javax.swing.JButton();
        label44 = new javax.swing.JLabel();
        nickname = new javax.swing.JTextField();
        position = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabelProgram.setBackground(new java.awt.Color(255, 255, 255));
        jLabelProgram.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabelProgram.setForeground(new java.awt.Color(255, 255, 255));
        jLabelProgram.setText("Search Employee");

        jLabelTime1.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabelTime1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTime1.setText("Time");

        jLabelDate.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabelDate.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDate.setText("Date");

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

        jButtonlogout.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButtonlogout.setForeground(new java.awt.Color(255, 51, 51));
        jButtonlogout.setText("Logout");
        jButtonlogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonlogoutMouseClicked(evt);
            }
        });

        jBack.setFont(new java.awt.Font("Leelawadee UI", 0, 36)); // NOI18N
        jBack.setForeground(new java.awt.Color(255, 255, 255));
        jBack.setText("Back");
        jBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelTime1)
                        .addGap(30, 30, 30)
                        .addComponent(jLabelDate))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jBack)
                        .addGap(652, 652, 652)
                        .addComponent(jLabelProgram)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 653, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jfirstname_lastname, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonlogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTime1)
                    .addComponent(jLabelDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelProgram, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBack, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jfirstname_lastname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 35, Short.MAX_VALUE))))
        );

        Search_id_employee.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Search_id_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_id_employeeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel1.setText("ID Employee : ");

        label37.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        label37.setText("ประวัติการทำงาน");

        stop.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        label38.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        label38.setText("ชื่อสำนักงาน");

        reason_for_resignation.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        label39.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        label39.setText("ตำเเหน่ง");

        label41.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        label41.setText("ถึงวันที่");

        label42.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        label42.setText("เหตุผลที่ออก");

        label43.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        label43.setText("เหตุผลที่อยากมาทำงานที่นี่คืออะไร");

        reason_for_wanting_to_work_here.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        label3.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        label3.setText("ตำเเหน่งงานที่มาสมัคร");

        first_name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        label2.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        label2.setText("นามสกุล");

        age.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        last_name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        ethnicity.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        nationality.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        label4.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        label4.setText("อายุ");

        religion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        label5.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        label5.setText("เชื้อชาติ");

        birthday.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        label6.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        label6.setText("สัญชาติ");

        id_card.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        label7.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        label7.setText("ศาสนา");

        current_address.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        label8.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        label8.setText("วัน/เดือน/ปีเกิด");

        district_1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        district_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                district_1ActionPerformed(evt);
            }
        });

        label9.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        label9.setText("บัตรประชาชน");

        district_2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        label10.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        label10.setText("ที่อยู่ปัจจุบัน");

        label11.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        label11.setText("ตำบล");

        label12.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        label12.setText("อำเภอ");

        label14.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        label14.setText("จังหวัด");

        label1.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        label1.setText("ชื่อ");

        phone_number.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        province.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        father_name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        mother_name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        label13.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        label13.setText("เบอร์โทรศัพท์");

        father_age.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        father_age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                father_ageActionPerformed(evt);
            }
        });

        label15.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        label15.setText("ชื่อบิดา");

        mother_age.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        label16.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        label16.setText("อายุ");

        father_ethnicity.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        label17.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        label17.setText("เชื้อชาติ");

        mother_ethnicity.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        label18.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        label18.setText("สัญชาติ");

        father_nationality.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        label19.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        label19.setText("อาชีพ");

        mother_nationality.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        label20.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        label20.setText("ชื่อมารดา");

        label21.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        label21.setText("อายุ");

        label22.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        label22.setText("เชื้อชาติ");

        label23.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        label23.setText("สัญชาติ");

        husband_or_wife_name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        husband_or_wife_age.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        father_occupation.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        mother_occupation.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        label24.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        label24.setText("อาชีพ");

        husband_or_wife_ethnicity.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        label25.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        label25.setText("สามี/ภรรยา ชื่อ-นามสกุล");

        husband_or_wife_phone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        label26.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        label26.setText("อายุ");

        husband_or_wife_nationality.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        label29.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        label29.setText("สัญชาติ");

        husband_or_wife_occupation.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        husband_or_wife_occupation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                husband_or_wife_occupationActionPerformed(evt);
            }
        });

        label27.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        label27.setText("เชื้อชาติ");

        husband_or_wife_workplace.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        husband_or_wife_workplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                husband_or_wife_workplaceActionPerformed(evt);
            }
        });

        label30.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        label30.setText("อาชีพ");

        husband_or_wife_position.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        label31.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        label31.setText("ที่ทำงาน");

        label32.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        label32.setText("ตำเเหน่ง");

        label28.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        label28.setText("เบอร์โทรศัพท์");

        education_level.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        name_place_graduated.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        graduated_subject.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        work_history.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        label33.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        label33.setText("ประวัติการศึกษา");

        office_name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        label34.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        label34.setText("จบการศึกษาระดับ");

        old_position.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        label35.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        label35.setText("ชื่อสถานที่ที่จบการศึกษา");

        label40.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        label40.setText("เริ่มทำงานตั้งเเต่วันที่");

        label36.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        label36.setText("วิชา/สาขาที่จบมา");

        start.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        Button_save_profile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Button_save_profile.setText("Save Profile");
        Button_save_profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_save_profileMouseClicked(evt);
            }
        });
        Button_save_profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_save_profileActionPerformed(evt);
            }
        });

        Button_edit_profile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Button_edit_profile.setText("Edit Profile");
        Button_edit_profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_edit_profileMouseClicked(evt);
            }
        });

        label44.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        label44.setText("ชื่อเล่นภาษาอังกฤษ");

        position.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IT", "CEO", "เลขานุการ", "พนักงาน", "พนักงานขนส่ง" }));
        position.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(label20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mother_name))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(father_name)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mother_age, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mother_ethnicity))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(father_age, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(father_ethnicity, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label18)
                                    .addComponent(label23)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(label11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(district_1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(label12))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(label4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(label5)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(ethnicity, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(label6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nationality, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(label7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(religion, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(district_2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(label13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(phone_number, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(label14)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(province, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(label1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(first_name, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(last_name, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(position, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label44)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nickname, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(father_nationality, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(father_occupation, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mother_nationality, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mother_occupation, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(69, 69, 69))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(current_address, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(birthday, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(id_card, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(husband_or_wife_name, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(husband_or_wife_age, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(husband_or_wife_ethnicity, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(husband_or_wife_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(work_history, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(husband_or_wife_nationality, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(husband_or_wife_occupation, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(husband_or_wife_workplace, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(education_level, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(name_place_graduated, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(graduated_subject, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(husband_or_wife_position, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(label33)
                            .addComponent(label37)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label38)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(office_name, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label39)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(old_position, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label40)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label41)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(stop, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label42)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(reason_for_resignation))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label43)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(reason_for_wanting_to_work_here, javax.swing.GroupLayout.PREFERRED_SIZE, 975, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Button_save_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Button_edit_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(643, 643, 643)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Search_id_employee, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Search_id_employee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label1)
                            .addComponent(first_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3)
                            .addComponent(label2)
                            .addComponent(last_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(position, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nickname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label44, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label4)
                    .addComponent(label5)
                    .addComponent(label6)
                    .addComponent(label7)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ethnicity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(religion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label8)
                    .addComponent(label9)
                    .addComponent(birthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_card, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label10)
                    .addComponent(current_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label11)
                    .addComponent(label12)
                    .addComponent(label14)
                    .addComponent(label13)
                    .addComponent(district_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phone_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(province, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(district_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label15)
                    .addComponent(label16)
                    .addComponent(label17)
                    .addComponent(label18)
                    .addComponent(label19)
                    .addComponent(father_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(father_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(father_ethnicity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(father_nationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(father_occupation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label20)
                    .addComponent(label21)
                    .addComponent(label22)
                    .addComponent(label23)
                    .addComponent(label24)
                    .addComponent(mother_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mother_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mother_ethnicity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mother_nationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mother_occupation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label25)
                    .addComponent(label26)
                    .addComponent(label27)
                    .addComponent(label28)
                    .addComponent(husband_or_wife_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(husband_or_wife_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(husband_or_wife_ethnicity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(husband_or_wife_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label29)
                    .addComponent(label30)
                    .addComponent(label31)
                    .addComponent(husband_or_wife_nationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(husband_or_wife_occupation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(husband_or_wife_workplace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label32)
                    .addComponent(husband_or_wife_position, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(label33)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label34)
                    .addComponent(label35)
                    .addComponent(label36)
                    .addComponent(education_level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name_place_graduated, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(graduated_subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label37)
                    .addComponent(work_history, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label38)
                    .addComponent(label39)
                    .addComponent(label41)
                    .addComponent(office_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(old_position, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label40)
                    .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label42)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(reason_for_resignation, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label43)
                    .addComponent(reason_for_wanting_to_work_here, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Button_edit_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Button_save_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jButtonlogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonlogoutMouseClicked
        // TODO add your handling code here:
        login_ui show = new login_ui();
        show.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonlogoutMouseClicked

    private void jBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBackMouseClicked
        // TODO add your handling code here:
        String a1 = user.getUser();
        String a2 = user.getFirst();
        All_Data account = new All_Data();
        account.setUser(a1);
        account.setFirst(a2);
        employee_history_ui employee_history = new employee_history_ui(account);
        employee_history.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBackMouseClicked

    private void Search_id_employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_id_employeeActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Search_id_employeeActionPerformed

    private void district_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_district_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_district_1ActionPerformed

    private void father_ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_father_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_father_ageActionPerformed

    private void husband_or_wife_occupationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_husband_or_wife_occupationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_husband_or_wife_occupationActionPerformed

    private void husband_or_wife_workplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_husband_or_wife_workplaceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_husband_or_wife_workplaceActionPerformed

    private void Button_save_profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_save_profileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_save_profileActionPerformed

    private void Button_edit_profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_edit_profileMouseClicked
        // TODO add your handling code here:
        Button_edit_profile.setVisible(false);
        Button_save_profile.setVisible(true);
        edit_enable();
    }//GEN-LAST:event_Button_edit_profileMouseClicked

    private void Button_save_profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_save_profileMouseClicked
        // TODO add your handling code here:
        Connection c = null;
        Statement stmt = null;
                try {
                    Class.forName("org.sqlite.JDBC");
                    c = DriverManager.getConnection("jdbc:sqlite:database.db");
                    c.setAutoCommit(false);
                    stmt = c.createStatement();
                    String a1 = first_name.getText();
                    String a2 = last_name.getText();
                    String a3 = position.getSelectedItem().toString();
                    String a4 = age.getText();
                    String a5 = ethnicity.getText();
                    String a6 = nationality.getText();
                    String a7 = religion.getText();
                    String a8 = birthday.getText();
                    String a9 = id_card.getText();
                    String a10 = current_address.getText();
                    String a11 = district_1.getText();
                    String a12 = district_2.getText();
                    String a13 = phone_number.getText();
                    String a14 = province.getText();
                    String a15 = father_name.getText();
                    String a16 = father_age.getText();
                    String a17 = father_ethnicity.getText();
                    String a18 = father_nationality.getText();
                    String a19 = father_occupation.getText();
                    String a20 = mother_name.getText();
                    String a21 = mother_age.getText();
                    String a22 = mother_ethnicity.getText();
                    String a23 = mother_nationality.getText();
                    String a24 = mother_occupation.getText();
                    String a25 = husband_or_wife_name.getText();
                    String a26 = husband_or_wife_age.getText();
                    String a27 = husband_or_wife_ethnicity.getText();
                    String a28 = husband_or_wife_phone.getText();
                    String a29 = husband_or_wife_nationality.getText();
                    String a30 = husband_or_wife_occupation.getText();
                    String a31 = husband_or_wife_workplace.getText();
                    String a32 = husband_or_wife_position.getText();
                    String a33 = education_level.getText();
                    String a34 = name_place_graduated.getText();
                    String a35 = graduated_subject.getText();
                    String a36 = work_history.getText();
                    String a37 = office_name.getText();
                    String a38 = old_position.getText();
                    String a39 = start.getText();
                    String a40 = stop.getText();
                    String a41 = reason_for_resignation.getText();
                    String a42 = reason_for_wanting_to_work_here.getText();
                    String a43 = Search_id_employee.getText();
                    String a44 = nickname.getText();
                    ResultSet rs = stmt.executeQuery( "SELECT * FROM employee_data WHERE id_card = '"+a9+"'" );
                    String  first = rs.getString("first_name");
                    String  card = rs.getString("id_card");
                    
                    if (a1.equals(first) && a9.equals(card) && a1.equals("") && a2.equals("") && a3.equals("") && a4.equals("") && a5.equals("") && a6.equals("") && a7.equals("") && a8.equals("") && a9.equals("") && a10.equals("") && 
                            a11.equals("") && a12.equals("") && a13.equals("") && a14.equals("") && a15.equals("") && a16.equals("") && a17.equals("") && a18.equals("") && a19.equals("") && a20.equals("") && 
                            a21.equals("") && a22.equals("") && a23.equals("") && a24.equals("") && a25.equals("") && a26.equals("") && a27.equals("") && a28.equals("") && a29.equals("") && a30.equals("") && 
                            a31.equals("") && a32.equals("") && a33.equals("") && a34.equals("") && a35.equals("") && a36.equals("") && a37.equals("") && a38.equals("") && a39.equals("") && a40.equals("") && 
                            a41.equals("") && a42.equals("")){
                        JOptionPane.showMessageDialog(null, "Please fill in all the blanks.",
                        "ALERT", JOptionPane.WARNING_MESSAGE);
                    }
                    else if (!a1.equals("") && !a2.equals("") && !a3.equals("") && !a4.equals("") && !a5.equals("") && !a6.equals("") && !a7.equals("") && !a8.equals("") && !a9.equals("") && !a10.equals("") && 
                            !a11.equals("") && !a12.equals("") && !a13.equals("") && !a14.equals("") && !a15.equals("") && !a16.equals("") && !a17.equals("") && !a18.equals("") && !a19.equals("") && !a20.equals("") && 
                            !a21.equals("") && !a22.equals("") && !a23.equals("") && !a24.equals("") && !a25.equals("") && !a26.equals("") && !a27.equals("") && !a28.equals("") && !a29.equals("") && !a30.equals("") && 
                            !a31.equals("") && !a32.equals("") && !a33.equals("") && !a34.equals("") && !a35.equals("") && !a36.equals("") && !a37.equals("") && !a38.equals("") && !a39.equals("") && !a40.equals("") && 
                            !a41.equals("") && !a42.equals("")){
                        String sql = ("UPDATE employee_data SET position = '"+a3+"',age = '"+a4+"',ethnicity = '"+a5+"',nationality = '"+a6+"',religion = '"+a7+"',birthday = '"+a8+"',current_address = '"+a10+"',district_1 = '"+a11+"',district_2 = '"+a12+"',"
                                + "phone_number = '"+a13+"',province = '"+a14+"',father_name = '"+a15+"',father_age = '"+a16+"',father_ethnicity = '"+a17+"',father_nationality = '"+a18+"',father_occupation = '"+a19+"',mother_name = '"+a20+"',mother_age = '"+a21+"',"
                                + "mother_ethnicity = '"+a22+"',mother_nationality = '"+a23+"',mother_occupation = '"+a24+"',husband_or_wife_name = '"+a25+"',husband_or_wife_age = '"+a26+"',"
                                + "husband_or_wife_ethnicity = '"+a27+"',husband_or_wife_phone = '"+a28+"',husband_or_wife_nationality = '"+a29+"',husband_or_wife_occupation = '"+a30+"',husband_or_wife_workplace = '"+a31+"',"
                                + "husband_or_wife_position = '"+a32+"',graduated_level = '"+a33+"',name_of_place_of_graduation = '"+a34+"',graduated_subject_or_field = '"+a35+"',work_history = '"+a36+"',office_name = '"+a37+"',"
                                + "old_position = '"+a38+"',start = '"+a39+"',stop = '"+a40+"',reason_for_resignation = '"+a41+"',reasons_for_wanting_to_work_here = '"+a42+"',nick_name = '"+a44+"' WHERE id_employee = '"+a43+"'");
                        stmt.executeUpdate(sql);
                        String a45 = nickname.getText().toLowerCase();
                        String sql1 = ("UPDATE user_data SET username = '"+a45+"',position = '"+a3+"'  WHERE first_name = '"+a1+"'");
                        stmt.executeUpdate(sql1);
                        JOptionPane.showMessageDialog(null, "Update Profile is Successfully",
                                "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
                        Button_save_profile.setVisible(false);
                        Button_edit_profile.setVisible(true);
                        edit_disable();
                        c.commit();
                        stmt.close();
                        rs.close();
                    }           
                } 
                catch ( Exception b ) {
                   if (c != null) {
                        try {
                            c.rollback();
                        } catch (Exception ex) {
                         }
                    }
                }
                finally{
                    if (c != null) {
                        try {
                            c.close();
                        } catch (Exception ex) {
                        }
                    }
                }    
    }//GEN-LAST:event_Button_save_profileMouseClicked

    private void positionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_positionActionPerformed

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
            java.util.logging.Logger.getLogger(employee_search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employee_search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employee_search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employee_search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employee_search(new All_Data()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_edit_profile;
    private javax.swing.JButton Button_save_profile;
    private javax.swing.JTextField Search_id_employee;
    private javax.swing.JTextField age;
    private javax.swing.JTextField birthday;
    private javax.swing.JTextField current_address;
    private javax.swing.JTextField district_1;
    private javax.swing.JTextField district_2;
    private javax.swing.JTextField education_level;
    private javax.swing.JTextField ethnicity;
    private javax.swing.JTextField father_age;
    private javax.swing.JTextField father_ethnicity;
    private javax.swing.JTextField father_name;
    private javax.swing.JTextField father_nationality;
    private javax.swing.JTextField father_occupation;
    private javax.swing.JTextField first_name;
    private javax.swing.JTextField graduated_subject;
    private javax.swing.JTextField husband_or_wife_age;
    private javax.swing.JTextField husband_or_wife_ethnicity;
    private javax.swing.JTextField husband_or_wife_name;
    private javax.swing.JTextField husband_or_wife_nationality;
    private javax.swing.JTextField husband_or_wife_occupation;
    private javax.swing.JTextField husband_or_wife_phone;
    private javax.swing.JTextField husband_or_wife_position;
    private javax.swing.JTextField husband_or_wife_workplace;
    private javax.swing.JTextField id_card;
    private javax.swing.JLabel jBack;
    private javax.swing.JButton jButtonlogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelProgram;
    private javax.swing.JLabel jLabelTime1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jfirstname_lastname;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label10;
    private javax.swing.JLabel label11;
    private javax.swing.JLabel label12;
    private javax.swing.JLabel label13;
    private javax.swing.JLabel label14;
    private javax.swing.JLabel label15;
    private javax.swing.JLabel label16;
    private javax.swing.JLabel label17;
    private javax.swing.JLabel label18;
    private javax.swing.JLabel label19;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label20;
    private javax.swing.JLabel label21;
    private javax.swing.JLabel label22;
    private javax.swing.JLabel label23;
    private javax.swing.JLabel label24;
    private javax.swing.JLabel label25;
    private javax.swing.JLabel label26;
    private javax.swing.JLabel label27;
    private javax.swing.JLabel label28;
    private javax.swing.JLabel label29;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label30;
    private javax.swing.JLabel label31;
    private javax.swing.JLabel label32;
    private javax.swing.JLabel label33;
    private javax.swing.JLabel label34;
    private javax.swing.JLabel label35;
    private javax.swing.JLabel label36;
    private javax.swing.JLabel label37;
    private javax.swing.JLabel label38;
    private javax.swing.JLabel label39;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label40;
    private javax.swing.JLabel label41;
    private javax.swing.JLabel label42;
    private javax.swing.JLabel label43;
    private javax.swing.JLabel label44;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel label8;
    private javax.swing.JLabel label9;
    private javax.swing.JTextField last_name;
    private javax.swing.JTextField mother_age;
    private javax.swing.JTextField mother_ethnicity;
    private javax.swing.JTextField mother_name;
    private javax.swing.JTextField mother_nationality;
    private javax.swing.JTextField mother_occupation;
    private javax.swing.JTextField name_place_graduated;
    private javax.swing.JTextField nationality;
    private javax.swing.JTextField nickname;
    private javax.swing.JTextField office_name;
    private javax.swing.JTextField old_position;
    private javax.swing.JTextField phone_number;
    private javax.swing.JComboBox<String> position;
    private javax.swing.JTextField province;
    private javax.swing.JTextField reason_for_resignation;
    private javax.swing.JTextField reason_for_wanting_to_work_here;
    private javax.swing.JTextField religion;
    private javax.swing.JTextField start;
    private javax.swing.JTextField stop;
    private javax.swing.JTextField work_history;
    // End of variables declaration//GEN-END:variables
}
