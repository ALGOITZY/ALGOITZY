import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class main11399ATM {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        String P = br.readLine();

        String[] tmp = P.split(" ");
        int n = Integer.parseInt(N);
        int[] p = new int[n];
        for(int i = 0; i<p.length; i++) {
            p[i] = Integer.parseInt(tmp[i]);
        }
        Arrays.sort(p);
        System.out.println(dp(p));
    }

    public static int dp(int[] p) {
        if(p.length == 1) {
            return p[0];
        }

        int[] dp = new int[p.length];
        dp[0] = p[0];
        for(int i = 1; i<p.length; i++) {
            dp[i] = dp[i-1] + p[i];
        }
        int sum =0;
        for (int i =0 ;i<dp.length;i++) {
            sum+=dp[i];
        }
        return sum;
    }
}
