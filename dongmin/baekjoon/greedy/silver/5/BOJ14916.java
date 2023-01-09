package algoitzy.week14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 거스름돈
public class BOJ14916 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int change = Integer.parseInt(br.readLine());

        int count = 0;
        while (change > 0) {
            if (change < 2) {
                count = -1;
                break;
            }

            if (change % 5 == 0) {
                count += change / 5;
                break;
            }
            change -= 2;
            count++;
        }

        System.out.println(count);
    }
}
