package com.simundi.java7.resourcemanagement;

import java.io.*;

import static com.simundi.java7.stringswtich.SillyClass.print;

/**
 * Created by simundi on 02/11/2014.
 *
 * Link reference: http://www.oracle.com/technetwork/articles/java/trywithresources-401775.html
 *
 * Needs to Implement AutoClose interface: http://docs.oracle.com/javase/7/docs/api/java/lang/AutoCloseable.html
 *
 *
 *
 */
public class PlayingWithFiles {



    public void newStyle() throws IOException {

        File file = new File("data-new.txt");
        file.createNewFile();
        print("File created: " + file.getAbsolutePath());

        try(
                BufferedReader oldFile = new BufferedReader(new FileReader("data-old.txt") );
                DataOutputStream newFIle = new DataOutputStream( new FileOutputStream(file) );
                ){

            while(oldFile.ready()){
                newFIle.writeChars(oldFile.readLine());
                newFIle.writeChars("\n");
            }

        }

    }


    public void oldStyleFileWriting(String... data) throws IOException {
        DataOutputStream out = null;
        try {
            File file = new File("data-old.txt");
            file.createNewFile();
            print("File created: " + file.getAbsolutePath());
            out = new DataOutputStream(new FileOutputStream(file));
            for (String line:data)out.writeChars(line + "\n");
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }

    public static void main(String[] args){
        PlayingWithFiles playingWithFiles = new PlayingWithFiles();

        try {
            playingWithFiles.oldStyleFileWriting("Soneto do Amor Total" , "", "Amo-te tanto, meu amor... não cante");
            playingWithFiles.newStyle();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
