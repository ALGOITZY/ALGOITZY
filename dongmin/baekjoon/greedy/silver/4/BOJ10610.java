package algoitzy.week12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 30
public class BOJ10610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();

        int[] count = new int[10];

        int sum = 0;
        for (String s : n.split("")) {
            int number = Integer.parseInt(s);
            count[number]++;
            sum += number;
        }

        if (count[0] == 0 || sum % 3 != 0) {
            System.out.println(-1);
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            if(count[i] > 0) {
                sb.append(String.valueOf(i).repeat(count[i]));
            }
        }
        System.out.println(sb);
    }
}
