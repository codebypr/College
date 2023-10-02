package My;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Vector;
import java.sql.*;


public class Myfile {
    Connection con;
    ResultSet rs;
    Connect a=new Connect();
    
                    public String date(){
                                    Date d=new Date();
                                    SimpleDateFormat sp=new SimpleDateFormat("dd-MM-yyy");
                                    String date=sp.format(d);
                                    return date;
                      }
                    public int gettotaldayofmonth(int year , int month){
                      YearMonth yearMonthObject = YearMonth.of(year, month+1);
                                  int totalday = yearMonthObject.lengthOfMonth();
                                  return totalday;
                    }
                    public Vector getdayname(int year,int month){
                                  int  totalday=gettotaldayofmonth(year,month)+1;
                                   Vector v=new Vector();
                                   v.add(null);
                                   for(int j=1;j<=totalday;j++){
                                   Date d1 = (new GregorianCalendar (year, month, j)).getTime(); 
                                   DateFormat f = new SimpleDateFormat("EEE");   
                                   String date=f.format(d1);
                                     v.add(date)  ;
                                   }
                                          return v;
                    }
                    
                    public Dimension screenSize(){                          
                                    Toolkit tk=Toolkit.getDefaultToolkit();
                                     Dimension screenSize = tk.getScreenSize();
                                     return screenSize;
                    }
                    public Vector getid(){
                                    String ar[]=new String[50];int i=0;
                                    con=a.connection();
                                     rs=a.setdata("select * from student");
                                     Vector v=new Vector();
                                      try{
                                            while(rs.next()){
                                                String h=rs.getString("id");
                                                v.add(h);
                                                             }                    
                                             }
                                             catch(Exception e){
                                             }
                                             return v;
                                }
                    public void holiday(String date){
                                 Vector v=getid();
                                 for(int i=0;i<v.size();i++){
                                 con=a.connection();String h="H";
                                 int num=a.getdata("insert into attendence(Att,studentid,date) values('"+h+"','"+v.get(i)+"','"+date+"')");
                                    }

                                }
                    
                    public static void main(String []ar){
                        Myfile mf=new Myfile();
                       
                        
                         String s="9306443566";
                         int a=s.length();
                      System.out.println(a);
                       
                    }
}
