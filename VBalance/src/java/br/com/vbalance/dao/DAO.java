/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vbalance.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Mr Menezes
 */
public class DAO {
    
    private String login = "root";
    private String password = "rootadmin";
    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/vbalancedb?zeroDateTimeBehavior=convertToNull";
    protected Connection connection;
    
    protected void startConnection() {
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, login, password);
        } catch (ClassNotFoundException cnfe) {
            System.err.println("Driver not found\n" + cnfe);
        } catch (SQLException sqle) {
            System.err.println("Error ao criar a cconexão com o banco de dados\n");
            System.err.println("\nError Menssage: " + sqle.getMessage());
            System.err.println("\nError Cod.: " + sqle.getErrorCode());
            System.err.println("\nSQL State: " + sqle.getSQLState());
        } catch (Exception e) {
            System.err.println("Error\n" + e);
        }
    }

    protected void destroyConnection() {
        try {
            connection.close();
        } catch (SQLException sqle) {
            System.err.println("Error on close database\n" + sqle);
        }
    }
}
