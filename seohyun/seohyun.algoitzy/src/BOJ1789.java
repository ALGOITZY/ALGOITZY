import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 수들의 합

public class BOJ1789 {
    static class Solution {
        public void sol() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            long s = Long.parseLong(br.readLine());
            int i = 0;
            long sum = 0;

            while(sum < s) {
                i++;
                sum += i;
            }
            if(sum > s) {
                System.out.println(i-1);
            }else {
                System.out.println(i);
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
