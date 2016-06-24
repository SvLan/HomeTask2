package com.HomeTask;

/**
 * Created by Администратор on 24.06.2016.
 */
public class mass1 {
    public static void main(String[] args) {
        int[][] mass = new int[8][5];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = (int) (Math.random() * 90) +10;
                System.out.print(mass[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
