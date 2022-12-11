package algoitzy.week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 동전 0

public class BOJ11047 {
    static class Solution {
        public void sol() throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            int[] coin = new int[N];

            for(int i = 0; i < N; i++) {
                coin[i] = Integer.parseInt(br.readLine());
            }

            int count = 0;

            for(int i = N - 1; i >= 0; i--) {

                if(coin[i] <= K) {
                    count += (K / coin[i]);
                    K = K % coin[i];
                }
            }
            System.out.println(count);

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
