package swingmvc.miniproject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class Bill extends JFrame {
      
 JLabel l1;
 Bill()
 {
  l1=new JLabel("Your order is successfully placed."
    + "\n Please wait for your order");
  l1.setBounds(50,80,480,20);
  
  add(l1);
  
  setSize(500,150);
  setLayout(null);
  setVisible(true);
  
  
  
 }
	
 class WindowClose extends WindowAdapter
 {
  @Override
  public void windowClosing(WindowEvent e) {
   // TODO Auto-generated method stub
   super.windowClosing(e);
   System.exit(0);
  }
 }
	
 public static void main(String[] args) {
  // TODO Auto-generated method stub
    new Bill();
 }

	
}
