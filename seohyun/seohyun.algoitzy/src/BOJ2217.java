import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// 로프

public class BOJ2217 {
    static class Solution {
        public void sol() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int cnt = Integer.parseInt(st.nextToken());
            int arr[] = new int[cnt];
            for(int i=0; i < cnt; i++) {
                st = new StringTokenizer(br.readLine());
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);

            long max = 0;
            for(int i = cnt-1; i >= 0; i--) {
                arr[i] = arr[i] * (cnt-i);
                if(max < arr[i]) max = arr[i];
            }
            System.out.println(max);

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
