package dataPackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import gui.CheckRenderer;

public class CSVTable {
	DefaultTableModel model;
	List<Integer> empty;

	public CSVTable() {
		String[] colNames = new String[] { "product_id", "naam", "art_num_leverancier", "inkoopprijs", "opmerking",
				"kleur_id", "merk_id", "groep_id", "soort_id", "btw_tarief_id", "leverancier_id", "lever_van",
				"lever_tot", "datum_ontvangst", "prijs_1", "prijs_2", "prijs_3", "grootheid_id", "seizoen_id",
				"subsoort_id", "kleurcode_leverancier", "uitsluiten_punten", "uitsluiten_korting",
				"uitsluiten_voorraad", "opmerking_extern", "adviesprijs", "serienummer_verplicht", "geblokkeerd",
				"garantietermijn", "ruilen", "last_modified", "tags", "discontinued", "Variatie" };

		model = new DefaultTableModel(colNames, 0);

	}

	public DefaultTableModel getModel() {
		return model;
	}

	public void insertData(InputStream is) {
		Scanner scan = new Scanner(is);
		String[] array;
		empty = new ArrayList<Integer>();

		while (scan.hasNextLine()) {
			String line = scan.nextLine();

			if (line.indexOf(";") > -1) {
				array = line.split(";");
			} else {
				array = line.split("\t");
			}

			for (int i = 0; i < array.length; i++) {
				if (array[i] == "") {
					empty.add(i);
					empty.add(model.getRowCount());
				}
			}

			Object[] dataContent = new Object[array.length];
			for (int i = 0; i < array.length; i++) {
				dataContent[i] = array[i];
			}
			model.addRow(dataContent);
		}

		System.out.println("Columns: " + model.getColumnCount() + "\n" + "Rows: " + model.getRowCount());

		scan.close();
		
	}

}
