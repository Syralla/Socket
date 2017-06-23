package com.simon_f.socket;

/**
 * Created by DEU301997 on 22.06.2017.
 */

import java.sql.*;

public class dbaccess {

    public static ResultSet runQuery(String query) throws SQLException		//Datenbankzugriff, kann jetzt Querys ausführen
    {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rset = null;
        try
        {
            String connectionURL = "jdbc:mysql://simon-f.com/LernApp";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(connectionURL, "root", "LernApp");		//BENUTZER und PASSWORT
            stmt = conn.createStatement();
            rset = stmt.executeQuery(query);
            return rset;
        }

        catch(Exception e)
        {
            return rset;
        }
    }

    public static String jspquery (String query)
    {
        return "";
    }
}
