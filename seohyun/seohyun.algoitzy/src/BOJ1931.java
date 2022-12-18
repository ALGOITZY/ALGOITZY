import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// 회의실 배정

public class BOJ1931 {
    static class Solution {
        public void sol() throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(br.readLine());

            int[][] time = new int[N][2];

            StringTokenizer st;

            for(int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                time[i][0] = Integer.parseInt(st.nextToken());	// 시작시간
                time[i][1] = Integer.parseInt(st.nextToken());	// 종료시간
            }


            Arrays.sort(time, new Comparator<int[]>() {

                @Override
                public int compare(int[] o1, int[] o2) {

                    if(o1[1] == o2[1]) {
                        return o1[0] - o2[0];
                    }

                    return o1[1] - o2[1];
                }

            });

            int count = 0;
            int prev_end_time = 0;

            for(int i = 0; i < N; i++) {

                if(prev_end_time <= time[i][0]) {
                    prev_end_time = time[i][1];
                    count++;
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
