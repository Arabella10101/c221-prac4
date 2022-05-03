/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cos221prac4;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
}
