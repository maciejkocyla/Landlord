package model;

import javax.swing.table.DefaultTableModel;

public class TableModelMieszkania extends DefaultTableModel {
    private String[] columnNames = {"Id",
    								"Adres",
    								"Wynajmujacy"
    };
    private Object[][] data = {{null, null, null},
    		{null, null, null},
    		{null, null, null},
    		{null, null, null},
    		{null, null, null},
    		{null, null, null},
    		{null, null, null},
    		{null, null, null},
    		{null, null, null},
    		{null, null, null},
    		{null, null, null},
    		{null, null, null},
    		{null, null, null},
    		{null, null, null},
    		{null, null, null},
    		{null, null, null},
    		{null, null, null},
    		{null, null, null},
    		{null, null, null},
    		{null, null, null},
    		{null, null, null},
    		{null, null, null},
    		{null, null, null},
    		{null, null, null},
    		{null, null, null},
    		{null, null, null},
    		{null, null, null},
    		{null, null, null},
    		{null, null, null},};

    Class types[] = new Class[] {Integer.class, String.class, String.class};

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
        return data[row][col];
    } 
    @Override
    public Class getColumnClass(int c) {
    	return types[c];
    }
}