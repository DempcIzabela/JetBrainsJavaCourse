package com.Excercises.Regex.Excercise6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex2 = "[+-]{0,1}[1-9]+";
        String regex1 = "[+-]{0,1}[0-9]+[.,]*[0]{1}";
        String regex = "[+-]{0,1}[0-9]+[.,]+[0-9]*[1-9]$*";

        String number = scanner.nextLine();
        System.out.println((number.matches(regex) || number.matches(regex1)|| number.matches(regex2)) ? "YES" : "NO");
    }
}