package ru.job4j.middle.multithreading.fileDownload;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class FileDownload {


    public static void main(String[] args) {
        new Thread(new MyThread(), "th1").start();
        new Thread(new MyThread(), "th2").start();
        new Thread(new MyThread(), "th3").start();
    }


    static class MyThread implements Runnable {

        @Override
        public void run() {
            String file = "https://raw.githubusercontent.com/peterarsentev/course_test/master/pom.xml";
            try (BufferedInputStream in = new BufferedInputStream(new URL(file).openStream());
                 FileOutputStream fileOutputStream = new FileOutputStream("pom_tmp.xml")) {
                byte dataBuffer[] = new byte[1024];
                int bytesRead;
                long begin = System.nanoTime();
                while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                    fileOutputStream.write(dataBuffer, 0, bytesRead);
                    try {
                        long end = System.nanoTime();
                        long finish = end - begin;
                        System.out.println(finish);
                        Thread.sleep(finish);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}