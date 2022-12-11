package com.company.notes.study.week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
 * 1, 2, 3 더하기
 * */
public class BOJ9095 {
    public static void main(String[] args) throws IOException {
        BOJ9095 test = new BOJ9095();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        test.solution(n, arr);

    }

    public static void solution(int n, int[] arr) {
        int[] dp = new int[11]; //n은 양수이며 11보다 작다.

        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 4;

        for (int i = 3; i < 11; i++) {
            //f(n) = f(n-1) + f(n-2) + f(n-3)
            dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
        }
        for(int i:arr){
            System.out.println(dp[i-1]);
        }
    }
}
