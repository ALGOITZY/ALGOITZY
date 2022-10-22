package programmers.level1;

import java.util.Stack;

public class PG12906 {
	public int[] solution(int []arr) {
		Stack<Integer> stack = new Stack<>();
		stack.push(-1);

		for(int value : arr) {
			if(value != stack.peek()) {
				if(stack.peek() < 0) {	stack.pop();	}
				stack.push(value);
			}
		}
		
        return stack.stream().mapToInt(i->i).toArray();
		/*
		Queue<Integer> result = new LinkedList<>();
		int prev = -1;
		for(int value : arr) {
			if(prev != value) {
				prev = value;
				result.add(value);
			}
		}
		*/
       // return result.stream().mapToInt(i->i).toArray();
	}
}
