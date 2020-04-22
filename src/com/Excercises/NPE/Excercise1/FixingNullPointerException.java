package com.Excercises.NPE.Excercise1;
import java.util.*;

class FixingNullPointerException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        string = "null".equals(string) ? null : string;
        /* Do not change code above */
        String z = string != null ? string.toLowerCase() : "NPE!";
        System.out.println(z);
    }
}
