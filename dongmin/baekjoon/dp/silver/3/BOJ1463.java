package algoitzy.week16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1로 더하기
public class BOJ1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n + 1];
        dp[0] = -1;

        // 각 숫자별 최소 연산의 횟수를 저장한다..?
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 2 == 0) {
                dp[i] = Math.min(dp[i / 3] + 1, dp[i / 2] + 1);
            } else if (i % 3 == 0) {
                dp[i] = Math.min(dp[i / 3] + 1, dp[i - 1] + 1);
            } else if(i % 2 == 0){
                dp[i] = Math.min(dp[i / 2] + 1, dp[i - 1] + 1);
            } else {
                dp[i] = dp[i - 1] + 1;
            }
        }

        System.out.println(dp[n]);
    }
}
