package gui;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class CustomRenderer extends JLabel implements TableCellRenderer{

	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {
		setText(value.toString());
		String cellValue = value.toString();
		try{
			//double intValue = Double.parseDouble(value.toString());
			if(cellValue.length() == 0){
				setBackground(Color.RED);
				setOpaque(true);
			}
			else {
				setOpaque(false);
			} 
			
		} catch (Exception e){
			if(e instanceof NumberFormatException){
				System.out.println(e.getMessage());
			}
		}
		return this;
	}

	
}
