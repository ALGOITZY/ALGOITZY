package algoitzy.week13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 * 신입 사원
 * silver 1
 */
public class BOJ1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            int[][] score= new int[n][2];
            for (int j = 0; j < score.length; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                score[j][0] = Integer.parseInt(st.nextToken());
                score[j][1] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(score, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o1[0] - o2[0];
                }
            });

            int count = 1;
            int min = score[0][1];
            for (int j = 1; j < score.length; j++) {
                if(score[j][1] < min) {
                    min = score[j][1];
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}