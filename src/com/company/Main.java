package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        String[] arrayString = new String[50000000];
        long m = System.currentTimeMillis();
//        заполнение массива одним потоком, выполняется 2,5 сек
//        Process process = new Process();
//        Thread thread1 = new Thread(process);
//        thread1.start();
//        thread1.join();

//        заполнение массива 5ю потоками, выполняется 1,3 сек
        ProcessBySomeThreads processBySomeThreads1 =new ProcessBySomeThreads(arrayString, 0,10000000);
        ProcessBySomeThreads processBySomeThreads2 =new ProcessBySomeThreads(arrayString, 10000000,20000000);
        ProcessBySomeThreads processBySomeThreads3 =new ProcessBySomeThreads(arrayString, 20000000,30000000);
        ProcessBySomeThreads processBySomeThreads4 =new ProcessBySomeThreads(arrayString, 30000000,40000000);
        ProcessBySomeThreads processBySomeThreads5 =new ProcessBySomeThreads(arrayString, 40000000,50000000);
        Thread thread1 = new Thread(processBySomeThreads1);
        Thread thread2 = new Thread(processBySomeThreads2);
        Thread thread3 = new Thread(processBySomeThreads3);
        Thread thread4 = new Thread(processBySomeThreads4);
        Thread thread5 = new Thread(processBySomeThreads5);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        thread5.join();

        
        System.out.println((double) (System.currentTimeMillis() - m));
    }
}
