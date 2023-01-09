import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// 수리공 항승

public class BOJ1449 {
    static class Solution {
        public void sol() throws IOException {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int N = Integer.parseInt(st.nextToken());	// 물이 새는 곳의 개수
            int L = Integer.parseInt(st.nextToken());	// 테이프 길이
            int min = 0;	// 필요한 테이프의 최소 개수
            int[] arr = new int[N];
            st = new StringTokenizer(bf.readLine());

            for(int i=0; i<arr.length; i++)
                arr[i] = Integer.parseInt(st.nextToken());

            //현재 물이 샌곳에 테이프를 붙였을때, 테이프가 영향을 미치는 범위
            int tapeRange = (int)(arr[0] - 0.5 + L);
            min ++;

            Arrays.sort(arr);

            for(int i=1; i<arr.length; i++) {
                if (tapeRange < (int)(arr[i] + 0.5)){
                    tapeRange = (int)(arr[i] - 0.5 + L);
                    min ++;
                }
            }

            System.out.println(min);
            bf.close();
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
