import java.util.ArrayList;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/12906
public class pg12906 {
    public int[] solution(int []arr) {
        int target = -1;
        List<Integer> list = new ArrayList<>();
        for(int e : arr){
            if(target != e) {
                list.add(e);
                target = e;
            }
        }

        return list.stream().mapToInt(i->i).toArray();
    }
}
