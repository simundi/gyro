package com.simundi.java7.nio20;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.*;
/**
 * Created by simundi on 02/11/2014.
 */
public class RandomAcess {

    public static void main(String[] args){


        ByteBuffer copy = ByteBuffer.allocate(45);

        final Path path = Paths.get("soneto-do-amor-total.txt");


        try (FileChannel fc = (FileChannel.open(path, READ, WRITE))) {

            fc.read(copy);

            System.out.format("Read until %d characters: %s%n", fc.position(), new String(copy.array()));
            System.out.format("Positiom %s%n", fc.position());


            copy.clear();
            fc.read(copy);
            System.out.format("Read until %d: %s%n", fc.position(), new String(copy.array()));

            copy.clear();
            fc.position(150);
            fc.read(copy);
            System.out.format("Read until %d: %s%n", fc.position(), new String(copy.array()));


        }catch(IOException e){
            e.printStackTrace();
        }

    }




}
