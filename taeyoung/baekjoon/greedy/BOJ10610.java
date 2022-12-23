package com.company.notes.study.week12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

/*
 * 30
 * */
public class BOJ10610 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int arr[] = new int[str.length()];
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            arr[i] = Integer.parseInt(str.charAt(i) + "");
            sum += arr[i];
        }
        Arrays.sort(arr);
        if ((arr[0] == 0) && (sum % 3 == 0)) {
            for (int i = str.length()-1; i >= 0; i--) {
                System.out.print(arr[i]);
            }
        } else {
            System.out.println(-1);
        }
    }
}
