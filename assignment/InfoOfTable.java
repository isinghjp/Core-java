import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class InfoOfTable implements AdjustmentListener
   {
     JFrame jf; 
     JLabel e_id,name,salary,address;
     JTextField et,nt,st,at;
     JScrollBar jsb; 
     InfoOfTable(String s)
        {
          jf=new JFrame(s); 
          jf.setSize(500,500) ;   
          jf.setLayout(null);
          e_id=new JLabel("E_ID");
          e_id.setBounds(30,50,100,50); 
          jf.add(e_id);

          et=new JTextField(); 
          et.setBounds(130,50,150,50);
          jf.add(et);
 
          name=new JLabel("Name");
          name.setBounds(30,110,100,50);
          jf.add(name);

          nt=new JTextField(); 
          nt.setBounds(130,110,150,50);
          jf.add(nt); 
   
          salary=new JLabel("Salary");
          salary.setBounds(30,170,100,50); 
          jf.add(salary);
   
          st=new JTextField(); 
          st.setBounds(130,170,150,50);
          jf.add(st);
           
          address=new JLabel("Address");
          address.setBounds(30,230,100,50);
          jf.add(address); 
       
          at=new JTextField(); 
          at.setBounds(130,230,150,50);
          jf.add(at);
        
          jsb=new JScrollBar(Adjustable.HORIZONTAL);
          jsb.setBounds(20,300,200,50); 
          jsb.addAdjustmentListener(this);
          jf.add(jsb);

          jf.setVisible(true);
          jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
      }
    public static void main(String arg[])
       {
         new InfoOfTable("information of table");
        }
void adjustmentValueChanged(AdjustmentEvent e)
       {
           }
   }  
