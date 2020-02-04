package ru.job4j.middle.multithreading.notify;


public class ParallelSearch {

    public static void main(String[] args) {
        SimpleBlockingQueue <Integer> queue = new SimpleBlockingQueue <>();

        final Thread consumer = new Thread(
                () -> {
                    while (true) {
                        try {
                            synchronized (queue) {
                                if (queue.isEmpty()) {
                                    queue.wait(2000);
                                }
                                if (queue.isEmpty()) {
                                    break;
                                } else {
                                    System.out.println(queue.poll());
                                }
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
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
                            Thread.sleep(1500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("producer ended");
                }
        ).start();
    }
}



