package algoitzy.week5;

import java.util.PriorityQueue;

// 더 맵게
public class PG42626 {
    public static void main(String[] args) {
        int solution = solution(new int[]{1, 2, 3, 9, 10, 12}, 7);
        System.out.println("solution = " + solution);
    }

    public static int solution(int[] scoville, int K) {
        // 우선순위큐는 힙 자료구조를 이용해서 구현되어있다.
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int menu : scoville) {
            queue.offer(menu);
        }

        int count = 0;
        while (queue.size() > 1 && queue.peek() < K) {
            int mix = queue.poll() + (queue.poll() * 2);
            queue.offer(mix);

            count++;
        }

        return queue.peek() >= K ? count : -1;
    }
}
