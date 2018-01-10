package gui;

import java.awt.BorderLayout;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

import dataPackage.*;

public class TablePanel extends JPanel {

	JButton closeButton, webButton;
	// CSVTable data;
	private JTable jTableCsv;

	public TablePanel(CSVTable data) {
		// 3.this.data = data;
		InputStream is;

		setLayout(new BorderLayout(0, 0));
		setSize(800, 500);

		jTableCsv = new JTable();

		JScrollPane scroll = new JScrollPane(getjTableCsv());
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		add(scroll, BorderLayout.NORTH);
		jTableCsv.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		jTableCsv.setModel(data.getModel());
		try {
			//JFileChooser fileChooser = new JFileChooser();
			//FileNameExtensionFilter filter = new FileNameExtensionFilter("CSV FILES", "csv", "csv");
			//fileChooser.setFileFilter(filter);
			//int returnValue = fileChooser.showOpenDialog(null);
			//if (returnValue == JFileChooser.APPROVE_OPTION) {
				//File selectedFile = fileChooser.getSelectedFile();
				//String selectedFilePath = selectedFile.getPath();
				File f = new File("Examples/voorbeeld2.csv");
				is = new FileInputStream(f);
				data.insertData(is);
//			} else if (returnValue == JFileChooser.CANCEL_OPTION) {
//				System.out.println("Program Closing.");
//				System.exit(1);
//			}
		} catch (IOException ioe) {
			JOptionPane.showMessageDialog(this, ioe, "Error reading data", JOptionPane.ERROR_MESSAGE);
		}

	}

	public JTable getjTableCsv() {
		return jTableCsv;
	}

}
