package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 1로 만들기
 */
public class BOJ1463 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[] dp = new int[n+2];
		Arrays.fill(dp, Integer.MAX_VALUE);

		dp[1] = 0;

		for(int i = 2; i<=n; i++){
			if(i%3 == 0){
				dp[i] = Math.min(dp[i], dp[i/3] + 1);
			}if (i%2 == 0) {
				dp[i] = Math.min(dp[i], dp[i/2] + 1);
			}
			dp[i] = Math.min(dp[i], dp[i-1] + 1);
		}

		System.out.println(dp[n]);
	}
}
