/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cos221prac4;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author arabella
 */
public class populatetbls {
    //object constructors
    DBConnection objDBCon;

    
    private javax.swing.JTable Table;//table to display data in list
    
    public populatetbls() throws ClassNotFoundException, SQLException{
        //default constructor           
        objDBCon = new DBConnection();
    }
    
    public void populateFilms(javax.swing.JTable filmtbl) throws SQLException{
        ResultSet rs=objDBCon.query("SELECT * FROM film"); //selects all films
        
        //populates the table
        DefaultTableModel model = (DefaultTableModel) filmtbl.getModel(); 
        model.setRowCount(0);
        while(rs.next()){
            Object[] rowData ={
                rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),
                rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13)
            };
            model.addRow(rowData);
        }
        filmtbl.setModel(model);
        if(filmtbl.getRowCount()>0){
            filmtbl.setRowSelectionInterval(0, 0);
        }
    }
    
    public void populateClients(javax.swing.JTable clienttbl) throws SQLException{
        ResultSet rs=objDBCon.query("SELECT * FROM customer"); //selects all customers
        
        //populates the table
        DefaultTableModel model = (DefaultTableModel) clienttbl.getModel(); 
        model.setRowCount(0);
        while(rs.next()){
            Object[] rowData ={
                rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),
                rs.getString(8),rs.getString(9)
            };
            model.addRow(rowData);
        }
        clienttbl.setModel(model);
        if(clienttbl.getRowCount()>0){
            clienttbl.setRowSelectionInterval(0, 0);
        }
    }
}
