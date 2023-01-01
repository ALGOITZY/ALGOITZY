import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// A -> B

public class BOJ16953 {
    static class Solution {
        public void sol() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st = new StringTokenizer(br.readLine());

            long A = Long.parseLong(st.nextToken());
            long B = Long.parseLong(st.nextToken());

            int ans = 1;
            while (B != A) {
                if (B < A) {
                    ans = -1;
                    break;
                }

                String str = String.valueOf(B);

                // 맨 끝자리가 1이거나 B가 2로 나누어 떨어지지 않는다면, A로 만들 수 없다.
                if (str.charAt(str.length() - 1) != '1' && B % 2 != 0) {
                    ans = -1;
                    break;
                }

                if (B % 2 == 0) { // B가 2로 나누어 떨어진다면, 2로 나눈다.
                    B >>= 1;
                } else { // 그렇지 않고, 맨 끝자리가 1이라면 1을 없앤다.
                    str = str.substring(0, str.length() - 1);
                    B = Long.parseLong(str);
                }

                ans++; // 횟수 증가.
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
