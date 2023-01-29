package algoitzy.week17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 에디터
public class BOJ1406 {
    static BufferedReader br;
    static int n;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        stack();

    }

    // Stack
    private static void stack() throws IOException {
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();

        String str = br.readLine();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < str.length(); i++) {
            left.push(str.charAt(i));
        }

        for (int i = 0; i < n; i++) {
            String command = br.readLine();
            char c = command.charAt(0);

            switch(c) {
                case 'L':
                    if (!left.isEmpty()) {
                        right.push(left.pop());
                    }
                    break;
                case 'D':
                    if (!right.isEmpty()) {
                        left.push(right.pop());
                    }
                    break;
                case 'B':
                    if (!left.isEmpty()) {
                        left.pop();
                    }
                    break;
                case 'P':
                    left.push(command.charAt(2));
                    break;
            }
        }

        while (!left.isEmpty()) {
            right.push(left.pop());
        }

        StringBuilder sb = new StringBuilder();
        while (!right.isEmpty()) {
            sb.append(right.pop());
        }

        System.out.println(sb.toString());
    }
}
