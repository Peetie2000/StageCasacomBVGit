package gui;

import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

import dataPackage.*;

public class ButtonPanel extends JPanel {

	public CheckButtonListener checkButtonListener;
	public BeginCheck beginCheck;
	public NewRenderer newRenderer;

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

		JButton nieuw = new JButton();
		nieuw.setText("Nieuw");
		nieuw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//newRenderer.nieuwRender();
			}
		});
		add(nieuw);

		
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

	public void setNieuwListener(NewRenderer nr) {
		this.newRenderer = nr;
	}

	public void setCheckButtonListener(CheckButtonListener cbl) {
		this.checkButtonListener = cbl;
	}

	public void setBeginCheck(BeginCheck bc) {
		this.beginCheck = bc;
	}

}
