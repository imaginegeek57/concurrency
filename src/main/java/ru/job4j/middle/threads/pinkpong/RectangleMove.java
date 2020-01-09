package ru.job4j.middle.threads.pinkpong;

import javafx.scene.shape.Rectangle;

public class RectangleMove implements Runnable {

    private final Rectangle rect;

    public RectangleMove(Rectangle rect) {
        this.rect = rect;
    }


    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            this.rect.setX(this.rect.getX() + 1);
            this.rect.setY(this.rect.getX() - 0.2);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

