package com.simundi.java8.performance.comparators;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by simundi on 11/12/2014.
 */
public class TextDao {


    public static String[] getSplitText() {
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
