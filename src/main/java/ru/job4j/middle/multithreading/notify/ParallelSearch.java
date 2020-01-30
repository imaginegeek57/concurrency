package ru.job4j.middle.multithreading.notify;


public class ParallelSearch {

    public static void main(String[] args) throws InterruptedException {
        SimpleBlockingQueue <Integer> queue = new SimpleBlockingQueue <Integer>();
        final Thread consumer = new Thread(
                () -> {
                    while (!queue.isEmpty()) {
                        try {
                            queue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                            Thread.currentThread().interrupt();
                        }
                        queue.poll();
                        System.out.println(queue.poll());
                        queue.notify();
                    }
                }
        );
        consumer.start();
        Thread p = new Thread(
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
        );
        p.start();
    }
}



