package swingmvc.miniproject;


import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BookStore {
	
 JFrame frame;
 JLabel heading;
 JButton btn;
  
 public BookStore()
 {
  frame=new JFrame("Knowledge is Power");
  
  frame.setContentPane(new JLabel(new ImageIcon("C:\\Users\\DELL\\Pictures\\Edubridge.jpeg")));
  /*ImageIcon img=new ImageIcon("tree.png");
  img.setDescription("This is logo");
  JLabel l=new JLabel(img);
  l.setBounds(100,20,300,100);*/
  
  heading=new JLabel("Have a good day");
  heading.setFont(new Font(Font.SANS_SERIF,Font.ITALIC,40));
  heading.setBounds(300, 50, 300,50);
  
  btn=new JButton("Place Your Order");
  btn.setBounds(300, 100, 150, 20);
  
  //frame.add(l);
  frame.add(heading);
  frame.add(btn);
  frame.setLayout(null);
  frame.setSize(480,360);
  frame.setVisible(true);
  
  
  btn.addActionListener(new ActionListener() {
   
   @Override
   public void actionPerformed(ActionEvent e) {
    
    if(e.getSource()==btn)
    {
     frame.dispose();
     
     PlaceOrder order1=new PlaceOrder();
     order1.setVisible(true);
    }
   }
  });
  
 }
	
	

 public static void main(String[] args) {
  // TODO Auto-generated method stub
        new BookStore();
 }

}
