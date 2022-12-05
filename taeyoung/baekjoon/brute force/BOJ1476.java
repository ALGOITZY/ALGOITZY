package com.company.notes.study.week8;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int e = Integer.parseInt(st.nextToken()); //15
        int s = Integer.parseInt(st.nextToken()); //28
        int m = Integer.parseInt(st.nextToken()); //19
        if(e==15) e = 0;
        if(m==19) m = 0;

        for (int i = 0;; i++) {
            int n = s+i*28;
            if (n%15==e && n%19==m){
                System.out.println(n);
                return;
            }
        }
    }
}
