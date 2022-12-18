import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// 잃어버린 괄호

public class BOJ1541 {
    static class Solution {
        public void sol() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int sum = Integer.MAX_VALUE;	// 초기 상태 여부 확인을 위한 값으로 설정
            String[] subtraction = br.readLine().split("-");


            for(int i = 0; i < subtraction.length; i++) {
                int temp = 0;

                // 뺄셈으로 나뉜 토큰을 덧셈으로 분리하여 해당 토큰들을 더한다.
                String[] addition = subtraction[i].split("\\+");

                // 덧셈으로 나뉜 토큰들을 모두 더한다.
                for(int j = 0; j < addition.length; j++) {
                    temp += Integer.parseInt(addition[j]);
                }

                // 첫 번째토큰인 경우 temp값이 첫 번째 수가 됨
                if (sum == Integer.MAX_VALUE) {
                    sum = temp;
                } else {
                    sum -= temp;
                }
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
