package algoitzy.week14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 수리공 항승
public class BOJ1449 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] location = new int[n];
        for (int i = 0; i < n; i++) {
            location[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(location);

        int count = 1;
        double range = location[0] - 0.5 + l;

        for (int i = 1; i < location.length; i++) {
            if (range < location[i] + 0.5) {
                range = location[i] - 0.5 + l;
                count++;
            }
        }
        System.out.println(count);
    }
}
