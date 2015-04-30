package doctorGui;

import javax.swing.JFrame;


public class doctor {
	
	static JFrame frame;

	
	public doctor (){
		
		frame = new JFrame ("Doctor ");
		frame.setSize(500,200);
		//frame.getContentPane().setBackground(Color.black);
		frame.setLocation(300,200);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
		
	}



public static void main(String args[])
{
    new doctor();
}
}