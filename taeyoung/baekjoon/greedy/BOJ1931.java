package com.company.notes.study.week10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Collections;

/*
* 회의실 배정
* */
public class BOJ1931 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Meeting> timeList = new ArrayList<>();

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            timeList.add(new Meeting(s,e));
        }
        Collections.sort(timeList);

        int cnt=0;
        int endTime = 0;
        for(Meeting m : timeList){
            if(m.startTime>=endTime){
                cnt++;
                endTime = m.endTime;
            }
        }
        System.out.println(cnt);
    }

    static class Meeting implements Comparable<Meeting>{
        int startTime;
        int endTime;
        Meeting(int start, int end){
            startTime = start;
            endTime = end;
        }

        @Override
        public int compareTo(Meeting m) {
            if(this.endTime==m.endTime) return this.startTime-m.startTime;
            else return this.endTime-m.endTime;
        }
    }
}
