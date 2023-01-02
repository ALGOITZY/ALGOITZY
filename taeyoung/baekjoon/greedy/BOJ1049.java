package com.company.notes.study.week13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
/*
* 기타줄
* */
public class BOJ1049 {
    public static void main(String[] args) throws IOException {
        int packSize = 6;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int minPack = Integer.MAX_VALUE;
        int minOne = Integer.MAX_VALUE;

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            minPack = Math.min(minPack, Integer.parseInt(st.nextToken()));
            minOne = Math.min(minOne, Integer.parseInt(st.nextToken()));
        }
        int quot = n / packSize;
        int remain = n % packSize;
        int temp = Math.min((minPack * quot) + (minOne * remain), minPack * (quot + 1));
        System.out.println(Math.min(temp, minOne*n));
    }
}
