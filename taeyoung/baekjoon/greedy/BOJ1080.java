package com.company.notes.study.week14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 행렬
 * */
public class BOJ1080 {
    static int[][] a, b;
    static BufferedReader br;
    static int n, m;

    public static void main(String[] args) throws IOException {
        int answer = 0;
        setNM();

        a = new int[n][m];
        b = new int[n][m];

        setArr(a);
        setArr(b);

        if (n < 3 || m < 3) {
            if (!isEquals()) System.out.println(-1);
            else System.out.println(0); //악랄한 이 조건...
            return;
        }

        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < m - 2; j++) {
                if (a[i][j] != b[i][j]) {
                    answer++;
                    change3X3(i, j);
                }
            }
        }

        System.out.println(isEquals() ? answer : -1);
    }

    private static void setNM() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        n = Integer.parseInt(stringTokenizer.nextToken());
        m = Integer.parseInt(stringTokenizer.nextToken());
    }

    private static void setArr(int[][] arr) throws IOException {
        for (int j = 0; j < n; j++) {
            String row = br.readLine();
            for (int k = 0; k < m; k++) {
                arr[j][k] = Integer.parseInt(row.charAt(k) + "");
            }
        }
    }

    private static boolean isEquals() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] != b[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void change3X3(int x, int y) {
        for (int i = x; i < x + 3; i++) {
            for (int j = y; j < y + 3; j++) {
                a[i][j] = (a[i][j] == 1) ? 0 : 1;
            }
        }
    }

}
