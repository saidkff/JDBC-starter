package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConnectionManager {
    private static final String URL = "jdbc:postgresql://localhost:5432/flight_repository";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "postgres";

    static {
        try {
            Class.forName("java.sql.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    private ConnectionManager(){
    }

    public static Connection open(){
        try {
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
