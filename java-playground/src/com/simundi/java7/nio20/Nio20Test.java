package com.simundi.java7.nio20;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by simundi on 02/11/2014.
 *
 * Path equ
 *
 *
 */
public class Nio20Test {


    public static void main(String[] args){

        final Path path = Paths.get("/Users/simundi/github/gyro/java-playground/java-playground.iml");

        System.out.format("getFileName %s%n",path.getFileName());
        System.out.format("getFileSystem %s%n",path.getFileSystem());
        System.out.format("getNameCount %s%n",path.getNameCount());
        System.out.format("getParent %s%n",path.getParent());



        final Path newFIle = Paths.get("/testpath.txt");
        System.out.println("");
        System.out.format("getFileName %s%n",newFIle.getFileName());
        System.out.format("getFileSystem %s%n",newFIle.getFileSystem());
        System.out.format("getNameCount %s%n",newFIle.getNameCount());
        System.out.format("getParent %s%n",newFIle.getParent());


    }

}
