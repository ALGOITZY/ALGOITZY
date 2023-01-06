package com.company.notes.study.week14;

import java.util.Scanner;

/*
* 거스름돈
* */
public class BOJ14916 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        if (n == 1 || n == 3) {
            System.out.println(-1);
            return;
        }
        int q = n/5;
        int r = n%5;

        while(r%2!=0){
            q-=1;
            r+=5;
        }
        System.out.println(q+(r/2));
    }
}
