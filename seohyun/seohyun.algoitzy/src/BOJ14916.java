import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// 거스름돈

public class BOJ14916 {
    static class Solution {
        public void sol() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int[] dp = new int[100001];
            dp[1] = -1;
            dp[2] = 1;
            dp[3] = -1;
            dp[4] = 2;
            dp[5] = 1;
            for (int i = 6; i <= n; i++) {
                dp[i] = Integer.MAX_VALUE;
            }
            for (int i = 6; i <= n; i++) {
                if (dp[i-2] == -1 && dp[i-5] == -1) {
                    dp[i] = -1;
                } else if (dp[i-2] == -1) {
                    dp[i] = dp[i-5] + 1;
                } else if (dp[i-5] == -1) {
                    dp[i] = dp[i-2] + 1;
                } else {
                    dp[i] = Math.min(dp[i-2], dp[i-5]) + 1;
                }
            }
            System.out.print(dp[n]);
        }


        Solution() {}
    }

    public static class Main {
        public void main(String[] args) throws IOException {

//        test code
            Solution solution = new Solution();
            System.out.println("============= 1 번");
            solution.sol();


        }
    }

}
