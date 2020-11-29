package ru.job4j.middle.multithreading.threadIssue.strategy2.operations;

public class SumOperation implements Operation {
    @Override
    public int calc(int a, int b) {
        return a + b;
    }
}
