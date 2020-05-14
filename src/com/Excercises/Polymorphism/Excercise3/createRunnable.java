package com.Excercises.Polymorphism.Excercise3;

public static Runnable createRunnable(String text, int repeats) {
        return new java.lang.Runnable(){
public void run(){
        for(int i=0; i<repeats; i++){
        System.out.println(text);
        }
        }
        // an instance here
        };
        }
