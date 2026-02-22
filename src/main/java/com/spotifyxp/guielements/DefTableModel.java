package com.spotifyxp.guielements;

import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class DefTableModel extends DefaultTableModel {
    public DefTableModel(Object[][] data, Object[] columnNames) {
        super(data, columnNames);
    }
    
    public DefTableModel(Object[][] data, String[] columnNames) {
        super(data, columnNames);
    }

    @Override
    public void addRow(Object[] rowData) {
        if (SwingUtilities.isEventDispatchThread()) {
            super.addRow(rowData);
        } else {
            SwingUtilities.invokeLater(() -> super.addRow(rowData));
        }
    }

    @Override
    public void insertRow(int row, Object[] rowData) {
        if (SwingUtilities.isEventDispatchThread()) {
            super.insertRow(row, rowData);
        } else {
            SwingUtilities.invokeLater(() -> super.insertRow(row, rowData));
        }
    }

    @Override
    public void removeRow(int row) {
        if (SwingUtilities.isEventDispatchThread()) {
            super.removeRow(row);
        } else {
            SwingUtilities.invokeLater(() -> super.removeRow(row));
        }
    }

    @Override
    public void setRowCount(int rowCount) {
        if (SwingUtilities.isEventDispatchThread()) {
            super.setRowCount(rowCount);
        } else {
            SwingUtilities.invokeLater(() -> super.setRowCount(rowCount));
        }
    }
}
