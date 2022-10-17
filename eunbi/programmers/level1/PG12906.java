package study.Level1;

import java.util.Stack;

public class PG12906 {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        int before = arr[0];
        stack.push(before);
        for(int i = 1; i < arr.length; i++) {
            if(before != arr[i]) {
                stack.push(arr[i]);
                before = arr[i];
            }
        }
        int[] answer = new int[stack.size()];
        for(int i = 0; i < stack.size(); i++) answer[i] = stack.get(i);
        return answer;
    }
}
