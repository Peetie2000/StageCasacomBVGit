package gui;

import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

import dataPackage.*;

public class ButtonPanel extends JPanel {

	public ButtonListener buttonListener;

	public ButtonPanel(CSVTable csvTable) {
		setSize(800, 20);
		setLayout(new GridLayout(1, 5, 0, 0));

		JButton check = new JButton();
		check.setText("Clean");
		check.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener.clickClean();
			}
		});
		add(check);

		JButton duplicates = new JButton();
		duplicates.setText("Duplicaten");
		duplicates.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener.clickExtra();
			}
		});
		add(duplicates);

		JButton emptyFields = new JButton();
		emptyFields.setText("Lege velden");
		emptyFields.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener.clickCheck();
			}
		});
		add(emptyFields);

		JButton save = new JButton();
		save.setText("save");
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		add(save);

	}

	public void setClickCheck(ButtonListener cc) {
		this.buttonListener = cc;
	}

	public void setClickClean(ButtonListener cc2) {
		this.buttonListener = cc2;

	}

	public void setClickExtra(ButtonListener ce) {
		this.buttonListener = ce;

	}

}
