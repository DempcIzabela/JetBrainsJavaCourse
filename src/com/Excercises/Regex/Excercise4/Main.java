package com.Excercises.Regex.Excercise4;

import java.util.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String part = scanner.nextLine();
        String line = scanner.nextLine();
        String [] line_split = line.split(" ");
        Pattern pattern = Pattern.compile(part, Pattern.CASE_INSENSITIVE);
        Pattern pattern2 = Pattern.compile("^"+part, Pattern.CASE_INSENSITIVE);
        Pattern pattern3 = Pattern.compile(part+"$", Pattern.CASE_INSENSITIVE);
        int w =0;
        for(String part_line : line_split){

            Matcher matcher = pattern.matcher(part_line);
            Matcher matcher2 = pattern2.matcher(part_line);
            Matcher matcher3 = pattern3.matcher(part_line);

            if(matcher.find()==true && (matcher2.find()==false && matcher3.find()==false)){
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

