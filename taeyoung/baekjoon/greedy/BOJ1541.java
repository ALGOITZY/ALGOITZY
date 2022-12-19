package com.company.notes.study.week11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/*
* 잃어버린 괄호
* */
public class BOJ1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine(), "-");
        String temp = st1.nextToken();  //첫번째 토큰은 나중에 더해줌
        int answer = 0;
        while (st1.hasMoreTokens()) {
            int val = 0;
            val = sumSplitPlus(val, st1.nextToken());
            answer -= val;
        }

        answer = sumSplitPlus(answer, temp);

        System.out.println(answer);
    }

    private static int sumSplitPlus(int val, String s) {
        StringTokenizer st2 = new StringTokenizer(s, "+");
        while (st2.hasMoreTokens()) {
            val += Integer.parseInt(st2.nextToken());
        }
        return val;
    }
}
