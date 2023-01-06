package algoitzy.week14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 팰린드롬 만들기
public class BOJ1213 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        int[] alphabet = new int[26]; // 알파벳 개수

        for (int i = 0; i < name.length(); i++) {
            alphabet[name.charAt(i) - 65]++;
        }

        int count = 0; // 홀수개의 알파벳 개수
        for (int alpha : alphabet) {
            if (alpha % 2 != 0) count++;
        }

        StringBuilder result = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        if (count > 1) {
            result.append("I'm Sorry Hansoo");
        } else {
            for (int i = 0; i < alphabet.length; i++) {
                for (int j = 0; j < alphabet[i] / 2; j++) {
                    sb.append((char) (65 + i));
                }
            }

            result.append(sb);
            String end = sb.reverse().toString();

            for (int i = 0; i < alphabet.length; i++) {
                if (alphabet[i] % 2 != 0) {
                    result.append((char) (65 + i));
                }
            }

            result.append(end);
        }
        System.out.println(result);
    }
}
