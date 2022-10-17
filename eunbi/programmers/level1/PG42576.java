import java.util.HashMap;

public class Main {
    public int solution(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);

        int size = nums.length / 2;
        int answer = map.size() > size ? size : map.size();
        return answer;
    }
}
