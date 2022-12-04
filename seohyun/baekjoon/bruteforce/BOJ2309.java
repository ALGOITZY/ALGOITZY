import java.io.*;
import java.util.Arrays;

// 일곱 난쟁이

// 1. 그냥 다 해보기, for 문을 이용하여,

public class BOJ2309 {
    static class Solution {
        public void sol() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int[] arr = new int[9];
            int sum = 0;
            for (int i = 0; i < 9; i++) {
                arr[i] = Integer.parseInt(br.readLine());
                sum += arr[i];
            }
            for (int i = 0; i < 8; i++) {
                for (int j = i+1; j < 9; j++) {
                    if (sum - arr[i] - arr[j] == 100) {
                        arr[i] = 0;
                        arr[j] = 0;
                        Arrays.sort(arr);
                        for (int k = 2; k < 9; k++) {
                            System.out.println(arr[k]);
                        }
                        return;
                    }
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
