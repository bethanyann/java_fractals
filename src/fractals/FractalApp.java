package fractals;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JButton;

public class FractalApp extends JApplet implements ActionListener{
	
	JButton start;
	//declare your components here
	public void init () 
	{  //this is where you instantiate and add all your components just like a constructor
		getContentPane().setLayout(null);
		setSize(600, 600);//sets the size of the appletviewer

		start = new JButton("Start");
		start.setBounds(275,300,100,30);
		getContentPane().add(start);
		
	}



	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
