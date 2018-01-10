package gui;

import javax.swing.JPanel;

import dataPackage.*;

public class MainPanel extends JPanel implements CheckButtonListener{

	CSVTable csvTable;
	TablePanel table;
	ButtonPanel buttons;
	
	public MainPanel(){
		setLayout(null);
		setSize(800,700);
		csvTable = new dataPackage.CSVTable();

		buttons = new ButtonPanel(csvTable);
		buttons.setCheckButtonListener(this);
		buttons.setLocation(0, 0);
		
		table = new TablePanel(csvTable);
		table.setLocation(0, 20);
		
		add(buttons);
		add(table);
	}
	
	public void beginPaint(){
		table.repaint();
	}
	public void bindRenderer(){
		for (int i = 0; i < table.getjTableCsv().getColumnCount(); i++) {
			String columnName = table.getjTableCsv().getColumnName(i);
			table.getjTableCsv().getColumn(columnName).setCellRenderer(new CustomRenderer());
		}
		table.repaint();
	}
	
	public void bindIntegerRenderer(){
		for (int i = 0; i < table.getjTableCsv().getColumnCount(); i++) {
			String columnName = table.getjTableCsv().getColumnName(i);
			table.getjTableCsv().getColumn(columnName).setCellRenderer(new CustomRendererIllegal());
		}
		table.repaint();
	}
	
	public void bindCleaner(){
		for (int i = 0; i < table.getjTableCsv().getColumnCount(); i++) {
			String columnName = table.getjTableCsv().getColumnName(i);
			table.getjTableCsv().getColumn(columnName).setCellRenderer(new CustomCleanerRenderer());
		}
		table.repaint();
	}
	
	@Override
	public void clickCheck() {
		bindRenderer();		
	}
	
	@Override
	public void clickIllegal() {
		bindIntegerRenderer();
	}
	
	@Override
	public void clickCleaner() {
		bindCleaner();
	}
}
