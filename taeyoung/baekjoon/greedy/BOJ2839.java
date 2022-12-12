package com.company.notes.study.week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* 설탕 배달
* */
public class BOJ2839 {
    public static void main(String[] args) throws IOException {
        BOJ2839 test = new BOJ2839();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(test.solution(Integer.parseInt(br.readLine())));
    }

    public static int solution(int n) {
        int cnt = n / 5;
        int remain = n % 5;
        for (int i = 0; i <= cnt; i++) {
            if (remain % 3 == 0) return (cnt - i) + (remain / 3);
            else remain += 5;
        }
        return -1;
    }
}
