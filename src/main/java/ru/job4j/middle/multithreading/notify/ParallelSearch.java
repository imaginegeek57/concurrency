package ru.job4j.middle.multithreading.notify;


public class ParallelSearch {

    public static void main(String[] args) {
        SimpleBlockingQueue <Integer> queue = new SimpleBlockingQueue <>();
        final Thread consumer = new Thread(
                () -> {
                    while (!Thread.currentThread().isInterrupted()) {
                        try {
                            synchronized (queue) {
                                queue.wait(1000);
                            }
                            System.out.println(queue.poll());

                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
        );
        consumer.start();
        new Thread(
                () -> {
                    for (int index = 0; index != 5; index++) {
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


