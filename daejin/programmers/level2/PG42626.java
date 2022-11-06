package level2;

import java.util.*;

public class PG42626 {
	 public int solution(int[] scoville, int K) {
	        int answer = 0;
	        PriorityQueue<Integer> queue = new PriorityQueue<>();
	        
	        for (int s : scoville){
	            queue.add(s);
	        }
	        
	        while(queue.peek() < K){
	            int a = queue.remove();
	            if(queue.isEmpty()){
	                answer = -1;
	                break;
	            }
	            int b = queue.remove();
	            int c = a + b * 2;
	            
	            queue.add(c);
	            answer ++;
	            
	        }
	        
	        return answer;
	    }
}
