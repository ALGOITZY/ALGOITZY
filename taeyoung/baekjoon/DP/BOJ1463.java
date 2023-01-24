package com.company.notes.study.week16;

import java.util.Scanner;

/*
* 1로 만들기
* */
public class BOJ1463 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] dp = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            int min = dp[i - 1] + 1;
            if (i % 3 == 0) min = Math.min(min, dp[i / 3] + 1);
            if (i % 2 == 0) min = Math.min(min, dp[i / 2] + 1);
            dp[i] = min;
        }
        System.out.println(dp[n]);
    }
}
