package com.Excercises.ComparingDataAndTimes.Excercise1;

import java.util.*;
import java.time.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.next();
        LocalDateTime data1 = LocalDateTime.parse(input1);
        String input2 = scanner.next();
        LocalDateTime data2 = LocalDateTime.parse(input2);
        int input3 = scanner.nextInt();
        int counter =0;
        for(int i=0; i<input3; i++){
            String input4 = scanner.next();
            LocalDateTime data4 = LocalDateTime.parse(input4);
            if(data1.isBefore(data2)){
                if((data4.isAfter(data1) || data4.isEqual(data1)) && data4.isBefore(data2)){
                    counter=counter+1;
                }
            }
            else{
                if((data4.isAfter(data2) || data4.isEqual(data2)) && data4.isBefore(data1)){
                    counter=counter+1;
                }
            }
        }
        System.out.print(counter);
        // put your code here
    }
}

