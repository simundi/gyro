package com.simundi.java8.performance.comparators;

/**
 * Created by simundi on 02/05/2015.
 */
import java.io.*;
import java.util.List;
import java.util.Scanner;


public class Solution {


    private static int  countOccurrences(String baseText , String subString){
        int occurences = 0;
        int indexOf = 0;

        while (indexOf < baseText.length()){
            int found = baseText.indexOf(subString , indexOf);
            if(found >= 0) occurences++;
            indexOf = found + subString.length();
        }


        return occurences;
    }

    public static void main(String[] args) throws Exception {

        final SolutionInput input = readInputFile();
        input.validateInput();

        int[] occurrences = new int[input.N];

        for( int i = 1; i < input.N; i++){
            final String subString = input.text.substring(0, i);



        }


        final PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(System.out));
        printWriter.write("0");
        printWriter.flush();
        printWriter.close();
    }


    private static class SolutionInput{
        private final static int MAX = 26;

        public final int N;
        public final int K;
        public final int L;
        public final int M;
        public final String text;

        public SolutionInput(int n, int k, int l, int m, String text) {
            this.N = n;
            this.K = k;
            this.L = l;
            this.M = m;
            this.text = text;
        }

        public SolutionInput(String firstInputLine, String secondInputLine, String thirdInputLine) {
            this.N = Integer.valueOf(firstInputLine);

            final String[] split = secondInputLine.split(" ");

            this.K = Integer.valueOf(split[0]);
            this.L = Integer.valueOf(split[1]);
            this.M = Integer.valueOf(split[2]);
            this.text = thirdInputLine;
        }

        public void validateInput(){
            if( !(2 <= N && N <= 100000) ) throw new IllegalArgumentException("N Constraints: 2 <= N <= 100000");
            if( !(2 <= K && K <= L && L <= MAX && L < N) ) throw new IllegalArgumentException("Constraints: 2 <= K <= L <= 26 , L < N");
            if( !(2 <= M && M <= MAX) ) throw new IllegalArgumentException("Constraints: 2 <= K <= L <= 26 , L < N");
        }

    }




    private static SolutionInput readInputFile() throws IOException {
        try( final Scanner scanner = new Scanner(new BufferedInputStream(System.in)) ) {
            return new SolutionInput(
                    scanner.nextLine(),
                    scanner.nextLine(),
                    scanner.nextLine()
            );
        }

    }


}
