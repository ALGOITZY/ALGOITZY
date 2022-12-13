package algoitzy.week11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 잃어버린 괄호
public class BOJ1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] expression = br.readLine().split("-");

        int totalSum = 0;
        for (int i = 0; i < expression.length; i++) {
            int sum = 0;
            for (String num : expression[i].split("\\+")) {
                sum += Integer.parseInt(num);
            }

            if (i > 0) {
                totalSum -= sum;
            } else {
                totalSum += sum;
            }
        }

        System.out.println(totalSum);
    }
}
