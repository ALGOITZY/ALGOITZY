package algoitzy.week4;

import java.util.*;

// 주식가격
public class PG42584 {
    public static void main(String[] args) {
        int[] solution = solution2(new int[]{1, 2, 3, 2, 3});
        System.out.println(Arrays.toString(solution));
    }

    public static int[] solution1(int[] prices) {

        Queue<Integer> queue = new LinkedList<>();
        for (int price : prices) {
            queue.offer(price);
        }

        List<Integer> list = new ArrayList<>();
        int index = 1;
        while (!queue.isEmpty()) {
            int price = queue.poll();
            int count = 0;
            for (int i = index; i < prices.length; i++) {
                if(price > prices[i]) {
                    count++;
                    break;
                }
                count++;
            }
            list.add(count);
            index++;
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static int[] solution2(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int[] period = new int[prices.length];

        int i = 0;
        stack.push(i);
        for (i = 1; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                int index = stack.pop();
                period[index] = i - index;
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int index = stack.pop();
            period[index] = i - index - 1;
        }

        return period;
    }
}
