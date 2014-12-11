package com.simundi.java8.performance.comparators;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by simundi on 11/12/2014.
 */
public class TextDao {


    public static List<String> getList() {
        return Stream.
                of(getText().split(" "))
                .filter(str -> str.trim().isEmpty())
                .collect(Collectors.toList());

    }

    public static String[] getArray() {
        return getText().split(" ");
    }

    public static String getText() {
        final StringBuilder finalText = new StringBuilder();


        try (
                BufferedReader file = new BufferedReader(new FileReader("dummy-text.txt"))
        ) {
            while (file.ready()) {
                finalText.append(file.readLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return finalText.toString();
    }

}
