package com.company.notes.study.week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1748 {
    public static void main(String[] args) throws IOException {
        BOJ1748 test = new BOJ1748();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        System.out.println(test.solution(st.nextToken()));
    }

    public static int solution(String n) {
        int answer = 0;
        int digit = n.length();


        for (int i = 1; i <= digit; i++) {
            int val = 0;
            if (digit == i) {
                val = Integer.parseInt(n);
            } else {
                val = (int) (Math.pow(10, i) - 1);
            }
            answer += i * (val - Math.pow(10, i - 1) + 1);
        }
        return answer;
    }
}
