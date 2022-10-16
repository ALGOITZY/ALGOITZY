package programmers.level1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PG12906 {
	public int[] solution(int []arr) {
		Stack<Integer> stack = new Stack<>();
		Queue<Integer> result = new LinkedList<>();
		stack.push(10);

		for(int value : arr) {
			if(value != stack.pop()) {
				result.add(value);
			}
			stack.push(value);
		}

        return result.stream().mapToInt(i->i).toArray();
	}
}
