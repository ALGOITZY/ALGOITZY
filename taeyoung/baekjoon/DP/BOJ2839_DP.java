package com.company.notes.study.week15;

import java.util.Scanner;

/*
* 설탕 배달
* */
public class BOJ2839_DP {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            if (i == 3 || i == 5) dp[i] = 1;
            else if (i > 5) {
                if (i % 5 == 0) {
                    dp[i] = dp[i - 5] + 1;
                } else if (i % 3 == 0) {
                    dp[i] = dp[i - 3] + 1;
                } else if (dp[i - 3] != -1 || dp[i - 5] != -1) {
                    dp[i] = Math.min(dp[i - 3], dp[i - 5]) + 1;
                } else {
                    dp[i] = -1;
                }
            } else dp[i] = -1;

        }
        System.out.println(dp[n]);
    }
}
