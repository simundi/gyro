package com.simundi.java8.ch03.strings;

/**
 * Created by simundi on 13/11/2014.
 */
public class InteratingString {


    public static void main(String[] args) {

        final String str = "Test Java 8";

        System.out.print("Printing Char codes: ");
        str.chars().forEach(System.out::print);

        System.out.print("\nPrinting Chars: ");
        str
                .chars()
                .mapToObj(ch -> Character.valueOf((char) ch))
                .forEach(System.out::print);

        System.out.print("\nPrinting Digit Chars: ");
        str
                .chars()
                .filter(Character::isDigit)
                .mapToObj(ch -> Character.valueOf((char) ch))
                .forEach(System.out::print);


    }
}
