package com.Excercises.InputStream.Excercise2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

class Main {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            // start coding here
            String line = reader.readLine();
            if(line.isBlank() || line.equals("\\s+")){
                System.out.print(0);
            }
            else{
                line = line.trim();
                String[] line_divided= line.split("\\s+", 10);

                System.out.print(line_divided.length);
            }
        }
    }

}