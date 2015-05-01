package simplelogin;


import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import simplelogin.Gui.Action;

public class doctor extends JFrame {
private JTextField filename = new JTextField(), dir = new JTextField();
private JButton open = new JButton("Browse");
private JButton message = new JButton("Message");
private JButton f = new JButton("Submit");
JTextArea textArea = new JTextArea(15, 20);
static JTextArea field = new JTextArea(10, 10);
static JFrame framemessage = new JFrame ("Message Patient");

public doctor() {
JPanel p = new JPanel();
open.addActionListener(new OpenL());
p.add(open);
message.addActionListener(new message());
p.add(message);
Container cp = getContentPane();
cp.add(p, BorderLayout.SOUTH);
dir.setEditable(false);
filename.setEditable(false);
p = new JPanel();
p.setLayout(new GridLayout(2, 1));
p.add(filename);
p.add(dir);
cp.add(p, BorderLayout.NORTH);
JPanel d = new JPanel();
cp.add(d); 
textArea.setEditable(false);
d.add(textArea);


}

static class Actionmessage implements ActionListener {
    public void actionPerformed(ActionEvent e) {
          
      	File file = new File("C:\\Patient1message");
    	
      	if (!file.exists()) {
      		if (file.mkdir()) {
      			System.out.println("Patient message directory is created!");
      		} else {
      			System.out.println("Failed to create patient message directory!");
      		}
      	}

      	
      	PrintWriter outmessage  = null;
      	
			try {

				
				outmessage = new PrintWriter("C:\\Patient1message\\Patientmessage.txt");
			}catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
			
			DateFormat dateFormat1 = new SimpleDateFormat("MM.dd.yyyy");
			Date date = new Date();
			DateFormat dateFormat2 = new SimpleDateFormat("HH.mm");
			Date date2 = new Date();
			
	        String nameData = dateFormat1.format(date) + " " + dateFormat2.format(date2) + ":\n" + field.getText() + "\n";
	        outmessage.print(nameData);
	        outmessage.close();
	        framemessage.dispose();
          
    }}

class message implements ActionListener {
public void actionPerformed(ActionEvent e) {
	


	framemessage.setSize(500,300);
	framemessage.setLocation(300,200);
	framemessage.setLayout(null);
	
	

	field.setColumns(25);
	field.setSize(field.getPreferredSize());
	field.setLocation(100, 10);
	framemessage.add(field);

	f.setSize(f.getPreferredSize());
	f.setLocation(200,225);
	framemessage.add(f);
	f.addActionListener(new Actionmessage());
	
	
	framemessage.add(f);

	

	
	framemessage.setVisible(true);
	
	
	}
}

class OpenL implements ActionListener {
public void actionPerformed(ActionEvent e) {
 JFileChooser c = new JFileChooser();
 int rVal = c.showOpenDialog(doctor.this);
 if (rVal == JFileChooser.APPROVE_OPTION) {
   filename.setText(c.getSelectedFile().getName());
   dir.setText(c.getCurrentDirectory().toString());
   try {
	BufferedReader in = new BufferedReader(new FileReader(c.getSelectedFile()));
	
	try {
		textArea.setText("");

		String symptom1 = in.readLine();
		String symptom2 = in.readLine();
		String symptom3 = in.readLine();
		String symptom4 = in.readLine();
		String symptom5 = in.readLine();
		String symptom6 = in.readLine();
		String symptom7 = in.readLine();
		String symptom8 = in.readLine();
		String symptom9 = in.readLine();
		String symptom10 = in.readLine();
		
		

		textArea.append(symptom1 + "\n");
		textArea.append(symptom2 + "\n");
		textArea.append(symptom3 + "\n");
		textArea.append(symptom4 + "\n");
		textArea.append(symptom5 + "\n");
		textArea.append(symptom6 + "\n");
		textArea.append(symptom7 + "\n");
		textArea.append(symptom8 + "\n");
		textArea.append(symptom9 + "\n");
		textArea.append(symptom10 + "\n");

		
		
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} 
	
} catch (FileNotFoundException e1) {

	e1.printStackTrace();
}
   
 }
 if (rVal == JFileChooser.CANCEL_OPTION) {
   filename.setText("You pressed cancel");
   dir.setText("");
 }
}


}

public static void main(String[] args) {
run(new doctor(), 400, 300);
}

public static void run(JFrame frame, int width, int height) {
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(width, height);
frame.setVisible(true);
}
} 

