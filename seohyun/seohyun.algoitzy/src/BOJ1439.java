import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// 뒤집기

public class BOJ1439 {
    static class Solution {
        public void sol() throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            StringTokenizer st1 = new StringTokenizer(s, "0");
            StringTokenizer st0 = new StringTokenizer(s, "1");
            System.out.println(Math.min(st1.countTokens(), st0.countTokens()));

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
