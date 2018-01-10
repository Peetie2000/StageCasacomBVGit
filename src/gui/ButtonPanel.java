package gui;

import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

import dataPackage.*;

public class ButtonPanel extends JPanel {

	private CheckButtonListener checkButtonListener;	
	
	public ButtonPanel(CSVTable csvTable) {
		setSize(800, 20);
		setLayout(new GridLayout(1, 4, 0, 0));

		JButton check = new JButton();
		check.setText("Clean");
		check.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkButtonListener.clickCleaner();
			}
		});
		add(check);

		JButton duplicates = new JButton();
		duplicates.setText("Duplicaten");
		duplicates.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
			}
		});
		add(duplicates);

		JButton emptyFields = new JButton();
		emptyFields.setText("Lege velden");
		emptyFields.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkButtonListener.clickCheck();
			}
		});
		add(emptyFields);

		JButton illegal = new JButton();
		illegal.setText("Illegale karakters");
		illegal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				checkButtonListener.clickIllegal();
			}
		});
		add(illegal);

	}

	public void setCheckButtonListener(CheckButtonListener cbl) {
		this.checkButtonListener = cbl;
	}
}