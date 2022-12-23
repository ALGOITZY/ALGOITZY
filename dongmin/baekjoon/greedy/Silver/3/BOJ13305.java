package algoitzy.week12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 주유소

/** 반례
 * 4
 * 10 10 10
 * 1 2 3 4
 * result = 30
 *
 * 4
 * 10 10 10
 * 2 3 1 4
 * result = 50
 *
 */
public class BOJ13305 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] road = new int[n - 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n - 1; i++) {
            road[i] = Integer.parseInt(st.nextToken());
        }

        int[] price = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            price[i] = Integer.parseInt(st.nextToken());
        }

        long result = 0; // 최소 비용
        long min = price[0];
        for (int i = 0; i < n - 1; i++) {
            if (price[i] < min) {
                min = price[i];
            }
            result += min * road[i];
        }

        System.out.println(result);
    }
}
