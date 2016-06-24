package com.HomeTask;

/**
 * Created by Администратор on 24.06.2016.
 */
public class Fibonachi {
    public static void main(String[] args) {
        int a = 11;
        int n0 = 1, n1 = 1;
        System.out.print(n0 + " " + n1);
        int n2 = 2, i = 2;
        while (i < a) {
            n2 = n0 + n1;
            n0 = n1;
            n1 = n2;
            System.out.print(" " + n2);
            i++;
        }
    }
}
