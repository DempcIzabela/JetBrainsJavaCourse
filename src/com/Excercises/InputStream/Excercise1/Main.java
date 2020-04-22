package com.Excercises.InputStream.Excercise1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

class Main {
    public static void main(String[] args) throws Exception {
        try (Reader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int data = reader.read();
            String s = "";
            while (data != -1) {
                char ch = (char) data;
                s = new StringBuilder(s).append(ch).toString();
                data = reader.read();
            }
            String reverse = "";

            for(int i = s.length() - 1; i >= 0; i--)
            {
                reverse = reverse + s.charAt(i);
            }


            System.out.println(reverse);
            reader.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


        // start coding here

    }
}
