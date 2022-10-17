package study.week1;

import java.util.HashMap;
import java.util.Map;

// 위장
public class PG42578 {
    public static void main(String[] args) {
        int solution = solution(new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}});
        System.out.println("solution = " + solution);
    }

    public static int solution(String[][] clothes) {

        Map<String, Integer> map = new HashMap<>();
        for (String[] clothe : clothes) {
            map.put(clothe[1], map.getOrDefault(clothe[1], 0) + 1);
        }

        int count = 1;
        for (String key : map.keySet()) {
            count *= (map.get(key) + 1);
        }

        return count;
    }

}
