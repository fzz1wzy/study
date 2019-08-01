package com;

public class ThreadDemo extends Thread {

    @Override
    public void run() {
        System.out.println("threadDemo:start");

        try {
            this.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("threadDemo:end");
    }

    public static void main(String[] args) throws InterruptedException {

        System.out.println("main:start");

        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.setDaemon(true);
        threadDemo.start();
        Thread.sleep(1000);
        System.out.println("main:end");

    }

}
