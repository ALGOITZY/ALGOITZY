package com.company.notes.study.week11;

import java.math.BigInteger;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/*
* 수들의 합
* */
public class BOJ1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger s = new BigInteger(br.readLine());
        BigInteger sum = BigInteger.valueOf(0);
        int index = 0;

        while (s.compareTo(sum)>=0) { // s>sum => 1
            index++;
            sum = sum.add(BigInteger.valueOf(index));
        }
        System.out.println(index-1);
    }
}
