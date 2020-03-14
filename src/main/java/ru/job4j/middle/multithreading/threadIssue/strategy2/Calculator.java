package ru.job4j.middle.multithreading.threadIssue.strategy2;

import ru.job4j.middle.multithreading.threadIssue.strategy2.operations.Operation;

public class Calculator {

    public Operation operation;

    public int calculate(int a, int b) {
        return operation.calc(a, b);
    }

}
