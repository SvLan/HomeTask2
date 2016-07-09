package com.HomeTask;

/**
 * Created by Администратор on 30.06.2016.
 */
public class RecursFibonachi {
    static int counter = 0;
    static int fib(int n) {
        if (n == 4) {
            counter++;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 2) + fib(n - 1);
    }

    public static void main(String[] args) {
        int fibRes = fib(15);

        System.out.println("15-ый элемент Фибоначчи = " + fibRes);
        System.out.println("Для вычисления 15-го, четвертый нужно посчитать  " + counter + " раз");
    }
}

