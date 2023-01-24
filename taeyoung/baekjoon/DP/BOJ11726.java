package com.company.notes.study.week16;

import java.util.Scanner;

/*
* 2×n 타일링
* */
public class BOJ11726 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] dp = new int[n + 1];
        dp[1] = 1;
        if (n >= 2) dp[2] = 2;
        if (n >= 3) {
            for (int i = 3; i <= n; i++) {
                dp[i] = (dp[i - 2] + dp[i - 1]) % 10007;
            }
        }

        System.out.println(dp[n] % 10007);
    }
}
