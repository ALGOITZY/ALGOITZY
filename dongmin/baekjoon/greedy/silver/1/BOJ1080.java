package algoitzy.week14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 행렬
public class BOJ1080 {

    static BufferedReader br;
    static int n;
    static int m;
    static int[][] A;
    static int[][] B;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        A = createArray();
        B = createArray();

        if (n < 3 && m < 3) {
            if (isEquals(A, B)) {
                System.out.println(0);
            } else {
                System.out.println(-1);
            }
            return;
        }

        if (isEquals(A, B)) {
            System.out.println(0);
            return;
        }

        int count = 0;
        for (int i = 0; i <= n - 3; i++) {
            for (int j = 0; j <= m - 3; j++) {
                if (A[i][j] != B[i][j]) {
                    transfer(i, j);
                    count++;
                    if (isEquals(A, B)) {
                        System.out.println(count);
                        return;
                    }
                }
            }
        }
        System.out.println(-1);
    }

    private static void transfer(int x, int y) {
        for (int i = x; i < x + 3; i++) {
            for (int j = y; j < y + 3; j++) {
                if (A[i][j] == 0) {
                    A[i][j] = 1;
                } else {
                    A[i][j] = 0;
                }
            }
        }
    }

    private static int[][] createArray() throws IOException {
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            String[] strArr = br.readLine().split("");
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(strArr[j]);
            }
        }
        return arr;
    }

    private static boolean isEquals(int[][] A, int[][] B) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (A[i][j] != B[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}