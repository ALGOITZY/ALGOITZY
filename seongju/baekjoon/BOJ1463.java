import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1463 {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());

        int count = 0;
        arr = new int[x+1];
        int ans = div(x);
        System.out.println(arr[x]);

    }

    static int div(int x) {
        arr[1] = 0;
        for(int i = 2; i<=x;i++) {
            arr[i] = arr[i-1]+1;
            if(i % 3 == 0) {
                arr[i] = Math.min(arr[i], arr[i/3]+1);
            } if(i % 2 == 0) {
                arr[i] = Math.min(arr[i], arr[i/2]+1);
            }
        }
        return arr[x];

    }
}
