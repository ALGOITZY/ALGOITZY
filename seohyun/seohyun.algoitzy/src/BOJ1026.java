import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// 보물

public class BOJ1026 {
    static class Solution {
        public void sol() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st;

            int N = Integer.parseInt(br.readLine());
            int[] A = new int[N];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(A); // A를 오름차순으로 정렬

            Integer[] B = new Integer[N];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                B[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(B, Comparator.reverseOrder());

            int ans = 0;
            for (int i = 0; i < N; i++) { // A의 가장 작은 값과 B의 가장 큰 값을 곱해서 더해 나감.
                ans += A[i] * B[i];
            }

            bw.write(ans + "\n");
            bw.flush();
            bw.close();
            br.close();

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
