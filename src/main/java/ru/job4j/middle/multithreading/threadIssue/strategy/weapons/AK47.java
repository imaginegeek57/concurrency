package ru.job4j.middle.multithreading.threadIssue.strategy.weapons;

public class AK47 implements Weapon {
    @Override
    public void shoot() {
        System.out.println("TRA-TA-TA-TA-TA-TA-TA");
    }
}
