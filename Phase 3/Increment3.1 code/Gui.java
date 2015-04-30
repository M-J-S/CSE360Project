package simplelogin;




import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame; //library
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import doctorGui.doctor;

public class Gui  {


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
		
		e = new JButton("Help");
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
	    	   					JOptionPane.showMessageDialog(null,"Success");
	    	   					
	    	   					frame.dispose();
	    	   					
	    	   					doctor1();
	    	   					
	    	   					
	       					}
	       					else{
	       						JOptionPane.showMessageDialog(null,"Failed"); 
	       					}
	       					break;

           
           case "Patient1": if (passwordData.equals("Patient1password")){
  								JOptionPane.showMessageDialog(null,"Success");
  								
	    	   					frame.dispose();
	    	   					
	    	   					patient1();
  								
  								
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

		    new doctor();
			
		}



		private void patient1() {
			
	        new patientSlider();
			
		}
		




	}
	
	
}