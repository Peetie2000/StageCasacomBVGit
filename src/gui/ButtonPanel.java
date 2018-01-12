package gui;

import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

import dataPackage.*;

public class ButtonPanel extends JPanel {

	private CheckButtonListener checkButtonListener;
	private BeginCheck beginCheck;
	private IllegalListener illegalListener;

	public ButtonPanel(CSVTable csvTable) {
		setSize(800, 20);
		setLayout(new GridLayout(1, 4, 0, 0));

		JButton check = new JButton();
		check.setText("Clean");
		check.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				beginCheck.beginPainter();
			}
		});
		add(check);

		JButton illegal = new JButton();
		illegal.setText("illegal");
		illegal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				illegalListener.IllegalCheck();
			}
		});
		add(illegal);

		
		JButton duplicates = new JButton();
		duplicates.setText("Duplicaten");
		duplicates.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

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
		
		
	}

	public void setIllegalListener(IllegalListener bi) {
		this.illegalListener = bi;
	}

	public void setCheckButtonListener(CheckButtonListener cbl) {
		this.checkButtonListener = cbl;
	}

	public void setBeginCheck(BeginCheck bc) {
		this.beginCheck = bc;
	}

}
