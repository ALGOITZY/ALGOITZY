package algoitzy.week17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 괄호의 값
public class BOJ2504 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String bracket = br.readLine();

        Stack<Character> stack = new Stack<>();
        int result = 0;
        int mul = 1;

        result = getResult(bracket, stack, result, mul);

        System.out.println(!stack.isEmpty() ? 0 : result);
    }

    private static int getResult(String bracket, Stack<Character> stack, int result, int mul) {
        for (int i = 0; i < bracket.length(); i++) {
            switch (bracket.charAt(i)) {
                case '(':
                    stack.push('(');
                    mul *= 2;
                    break;
                case '[':
                    stack.push('[');
                    mul *= 3;
                    break;
                case ')':
                    if (stack.isEmpty() || stack.peek() != '(') {
                        return 0;
                    }
                    if(bracket.charAt(i - 1) == '(') {
                        result += mul;
                    }
                    stack.pop();
                    mul /= 2; // 괄호가 닫히면 mul의 값을 곱했던 숫자로 나눠줘야함
                    break;
                case ']':
                    if (stack.isEmpty() || stack.peek() != '[') {
                        return 0;
                    }
                    if (bracket.charAt(i - 1) == '[') {
                        result += mul;
                    }
                    stack.pop();
                    mul /= 3;
                    break;
            }
        }
        return result;
    }
}
