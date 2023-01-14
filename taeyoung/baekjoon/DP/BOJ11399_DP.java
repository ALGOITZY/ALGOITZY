package com.company.notes.study.week15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * ATM
 * */
public class BOJ11399_DP {
    public static void main(String[] args) throws IOException {
        BOJ11399_DP test = new BOJ11399_DP();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(test.solution(n, arr));
    }

    private int solution(int n, int[] arr) {
        Arrays.sort(arr);
        int[] sum = new int[n];
        sum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum[i] = sum[i - 1] + arr[i];
        }

        int[] dp = new int[n];
        dp[0] = arr[0];
        for (int i = 1; i < n; i++) {
            dp[i] = dp[i - 1] + sum[i];
        }

        return dp[n - 1];
    }
}
