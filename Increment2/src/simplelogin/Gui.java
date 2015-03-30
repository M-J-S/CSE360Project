package simplelogin;


//import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame; //library
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Gui {

	static JFrame frame, Doctor1, Doctor2, Patient1, Patient2, Patient3; //frames
	static JTextField field;
	static JPasswordField p;
	JLabel l;
	JButton b, e;

	
	Gui () {
		
		frame = new JFrame ("Login Screen ");
		frame.setSize(500,200);
		//frame.getContentPane().setBackground(Color.black);
		frame.setLocation(300,200);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		l = new JLabel ("User Name");
		l.setLocation(50,10);
		l.setSize(l.getPreferredSize());
		frame.add(l);
		
		field = new JTextField();
		field.setColumns(25);
		field.setSize(field.getPreferredSize());
	
		field.setLocation(150, 10);
		field.setToolTipText("Enter User Name");
		frame.add(field);
		
		l = new JLabel ("Password");
		l.setLocation(50,40);
		l.setSize(l.getPreferredSize());
		frame.add(l);
		
		p = new JPasswordField();
		p.setColumns(25);
		p.setSize(p.getPreferredSize());
	
		p.setLocation(150, 40);
		p.setToolTipText("Enter Password");
		frame.add(p);
		
		b = new JButton("Login");
		b.setSize(b.getPreferredSize());
		b.setLocation(150,80);
		frame.add(b);
		b.addActionListener(new Action());
		
		e = new JButton("Emergency");
		e.setSize(e.getPreferredSize());
		e.setLocation(300,80);
		frame.add(e);
		
		frame.setVisible(true);
		
		
	}
	
	public static void main(String args[]){
		new Gui ();
	}
	
	//button actions
	static class Action implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	          String nameData = field.getText();
	          @SuppressWarnings("deprecation")
			String passwordData = p.getText();
	            if (nameData.equals(""))
	                JOptionPane.showMessageDialog(null,"Please enter User Name in the Text Box.");
	            if (passwordData.equals(""))
	                JOptionPane.showMessageDialog(null,"Please enter Password in the Text Box.");
	            else{
	            	
	            	
	     	     

	   
	            	
	            	
	            	
	            	switch (nameData) {
	            	
	      
	       case "Doctor1": if (passwordData.equals("Doctor1password")){
	    	   					JOptionPane.showMessageDialog(null,"Success1");
	    	   					
	    	   					frame.dispose();
	    	   					
	    	   					doctor1();
	    	   					
	    	   					
	       					}
	       					else{
	       						JOptionPane.showMessageDialog(null,"Failed"); 
	       					}
	       					break;
	       					
           case "Doctor2": if (passwordData.equals("Doctor2password")){
  								JOptionPane.showMessageDialog(null,"Success2");
  								
	    	   					frame.dispose();
	    	   					
	    	   					doctor2();
	    	   					
							}
							else{
								JOptionPane.showMessageDialog(null,"Failed"); 
							}
           					break;
           
           case "Patient1": if (passwordData.equals("Patient1password")){
  								JOptionPane.showMessageDialog(null,"Success1");
  								
	    	   					frame.dispose();
	    	   					
	    	   					patient1();
  								
  								
							}
							else{
								JOptionPane.showMessageDialog(null,"Failed"); 
							}
           					break;
         
           case "Patient2": if (passwordData.equals("Patient2password")){
								JOptionPane.showMessageDialog(null,"Success2");
								
	    	   					frame.dispose();
	    	   					
	    	   					patient2();
							}
							else{
								JOptionPane.showMessageDialog(null,"Failed"); 
							}
							break;
       
           case "Patient3": if (passwordData.equals("Patient3password")){
								JOptionPane.showMessageDialog(null,"Success3");
								
								patient3();
								
							}
							else{
								JOptionPane.showMessageDialog(null,"Failed"); 
							}
							break;
							
           case "":			//if this case isn't here or if please enter user name is put here it will pop up twice and use default option
           					break;
           					
           default:  		JOptionPane.showMessageDialog(null,"Failed");   	
	            	}
	        }

	    }

		private void doctor1() {

				Doctor1 = new JFrame ("Doctor1 ");
				Doctor1.setSize(500,700);
				Doctor1.setLocation(300,200);
				Doctor1.setLayout(null);
				Doctor1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				Doctor1.setVisible(true);
			
		}

		private void doctor2() {
				
				Doctor2 = new JFrame ("Doctor2 ");
				Doctor2.setSize(500,700);
				Doctor2.setLocation(300,200);
				Doctor2.setLayout(null);
				Doctor2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				Doctor2.setVisible(true);
			
		}

		private void patient1() {
			
				Patient1 = new JFrame ("Patient1 ");
				Patient1.setSize(700,700);
				Patient1.setLocation(300,200);
				Patient1.setLayout(null);
				Patient1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				symptoms();
				
				Patient1.setVisible(true);
				
			
		}
		
		private void symptoms() {
			//put radio buttons 1-10 in here and radio button display
			
		}

		private void patient2() {
			
				Patient2 = new JFrame ("Patient2 ");
				Patient2.setSize(700,700);
				Patient2.setLocation(300,200);
				Patient2.setLayout(null);
				Patient2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				symptoms();
				
				Patient2.setVisible(true);
			
		}

		private void patient3() {
				Patient3 = new JFrame ("Patient3 ");
				Patient3.setSize(700,700);
				Patient3.setLocation(300,200);
				Patient3.setLayout(null);
				Patient3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				symptoms();
				
				Patient3.setVisible(true);
			
		}
	}
	
	
}