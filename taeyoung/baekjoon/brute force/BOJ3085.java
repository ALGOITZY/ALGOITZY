package com.company.notes.study;


import java.util.Scanner;

public class BOJ3085 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int e = scan.nextInt(); //15
        int s = scan.nextInt(); //28
        int m = scan.nextInt(); //19
        if(e==15) e = 0;
        if(m==19) m = 0;

        for (int i = 0; i<1000; i++) {
            int n = s+i*28;
            if (n%15==e && n%19==m){
                System.out.println(n);
                return;
            }
        }
    }
}
