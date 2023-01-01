import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// 기타

public class BOJ1049 {
    static class Solution {
        public void sol() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            //세트, 낱개 최솟값을 저장 할 변수이다. 올 수 있는 최댓값을 우선 저장해줘야하는데
            //조건에서 말한 최댓값은 1000이기때문에 1000 저장.
            int set = 1000;
            int single = 1000;

            //입력값을 받으면서 최솟값을 변수에 저장
            for(int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                set = Math.min(set, Integer.parseInt(st.nextToken()));
                single = Math.min(single, Integer.parseInt(st.nextToken()));
            }

            //가격을 정할 3개지 방법을 저장 할 3개의 변수
            int A, B, C;

            //끊어진 기타줄의 개수가 6의 배수이면 몫을 곱해주면 되지만,
            //6의 배수가 아니면 몫에 +1을 해서 곱해준다.(세트로만 사는 경우에만 해당)
            if(N % 6 == 0) {
                A = set * (N / 6);
            }else {
                A = set * ((N / 6) + 1);
            }
            B = (set * (N / 6)) + (single * (N % 6));
            C = single * N;

            //세가지의 값중 최솟값을 저장
            int result = Math.min(A, Math.min(B, C));

            System.out.println(result);
        }
        Solution() {}
    }

    public static class Main {
        public void main(String[] args) throws IOException  {

//        test code
            Solution solution = new Solution();
            System.out.println("============= 1 번");
            solution.sol();


        }
    }

}
