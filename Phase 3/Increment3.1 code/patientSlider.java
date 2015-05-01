package simplelogin;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


 
 
public class patientSlider extends JFrame
{
 
    private static final long serialVersionUID = 1L;

	protected static final String Clock = null;
 
    private JSlider slider1 ;
    private JSlider slider2 ;
    private JSlider slider3 ;
    private JSlider slider4 ;
    private JSlider slider5 ;
    private JSlider slider6 ;
    private JSlider slider7 ;
    private JSlider slider8 ;
    private JSlider slider9 ;
    private JSlider slider10 ;
    
    
    private JLabel lbl1 ;
    private JLabel lbl2 ;
    private JLabel lbl3 ;
    private JLabel lbl4 ;
    private JLabel lbl5 ;
    private JLabel lbl6 ;
    private JLabel lbl7 ;
    private JLabel lbl8 ;
    private JLabel lbl9 ;
    private JTextField lbl10 ;
    private JLabel lbl11 ;
    
    private JPanel panel1 ;
    private JPanel panel2 ;
    private JPanel panel3 ;
    private JPanel panel4 ;
    private JPanel panel5 ;
    private JPanel panel6 ;
    private JPanel panel7 ;
    private JPanel panel8 ;
    private JPanel panel9 ;
    private JPanel panel10 ;
    private JPanel panel11 ;
    
    private JTextField txt1 ;
    private JTextField txt2 ;
    private JTextField txt3 ;
    private JTextField txt4 ;
    private JTextField txt5 ;
    private JTextField txt6 ;
    private JTextField txt7 ;
    private JTextField txt8 ;
    private JTextField txt9 ;
    private JTextField txt10 ;
    
