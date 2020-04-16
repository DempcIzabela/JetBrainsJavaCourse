package com.Excercises.Regex.Excercise5;

import java.util.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String part = scanner.nextLine();
        String line = scanner.nextLine();
        String [] line_split = line.split("[\\s,.!?]");

        Pattern pattern1 = Pattern.compile("^"+part, Pattern.CASE_INSENSITIVE);
        Pattern pattern2 = Pattern.compile(part+"$", Pattern.CASE_INSENSITIVE);
        int w =0;
        for(String part_line : line_split){

            Matcher matcher1 = pattern1.matcher(part_line);
            Matcher matcher2 = pattern2.matcher(part_line);

            if(matcher1.find()==true || matcher2.find()==true){
                System.out.print("YES");
                w++;
                break;
            }

        }
        if(w==0){
            System.out.print("NO");
        }
        // write your code here
    }
}

