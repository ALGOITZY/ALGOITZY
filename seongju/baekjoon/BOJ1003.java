import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcase = Integer.parseInt(br.readLine());
        int[] arr = new int[testcase];

        for(int i = 0; i< testcase; i++) {
            int k = Integer.parseInt(br.readLine());
            arr[i] = k;
        }
        for (int i : arr) {
            if(i == 0) System.out.println(1+" "+0);
            else if(i == 1) System.out.println(0+" "+1);
            else {
                int[][] result = fibonacci(i);
                System.out.println(result[i][0] + " " + result[i][1]);
            }
        }
    }
    //f(4) = f(3) + f(2)
    //f(3) = f(2) + f(1) = f(1) + f(0) + f(1) = 1
    //f(2) = f(1) + f(0)
    public static int[][] fibonacci(int input) {
        int[][] ans = new int[input+1][2];
        ans[0][0] = 1; ans[0][1] = 0;
        ans[1][0] = 0; ans[1][1] = 1;
        for(int i = 2; i<=input; i++) {

            ans[i][0] = ans[i-1][0] + ans[i-2][0];
            ans[i][1] = ans[i-1][1] + ans[i-2][1];
        }
        return ans;
    }
}
