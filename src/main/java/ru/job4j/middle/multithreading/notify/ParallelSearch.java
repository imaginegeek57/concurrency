package ru.job4j.middle.multithreading.notify;


public class ParallelSearch {

    public static void main(String[] args) {
        SimpleBlockingQueue <Integer> queue = new SimpleBlockingQueue <Integer>();
        final Thread consumer = new Thread(
                () -> {
                    while (true) {
                        try {
                 //           queue.poll();
                            System.out.println(queue.poll());
                        }catch (InterruptedException e) {
                            e.fillInStackTrace();
                            Thread.currentThread().interrupt();
                        }
                    }
                }
        );
        consumer.start();
        new Thread(
                () -> {
                    for (int index = 0; index != 3; index++) {
                        queue.offer(index);
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
        ).start();
    }
}


