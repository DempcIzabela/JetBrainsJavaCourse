package com.Excercises.Regex.Excercise2;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String regNumRegex = "\\s*[ABEKMHOPCTYX]{1}[0-9]{3}[ABEKMHOPCTYX]{2}\\s*";

        /* The read string which may be a login */
        String mayBeregNum = scanner.nextLine();

        boolean isregNum = mayBeregNum.matches(regNumRegex);

        System.out.println(isregNum);
        /* write your code here */
    }
}
