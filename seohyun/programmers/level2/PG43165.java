package algoitzy.week2;
public class PG43165 {

    class Solution {
        int answer = 0;

        public int solution(int[] numbers, int target) {
            dfs(numbers, 0, target, 0);
            return answer;
        }

        public void dfs(int[] numbers, int depth, int target, int sum) {
            if(depth == numbers.length){
                if(target == sum) answer++;
            } else {
                dfs(numbers, depth + 1, target, sum + numbers[depth]);
                dfs(numbers, depth + 1, target, sum - numbers[depth]);
            }
        }
    }

}
