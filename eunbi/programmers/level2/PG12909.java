package study.Level2;

import java.util.Stack;

public class PG12909 {
    public boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();

        for (char x : s.toCharArray()) {
            if(x == '(') stack.push('(');
            else {
                if(stack.size() == 0)  return false;
                stack.pop();
            }
        }
        if(stack.size() != 0)    return false;
        return answer;
    }
}
