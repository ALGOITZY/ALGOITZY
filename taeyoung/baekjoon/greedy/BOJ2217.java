package com.company.notes.study.week11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

/*
* 로프
* */

public class BOJ2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] ropes = new int[n];
        int answer = 0;

        for (int i = 0; i < n; i++) {
            ropes[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(ropes);
        for (int i = 0; i < n; i++) {
            answer = Math.max(answer, ropes[i] * (n - i));
        }

        System.out.println(answer);
    }
}
