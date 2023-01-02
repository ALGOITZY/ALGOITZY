package com.company.notes.study.week13;

import java.util.Scanner;

/*
* A → B
* */
public class BOJ16953 {
    public static void main(String[] args) {
        int answer = 1;     //필요 연산의 최솟값에 1을 더한 값을 출력
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String b = scan.next();
        while (true) {
            int num = Integer.parseInt(b);
            if(a==num) break;
            if (a > num) {
                System.out.println(-1);
                return;
            }
            if (b.charAt(b.length() - 1) == '1') {
                b = b.substring(0, b.length() - 1);
            } else if (num % 2 == 0) {
                b = (num / 2) + "";
            } else {
                System.out.println(-1);
                return;
            }
            answer++;
        }
        System.out.println(answer);
    }
}
