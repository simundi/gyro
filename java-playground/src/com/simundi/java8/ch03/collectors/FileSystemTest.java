package com.simundi.java8.ch03.collectors;

import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by simundi on 20/11/2014.
 */
public class FileSystemTest {


    public static void main(String[] args) {

        try {
            System.out.println(">>Paths:");
            Files
                    .list(Paths.get("."))
                    .forEach(System.out::println);

            System.out.println("\n>>Filtering Directories:");
            Files
                    .list(Paths.get("."))
                    .filter(Files::isDirectory)
                    .forEach(System.out::println);

            System.out.println("\n>>Filtering Directories with newDirectoryStream:");
            Files
                    .newDirectoryStream(Paths.get(".") , path -> path.toString().endsWith(".txt"))
                    .forEach(System.out::println);


            System.out.println("\n>>Filtering Directories with newDirectoryStream:");
            Files
                    .walk(Paths.get("."))
                    .filter(path -> path.toString().endsWith(".java"))
                    .forEach(path -> System.out.println("> " + path.toString()));


            System.out.println("\n>>Flat Map:");//TODO study more FlatMap!!!!!!
            final List<? extends Serializable> files = Stream.of(Paths.get(".").toFile().listFiles())
                    .flatMap(
                            (file -> file.listFiles() == null ? Stream.of(file) : Stream.of(file.list()))


                    ).collect(Collectors.toList());




        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
