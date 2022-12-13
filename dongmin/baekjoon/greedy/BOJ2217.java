package algoitzy.week11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 로프
public class BOJ2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] ropes = new int[n];
        for (int i = 0; i < n; i++) {
            ropes[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(ropes);

        int max = 0;
        for (int i = n - 1; i >= 0; i--) {
            max = Math.max(max, ropes[i] * (n - i));
        }
        System.out.println(max);
    }
}
