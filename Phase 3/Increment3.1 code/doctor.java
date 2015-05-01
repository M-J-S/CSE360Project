package doctorGui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class doctor extends JFrame {
private JTextField filename = new JTextField(), dir = new JTextField();
private JButton open = new JButton("Browse");

public doctor() {
JPanel p = new JPanel();
open.addActionListener(new OpenL());
p.add(open);
Container cp = getContentPane();
cp.add(p, BorderLayout.SOUTH);
dir.setEditable(false);
filename.setEditable(false);
p = new JPanel();
p.setLayout(new GridLayout(3, 1));
p.add(filename);
p.add(dir);
cp.add(p, BorderLayout.NORTH);
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
run(new doctor(), 500, 500);
}

public static void run(JFrame frame, int width, int height) {
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(width, height);
frame.setVisible(true);
}
} 

