package algoitzy.week11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 수들의 합
public class BOJ1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long s = Long.parseLong(br.readLine());

        int count = 0;
        int num = 1;
        while (s >= 0) {
            s -= num++;
            count++;
        }

        System.out.println(count - 1);
    }
}