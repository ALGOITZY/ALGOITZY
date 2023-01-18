import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11726 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] rectangle = new long[1001];
        for(int i = 0; i<=3; i++) {
            rectangle[i] = i;
        }

        for(int i = 4; i<=n; i++) {
            rectangle[i] = rectangle[i-1] % 10_007 + rectangle[i-2] % 10_007;
            rectangle[i] %= 10_007;
        }
        System.out.println(rectangle[n]);
    }
}
