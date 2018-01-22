package gui;

import javax.swing.JPanel;
import javax.swing.JTextField;

import dataPackage.*;

public class MainPanel extends JPanel implements ButtonListener {

	CSVTable csvTable;
	private TablePanel table;
	ButtonPanel buttons;

	public MainPanel() {
		setLayout(null);
		setSize(800, 700);
		csvTable = new dataPackage.CSVTable();

		buttons = new ButtonPanel(csvTable);
		buttons.setClickCheck(this);
		buttons.setClickClean(this);
		buttons.setClickExtra(this);
		buttons.setLocation(0, 0);

		table = new TablePanel(csvTable);
		table.setLocation(0, 20);

		add(buttons);
		add(table);
		for (int i = 0; i < table.getjTableCsv().getColumnCount(); i++) {
			String columnName = table.getjTableCsv().getColumnName(i);
			table.getjTableCsv().getColumn(columnName).setCellRenderer(new BeginRenderer());
		}
	}

	public void bindCheck() {
		for (int i = 0; i < table.getjTableCsv().getColumnCount(); i++) {
			if (i == 4 || i == 20 || i == 24 || i == 31) {
			} else {
				String columnName = table.getjTableCsv().getColumnName(i);
				table.getjTableCsv().getColumn(columnName).setCellRenderer(new CheckRenderer());
			}
		}
		table.repaint();
	}

	public void bindClean() {
		for (int i = 0; i < table.getjTableCsv().getColumnCount(); i++) {
			String columnName = table.getjTableCsv().getColumnName(i);
			table.getjTableCsv().getColumn(columnName).setCellRenderer(new CleanRenderer());
		}
		table.repaint();
	}

	public void bindExtra() {
		for (int i = 0; i < table.getjTableCsv().getColumnCount(); i++) {
			String columnName = table.getjTableCsv().getColumnName(i);
			table.getjTableCsv().getColumn(columnName).setCellRenderer(new ExtraRenderer());
		}
		table.repaint();
	}

	@Override
	public void clickCheck() {
		bindCheck();
	}

	@Override
	public void clickClean() {
		bindClean();
	}

	@Override
	public void clickExtra() {
		bindExtra();
	}

}
