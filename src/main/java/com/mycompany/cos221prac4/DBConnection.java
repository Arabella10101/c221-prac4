package com.mycompany.cos221prac4;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {

    //object constructor for sql querying and linking to database
    private Connection conn;
    private Statement stmt;

    public DBConnection() throws ClassNotFoundException, SQLException {
        //creates connection to the database    

        String dbURL = "";
        conn = DriverManager.getConnection(dbURL, "", "");
        stmt = conn.createStatement();
    }

    public ResultSet query(String sql) throws SQLException {
        //for regular query sql    

        ResultSet result = stmt.executeQuery(sql);
        return result; //returns result set

    }

    public int update(String sql) throws SQLException {
        //for update sql    

        Statement stmt = conn.createStatement();
        int done = stmt.executeUpdate(sql);
        return done; //returns done
    }
}
