package algoitzy.week13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 신입 사원
public class BOJ1439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int[] count = new int[2];

        // [, , , 11]
        for (String number : s.split("0")) {
            if (!number.equals("")) {
                count[0]++;
            }
        }

        // [000, , 00]
        for (String number : s.split("1")) {
            if (!number.equals("")) {
                count[1]++;
            }
        }

        int min = Math.min(count[0], count[1]);
        System.out.println(min);
    }
}
