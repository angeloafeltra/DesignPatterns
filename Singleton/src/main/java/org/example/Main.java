package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Se vedi lo stesso valore il singleton è stato riusato.\n RESULT:");

        Thread thread1=new Thread(new Thread1());
        Thread thread2=new Thread(new Thread2());
        thread2.start();
        thread1.start();

    }

    static class Thread1 implements Runnable{

        @Override
        public void run() {
            Singleton singleton= Singleton.getInstance("Thread 1");
            System.out.println(singleton.value);
        }

    }

    static class Thread2 implements Runnable{

        @Override
        public void run() {
            Singleton singleton= Singleton.getInstance("Thread 2");
            System.out.println(singleton.value);
        }

    }
}