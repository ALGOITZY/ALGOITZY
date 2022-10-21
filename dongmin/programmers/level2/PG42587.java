package algoitzy.week3;

import java.util.*;

// 프린터
public class PG42587 {
    public static void main(String[] args) {
        int solution = solution(new int[]{1, 1, 9, 1, 1, 1}, 0);
        System.out.println("solution = " + solution);
    }

    public static int solution(int[] priorities, int location) {

        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int priority : priorities) {
            pq.add(priority);
        }

        int count = 0;

        loop:
        while (!pq.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == pq.peek()) {
                    if (location == i) {
                        count++;
                        break loop;
                    }
                    pq.poll();
                    count++;
                }
            }
        }

        return count;
    }
}
