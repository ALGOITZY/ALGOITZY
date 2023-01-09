import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// 행렬

public class BOJ1080 {
    static class Solution {
        static int n, m;
        static int[][] A;
        static int[][] B;
    
        public void sol() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            // 주어진 값들 입력
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            A = new int[n][m];
            B = new int[n][m];

            // A 행렬 입력
            for(int i=0; i < n; i++){
                String s = br.readLine();
                for(int j=0; j < m; j++){
                    A[i][j] = s.charAt(j) - '0';
                }
            }

            // B 행렬 입력
            for(int i=0; i < n; i++){
                String s = br.readLine();
                for(int j=0; j < m; j++){
                    B[i][j] = s.charAt(j) - '0';
                }
            }

            // A -> B로 행렬 전환하기 위해 동작 수행
            int ans = 0;
            for(int i=0; i < n; i++){
                for(int j=0; j < m; j++){
                    // 더 이상 부분 행렬 연산이 불가한 위치인데 다르다면, 변환이 불가한 경우!
                    if(i >= n-2 || j >= m-2){
                        if(A[i][j] != B[i][j]){
                            System.out.println(-1);
                            return;
                        } else {
                            continue;
                        }
                    }

                    // 값이 다르다면 변경을 수행하고 수행 횟수 +1을 한다.
                    if(A[i][j] != B[i][j]){
                        change(i, j);
                        ans++;
                    }
                }
            }
            System.out.println(ans);
            br.close();
        }

        private static void change(int y, int x){
            // 3x3 행렬 부분을 0이면 1로, 1이면 0으로 변경한다.
            for(int i=y; i <= y+2; i++){
                for(int j=x; j <= x+2; j++){
                    A[i][j] = A[i][j] ^ 1;
                }
            }

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
