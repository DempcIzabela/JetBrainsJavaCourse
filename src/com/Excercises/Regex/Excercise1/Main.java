package com.Excercises.Regex.Excercise1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mayBeIp = scanner.nextLine();
        int x = 0;
        String IpAdressRegex = "[0-9]{1,4}[.][0-9]{1,4}[.][0-9]{1,4}[.][0-9]{1,4}";
        if (mayBeIp.matches(IpAdressRegex)) {
            String[] IpAdress = mayBeIp.split("\\.");
            for (String part : IpAdress) {
                int partInt = Integer.parseInt(part);
                if (partInt >= 0 && partInt <= 255) {
                    x++;
                }

            }
            if (x == 4) {
                System.out.print("YES");
            } else {
                System.out.print("NO");
            }
        } else {
            System.out.print("NO");
        }

        // write your code here
    }
}