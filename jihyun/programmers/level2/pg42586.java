import java.util.*;

// https://school.programmers.co.kr/learn/courses/30/lessons/42586
// 기능개발
public class pg42586 {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<progresses.length; i++){
            queue.add(calculateTime(progresses[i], speeds[i]));
        }

        List<Integer> list = new ArrayList<>();
        int cnt = 0; int standard = queue.poll();
        for(int q : queue){
            ++cnt;
            if(q > standard) {
                standard = q;
                list.add(cnt);
                cnt = 0;
            }
        }
        list.add(++cnt);

        return list.stream().mapToInt(i->i).toArray();
    }

    public int calculateTime(int p, int s){
        int leftProgress = 100 - p;
        int t = leftProgress/s;
        return leftProgress % s == 0 ? t : t+1;
    }
}
