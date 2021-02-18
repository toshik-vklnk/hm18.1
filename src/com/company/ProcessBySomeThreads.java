package com.company;

public class ProcessBySomeThreads implements Runnable{
    private String[] array;
    private int minIndex;
    private int maxIndex;

    public ProcessBySomeThreads(String[] array, int minIndex, int maxIndex) {
        this.array = array;
        this.maxIndex = maxIndex;
        this.minIndex = minIndex;
    }

    public void run() {
        for (int i = minIndex; i < maxIndex; i++) {
            if (i % 3 == 0) {
                array[i] = "Fizz";
            } else if (i % 5 == 0) {
                array[i] = "Buzz";
            } else if (i % 3 == 0 && i % 5 ==0) {
                array[i] = "FizzBuzz";
            } else {
                array[i] = String.valueOf(i);
            }
        }
    }
}

