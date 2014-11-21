package com.simundi.java8.ch04.decorator;

import java.awt.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Created by simundi on 21/11/2014.
 */
public class Camera {

    private Function<Color, Color> filter;

    public Camera() {
        setFilter();
    }

    public Color capture(final Color inputColor){
        final Color processedColor = filter.apply(inputColor);
        return processedColor;
    }

    public void setFilter(Function<Color, Color>... filters) {
        this.filter =
                Stream.of(filters)
                .reduce((filter , next) -> filter.compose(next))
                .orElse(color -> color);//default function << (if there is no funciton, it will create this function)
        ;
    }


    public static void main(String[] args) {
        final Camera camera = new Camera();

        final Consumer<String> printCaptured = (filterInfo) -> System.out.printf("with %s: %s%n" , filterInfo ,
                camera.capture(new Color(200, 100, 200)));

        printCaptured.accept("no filter%n");

        camera.setFilter(Color::brighter);
        printCaptured.accept("brigther filter%n");

        camera.setFilter(Color::darker);
        printCaptured.accept("Darker filter%n");


        camera.setFilter(Color::darker , (color) -> new Color(color.getRGB()).darker());
        printCaptured.accept("Twice darker%n");


    }


}
