package algoitzy.week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 날짜 계산
public class BOJ1476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int e = 1, s = 1, m = 1, year = 1;
        while (e != E || s != S || m != M) {
            e = (e != 15) ? e + 1 : 1;
            s = (s != 28) ? s + 1 : 1;
            m = (m != 19) ? m + 1 : 1;

            year++;
        }

        System.out.println(year);
    }
}
