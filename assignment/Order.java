import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Order extends JFrame// implements ActionListener
   {
     JPanel pane1,pane2,pane3,pane4;
	 JLabel lab;
	 JComboBox jcb;
	 JRadioButton rb1,rb2;
	 JButton b1,b2,b3;
	 String str[]={"---------none----------"};
	 Order(String s)
	   {
	    super(s);
		pane1=new JPanel();
        lab=new JLabel("Order By");		
		lab.setSize(100,40);
		pane1.add(lab);
        jcb=new JComboBox(str);
		pane1.add(jcb); 
		add(pane1,BorderLayout.NORTH);
		
		pane2=new JPanel();
		rb1=new JRadioButton("Asscending");
		rb2=new JRadioButton("Descending");
		ButtonGroup jb=new ButtonGroup();
		jb.add(rb1);
		jb.add(rb2);
		pane4=new JPanel();
		pane4.add(rb1);
		pane4.add(rb2);
	 add(pane4,BorderLayout.CENTER);
		
		pane3=new JPanel();
		b1=new JButton("Add");
		b2=new JButton("Ok");
		b3=new JButton("Cancel");
		pane3.add(b1);
		pane3.add(b2);
		pane3.add(b3);
		//pane3.setBounds(100,300, 200,50);
	add(pane3,BorderLayout.SOUTH);
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 	
	setSize(300,200);
	setVisible(true);
	//pack();
	}
	
public static void main(String arg[])
    {
      new Order("Order by");
    }
}	 
//