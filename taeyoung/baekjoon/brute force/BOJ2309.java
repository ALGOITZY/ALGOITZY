package com.company.notes.study;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ2309 {
    public static void main(String[] args) {
        int[] arr = new int[9];
        Scanner scan = new Scanner(System.in);
        int totalSum = 0;
        for (int i = 0; i < 9; i++) {
            arr[i] = scan.nextInt();
            totalSum += arr[i];
        }

        boolean findFake = false;
        for (int i = 0; i < 9; i++) {
            if (findFake) break;
            int sum = totalSum - arr[i];
            for (int j = i + 1; j < 9; j++) {
                if (sum-arr[j] == 100) {
                    arr[i] = -1;
                    arr[j] = -1;
                    findFake = true;
                    break;
                }
            }
        }
        Arrays.sort(arr);
        for (int i : arr) {
            if (i != -1) {
                System.out.println(i);
            }
        }
    }

}
