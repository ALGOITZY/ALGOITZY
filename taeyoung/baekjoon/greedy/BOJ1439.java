package com.company.notes.study.week13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
 * 뒤집기
 * */
public class BOJ1439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cntOne = 0, cntZero = 0;
        char now = '2'; //초기화 목적
        for (char c : br.readLine().toCharArray()) {
            if (now != c) {
                if (c == '1') cntOne++;
                else cntZero++;
                now = c;
            }
        }
        System.out.println(Math.min(cntOne, cntZero));
    }
}
