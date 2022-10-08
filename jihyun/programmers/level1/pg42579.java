import java.util.HashMap;
import java.util.Map;

// https://school.programmers.co.kr/learn/courses/30/lessons/42576
// 완주하지 못한 선수
public class pg42579 {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        int cnt;
        for(String name : participant){
            cnt = map.getOrDefault(name, 0) + 1;
            map.put(name, cnt);
        }

        for(String name : completion){
            cnt = map.get(name);
            if(cnt == 1) {
                map.remove(name, 1);
            }else {
                map.put(name, cnt-1);
            }
        }

        return map.keySet().iterator().next();
    }
}
/*정확성  테스트
테스트 1 〉	통과 (0.05ms, 74.6MB)
테스트 2 〉	통과 (0.06ms, 73.6MB)
테스트 3 〉	통과 (0.69ms, 77.6MB)
테스트 4 〉	통과 (0.95ms, 79.5MB)
테스트 5 〉	통과 (0.97ms, 77.6MB)
효율성  테스트
테스트 1 〉	통과 (50.00ms, 82.1MB)
테스트 2 〉	통과 (68.57ms, 89.8MB)
테스트 3 〉	통과 (95.90ms, 96.1MB)
테스트 4 〉	통과 (81.35ms, 95.9MB)
테스트 5 〉	통과 (82.54ms, 95.5MB)*/