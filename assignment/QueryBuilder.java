import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class QueryBuilder extends JFrame implements ActionListener 
  {
    JLabel ednl;
    JTextField ednt,ednt1;
    JButton ok,exit;
    QueryBuilder(String s) 
      {
        ednl=new JLabel("Enter the DSN name");
        ednl.setBounds(20,50,150,40)  ;
        add(ednl);
        
        ednt=new JTextField();
        ednt.setBounds(170,50,100,40);
        add(ednt);

       
        ok=new JButton("OK"); 
        ok.setBounds(50,100,80,40);
        ok.addActionListener(this); 
        add(ok);
        
        exit=new JButton("Exit"); 
        exit.setBounds(140,100,80,40);
        exit.addActionListener(this);
        add(exit);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setLayout(null) ;
        setVisible(true);
      
       }
   public static void main(String arg[])    
       {
         new QueryBuilder("QueryBuilder");
        }
  public void actionPerformed(ActionEvent e)
       {
         if(e.getActionCommand().equals("OK"))
             new Order("RDERERF");
         if(e.getActionCommand().equals("Exit"))
             System.exit(1);
            
       } 
  }       
   
        
