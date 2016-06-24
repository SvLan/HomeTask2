package com.HomeTask;

/**
 * Created by Администратор on 24.06.2016.
 */
public class SimetricTime {
    public static void main(String[] args) {
        int n = 0;
        for(int h=1;h<=24;h++){
            for(int m=0;m<=59;m++){
                if(h/10%10==m%10&h%10==m/10%10){
                    n++;
                }
            }
        }
        System.out.println(n);
    }
}
