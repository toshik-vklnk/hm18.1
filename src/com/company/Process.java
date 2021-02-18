package com.company;

public class Process implements Runnable {
    String[] arrayString = new String[50000000];

    @Override
    public void run() {
        for (int i = 0; i < arrayString.length; i++) {
            if (i % 3 == 0) {
                arrayString[i] = "Fizz";
            } else if (i % 5 == 0) {
                arrayString[i] = "Buzz";
            } else if (i % 3 == 0 && i % 5 ==0) {
                arrayString[i] = "FizzBuzz";
            } else {
                arrayString[i] = String.valueOf(i);
            }
        }
    }
}
