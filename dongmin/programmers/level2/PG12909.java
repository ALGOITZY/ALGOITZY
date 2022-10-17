package study.week1;

import java.util.Stack;

// 올바른 괄호
public class PG12909 {
    public static void main(String[] args) {
        boolean solution = solution("()()");
        System.out.println("solution = " + solution);
    }

    static boolean solution(String s) {
        /*
         * 맨 앞의 괄호가 '(' 이거나, 맨 뒤의 괄호가 '(' 인 경우에는 올바른 괄호 성립이 절대 불가능
         */
        if (s.charAt(0) == ')' || s.charAt(s.length() - 1) == '(') {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else {
                /*
                 * 스택이 비어있고 현재 괄호가 ')' 인 경우에는 성립 X
                 */
                if(stack.isEmpty()) {
                    return false;
                }else {
                    stack.pop();
                }
            }
        }

        /*
         * stack이 비어있다면 올바른 괄호가 성립, 요소가 남아있다면 성립 X
         */
        return stack.isEmpty();
    }
}
