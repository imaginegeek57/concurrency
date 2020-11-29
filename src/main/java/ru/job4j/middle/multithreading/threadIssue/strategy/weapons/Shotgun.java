package ru.job4j.middle.multithreading.threadIssue.strategy.weapons;

public class Shotgun implements Weapon {
    @Override
    public void shoot() {
        System.out.println("POOOOF");
    }
}
