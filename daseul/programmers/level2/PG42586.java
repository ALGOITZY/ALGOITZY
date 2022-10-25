package programmers.level2;

import java.util.Stack;

public class PG42586 {
	public int[] solution(int[] progresses, int[] speeds) {
        Stack<Integer> stack = new Stack<>();
        int start = 0;

        while(start < progresses.length) {
        	int completeCount = 0;
        	boolean isProgressive = true;

        	for(int idx = start; idx < progresses.length; idx++) {
        		progresses[idx] += speeds[idx];

        		if(isProgressive == true && progresses[idx] >= 100) {
        			completeCount++;
        		} else {
        			isProgressive = false;
        		}
        	}

        	if(completeCount > 0) {
        		stack.add(completeCount);
        		start += completeCount;
        	}
        }

        return stack.stream().mapToInt(i->i).toArray();
    }
}
