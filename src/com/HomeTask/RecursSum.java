package com.HomeTask;

import java.util.Scanner;

/**
 * Created by Администратор on 25.06.2016.
 */
public class RecursSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Введите число n: ");
        n = scanner.nextInt();
        System.out.println("Сумма чисел " + n + " = " + recurs(n));
    }
    public static int recurs(int n) {
        if (n == 1) {
            return 1;
        }
        return recurs(n - 1) + n;
    }

    }