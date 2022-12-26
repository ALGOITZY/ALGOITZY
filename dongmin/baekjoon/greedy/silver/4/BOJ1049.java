package algoitzy.week13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 기타줄
public class BOJ1049 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] unit =new int[m];
        int[] single =new int[m];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            unit[i] = Integer.parseInt(st.nextToken());
            single[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(unit);
        Arrays.sort(single);

        if (n < 6) {
            System.out.println(Math.min(unit[0], single[0] * n));
        } else {
            int total = 0;
            total += Math.min(unit[0] * (n / 6), single[0] * (6 * (n / 6)));
            total += Math.min(unit[0], single[0] * (n % 6));
            System.out.println(total);
        }
    }
}