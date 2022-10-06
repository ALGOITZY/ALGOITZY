package programmers.level1;

import java.util.HashSet;
import java.util.Set;

// 폰켓몬
public class PG1845 {
    public static void main(String[] args) {
        int solution = solution(new int[]{3, 1, 2, 3});
        System.out.println("solution = " + solution);
    }

    public static int solution(int[] nums) {
        Set<Integer> pokemon = new HashSet<>();

        for (int num : nums) {
            pokemon.add(num);
        }

        return Math.min(pokemon.size(), nums.length / 2);
    }
}
