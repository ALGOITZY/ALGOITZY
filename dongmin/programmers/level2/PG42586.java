package algoitzy.week3;

import java.util.*;

// 기능개발 [스택/큐]
public class PG42586 {
    public static void main(String[] args) {
        int[] solution = solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1});
        System.out.println(Arrays.toString(solution));
    }

    public static int[] solution(int[] progresses, int[] speeds) {

        Queue<Integer> queue = new LinkedList<>();
        for (int progress : progresses) {
            queue.offer(progress);
        }

        Queue<Integer> dayQueue = new LinkedList<>();
        for (int speed : speeds) {
            int day = 0;
            int q = queue.poll();
            while (q < 100) {
                q += speed;
                day++;
            }
            dayQueue.offer(day);
        }

        List<Integer> list = new ArrayList<>();
        int func = dayQueue.poll();
        int count = 1;
        while (!dayQueue.isEmpty()) {
            if (func >= dayQueue.peek()) { // 개발 기간이 같은 기능은 같은 날 배포가 되어야함!
                dayQueue.poll();
                count++;
            } else {
                list.add(count);
                func = dayQueue.poll();
                count = 1;
            }

            if(dayQueue.size() == 0) {
                list.add(count);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
