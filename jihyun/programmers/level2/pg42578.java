import java.util.HashMap;
import java.util.Map;

// https://school.programmers.co.kr/learn/courses/30/lessons/42578
// 위장
public class pg42578 {
    public int solution(String[][] items) {
        Map<String, Integer> map = new HashMap<>();
        for(String[] item : items) {
            map.put(item[1], map.getOrDefault(item[1], 0) + 1);
        }

        int answer = 1;
        for(String key : map.keySet()){
            answer *= (map.get(key)+1);
        }
        return answer-1;
    }

}