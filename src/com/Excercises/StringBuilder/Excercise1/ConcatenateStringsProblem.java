package com.Excercises.StringBuilder.Excercise1;
import java.util.Scanner;
import java.util.stream.Stream;

class ConcatenateStringsProblem {

    public static String concatenateStringsWithoutDigits(String[] strings) {
        // write your code with StringBuilder here
        StringBuilder longString = new StringBuilder();
        String x="";
        String y="";
        for(String str : strings){
            StringBuilder sb = new StringBuilder(str);
            x = sb.toString().replaceAll("[0-9]","");
            y = y.concat(x);
        }
        return y;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = Stream
                .of(scanner.nextLine().split("\\s+"))
                .toArray(String[]::new);

        String result = concatenateStringsWithoutDigits(strings);

        System.out.println(result);
    }
}



