package algoitzy.week17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 스택 수열
public class BOJ1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int start = 1;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            while (start <= num) {
                stack.push(start);
                sb.append("+\n");
                start++;
            }

            if (stack.peek() > num) {
                System.out.println("NO");
                break;
            } else {
                stack.pop();
                sb.append("-\n");
            }
        }

        System.out.println(sb);

    }
}
