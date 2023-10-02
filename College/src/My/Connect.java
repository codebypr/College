package My;

import java.sql.*;
import javax.swing.JOptionPane;
public class Connect{
    Connection con;
    Statement st;
    ResultSet rs;
    int i;
            public Connection connection(){
                
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");       
            con=DriverManager.getConnection("jdbc:mysql://localhost/collegedata","root","1234");
        }
             catch(SQLNonTransientException x){}
         catch (Exception ex) {
           JOptionPane.showMessageDialog(null, ex);
        }
            
                return con;
            }
            
            public int getdata(String quary){
               
                    con=connection();
        try {
            st=con.createStatement();
            i=st.executeUpdate(quary);
        }
         catch(Exception e){                    
                    JOptionPane.showMessageDialog(null, e);                                                                       
                    }
                return i;
            }
            
            public ResultSet setdata(String quary){
                try{
                    con=connection();
                    st=con.createStatement();
                    rs=st.executeQuery(quary);
                }
                catch(SQLNonTransientException x){}
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
                return rs;
            }
}