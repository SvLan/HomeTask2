package com.HomeTask;

/**
 * Created by Администратор on 24.06.2016.
 */
public class mass2 {
    public static void main(String[] args) {
        int[][] mas = new int[7][4];
        int [] mas1 = new int[mas.length];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = (int) (Math.random() * 11) - 5;
                System.out.print(mas[i][j] + " ");
            }
                System.out.println(" ");
        }

    }
}