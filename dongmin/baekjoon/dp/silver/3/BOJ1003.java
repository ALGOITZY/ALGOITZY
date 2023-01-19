package algoitzy.week16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 피보나치 함수
public class BOJ1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int[][] dp = new int[41][2]; // n번째 피보나치를 호출했을 때 나오는 0, 1의 개수
        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        for (int i = 2; i < 41; i++) {
            dp[i][0] = dp[i - 1][0] + dp[i - 2][0];
            dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
        }

        for (int i = 0; i < t; i++) {
            StringBuilder sb = new StringBuilder();
            int n = Integer.parseInt(br.readLine());

            sb.append(dp[n][0]).append(" ").append(dp[n][1]);
            System.out.println(sb);
        }
    }
}
