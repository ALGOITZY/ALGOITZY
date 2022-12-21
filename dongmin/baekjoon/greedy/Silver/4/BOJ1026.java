package algoitzy.week11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 보물
public class BOJ1026 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int n;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());

        int[] a = new int[n];
        int[] b = new int[n];

        initArray(a);
        initArray(b);

        Arrays.sort(a);

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int max = 0;
            int index = 0;

            for (int j = 0; j < n; j++) {
                if(b[j] > max) {
                    max = b[j];
                    index = j;
                }
            }

            sum += a[i] * max;
            b[index] = -1;
        }

        System.out.println(sum);
    }

    /**
     * init array method
    */
    private static void initArray(int[] arr) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }
}
