import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 30

public class BOJ10610 {
    static class Solution {
        public void sol() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String nStr = br.readLine();
            int sum = 0;
            char[] charArr = nStr.toCharArray();
            Arrays.sort(charArr);	// 오름차순 정렬
            int len = charArr.length;
            StringBuilder sb = new StringBuilder();
            for(int i = len - 1; i >= 0; i--) {
                int num = charArr[i] - '0';
                sum += num;
                sb.append(num);
            }
            if(charArr[0] != '0' || sum % 3 != 0) {	// 만약 3의 배수가 아니라면
                System.out.println(-1);
                return;
            }
            System.out.println(sb.toString());
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
