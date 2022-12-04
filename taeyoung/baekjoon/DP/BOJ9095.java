package com.company.notes.study.week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
 * 1, 2, 3 더하기
 * */
public class BOJ9095 {
    public static void main(String[] args) throws IOException {
        BOJ9095 test = new BOJ9095();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        test.solution(n, arr);

    }

    public static void solution(int n, int[] arr) {
        int[] answer = new int[n];
        ArrayList<Integer> dp = new ArrayList<>();

        //f(n) = f(n-1) + f(n-2) + f(n-3)
        dp.add(1);
        dp.add(2);
        dp.add(4);
        int last = 3;
        for(int i=0; i<n;i++){
            while(true){
                if(last>arr[i]-1){
                    answer[i] = dp.get(arr[i]-1);
                    break;
                }else{
                    dp.add(dp.get(last-1)+dp.get(last-2)+dp.get(last-3));
                    last++;
                }
            }
        }
        for(int i:answer){
            System.out.println(i);
        }
    }
}
