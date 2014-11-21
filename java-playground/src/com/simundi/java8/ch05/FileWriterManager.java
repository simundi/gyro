package com.simundi.java8.ch05;

import com.simundi.java8.ch04.exceptionsAndLambda.UserInstance;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by simundi on 21/11/2014.
 */
public class FileWriterManager {

    public static void use(String fileName, UserInstance<FileWriter, IOException> writingBlock) {


        try (final FileWriter fileWriter = new FileWriter(fileName)) {

            writingBlock.accept(fileWriter);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        char[] str = null;

        use("TestFile.txt" , writer ->{
            writer.write("Test 1");
            writer.write(str);
        });
    }
}
