package com.Excercises.Multithreading.Excercise2;
import java.util.*;
import java.util.concurrent.*;





    class FutureUtils {

        public static int howManyIsDone(List<Future> items) {

            ExecutorService executor = Executors.newFixedThreadPool(4);

            int sum = 0;
            for (Future<Integer> future : items) {
                if(future.isDone()){
                    sum += 1;
                }
                // blocks on each future to get a result
            }
            return sum;

        }

    }


