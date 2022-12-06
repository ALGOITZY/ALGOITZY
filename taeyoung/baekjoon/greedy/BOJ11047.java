package com.company.notes.study.week10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
/*
* 동전 0
* */
public class BOJ11047 {
    public static void main(String[] args) throws IOException{
        BOJ11047 test = new BOJ11047();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(test.solution(k, arr));
    }
    public static int solution(int k, int[] arr){
        int answer =0;
        int index = arr.length-1;

        while(k>0){
            if(arr[index]>k){
                index--;
            }else{
                k-=arr[index];
                answer++;
            }
        }
        return answer;
    }
}
