


import My.*;
import java.awt.Dimension;
import java.util.Date;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.Timer;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
public class teacher extends javax.swing.JFrame {
    Connect a=new Connect();
    Myfile mf=new Myfile();
     Vector v=new Vector();
Connection con;
Statement st;
ResultSet rs;


                                            //MY CONSTRUCTER........
            public teacher() {
                initComponents(); 
                     date.setText(mf.date());
                     time();
                     attendencetable(); 
                      jLabelattmonth.setText(getmonthnam(jMonthChooser1.getMonth())+"  "+jYearChooser1.getYear());
          l.setVisible(false);
                                    
                    
            }       
                SimpleDateFormat sd;
      public void time(){
             Timer t;           
                t=new Timer(0, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                        Date dt=new Date();
                        sd=new SimpleDateFormat("hh:mm:ss");
                        String str=sd.format(dt);
                        time.setText(str);
                        }
                        });
                        t.start();
        }            
      String[] Stid=new String[50];String s;
      
        public void attendencetable(){
                            try{
                                
                     con=a.connection();
                     rs=a.setdata("select * from student");
                     
                        DefaultTableModel dm=(DefaultTableModel) jtAtt.getModel();
                        dm.setRowCount(0);
                        dm.setColumnCount(0);
                        dm.addColumn("NAME");
                        int y=jYearChooser1.getYear();
                        int m=jMonthChooser1.getMonth();                       
                        int totalday=mf.gettotaldayofmonth(y,m);                      
                             for(int i=1;i<=totalday;i++)
                             dm.addColumn(i);
                     Vector vv=mf.getdayname(y,m);
                          dm.addRow(vv); 
                             while(rs.next()){
                             Vector v=new Vector();
                             v.add(rs.getString("name"));                    
                             dm.addRow(v);
                                                }                     
                       jtAtt.getColumnModel().getColumn(0).setPreferredWidth(200);   
                     }
                     catch(Exception e){
                         JOptionPane.showMessageDialog(null, e);
                     }
        }
                public String getmonthnam(int month){
                     Date d=new Date();
                                     d.setMonth(month);
                                      SimpleDateFormat sp=new SimpleDateFormat("MMMM");
                                    String date=sp.format(d);                 
                                   return date;
                }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jMenu3 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jDialog1 = new javax.swing.JDialog();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        l = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        tnam = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tsub = new javax.swing.JComboBox<>();
        tph = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        tpic = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        jLabletph = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtextid = new javax.swing.JTextField();
        jtextpassword = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        jLabelid = new javax.swing.JLabel();
        jLabelpassword = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtablestudent = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        srol = new javax.swing.JTextField();
        snam = new javax.swing.JTextField();
        sclass = new javax.swing.JComboBox<>();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton15 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        scity = new javax.swing.JTextField();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        smobile = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        sid = new javax.swing.JTextField();
        jLabelsid = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtAtt = new javax.swing.JTable();
        jLabelattmonth = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        jMenu3.setText("jMenu3");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("File");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar3.add(jMenu7);

        jMenu8.setText("File");
        jMenuBar4.add(jMenu8);

        jMenu9.setText("Edit");
        jMenuBar4.add(jMenu9);

        jMenuItem1.setText("jMenuItem1");

        jMenu10.setText("File");
        jMenuBar5.add(jMenu10);

        jMenu11.setText("Edit");
        jMenuBar5.add(jMenu11);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("College Management System");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, -1));

        date.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        date.setForeground(new java.awt.Color(204, 255, 255));
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 100, 20));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Date :");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        time.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        time.setForeground(new java.awt.Color(204, 255, 255));
        jPanel1.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 40, 90, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 74));

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Admine Panel");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("DASHBOARD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 67, 159, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("TEACHER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 129, 159, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("STUDENT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 185, 159, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setText("ATTENDENCE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 241, 159, -1));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setText("EXIT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 300, 159, -1));

        l.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 153));
        jLabel35.setText("    Attendence options");
        jLabel35.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton19.setBackground(new java.awt.Color(255, 51, 51));
        jButton19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton19.setText("View");
        jButton19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton21.setBackground(new java.awt.Color(204, 204, 0));
        jButton21.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton21.setText("Attendence");
        jButton21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setBackground(new java.awt.Color(102, 51, 255));
        jButton22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton22.setText("Refresh");
        jButton22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lLayout = new javax.swing.GroupLayout(l);
        l.setLayout(lLayout);
        lLayout.setHorizontalGroup(
            lLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
            .addGroup(lLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lLayout.createSequentialGroup()
                        .addGroup(lLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(lLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lLayout.createSequentialGroup()
                                .addComponent(jYearChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lLayout.createSequentialGroup()
                                .addComponent(jMonthChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        lLayout.setVerticalGroup(
            lLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lLayout.createSequentialGroup()
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jMonthChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jYearChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton19)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jPanel2.add(l, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 160, 240));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 180, 660));

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1010, 690));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/college.jpg"))); // NOI18N
        jLabel38.setText("jLabel38");
        jPanel3.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 360, 370));

        jTabbedPane1.addTab("tab1", jPanel3);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setForeground(new java.awt.Color(255, 255, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TEACHER ID", "NAME", "SUBJECT", "MOBILE", "DATE OF JOINING"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 750, 240));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Teacher name :");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));
        jPanel4.add(tnam, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 157, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Subject :");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, -1));

        tsub.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[--Select one--]", "BA", "B.Com", "B.Tech", "BCA", "MA", "MCA" }));
        tsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsubActionPerformed(evt);
            }
        });
        jPanel4.add(tsub, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 157, -1));
        jPanel4.add(tph, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 157, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Phone no.");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));

        jButton10.setBackground(new java.awt.Color(0, 255, 0));
        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton10.setText("ADD");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 70, 20));

        jButton11.setBackground(new java.awt.Color(255, 153, 255));
        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Untitled.png"))); // NOI18N
        jButton11.setText("View Record");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 210, 40));

        jButton12.setBackground(new java.awt.Color(255, 255, 0));
        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton12.setText("Done");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 220, 70, 20));

        jButton13.setBackground(new java.awt.Color(255, 0, 0));
        jButton13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton13.setText("Delete");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 80, 20));

        tpic.setBackground(new java.awt.Color(0, 0, 0));
        tpic.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel4.add(tpic, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 80, 100));

        jButton20.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton20.setText("Brows");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 80, 20));

        jLabletph.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabletph.setForeground(new java.awt.Color(255, 0, 0));
        jPanel4.add(jLabletph, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 190, 20));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 450, 220));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setText("Add New Teacher");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel8.setText("Set Teacher Password");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, 190, -1));

        jtextid.setText("Enter Teacher Id");
        jtextid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtextidFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtextidFocusLost(evt);
            }
        });
        jPanel4.add(jtextid, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, 160, -1));

        jtextpassword.setText("Create Password");
        jtextpassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtextpasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtextpasswordFocusLost(evt);
            }
        });
        jtextpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextpasswordActionPerformed(evt);
            }
        });
        jPanel4.add(jtextpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, 160, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Confirm Password :");
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 160, -1, 20));
        jPanel4.add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 180, 160, -1));

        jLabelid.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelid.setForeground(new java.awt.Color(255, 0, 0));
        jPanel4.add(jLabelid, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, 160, 20));

        jLabelpassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelpassword.setForeground(new java.awt.Color(255, 0, 0));
        jPanel4.add(jLabelpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, 190, 20));

        jLabel30.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, 230, 220));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bb.jpg"))); // NOI18N
        jLabel34.setText("jLabel34");
        jPanel4.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 660));

        jLabel36.setText("jLabel36");
        jPanel4.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 320, 300, -1));

        jLabel37.setText("jLabel37");
        jPanel4.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 310, 270, 30));

        jTabbedPane1.addTab("tab2", jPanel4);

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtablestudent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtablestudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student id", "Name", "Class", "Roll", "City", "Contact"
            }
        ));
        jScrollPane2.setViewportView(jtablestudent);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 800, 220));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Phone no :");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Name :");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 40, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Class :");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 50, 20));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Roll no :");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 50, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Teacher id :");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Password :");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));
        jPanel5.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 130, -1));
        jPanel5.add(srol, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 150, -1));
        jPanel5.add(snam, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 150, -1));

        sclass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[--Select one--]", "MA", "BA", "BCA", "BCom", "BTech", "MCA" }));
        jPanel5.add(sclass, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 150, -1));
        jPanel5.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 130, -1));

        jButton15.setBackground(new java.awt.Color(255, 255, 51));
        jButton15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton15.setText("ADD");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 100, 20));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("City :");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 40, -1));
        jPanel5.add(scity, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 150, -1));

        jButton16.setBackground(new java.awt.Color(255, 51, 51));
        jButton16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton16.setText("Delete");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 580, 130, 20));

        jButton17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton17.setText("VIEW");
        jButton17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 800, 20));
        jPanel5.add(smobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, 150, -1));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 110, 80, 100));

        jLabel29.setBackground(new java.awt.Color(51, 255, 51));
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aa.jpg"))); // NOI18N
        jLabel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel5.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 800, 240));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(204, 255, 255));
        jLabel31.setText("Add New Student");
        jPanel5.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 180, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Student Id :");
        jPanel5.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 550, 70, -1));
        jPanel5.add(sid, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 550, 130, 20));

        jLabelsid.setForeground(new java.awt.Color(255, 0, 0));
        jPanel5.add(jLabelsid, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 550, 200, 20));

        jTabbedPane1.addTab("tab3", jPanel5);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });
        jPanel6.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 30, 128, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("search");
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 30, -1, 20));

        jtAtt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jtAtt);

        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 84, 1176, 475));

        jLabelattmonth.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelattmonth.setForeground(new java.awt.Color(204, 255, 255));
        jPanel6.add(jLabelattmonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 11, 312, 54));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bb.jpg"))); // NOI18N
        jLabel32.setText("jLabel32");
        jPanel6.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 190, -1, -1));

        jTabbedPane1.addTab("tab4", jPanel6);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("STUDENT RECORD ");

        jLabel18.setText("Student Name  :");

        jLabel19.setText("Course :");

        jLabel23.setText("City :");

        jLabel24.setText("Roll.No. :");

        jLabel25.setText("jLabel25");

        jLabel26.setText("Mobile.No. :");

        jLabel27.setText("Year :");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel26)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel27)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(427, 427, 427))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(341, 341, 341))))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(488, 488, 488)
                .addComponent(jLabel3)
                .addContainerGap(494, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel18))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel20)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel24)
                .addGap(32, 32, 32)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(jLabel27)
                .addGap(30, 30, 30)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel23))
                .addGap(18, 18, 18)
                .addComponent(jLabel26)
                .addContainerGap(352, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab5", jPanel7);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 1200, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
        l.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        if(tnam.getText().trim().isEmpty() )
            JOptionPane.showMessageDialog(rootPane,"Please enter your Name !" );
        else if(tph.getText().trim().isEmpty())
                JOptionPane.showMessageDialog(rootPane,"Fill your phone no number !" );
        else if(tsub.getSelectedIndex()==0)
            JOptionPane.showMessageDialog(rootPane,"select your subject." );
       
        else{
            
            String tmobile=tph.getText();
            if(tmobile.length()<10 || tmobile.length()>10){
                jLabletph.setText("Invalid mobile number!");
                return;
            }
            Date d=new Date();
            SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd");
            String st=s.format(d);
            
          
               
                try{
                     con=a.connection();
                Statement sta=con.createStatement();
                   int i=sta.executeUpdate("insert into teacher (name,mobile,subject,date) values('"+tnam.getText()+"','"+tmobile+"','"+tsub.getSelectedItem()+"','"+st+"')");
                   if(i>0)
                       JOptionPane.showMessageDialog(null, "Done !");
                }
                catch(Exception e){
                        jLabletph.setText("Already exsist !");
                }
         
            tnam.setText("");
            tsub.setSelectedIndex(0);
            tph.setText("");
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        con=a.connection();
        rs=a.setdata("select * from teacher");
        try{
        ResultSetMetaData rsm=rs.getMetaData();
        int c=rsm.getColumnCount();
            DefaultTableModel dm=(DefaultTableModel)jTable1.getModel();
            dm.setRowCount(0);
            while(rs.next()){
                Vector v=new Vector();
                for(int i=1;i<=c;i++){
                    v.add(rs.getString("id"));
                    v.add(rs.getString("name"));
                    v.add(rs.getString("subject"));
                    v.add(rs.getString("mobile"));
                    v.add(rs.getString("date"));
                }
                dm.addRow(v);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        if(jtextid.getText().trim().isEmpty() || jtextid.getText().equals("Enter Teacher Id"))
           jLabelid.setText("Please Enter id !");
        else if(jtextpassword.getText().trim().isEmpty() || jtextpassword.getText().equals("Create Password"))
            JOptionPane.showMessageDialog(rootPane,"Create Password !"); 
        else if(jPassword.getText().trim().isEmpty())
           jLabelpassword.setText("Confirm Password !");
        else{
            String id=jtextid.getText();
            String pass=jtextpassword.getText();
            String pass1=jPassword.getText();
                if(pass.equals(pass1)){
                     try {
            st=con.createStatement();
            int num=st.executeUpdate("insert into teacher_password values('"+id+"','"+pass+"')");
            if(num>0){
                 JOptionPane.showMessageDialog(rootPane, "Done !");
             jtextid.setText("Enter Teacher Id");
             jtextpassword.setText("Create Password");
             jPassword.setText("");
             jLabelid.setText("");
             jLabelpassword.setText("");
            }                     
        } catch(Exception e){
                    String ex=e.getMessage();
                    JOptionPane.showMessageDialog(null, ex);
                        if(ex.contains("'teacher_password.teacherid'"))
                            // jLabelid.setText();
                        JOptionPane.showMessageDialog(null, "already done !");
                        else if(ex.contains("'teacher_password.password'"))
                             JOptionPane.showMessageDialog(null,"Duplicate password !");
                            // jLabelpassword.setText("Duplicate password !");
                        else
                            JOptionPane.showMessageDialog(null,"ID not found");
                               // jLabelid.setText("ID not found");                                                 
        }  
        }
                else
                      jLabelpassword.setText( "Password mismatch !");
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
         if(jtextid.getText().equals("Enter Teacher Id"))
            JOptionPane.showMessageDialog(rootPane,"enter id !");
         else{
             con=a.connection();
             int i=a.getdata("delete from teacher where id='"+jtextid.getText()+"'");
              if(i>0)
                JOptionPane.showMessageDialog(rootPane, "Successful");
            else
                JOptionPane.showMessageDialog(rootPane, "This ID not exsist !");
          
         }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2);
        l.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
          if(snam.getText().trim().isEmpty())
            JOptionPane.showMessageDialog(rootPane, "Enter Student name !");
        else if(srol.getText().trim().isEmpty())
            JOptionPane.showMessageDialog(rootPane, "Enter Student Roll.no !");
        else if(scity.getText().trim().isEmpty())
            JOptionPane.showMessageDialog(rootPane, "Enter Student City !");
        else if(sclass.getSelectedIndex()==0)
            JOptionPane.showMessageDialog(rootPane, "Select Student class !");
        else if(smobile.getText().trim().isEmpty())
            JOptionPane.showMessageDialog(rootPane, "Enter phone number!");
     
        else{
            String phonenumber=smobile.getText();
            if(phonenumber.length()>10 || phonenumber.length()<10){
                JOptionPane.showMessageDialog(null, "invalid phone number !");
                return;
            }
            con=a.connection();
            int i=a.getdata("insert into student (name,class,roll,city,mobile)values('"+snam.getText()+"','"+sclass.getSelectedItem()+"','"+srol.getText()+"','"+scity.getText()+"','"+smobile.getText()+"')");
             if(i>0)
                JOptionPane.showMessageDialog(rootPane, "Successful");
            else
                JOptionPane.showMessageDialog(rootPane, "Failed !");
             snam.setText("");
             srol.setText("");
             scity.setText("");
           sclass.setSelectedIndex(0);
           smobile.setText("");
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        con=a.connection();
        if(sid.getText().trim().isEmpty())
            jLabelsid.setText( "Enter student Id !");
        else{
        int i=a.getdata("delete from student where id='"+sid.getText()+"'");
        if(i>0)
                       jLabelsid.setText("Successful.");
                    else
                        jLabelsid.setText( "This Id not exsist !");
               
        smobile.setText("");
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        con=a.connection();
        rs=a.setdata("select * from student");
        try{
        ResultSetMetaData rsm=rs.getMetaData();
        int i=rsm.getColumnCount();
        DefaultTableModel dm=(DefaultTableModel) jtablestudent.getModel();
        dm.setRowCount(0);
        while(rs.next()){
            Vector v1=new Vector();
            for(int z=1;z<=i;z++){
                v1.add(rs.getString("id"));
                 v1.add(rs.getString("name"));
                  v1.add(rs.getString("class"));
                   v1.add(rs.getString("roll"));
                    v1.add(rs.getString("city"));
                    v1.add(rs.getString("mobile"));
            }
            dm.addRow(v1);
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Something wrong");
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3);
        l.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tsubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tsubActionPerformed

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        // TODO add your handling code here:
        DefaultTableModel dm=(DefaultTableModel) jtAtt.getModel();
        TableRowSorter<DefaultTableModel> tb=new TableRowSorter<>(dm);
        jtAtt.setRowSorter(tb);
        tb.setRowFilter(RowFilter.regexFilter(jTextField2.getText()));
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        JFileChooser jf=new JFileChooser();
        FileNameExtensionFilter fn=new FileNameExtensionFilter("JPG","jpg");
        jf.addChoosableFileFilter(fn);
        int i=jf.showOpenDialog(null);
        if(i==jf.APPROVE_OPTION){
            File file=jf.getSelectedFile();
            String path=file.getAbsolutePath();
            ImageIcon ic=new ImageIcon(path);
            Image pic=ic.getImage().getScaledInstance(80, 100, Image.SCALE_SMOOTH);
            tpic.setIcon(new ImageIcon(pic));
        }
    }//GEN-LAST:event_jButton20ActionPerformed
  
    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        con=a.connection();
        
           DefaultTableModel dm=(DefaultTableModel) jtAtt.getModel();
           try{         
                       int y=jYearChooser1.getYear();
                        int m=jMonthChooser1.getMonth();int mm=m+1;
                    for(int d=01;d<=mf.gettotaldayofmonth(y,m);d++){
                       String date=""+y+"-"+mm+"-"+d;
                        Vector v=mf.getid();
                        for(int i=0;i<v.size();i++){
                        rs=a.setdata("select Att from attendence where studentid='"+v.get(i)+"' and date='"+date+"'");
                        while(rs.next()){
                            String str=rs.getString("Att");
                        dm.setValueAt(str, i+1, d);
                        }
                        }
                    }
           }
           catch(SQLNonTransientConnectionException x){}
           catch(Exception e){
               JOptionPane.showMessageDialog(rootPane, e);
           }
       
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here
       User at=new User();
        at.setVisible(true);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
         attendencetable();
          jLabelattmonth.setText(getmonthnam(jMonthChooser1.getMonth())+"  "+jYearChooser1.getYear());
                                     
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(4);
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jtextidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtextidFocusGained
        if(jtextid.getText().equals("Enter Teacher Id")){
            jtextid.setText("");
        }
    }//GEN-LAST:event_jtextidFocusGained

    private void jtextidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtextidFocusLost
        // TODO add your handling code here:
        if(jtextid.getText().equals("")){
            jtextid.setText("Enter Teacher Id");
        }
    }//GEN-LAST:event_jtextidFocusLost

    private void jtextpasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtextpasswordFocusGained
            if(jtextpassword.getText().equals("Create Password")){
            jtextpassword.setText("");
        }
    }//GEN-LAST:event_jtextpasswordFocusGained

    private void jtextpasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtextpasswordFocusLost
   
         if(jtextpassword.getText().equals("")){
            jtextpassword.setText("Create Password");
        }
    }//GEN-LAST:event_jtextpasswordFocusLost

    private void jtextpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextpasswordActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        teacher f=new teacher();
         Myfile mf=new Myfile();
        Dimension scrsize=mf.screenSize();
        f.setSize(scrsize.width, scrsize.height);
       
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                f.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelattmonth;
    private javax.swing.JLabel jLabelid;
    private javax.swing.JLabel jLabelpassword;
    private javax.swing.JLabel jLabelsid;
    private javax.swing.JLabel jLabletph;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JMenuItem jMenuItem1;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    private javax.swing.JTable jtAtt;
    private javax.swing.JTable jtablestudent;
    private javax.swing.JTextField jtextid;
    private javax.swing.JTextField jtextpassword;
    private javax.swing.JPanel l;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JTextField scity;
    private javax.swing.JComboBox<String> sclass;
    private javax.swing.JTextField sid;
    private javax.swing.JTextField smobile;
    private javax.swing.JTextField snam;
    private javax.swing.JTextField srol;
    private javax.swing.JLabel time;
    private javax.swing.JTextField tnam;
    private javax.swing.JTextField tph;
    private javax.swing.JLabel tpic;
    private javax.swing.JComboBox<String> tsub;
    // End of variables declaration//GEN-END:variables
}
