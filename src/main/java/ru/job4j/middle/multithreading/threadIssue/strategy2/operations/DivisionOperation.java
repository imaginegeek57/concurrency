package ru.job4j.middle.multithreading.threadIssue.strategy2.operations;

public class DivisionOperation implements Operation {
    @Override
    public int calc(int a, int b) {
        return a / b;
    }
}
