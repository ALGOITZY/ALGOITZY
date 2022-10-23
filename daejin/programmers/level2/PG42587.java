package level2;
import java.util.Collections;
import java.util.PriorityQueue;

public class PG42587 {
	public int solution(int[] priorities, int location) {
		int answer = 1;
        // 우선순위 큐 적용(https://coding-factory.tistory.com/603)
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for(int i : priorities) {
			//큐에 값을 추가
			pq.offer(i);
		}
		
		while(!pq.isEmpty()) {
			for(int i = 0; i < priorities.length; i++) {
				//큐에 첫번째값과 우선순위 배열 비교
				if(pq.peek() == priorities[i]) {
					if(location == i) {
						return answer;
					}
					//큐의 첫번째값 반환 후 제거
					pq.poll();
					answer++;
				}
			}
		}
     return answer;
	}
}
