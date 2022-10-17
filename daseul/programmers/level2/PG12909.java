package programmers.level2;

import java.util.Stack;

public class PG12909 {
	public boolean solution(String str) {
		Stack<String> stack = new Stack<>();

		for(int idx = 0; idx < str.length(); idx++) {
			char ch = str.charAt(idx);
			if(ch == '(') {
				stack.push("(");
			} else {
				if(stack.isEmpty()) {	return false;	}
				stack.pop();
			}
		}

		return stack.isEmpty() ? true : false;
	}
}
