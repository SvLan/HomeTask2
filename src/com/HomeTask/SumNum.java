package com.HomeTask;

import java.util.Scanner;

/**
 * Created by Администратор on 17.06.2016.
 */
public class SumNum {
    public static void main(String[] args) {
        int n = 0;
        int sum = 0;
        System.out.println("Введите число ");
        Scanner scr = new Scanner(System.in);
        n = scr.nextInt();
        while (n != 0){
             sum += n%10;
            n/= 10;
        }
System.out.println("Сумма числа " + sum);
    }

  }