package com.simundi.java7.stringswtich;



/**
 * Created by simundi on 02/11/2014.
 */
public class SillyClass {

    public static void print(String msg){
        print("SYSOUT" , msg);
    }

    public static void print(String command , String msg){

        if(command != null) command = command.toUpperCase();

        switch (command){
            case "SYSOUT": System.out.println(msg);
                break;
            case "sysout": throw new IllegalArgumentException("Test" );

            default: System.out.println("No command found");
        }


    }



    public static void main(String[] args){


        print("sysout" , "Test");

        print(null, "Test");

    }
}
