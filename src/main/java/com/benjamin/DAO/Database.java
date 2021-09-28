package com.benjamin.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    protected Connection con;
    private String USER = "admin";
    private String PWD = "admin";
    private String URL = "jdbc:mysql://localhost:3306/cafefilrouge?serverTimezone=UTC";

    /**
     * Initialise connexion with MySQL DB
     */
    public Database() {
        connect();
    }

    public Database(String USER, String PWD, String URL) {
        this.USER = USER;
        this.PWD = PWD;
        this.URL = URL;
        connect();
    }

    public Connection getCon() {
        return con;
    }

    /**
     * creates the connexion with MySql DataBase
     *
     * @return Connection
     */
    private Connection connect() {
        try {
            this.con =  DriverManager.getConnection(URL, USER, PWD);
            System.out.println("Base de donnée connectée avec succès");
        } catch (SQLException e) {
            System.out.println("Error : impossible de se connecter a la base de données");
            System.out.println(e.getMessage());
        }
        return null;
    }
}