	JButton b;

 
    public patientSlider() {
        super("patientGUI");
        setAlwaysOnTop(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(new Color(14555));
        setSize(new Dimension(800,1000));
        setResizable(true);
        /****************************************************************/
       
       // container = getContentPane();
       // BorderLayout containerLayout = new BorderLayout();
       // container.setLayout(containerLayout);
        
        Container c = getContentPane();
        c.setLayout(new GridLayout(11,1));
        
 
        /****************** Labels Properties ********************************/
        lbl1 = new JLabel("Pain");
        lbl2 = new JLabel("Tiredness");
        lbl3 = new JLabel("Nausea");
        lbl4 = new JLabel("Depression");
        lbl5 = new JLabel("Anxiety");
        lbl6 = new JLabel("Drowsiness");
        lbl7 = new JLabel("Appetite");
        lbl8 = new JLabel("Wellbeing");
        lbl9 = new JLabel("Shortness of breath");
        lbl10 = new JTextField(4);
        lbl11 = new JLabel("Other");
 
        /****************** TextField1 Properties ********************************/
        txt1 = new JTextField(4);
        txt1.setToolTipText("Set Value in Range between 0 - 10 ") ;
        
        /****************** TextField2 Properties ********************************/
        txt2 = new JTextField(4);
        txt2.setToolTipText("Set Value in Range between 0 - 10 ") ;
        
        /****************** TextField3 Properties ********************************/
        txt3 = new JTextField(4);
        txt3.setToolTipText("Set Value in Range between 0 - 10 ") ;
        
        /****************** TextField4 Properties ********************************/
        txt4 = new JTextField(4);
        txt4.setToolTipText("Set Value in Range between 0 - 10 ") ;
        
        /****************** TextField5 Properties ********************************/
        txt5 = new JTextField(4);
        txt5.setToolTipText("Set Value in Range between 0 - 10 ") ;
        
        /****************** TextField6 Properties ********************************/
        txt6 = new JTextField(4);
        txt6.setToolTipText("Set Value in Range between 0 - 10 ") ;
        
        /****************** TextField7 Properties ********************************/
        txt7 = new JTextField(4);
        txt7.setToolTipText("Set Value in Range between 0 - 10 ") ;
        
        /****************** TextField8 Properties ********************************/
        txt8 = new JTextField(4);
        txt8.setToolTipText("Set Value in Range between 0 - 10 ") ;
        
        /****************** TextField9 Properties ********************************/
        txt9 = new JTextField(4);
        txt9.setToolTipText("Set Value in Range between 0 - 10 ") ;
        
        /****************** TextField9 Properties ********************************/
        txt10 = new JTextField(4);
        lbl10.setToolTipText("Enter any symptom you're experiencing not listed above") ;
        txt10.setToolTipText("Set Value in Range between 0 - 10 ") ;


        /****************** Slider1 Properties ***********************************/
        slider1 = new JSlider(JSlider.HORIZONTAL,0,10,0);//direction , min , max , current
        slider1.setFont(new Font("Tahoma",Font.BOLD,12));
        slider1.setMajorTickSpacing(1);
        slider1.setMinorTickSpacing(1);
        slider1.setPaintLabels(true);
        slider1.setPaintTicks(true);
        slider1.setPaintTrack(true);
        slider1.setAutoscrolls(true);
        slider1.setPreferredSize(new Dimension(500,50));
        
        /****************** Slider2 Properties ***********************************/
        slider2 = new JSlider(JSlider.HORIZONTAL,0,10,0);//direction , min , max , current
        slider2.setFont(new Font("Tahoma",Font.BOLD,12));
        slider2.setMajorTickSpacing(1);
        slider2.setMinorTickSpacing(1);
        slider2.setPaintLabels(true);
        slider2.setPaintTicks(true);
        slider2.setPaintTrack(true);
        slider2.setAutoscrolls(true);
        slider2.setPreferredSize(new Dimension(500,50));
        
        /****************** Slider3 Properties ***********************************/
        slider3 = new JSlider(JSlider.HORIZONTAL,0,10,0);//direction , min , max , current
        slider3.setFont(new Font("Tahoma",Font.BOLD,12));
        slider3.setMajorTickSpacing(1);
        slider3.setMinorTickSpacing(1);
        slider3.setPaintLabels(true);
        slider3.setPaintTicks(true);
        slider3.setPaintTrack(true);
        slider3.setAutoscrolls(true);
        slider3.setPreferredSize(new Dimension(500,50));
        
        /****************** Slider4 Properties ***********************************/
        slider4 = new JSlider(JSlider.HORIZONTAL,0,10,0);//direction , min , max , current
        slider4.setFont(new Font("Tahoma",Font.BOLD,12));
        slider4.setMajorTickSpacing(1);
        slider4.setMinorTickSpacing(1);
        slider4.setPaintLabels(true);
        slider4.setPaintTicks(true);
        slider4.setPaintTrack(true);
        slider4.setAutoscrolls(true);
        slider4.setPreferredSize(new Dimension(500,50));
        
        /****************** Slider5 Properties ***********************************/
        slider5 = new JSlider(JSlider.HORIZONTAL,0,10,0);//direction , min , max , current
        slider5.setFont(new Font("Tahoma",Font.BOLD,12));
        slider5.setMajorTickSpacing(1);
        slider5.setMinorTickSpacing(1);
        slider5.setPaintLabels(true);
        slider5.setPaintTicks(true);
        slider5.setPaintTrack(true);
        slider5.setAutoscrolls(true);
        slider5.setPreferredSize(new Dimension(500,50));
        
        /****************** Slider6 Properties ***********************************/
        slider6 = new JSlider(JSlider.HORIZONTAL,0,10,0);//direction , min , max , current
        slider6.setFont(new Font("Tahoma",Font.BOLD,12));
        slider6.setMajorTickSpacing(1);
        slider6.setMinorTickSpacing(1);
        slider6.setPaintLabels(true);
        slider6.setPaintTicks(true);
        slider6.setPaintTrack(true);
        slider6.setAutoscrolls(true);
        slider6.setPreferredSize(new Dimension(500,50));
        
        /****************** Slider7 Properties ***********************************/
        slider7 = new JSlider(JSlider.HORIZONTAL,0,10,0);//direction , min , max , current
        slider7.setFont(new Font("Tahoma",Font.BOLD,12));
        slider7.setMajorTickSpacing(1);
        slider7.setMinorTickSpacing(1);
        slider7.setPaintLabels(true);
        slider7.setPaintTicks(true);
        slider7.setPaintTrack(true);
        slider7.setAutoscrolls(true);
        slider7.setPreferredSize(new Dimension(500,50));
        
        /****************** Slider8 Properties ***********************************/
        slider8 = new JSlider(JSlider.HORIZONTAL,0,10,0);//direction , min , max , current
        slider8.setFont(new Font("Tahoma",Font.BOLD,12));
        slider8.setMajorTickSpacing(1);
        slider8.setMinorTickSpacing(1);
        slider8.setPaintLabels(true);
        slider8.setPaintTicks(true);
        slider8.setPaintTrack(true);
        slider8.setAutoscrolls(true);
        slider8.setPreferredSize(new Dimension(500,50));
        
        /****************** Slider9 Properties ***********************************/
        slider9 = new JSlider(JSlider.HORIZONTAL,0,10,0);//direction , min , max , current
        slider9.setFont(new Font("Tahoma",Font.BOLD,12));
        slider9.setMajorTickSpacing(1);
        slider9.setMinorTickSpacing(1);
        slider9.setPaintLabels(true);
        slider9.setPaintTicks(true);
        slider9.setPaintTrack(true);
        slider9.setAutoscrolls(true);
        slider9.setPreferredSize(new Dimension(500,50));
        
        /****************** Slider10 Properties ***********************************/
        slider10 = new JSlider(JSlider.HORIZONTAL,0,10,0);//direction , min , max , current
        slider10.setFont(new Font("Tahoma",Font.BOLD,12));
        slider10.setMajorTickSpacing(1);
        slider10.setMinorTickSpacing(1);
        slider10.setPaintLabels(true);
        slider10.setPaintTicks(true);
        slider10.setPaintTrack(true);
        slider10.setAutoscrolls(true);
        slider10.setPreferredSize(new Dimension(500,50));
        
        
        /*************************** Controls Events1 ************************************/
        //When Changing Slider 1 Cursor...do this
        slider1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                txt1.setText(String.valueOf(slider1.getValue()));
            }
        });
 

 
        //When Press Enter After Change...do this
        txt1.addActionListener(new ActionListener() {    
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    slider1.setValue(Integer.parseInt(txt1.getText()));
                }
                catch(Exception ex)
                {
                    txt1.setText("ERROR");
                    txt1.setToolTipText("Set Value in Range between 0 - 10 ") ;
                }
            }
        });
 
 
        this.addFocusListener(new FocusListener() {
            @Override
            public void focusLost(FocusEvent e){
            }
 
            @Override
            public void focusGained(FocusEvent e) {
                txt1.setText(String.valueOf(slider1.getValue()));
 
            }
        });
        /****************************************************************/
        
        /*************************** Controls Events2 ************************************/
        //When Changing Slider 2 Cursor...do this
        slider2.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                txt2.setText(String.valueOf(slider2.getValue()));
            }
        });
 

 
        //When Press Enter After Change...do this
        txt2.addActionListener(new ActionListener() {    
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    slider2.setValue(Integer.parseInt(txt2.getText()));
                }
                catch(Exception ex)
                {
                    txt2.setText("ERROR");
                    txt2.setToolTipText("Set Value in Range between 0 - 10 ") ;
                }
            }
        });
 
 
        this.addFocusListener(new FocusListener() {
            @Override
            public void focusLost(FocusEvent e){
            }
 
            @Override
            public void focusGained(FocusEvent e) {
                txt2.setText(String.valueOf(slider2.getValue()));
 
            }
        });
        /****************************************************************/
        
        /*************************** Controls Events3 ************************************/
        //When Changing Slider 2 Cursor...do this
        slider3.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                txt3.setText(String.valueOf(slider3.getValue()));
            }
        });
 

 
        //When Press Enter After Change...do this
        txt3.addActionListener(new ActionListener() {    
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    slider3.setValue(Integer.parseInt(txt3.getText()));
                }
                catch(Exception ex)
                {
                    txt3.setText("ERROR");
                    txt3.setToolTipText("Set Value in Range between 0 - 10 ") ;
                }
            }
        });
 
 
        this.addFocusListener(new FocusListener() {
            @Override
            public void focusLost(FocusEvent e){
            }
 
            @Override
            public void focusGained(FocusEvent e) {
                txt3.setText(String.valueOf(slider3.getValue()));
 
            }
        });
        /****************************************************************/
        
        /*************************** Controls Events4 ************************************/
        //When Changing Slider 2 Cursor...do this
        slider4.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                txt4.setText(String.valueOf(slider4.getValue()));
            }
        });
 

 
        //When Press Enter After Change...do this
        txt4.addActionListener(new ActionListener() {    
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    slider4.setValue(Integer.parseInt(txt4.getText()));
                }
                catch(Exception ex)
                {
                    txt4.setText("ERROR");
                    txt4.setToolTipText("Set Value in Range between 0 - 10 ") ;
                }
            }
        });
 
 
        this.addFocusListener(new FocusListener() {
            @Override
            public void focusLost(FocusEvent e){
            }
 
            @Override
            public void focusGained(FocusEvent e) {
                txt4.setText(String.valueOf(slider4.getValue()));
 
            }
        });
        /****************************************************************/
        
        /*************************** Controls Events5 ************************************/
        //When Changing Slider 2 Cursor...do this
        slider5.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                txt5.setText(String.valueOf(slider5.getValue()));
            }
        });
 

 
        //When Press Enter After Change...do this
        txt5.addActionListener(new ActionListener() {    
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    slider5.setValue(Integer.parseInt(txt5.getText()));
                }
                catch(Exception ex)
                {
                    txt5.setText("ERROR");
                    txt5.setToolTipText("Set Value in Range between 0 - 10 ") ;
                }
            }
        });
 
 
        this.addFocusListener(new FocusListener() {
            @Override
            public void focusLost(FocusEvent e){
            }
 
            @Override
            public void focusGained(FocusEvent e) {
                txt5.setText(String.valueOf(slider5.getValue()));
 
            }
        });
        /****************************************************************/
        
        /*************************** Controls Events6 ************************************/
        //When Changing Slider 2 Cursor...do this
        slider6.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                txt6.setText(String.valueOf(slider6.getValue()));
            }
        });
 

 
        //When Press Enter After Change...do this
        txt6.addActionListener(new ActionListener() {    
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    slider6.setValue(Integer.parseInt(txt6.getText()));
                }
                catch(Exception ex)
                {
                    txt6.setText("ERROR");
                    txt6.setToolTipText("Set Value in Range between 0 - 10 ") ;
                }
            }
        });
 
 
        this.addFocusListener(new FocusListener() {
            @Override
            public void focusLost(FocusEvent e){
            }
 
            @Override
            public void focusGained(FocusEvent e) {
                txt6.setText(String.valueOf(slider6.getValue()));
 
            }
        });
        /****************************************************************/
        
        /*************************** Controls Events7 ************************************/
        //When Changing Slider 2 Cursor...do this
        slider7.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                txt7.setText(String.valueOf(slider7.getValue()));
            }
        });
 

 
        //When Press Enter After Change...do this
        txt7.addActionListener(new ActionListener() {    
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    slider7.setValue(Integer.parseInt(txt7.getText()));
                }
                catch(Exception ex)
                {
                    txt7.setText("ERROR");
                    txt7.setToolTipText("Set Value in Range between 0 - 10 ") ;
                }
            }
        });
 
 
        this.addFocusListener(new FocusListener() {
            @Override
            public void focusLost(FocusEvent e){
            }
 
            @Override
            public void focusGained(FocusEvent e) {
                txt7.setText(String.valueOf(slider7.getValue()));
 
            }
        });
        /****************************************************************/
        
        /*************************** Controls Events8 ************************************/
        //When Changing Slider 2 Cursor...do this
        slider8.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                txt8.setText(String.valueOf(slider8.getValue()));
            }
        });
 

 
        //When Press Enter After Change...do this
        txt8.addActionListener(new ActionListener() {    
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    slider8.setValue(Integer.parseInt(txt8.getText()));
                }
                catch(Exception ex)
                {
                    txt8.setText("ERROR");
                    txt8.setToolTipText("Set Value in Range between 0 - 10 ") ;
                }
            }
        });
 
 
        this.addFocusListener(new FocusListener() {
            @Override
            public void focusLost(FocusEvent e){
            }
 
            @Override
            public void focusGained(FocusEvent e) {
                txt8.setText(String.valueOf(slider8.getValue()));
 
            }
        });
        /****************************************************************/
        
        /*************************** Controls Events9 ************************************/
        //When Changing Slider 2 Cursor...do this
        slider9.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                txt9.setText(String.valueOf(slider9.getValue()));
            }
        });
 

 
        //When Press Enter After Change...do this
        txt9.addActionListener(new ActionListener() {    
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    slider9.setValue(Integer.parseInt(txt9.getText()));
                }
                catch(Exception ex)
                {
                    txt9.setText("ERROR");
                    txt9.setToolTipText("Set Value in Range between 0 - 10 ") ;
                }
            }
        });
 
 
        this.addFocusListener(new FocusListener() {
            @Override
            public void focusLost(FocusEvent e){
            }
 
            @Override
            public void focusGained(FocusEvent e) {
                txt9.setText(String.valueOf(slider9.getValue()));
 
            }
        });
        /****************************************************************/
        /*************************** Controls Events10 ************************************/
        //When Changing Slider 2 Cursor...do this
        slider10.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                txt10.setText(String.valueOf(slider10.getValue()));
            }
        });
 

 
        //When Press Enter After Change...do this
        txt10.addActionListener(new ActionListener() {    
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    slider10.setValue(Integer.parseInt(txt10.getText()));
                }
                catch(Exception ex)
                {
                    txt10.setText("ERROR");
                    txt10.setToolTipText("Set Value in Range between 0 - 10 ") ;
                }
            }
        });
 
 
        this.addFocusListener(new FocusListener() {
            @Override
            public void focusLost(FocusEvent e){
            }
 
            @Override
            public void focusGained(FocusEvent e) {
                txt10.setText(String.valueOf(slider10.getValue()));
 
            }
        });
        /****************************************************************/
        
       
 
        panel1 = new JPanel();
        c.add(panel1);
        panel1.add(lbl1);
        panel1.add(txt1);
        panel1.add(slider1);
        
        
        panel2 = new JPanel();
        c.add(panel2);
        panel2.add(lbl2);
        panel2.add(txt2);
        panel2.add(slider2);
        
        panel3 = new JPanel();
        c.add(panel3);
        panel3.add(lbl3);
        panel3.add(txt3);
        panel3.add(slider3);
        
        panel4 = new JPanel();
        c.add(panel4);
        panel4.add(lbl4);
        panel4.add(txt4);
        panel4.add(slider4);
        
        panel5 = new JPanel();
        c.add(panel5);
        panel5.add(lbl5);
        panel5.add(txt5);
        panel5.add(slider5);
        
        panel6 = new JPanel();
        c.add(panel6);
        panel6.add(lbl6);
        panel6.add(txt6);
        panel6.add(slider6);
        
        panel7 = new JPanel();
        c.add(panel7);
        panel7.add(lbl7);
        panel7.add(txt7);
        panel7.add(slider7);
        
        panel8 = new JPanel();
        c.add(panel8);
        panel8.add(lbl8);
        panel8.add(txt8);
        panel8.add(slider8);
        
        panel9 = new JPanel();
        c.add(panel9);
        panel9.add(lbl9);
        panel9.add(txt9);
        panel9.add(slider9);
     
        panel10 = new JPanel();
        c.add(panel10);
        panel10.add(lbl11);
        panel10.add(lbl10);
        panel10.add(txt10);
        panel10.add(slider10);
        
        /***************************************Submit Button********************************************/
        panel11 = new JPanel();
        c.add(panel11);
        b = new JButton("Submit");
		b.setSize(b.getPreferredSize());
		//b.addActionListener(new Action());
        panel11.add(b);
        
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	//after submit button is clicked text file is written with symptom results and new text box pops up
            	//confirming submission
            	

            	
            	PrintWriter out = null;
            	
				try {
					DateFormat dateFormat1 = new SimpleDateFormat("MM.dd.yyyy");
					Date date = new Date();
					DateFormat dateFormat2 = new SimpleDateFormat("HH.mm");
					Date date2 = new Date();
					
					out = new PrintWriter("C:\\Patient1\\Patient_Date_" + dateFormat1.format(date) + "_Time_" + dateFormat2.format(date2) + ".txt");
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
				int valu1 = slider1.getValue();
				
				String status1;
				if(valu1 >= 7){
				 status1 = " Severe";
				}
				else{
				 status1 = " Okay";
				}
				
            	out.println("Pain:                " + valu1 + status1);
            	
				int valu2 = slider2.getValue();
				
				String status2;
				if(valu2 >= 7){
				 status2 = " Severe";
				}
				else{
				 status2 = " Okay";
				}
				
				
            	out.println("Tiredness:           " + valu2 + status2);
            	
				int valu3 = slider3.getValue();
				
				String status3;
				if(valu3 >= 7){
				 status3 = " Severe";
				}
				else{
				 status3 = " Okay";
				}
				
				
            	out.println("Nausea:              " + valu3 + status3);
            	
				int valu4 = slider4.getValue();
				
				String status4;
				if(valu4 >= 7){
				 status4 = " Severe";
				}
				else{
				 status4 = " Okay";
				}
				
				
            	out.println("Depression:          " + valu4 + status4);
            	
				int valu5 = slider5.getValue();
				
				String status5;
				if(valu5 >= 7){
				 status5 = " Severe";
				}
				else{
				 status5 = " Okay";
				}
				
				
            	out.println("Anxiety:             " + valu5 + status5);
            	
				int valu6 = slider6.getValue();
				
				String status6;
				if(valu6 >= 7){
				 status6 = " Severe";
				}
				else{
				 status6 = " Okay";
				}
				
				
            	out.println("Drowsiness:          " + valu6 + status6);
            	
				int valu7 = slider7.getValue();
				
				String status7;
				if(valu7 >= 7){
				 status7 = " Severe";
				}
				else{
				 status7 = " Okay";
				}
				
				
            	out.println("Appetite:            " + valu7 + status7);
            	
    			int valu8 = slider8.getValue();
    			
				String status8;
				if(valu8 >= 7){
				 status8 = " Severe";
				}
				else{
				 status8 = " Okay";
				}
				
    			
            	out.println("Wellbeing:           " + valu8 + status8);
            	
    			int valu9 = slider9.getValue();
    			
				String status9;
				if(valu9 >= 7){
				 status9 = " Severe";
				}
				else{
				 status9 = " Okay";
				}
				
    			
            	out.println("Shortness of breath: " + valu9 + status9);
            	
    			int valu10 = slider10.getValue();
    			String valu11 = lbl10.getText();
    			
				String status10;
				if(valu10 >= 7){
				 status10 = " Severe";
				}
				else{
				 status10 = " Okay";
				}
				
    			
            	out.println(valu11 + ": " + valu10 + status10);
            	
            	
            	
            	
            	
            	out.close();
            	dispose();
            
            }
         });
        /***********************************************************************************************/
 
 
        setVisible(true);
    }
 
    protected Object now(String clock2) {
		return null;
	}

	public static void main(String args[])
    {
        new patientSlider();
    }
}