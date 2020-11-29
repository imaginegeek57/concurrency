package ru.job4j.middle.multithreading.threadIssue.strategy2;

import ru.job4j.middle.multithreading.threadIssue.strategy2.operations.DivisionOperation;
import ru.job4j.middle.multithreading.threadIssue.strategy2.operations.SumOperation;

public class App {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.operation = new SumOperation();
        System.out.println(calculator.calculate(2, 5));
        System.out.println(calculator.calculate(1, 4));

        calculator.operation = new DivisionOperation();
        System.out.println(calculator.calculate(8, 4));
        System.out.println(calculator.calculate(9, 3));
    }
}
