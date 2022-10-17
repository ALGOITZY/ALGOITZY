import java.util.HashSet;
import java.util.Set;

// https://school.programmers.co.kr/learn/courses/30/lessons/1845
// 포켓몬 문제
public class pg1845 {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int maxSize = nums.length / 2;
        int setSize = set.size();
        return Math.min(maxSize, setSize);
    }

    /*
    테스트 1 〉	통과 (0.07ms, 78.5MB)
    테스트 2 〉	통과 (0.13ms, 71.7MB)
    테스트 3 〉	통과 (0.04ms, 78MB)
    테스트 4 〉	통과 (0.04ms, 81MB)
    테스트 5 〉	통과 (0.08ms, 73.2MB)
    테스트 6 〉	통과 (0.08ms, 71.4MB)
    테스트 7 〉	통과 (0.27ms, 78.8MB)
    테스트 8 〉	통과 (0.36ms, 75.6MB)
    테스트 9 〉	통과 (0.28ms, 71.7MB)
    테스트 10 〉	통과 (0.30ms, 73MB)
    테스트 11 〉	통과 (0.34ms, 77.1MB)
    테스트 12 〉	통과 (0.54ms, 83MB)
    테스트 13 〉	통과 (0.42ms, 77.8MB)
    테스트 14 〉	통과 (0.91ms, 81.8MB)
    테스트 15 〉	통과 (0.92ms, 80.3MB)
    테스트 16 〉	통과 (3.66ms, 82.9MB)
    테스트 17 〉	통과 (6.45ms, 77.5MB)
    테스트 18 〉	통과 (4.39ms, 78.7MB)
    테스트 19 〉	통과 (6.79ms, 84.8MB)
    테스트 20 〉	통과 (4.43ms, 77.6MB)
    */
}
