package com.example.perfectionsystem.Models;

import java.sql.*;

public class DataBaseDriver {
    private Connection conn;
    public DataBaseDriver(){
        try {
            this.conn= DriverManager.getConnection("jdbc:sqlite:Perfection.db");

        }catch (SQLException e){
            e.printStackTrace();
        }
    }




    /*
     * Accountant Section
     * */
    public ResultSet getAccountantData(String username,String password){
        Statement statement;
        ResultSet resultSet=null;
        try {
            statement=this.conn.createStatement();
            resultSet=statement.executeQuery("SELECT * FROM accounts WHERE username='"+username+"'AND password='"+password+"';");
        }catch (SQLException e){
            e.printStackTrace();
        }
        return resultSet;
    }



    /*
     * Admin Section
     * */
    public ResultSet getAdminData(String username,String password){
        Statement statement;
        ResultSet resultSet=null;
        try {
            statement=this.conn.createStatement();
            resultSet=statement.executeQuery("SELECT * FROM accounts WHERE username='"+username+"'AND password='"+password+"';");
        }catch (SQLException e){
            e.printStackTrace();
        }
        return resultSet;
    }

    /*
     *Utility Section*
     */

}
