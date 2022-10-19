import java.util.ArrayList;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/42586
// 기능개발
public class pg42586 {
    public int[] solution(int[] progresses, int[] speeds) {
        int size = progresses.length;
        int[] time = new int[size];

        for(int i=0; i<size; i++){
            int t = (100-progresses[i])/speeds[i];
            time[i] = (100-progresses[i])%speeds[i] == 0 ? t : t+1;
        }

        int answerSize = 1;
        int standardT = time[0];
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<size; i++) {
            if(time[i] > standardT) {
                list.add(answerSize);
                answerSize = 0;
                standardT = time[i];
            }
            answerSize+=1;
        }
        list.add(answerSize);

        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
