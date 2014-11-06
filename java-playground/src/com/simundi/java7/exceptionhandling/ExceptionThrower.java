package com.simundi.java7.exceptionhandling;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by simundi on 02/11/2014.
 */
public class ExceptionThrower {

    public static void throwSomething(String error) throws IOException, IllegalArgumentException, SQLException {

        switch (error) {
            case "FILE":
                throw new IOException("File error");
            case "SQL":
                throw new SQLException("SQL error");
            default:
                throw new IllegalArgumentException("Invalid argument");
        }
    }

    public static void main(String[] args){


        try {
            throwSomething("x");
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal handled");
            System.err.println(e);
        }

        //Rethrow Excpetion
        try {
            throwSomething("SQL");
        } catch (IOException | SQLException e) {
            throw new RuntimeException(e);
        }


    }


}
