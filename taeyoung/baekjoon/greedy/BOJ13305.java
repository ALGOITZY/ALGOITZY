package com.company.notes.study.week12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* 주유소
* */
public class BOJ13305 {
    static int n;
    static long[] len;
    static long[] fee;

    public static void main(String[] args) throws IOException {
        long answer = 0;
        initArray();

        long minFee = fee[0];

        for (int i = 0; i < n - 1; i++) {
            if (minFee > fee[i]) minFee = fee[i];
            answer += minFee * len[i];
        }

        System.out.println(answer);
    }

    private static void initArray() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        len = new long[n - 1];
        fee = new long[n - 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n - 1; i++) {
            len[i] = Long.parseLong(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n - 1; i++) {
            fee[i] = Long.parseLong(st.nextToken());
        }
    }
}
