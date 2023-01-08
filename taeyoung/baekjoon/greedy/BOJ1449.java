package com.company.notes.study.week14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 수리공 항승
 * */
public class BOJ1449 {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int l = Integer.parseInt(stringTokenizer.nextToken());
        stringTokenizer = new StringTokenizer(br.readLine());

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        Arrays.sort(nums);

        int answer = 1;
        double max = nums[0] - 0.5 + l;
        for (int i = 1; i < n; i++) {
            if (max < (nums[i]) + 0.5) {
                answer++;
                max = (nums[i]) - 0.5 + l;
            }
        }
        System.out.println(answer);
    }
}
