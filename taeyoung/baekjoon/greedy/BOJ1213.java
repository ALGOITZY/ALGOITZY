package com.company.notes.study.week14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 팰린드롬 만들기
 * */
public class BOJ1213 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];
        char[] chars = br.readLine().toCharArray();
        for (char c : chars) {
            arr[c - 'A']++;
        }

        int cntOdd = 0;
        for (int i : arr) {
            if (i % 2 == 1) cntOdd++;
        }

        if (cntOdd > 1) {
            System.out.println("I'm Sorry Hansoo");
        } else {
            StringBuilder sb = new StringBuilder();
            String midStr = "";

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    if (arr[i] % 2 == 0) {
                        for (int j = 0; j < arr[i] / 2; j++) {
                            sb.append((char) (i + 'A'));
                        }
                    } else {
                        for (int j = 0; j < arr[i] / 2 ; j++) {
                            sb.append((char) (i + 'A'));
                        }
                        midStr = String.valueOf((char)(i + 'A'));
                    }
                }
            }
            String firstStr = sb.toString();
            String endStr = sb.reverse().toString();
            System.out.println(firstStr+midStr+endStr);
        }
    }
}
