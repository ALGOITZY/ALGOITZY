package study;

import java.util.Arrays;
import java.util.Stack;

// 같은 숫자는 싫어
public class PG12906 {
    public static void main(String[] args) {
        int[] solution1 = solution1(new int[]{1, 1, 3, 3, 0, 1, 1});
        System.out.println(Arrays.toString(solution1));
    }

    // Stack
    public static int[] solution1(int []arr) {
        Stack<Integer> stack = new Stack<>();

        for (int number : arr) {
            if (!(stack.isEmpty() || stack.peek() != number)) {
                continue;
            }
            stack.push(number);
        }

        int[] result = new int[stack.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = stack.get(i);
        }

        return result;
    }
}
