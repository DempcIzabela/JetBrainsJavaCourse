package com.Excercises.Regex.Excercise3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String mayBePassword = scanner.nextLine();

        String Regex1 = "[a-zA-Z0-9_$]*[a-z]+";
        String Regex2 = "[a-zA-Z0-9_$]*[A-Z]+";
        String Regex3 = "[a-zA-Z0-9_$]*[0-9]+";
        String Regex4 = "[a-zA-Z0-9]{12,}";


        boolean isPassword4 = mayBePassword.matches(Regex4);

        int x = 0;

        for(int i = 1; i < mayBePassword.length(); i++)
        {
            String c = mayBePassword.substring(0,i);
            boolean isPassword1 = c.matches(Regex1);
            if(isPassword1){
                x++;
                break;
            }

        }
        for(int i = 1; i < mayBePassword.length(); i++)
        {
            String c = mayBePassword.substring(0,i);
            boolean isPassword2 = c.matches(Regex2);
            if(isPassword2){
                x++;
                break;
            }

        }
        for(int i = 1; i < mayBePassword.length(); i++)
        {
            String c = mayBePassword.substring(0,i);
            boolean isPassword3 = c.matches(Regex3);
            if(isPassword3){
                x++;
                break;
            }

        }
        if(x==3 && mayBePassword.length()>=12){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}

