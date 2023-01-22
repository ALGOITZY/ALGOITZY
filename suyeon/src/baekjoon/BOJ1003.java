package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 피보나치 함수
 */
public class BOJ1003 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		int[][] dp = new int[41][2];

		dp[0] = new int[] {1, 0};
		dp[1] = new int[] {0, 1};
		for(int i = 2; i<=40; i++){
			dp[i] = new int[] {dp[i-1][0] + dp[i-2][0], dp[i-1][1] + dp[i-2][1]};
		}

		while(t-- > 0){
			int n = Integer.parseInt(br.readLine());
			System.out.println(dp[n][0] + " " + dp[n][1]);
		}
	}
}
