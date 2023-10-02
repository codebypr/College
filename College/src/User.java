import My.*;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class User extends javax.swing.JFrame {
 Connection con;
        ResultSet rs;
        Connect a=new Connect();
        teacher t=new teacher();
        Myfile mf=new Myfile();
    
    public User() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        selectcours = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "P", "AB", "L"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(80);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(80);
            jTable1.getColumnModel().getColumn(1).setMinWidth(70);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(70);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 86, 234, 322));

        jButton1.setText("Holiday");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 414, 100, -1));

        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 414, 110, -1));

        selectcours.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[--Select one--]", "MA", "BA", "BCA", "BCom", "BTech", "MCA" }));
        selectcours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectcoursActionPerformed(evt);
            }
        });
        getContentPane().add(selectcours, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 62, 120, 20));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 62, 110, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dd.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 480, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         if(jDateChooser1.getDate()==null)
            JOptionPane.showMessageDialog(null, "please select date !");
        else{
         SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
         String date = dcn.format(jDateChooser1.getDate() );
                        mf.holiday(date);
                        JOptionPane.showMessageDialog(null, "Done !");
                        setVisible(false);
        }
 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         if(selectcours.getSelectedIndex()==0)
            JOptionPane.showMessageDialog(rootPane, "Select Course !");
      else if(jDateChooser1.getDate()==null)
            JOptionPane.showMessageDialog(null, "Please select date....");       
             
      else{
        
                for(int i=0;i<jTable1.getRowCount();i++){
                String P=jTable1.getValueAt(i,2).toString();
                String A=jTable1.getValueAt(i, 3).toString();
                String L=jTable1.getValueAt(i, 4).toString();
                String s1=jTable1.getValueAt(i, 0).toString();
                                  
                                SimpleDateFormat sp = new SimpleDateFormat("yyyy-MM-dd");
                                 String date = sp.format(jDateChooser1.getDate() );
                       
                         if(P.equals("true")){
                             
                             con=a.connection();String pr="P";
                             int num=a.getdata("insert into attendence(Att,studentid,date) values('"+pr+"','"+s1+"','"+date+"')");
                         }
                          if(A.equals("true")){
                            
                             con=a.connection();String ab="A";
                             int num=a.getdata("insert into attendence(Att,studentid,date) values('"+ab+"','"+s1+"','"+date+"')");
                         }
                          if(L.equals("true")){
                            
                             con=a.connection();String l="L";
                             int num=a.getdata("insert into attendence(Att,studentid,date) values('"+l+"','"+s1+"','"+date+"')");
                         }                        
               }
                 JOptionPane.showMessageDialog(null, "Done !");
                setVisible(false);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void selectcoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectcoursActionPerformed
        // TODO add your handling code here:
         if(selectcours.getSelectedIndex()==0)
            JOptionPane.showMessageDialog(rootPane, "Select Course !");
         else{
           
           con=a.connection();
           rs=a.setdata("select * from student where class='"+selectcours.getSelectedItem()+"'");
           try{
                    ResultSetMetaData rsm=rs.getMetaData();
                    int c=rsm.getColumnCount();
                    DefaultTableModel dm=(DefaultTableModel) jTable1.getModel();
                    dm.setRowCount(0);
                    while(rs.next()){
                        Vector v2=new Vector();
                        for(int i=1;i<=c;i++){
                            v2.add(rs.getString("id"));
                             v2.add(rs.getString("name"));
                          v2.add(false);
                           v2.add(false);
                            v2.add(false);
                                             }
                        dm.addRow(v2);
                }
                   
           }
           catch(Exception e){
               JOptionPane.showMessageDialog(rootPane, e);
           }
        }
    }//GEN-LAST:event_selectcoursActionPerformed
 
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
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> selectcours;
    // End of variables declaration//GEN-END:variables
}
