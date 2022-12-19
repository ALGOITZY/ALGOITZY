import java.io.*;

// 설탕배달

public class BOJ2839 {
    static class Solution {
        public void sol() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());


            if (N == 4 || N == 7) {
                System.out.println(-1);
            }
            else if (N % 5 == 0) {
                System.out.println(N / 5);
            }
            else if (N % 5 == 1 || N % 5 == 3) {
                System.out.println((N / 5) + 1);
            }
            else if (N % 5 == 2 || N % 5 == 4) {
                System.out.println((N / 5) + 2);
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
