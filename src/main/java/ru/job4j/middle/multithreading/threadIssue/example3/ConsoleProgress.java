package ru.job4j.middle.multithreading.threadIssue.example3;

public class ConsoleProgress {

    public static void main(String[] args) {
        Thread progress = new Thread(new Second());
        progress.start();
        try {
            Thread.sleep(1); // симулируем выполнение параллельной задачи в течение 1 секунды.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        progress.interrupt(); //
    }

    static class Second implements Runnable {

        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    System.out.println("Start loading ... ");
                    char[] charArray = {'\\', '|', '/'};
                    for (int i = 0; i <= 100; i++) {
                        Thread.sleep(500);
                        System.out.print("\r load: %c " + charArray[i]);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}