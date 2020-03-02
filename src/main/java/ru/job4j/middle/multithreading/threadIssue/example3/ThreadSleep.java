package ru.job4j.middle.multithreading.threadIssue.example3;

public class ThreadSleep {

    public static void main(String[] args) {
        Thread thread = new Thread(
                () -> {
                    try {
                        System.out.println("Start loading ... ");
                        for(int index = 0; index <= 100; index++) {
                            Thread.sleep(500);
                            System.out.print("\rLoading: " + index + "%");
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        );
        thread.start();
    }
}
