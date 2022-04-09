import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 

class TableQuery extends JFrame	// implements ActionListener  
  {     
 JPanel  pane1, pane2, pane3, pane4,pane5,pane6,pane7,pane8;
  JLabel ltn,lfn;     
  JComboBox jcbtn;	 
  JScrollPane jsp1,jsp2;    
  JButton ref,b1,b2,b3;  	
  String str[]={"____________none_________________"};   
  TableQuery(String a)       
  {          
  super(a);       
    pane2=new JPanel();		  
	ltn=new JLabel("Enter the table name ") ;
	ltn.setSize(100,40) ;		
  	pane2.add(ltn);		 
  	pane3=new JPanel();     
 jcbtn=new  JComboBox(str);
 jcbtn.setSize(50,50) ;	
 pane3.add(jcbtn);		
 ref=new JButton("Refresh") ;	
 ref.setSize(80,40) ;		
 // ref.addActionListener(this); 	
   pane3.add(ref);	
   pane4=new JPanel();	
 ltn=new JLabel("Field name ");	
 pane4.add(ltn);		
 pane1=new JPanel(new BorderLayout()); 	
 pane1.add(pane2,BorderLayout.NORTH); 
  pane1.add(pane3,BorderLayout.CENTER);	
 pane1.add(pane4,BorderLayout.SOUTH);		
add(pane1,BorderLayout.NORTH);		
pane5=new JPanel(new BorderLayout());	
jsp1=new JScrollPane(new JList());	
 pane5.add(jsp1);	    
 add(pane5,BorderLayout.WEST);	
 pane8=new JPanel();		
 b1=new JButton(">>");		 
b2=new JButton("<<");		 
b3=new JButton(">>>");		 
pane8.add(b1);		 
pane8.add(b2);		 
pane8.add(b3);		
 add(pane8,BorderLayout());		 		 
jsp2=new JScrollPane(new JList());		 
pane7=new JPanel(new BorderLayout());		 
pane7.add(jsp2);		 
add(pane7,BorderLayout.EAST);		 		 
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);          
setSize(500,500);		 
setVisible(true);		
 } 	
public static void main(String arg[]) 	   
 {		   
new TableQuery("Table Query");	

   }         
 }		           		             