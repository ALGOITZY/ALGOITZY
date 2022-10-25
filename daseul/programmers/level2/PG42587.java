package programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

public class PG42587 {
	public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> priorityQueue = new LinkedList<Integer>();

       	for(int idx = 0 ; idx < priorities.length; idx++) {
       		priorityQueue.add(priorities[idx]);
      	}

       	boolean isPrint = true;
       	boolean isNotFinish = true;
       	while(isNotFinish) {
       		int pollValue = priorityQueue.poll();

       		for(int pointer : priorityQueue) {
       			if(pollValue < pointer) {
       				isPrint = false;
       				break;
       			}
       		}

       		if(isPrint == true) {
       			answer++;
       			if(location == 0) {
       				isNotFinish = false;
       				break;
       			}
       		} else {
       			priorityQueue.add(pollValue);
       		}

       		location = location > 0 ? location-1 : priorityQueue.size() -1;
       		isPrint = true;
       	}

        return answer;
    }
}
