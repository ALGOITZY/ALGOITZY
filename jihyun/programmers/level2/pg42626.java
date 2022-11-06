import java.util.*;
// https://school.programmers.co.kr/learn/courses/30/lessons/42626
// 더 맵게
class pg42626 {
    public int solution(int[] scovilleList, int K) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();    
        for(int scov : scovilleList) {
            heap.offer(scov);
        }
        
        int time = 0;
        int scoville = 0;
        int min1, min2;
        while(heap.peek() <= K) {
            if(heap.size() == 1) return -1;
            time+=1;
            
            min1 = heap.poll();
            min2 = heap.poll();
            
            scoville= min1+(min2*2);
              
            heap.offer(scoville);
        }
        
        return time;
    }
}
