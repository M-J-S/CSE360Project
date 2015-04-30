/**********************************************************
NOTE: *change import package simplelogin accordingly line 7
	  *change import simple.simplelogin.patientSlider according with package line 11
	  *symptoms can be changed to reflect the patientSlider document according with
		input line 220
***********************************************************/
package simplelogin;

//import java.awt.Color;

import simplelogin.patientSlider;

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

//class GUI with included methods to generate a login screen, able to access patientSLider.h 
//and display patient's next screen
public class Gui implements patientSlider {

	static JFrame frame, Doctor1, Doctor2, Patient1, Patient2, Patient3; //frames
	static JTextField field;
	static JPasswordField p;
	JLabel l;
	JButton b, e;

	Gui () {
		
		frame = new JFrame ("Login Screen ");  //created frame for login in components
		frame.setSize(500,200);
		//frame.getContentPane().setBackground(Color.black);
		frame.setLocation(300,200);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l = new JLabel ("User Name");  //user name label for textfield
		l.setLocation(50,10);
		l.setSize(l.getPreferredSize());
		frame.add(l);
		
		field = new JTextField();  //user name textfield created for user
		field.setColumns(25);
		field.setSize(field.getPreferredSize());
	
		field.setLocation(150, 10);
		field.setToolTipText("Enter User Name");
		frame.add(field);
		
		l = new JLabel ("Password"); //label for password textfield
		l.setLocation(50,40);
		l.setSize(l.getPreferredSize());
		frame.add(l);
		
		p = new JPasswordField();  //password textfield created for user
		p.setColumns(25);
		p.setSize(p.getPreferredSize());
	
		p.setLocation(150, 40);
		p.setToolTipText("Enter Password");
		frame.add(p);
		
		b = new JButton("Login");  //creates login button for user login
		b.setSize(b.getPreferredSize());
		b.setLocation(150,80);
		frame.add(b);
		b.addActionListener(new Action());
		
		e = new JButton("Emergency"); //creates emergency button for patient's immediate contact
		e.setSize(e.getPreferredSize());
		e.setLocation(300,80);
		frame.add(e);
		
		frame.setVisible(true);	
	}
	
	//main method to create the login GUI
	public static void main(String args[]){
		new Gui ();
	}
	
	//button, actions and mechanics for the GUI 
	static class Action implements ActionListener {

	    public void actionPerformed(ActionEvent e) {

	        String nameData = field.getText();
	        @SuppressWarnings("deprecation")
			String passwordData = p.getText();
	        if (nameData.equals(""))  //if user name information is not filled
	            JOptionPane.showMessageDialog(null,"Please enter User Name in the Text Box.");
	        if (passwordData.equals(""))  //if password information is not filled
	            JOptionPane.showMessageDialog(null,"Please enter Password in the Text Box.");
	        else{
	            //switch will check if the current entered user name will match with the password given
	            switch (nameData) {	
	      			
	      			//****password data is already pre-assigned for patients and doctors
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
           
           			//******reminder: password data is already pre-assigned for patients and doctors
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
							
           			case "":		//if this case isn't here or if please enter user name is put here it will pop up twice and use default option

           			break;
           					
           			default:  		JOptionPane.showMessageDialog(null,"Failed");   	
	            }
	        }
	    }

	    //displays the GUI for the doctor upon correct entered username & password
		private void doctor1() {

			Doctor1 = new JFrame ("Doctor1 ");
			Doctor1.setSize(500,700);
			Doctor1.setLocation(300,200);
			Doctor1.setLayout(null);
			Doctor1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
			Doctor1.setVisible(true);
		}

		//displays the GUI for the doctor upon correct entered username & password
		private void doctor2() {
				
			Doctor2 = new JFrame ("Doctor2 ");
			Doctor2.setSize(500,700);
			Doctor2.setLocation(300,200);
			Doctor2.setLayout(null);
			Doctor2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
			Doctor2.setVisible(true);
		}

		//displays the GUI for the patient upon correct entered username & password
		private void patient1() {
			
			Patient1 = new JFrame ("Patient1 ");
			Patient1.setSize(700,700);
			Patient1.setLocation(300,200);
			Patient1.setLayout(null);
			Patient1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
			symptoms();	//displays the symptoms slider for patient to enter data
				
			Patient1.setVisible(true);	
		}
		
		//method creates the symptom slider frame for the user
		//access the file patientSlider.java
		private void symptoms() {
			//put radio buttons 1-10 in here and radio button display
			patientSlider frame = new patientSlider();
        	frame.setVisible(true);
		}

		//displays the GUI for the patient upon correct entered username & password
		private void patient2() {
			
			Patient2 = new JFrame ("Patient2 ");
			Patient2.setSize(700,700);
			Patient2.setLocation(300,200);
			Patient2.setLayout(null);
			Patient2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
			symptoms();	//displays the symptoms slider for patient to enter data
				
			Patient2.setVisible(true);
		}

		//displays the GUI for the patient upon correct entered username & password
		private void patient3() {

			Patient3 = new JFrame ("Patient3 ");
			Patient3.setSize(700,700);
			Patient3.setLocation(300,200);
			Patient3.setLayout(null);
			Patient3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
			symptoms();	//displays the symptoms slider for patient to enter data
				
			Patient3.setVisible(true);
		}
	}
}