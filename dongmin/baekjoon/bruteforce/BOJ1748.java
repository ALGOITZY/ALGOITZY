package algoitzy.week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 수 이어 쓰기 1
public class BOJ1748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int num = i;
            while (num > 0) {
                num /= 10;
                sum += 1;
            }
        }
        System.out.println(sum);
    }
}
