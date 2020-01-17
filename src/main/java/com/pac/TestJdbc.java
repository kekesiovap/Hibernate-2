package com.pac;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

    public static void main(String[] argz) {

        String jdbcUrl = "jdbc:mysql://localhost:3308/hb-01-one-to-one-uni";
        String user = "hbstudent";
        String pass = "hbstudent";
        try {
            System.out.println("connecting to database: " + jdbcUrl);

            Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);

            System.out.println("Connection successful");
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}
