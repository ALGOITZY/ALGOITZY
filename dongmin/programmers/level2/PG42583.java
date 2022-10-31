package algoitzy.week4;

import java.util.LinkedList;
import java.util.Queue;

// 다리를 지나는 트럭
public class PG42583 {
    public static void main(String[] args) {
        int solution = solution(2, 10, new int[]{7, 4, 5, 6});
        System.out.println("solution = " + solution);
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < bridge_length; i++) {
            queue.offer(0);
        }

        int count = 0; // 도착한 트럭의 개수
        int second = 0;
        int index = 0;

        while (count < truck_weights.length) {
            int poll = queue.poll();
            if (poll != 0) {
                count++;
            }

            int bridgeTotalWeight = 0; // 다리 위에 있는 트럭의 무게를 저장하는 변수
            for (Integer bridgeOnTruck : queue) {
                bridgeTotalWeight += bridgeOnTruck;
            }

            if (index == truck_weights.length || bridgeTotalWeight + truck_weights[index] > weight) {
                queue.offer(0);
            } else {
                queue.offer(truck_weights[index]);
                index++;
            }

            second++;
        }
        return second;
    }
}
