import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.io.*;

class CreateTable extends JFrame  implements ActionListener
   {
     
     JLabel tname,field,type,size;
     JTextField nt,ft,st;
     JComboBox jcb;
     JButton addb,canb,btb;
     String dt[]={"None","char","number","varchar","varchar2","boolean","date","time"};
     String s="create table ";
     boolean b=true;
     CreateTable(String s)
        {
          super(s);
          tname=new JLabel("Enter the table name");
          tname.setBounds(30,40,140,40); 
          add(tname);
          
          nt=new JTextField();
          nt.setBounds(170,40,100,40);
          add(nt);
          
          field=new JLabel("Field");
          field.setBounds(30,90,70,40);
          add(field);
          
          ft=new JTextField();
          ft.setBounds(100,90,100,40);
          add(ft);
                
          type=new JLabel("Data Type");
          type.setBounds(30,140,70,40); 
          add(type);

          jcb=new JComboBox(dt);
          jcb.setBounds(100,140,100,40); 
          add(jcb);
 
          size=new JLabel("Size");
          size.setBounds(30,190,70,40);
          add(size); 

          st=new JTextField();
          st.setBounds(100,190,100,40);    
          add(st);
          
          addb=new JButton("Add");
          addb.setBounds(50,250,80,40);
          addb.addActionListener(this);
          add(addb);
            
          canb=new JButton("cancel");
          canb.setBounds(140,250,80,40);
          canb.addActionListener(this);
          add(canb);

          btb=new JButton("Build the table");
          btb.setBounds(50,300,150,40);
          btb.addActionListener(this);
          add(btb);

         
          setSize(500,500) ;   
          setLayout(null);
          setVisible(true);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
      }
    public static void main(String arg[])
       {
         new CreateTable("creation of table");
        }
public void actionPerformed(ActionEvent e)
       {
        if(e.getActionCommand().equals("Add"))  
            {
              if(b==true)
                 {
                   s=s +nt.getText()+"(";
                   b=false;
                 }      
               else
                  s=s+","; 
              s=s+" "+ft.getText()+" "+jcb.getSelectedItem()+"("+st.getText()+")";
              
              ft.setText(null);
              st.setText(null);
             }
         if(e.getActionCommand().equals("Build the table"))
            {
              try
               {
                 s=s+")"; 
                 System.out.println(s);
                 Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
                 Statement st=c.createStatement();
                     st.executeUpdate(s);
                }
               catch(SQLException e1)
                  {
                    e1.printStackTrace();
                   }
               catch(Exception e2)
                  {
                    System.out.println(e2);
                  }
              }  
         if(e.getActionCommand().equals("cancel")) 
              {
                   
 
               }    
        }  
  }
