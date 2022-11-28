import java.io.*;
import java.util.StringTokenizer;

// 날짜 계산

public class BOJ1476 {
    static class Solution {
        public void sol() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int e = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int E = 0;
            int S = 0;
            int M = 0;
            int year = 0;

            while (true) {
                year++;
                E++;
                S++;
                M++;
                if (E == 16) E=1;
                if (S==29) S=1;
                if (M==20) M=1;
                if (e == E && m == M && S == s) break;
            }
            System.out.print(year);

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
