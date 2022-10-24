import java.util.LinkedList;
import java.util.Queue;

// https://school.programmers.co.kr/learn/courses/30/lessons/42587
// 프린터 문제
public class pg42587 {
    static int[][] exitPriorities;

    public int solution(int[] priorities, int location) {
        int answer = 0;
        exitPriorities = new int[2][priorities.length];

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            exitPriorities[0][i] = priorities[i];
            exitPriorities[1][i] = 0;
            q.add(i);
        }
        // target의 우선순위
        int targetPriority = priorities[location];

        while (true) {
            int index = q.poll();

            if (index == location && isTopPriority(targetPriority)) {
                answer++;
                break;
            }

            if (isTopPriority(priorities[index])) {
                exitPriorities[1][index] = 1;
                answer++;
            } else {
                q.add(index);
            }
        }
        return answer;
    }

    public boolean isTopPriority(int targetPriority) {

        for (int i = 0; i < exitPriorities[0].length; i++) {

            if (exitPriorities[0][i] > targetPriority && exitPriorities[1][i] == 0) {
                return false;
            }
        }
        return true;
    }
}
