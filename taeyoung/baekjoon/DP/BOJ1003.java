package com.company.notes.study.week16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 피보나치 함수
 * */
public class BOJ1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] dpZero = new int[41]; /* N은 40보다 작거나 같은 자연수 또는 0 */
        int[] dpOne = new int[41];

        dpZero[0] = 1;
        dpOne[1] = 1;
        for (int i = 2; i <= 40; i++) {
            dpZero[i] = dpZero[i - 2] + dpZero[i - 1];
            dpOne[i] = dpOne[i - 2] + dpOne[i - 1];
        }

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(dpZero[n] + " " + dpOne[n]);
        }
    }
}
