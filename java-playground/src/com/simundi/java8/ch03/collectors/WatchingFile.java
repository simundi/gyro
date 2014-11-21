package com.simundi.java8.ch03.collectors;

import java.io.IOException;
import java.nio.file.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by simundi on 20/11/2014.
 */
public class WatchingFile {

    public static void main(String[] args) {

        try {
            System.out.println("Starting Watch service: ");
            final Path path = Paths.get(".");
            final WatchService watchService = path.getFileSystem().newWatchService();
            path.register(watchService , StandardWatchEventKinds.ENTRY_MODIFY);

            System.out.println("WatchKey: ");
            final WatchKey watchKey = watchService.poll(1, TimeUnit.MINUTES);

            if(watchKey == null){
                System.out.println("Empty watchkey");
                return;
            }

            System.out.println("Events: ");
            watchKey
                    .pollEvents()
                    .stream()
                    .forEach(event -> System.out.println(">>> event: " + event.context()));



        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

}
