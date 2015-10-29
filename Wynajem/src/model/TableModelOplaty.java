package model;

import javax.swing.table.DefaultTableModel;

public class TableModelOplaty extends DefaultTableModel {

	private String[] columnNames = {"Id", //zmien tutaj
			"Data",
			"Opis",
			"Nr faktury",
			"Kwota",
			"Stan-Administrator",
			"Data Oplacenia - A.",
			"Stan-Wynajmujacy",
			"Data Oplacenia - W"			
};
private Object[][] data = {};

Class types[] = new Class[] {Integer.class, String.class, String.class, String.class,
							Double.class, Boolean.class, String.class, 
							 Boolean.class, String.class}; //zmien tutaj

@Override
public int getColumnCount() {
return columnNames.length;
}
@Override
public int getRowCount() {
return (data == null?0:data.length);
}
@Override
public String getColumnName(int col) {
return columnNames[col];
}
@Override
public Object getValueAt(int row, int col) {
return (data == null?null:data[row][col]);
} 
@Override
public Class getColumnClass(int c) {
return types[c];
}

}
