package gui;

import javax.swing.JFrame;
import gui.MainPanel;

public class MainFrame  extends JFrame{
	
	
	public MainFrame(){
		setSize(804, 486);
		setResizable(false);
		setVisible(true);
		setTitle("Test Ruben and Patrick");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setContentPane(new MainPanel());
		//new MainPanel().csvTable.getModel().repaint();
		
	}
}
