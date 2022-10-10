import java.util.HashMap;
import java.util.Map;

public class Main {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();

        for (String key : participant) map.put(key, map.getOrDefault(key, 0) + 1);
        for (String key : completion) {
            map.put(key, map.get(key) - 1);
            if(map.get(key) == 0)   map.remove(key);
        }
        for (String key : map.keySet()) answer += key;
        return answer;
    }
}
