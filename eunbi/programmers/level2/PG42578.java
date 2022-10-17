package study.Level2;

import java.util.HashMap;

public class PG42578 {
    HashMap<String, Integer> map = new HashMap<>();
    public int solution(String[][] clothes) {
        int answer = 1;
        for(int i = 0; i < clothes.length; i++) map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        for (String key : map.keySet()) answer *= (map.get(key) + 1);
        return answer - 1;
    }
}
