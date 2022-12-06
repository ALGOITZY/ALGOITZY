package algoitzy.week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 설탕 배달
public class BOJ2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        solution1(n);
        solution2(n);
    }

    private static void solution2(int n) {
        int count = 0;

        while (true) {
            if (n % 5 == 0) {
                count += n / 5;
                break;
            } else if (n < 3) {
                count = -1;
                break;
            }

            n -= 3;
            count++;
        }
        System.out.println(count);
    }

    private static void solution1(int n) {
        if(n == 4 || n == 7) {
            System.out.println(-1);
            return;
        }

        if (n % 15 == 0) {
            System.out.println(n / 5);
            return;
        }

        int min = 10000;
        if (n % 5 == 0) {
            min = n / 5;
        }

        if (n % 3 == 0) {
            min = n / 3;
        }

        int i = 1;
        while((n - (i * 5)) > 0) {
            if ((n - (i * 5)) % 3 == 0) {
                int count = i + (n - (i * 5)) / 3;
                min = Math.min(min, count);
            }

            i++;
        }

        System.out.println(min);
    }
}
