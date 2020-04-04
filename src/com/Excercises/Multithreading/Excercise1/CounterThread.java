package com.Excercises.Multithreading.Excercise1;

public class CounterThread extends Thread {

    @Override
    public void run() {
        long counter = 0;

        while (!isInterrupted()) {
            try{
                counter++;
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.print("It was interrupted");

                break;
            }
        }
    }
}
