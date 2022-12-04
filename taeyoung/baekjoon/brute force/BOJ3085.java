package com.company.notes.study.week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* 사탕 게임
* */

public class BOJ3085 {

    public static int findMax(int n, char[][] board, int max) {

        for(int i=0; i<n; i++) {
            int count = 1;
            for(int j=0; j<n-1; j++) {
                if(board[i][j] == board[i][j+1]) count ++;
                else count = 1;

                max = Math.max(max, count);
            }
        }

        for(int i=0; i<n; i++) {
            int count = 1;
            for(int j=0; j<n-1; j++) {
                if(board[j][i] == board[j+1][i]) count ++;
                else count = 1;
                max = Math.max(max, count);
            }
        }
        return max;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[][] board = new char[n][n];
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++) {
            String str = br.readLine();
            for(int j=0; j<n; j++) {
                board[i][j] = str.charAt(j);
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<n-1; j++) {
                char temp = board[i][j];
                board[i][j] = board[i][j+1];
                board[i][j+1] = temp;

                max = findMax(n, board,max);

                temp = board[i][j]; //원상복귀
                board[i][j] = board[i][j+1];
                board[i][j+1] = temp;
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<n-1; j++) {

                char temp = board[j][i];
                board[j][i] = board[j+1][i];
                board[j+1][i] = temp;

                max = findMax(n, board,max);

                temp = board[j][i];
                board[j][i] = board[j+1][i];
                board[j+1][i] = temp;
            }
        }

        System.out.println(max);
    }
}
