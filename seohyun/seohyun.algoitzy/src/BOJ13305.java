import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 주유소

public class BOJ13305 {
    static class Solution {
        public void sol() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(br.readLine());

            long[] dist = new long[N - 1];	// 거리
            long[] cost = new long[N];	// 비용

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int i = 0; i < N - 1; i++) {
                dist[i] = Long.parseLong(st.nextToken());
            }

            st = new StringTokenizer(br.readLine(), " ");
            for(int i = 0; i < N; i++) {
                cost[i] = Long.parseLong(st.nextToken());
            }

            long sum = 0;
            long minCost = cost[0];	// 이전 까지의 과정 중 주유 최소 비용

            for(int i = 0; i < N - 1; i++) {
                if(cost[i] < minCost) {
                    minCost = cost[i];
                }

                sum += (minCost * dist[i]);
            }

            System.out.println(sum);

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
