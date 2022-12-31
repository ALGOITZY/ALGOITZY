package com.company.notes.study.week13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/*
* 신입 사원
* */
public class BOJ1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            ArrayList<Grade> applicants = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                int document = Integer.parseInt(st.nextToken());
                int interview = Integer.parseInt(st.nextToken());
                applicants.add(new Grade(document, interview));
            }
            Collections.sort(applicants);
            int cnt = 1;    //첫 지원자는 항상 카운트
            int min = applicants.get(0).interview;
            for (int j = 1; j < n; j++) {
                int now = applicants.get(j).interview;
                min = Math.min(min, now);
                if (min == now) cnt++;
            }
            System.out.println(cnt);
        }
    }

    static class Grade implements Comparable<Grade> {
        int document;
        int interview;

        Grade(int document, int interview) {
            this.document = document;
            this.interview = interview;
        }

        @Override
        public int compareTo(Grade o) {
            return this.document - o.document;
        }
    }
}
