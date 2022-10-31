class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for(int i = 0; i < prices.length; i++) {
            int cnt = 0;
            boolean check = true;
            for(int j = i + 1; j < prices.length; j++) {
                cnt += 1;
                if(prices[i] > prices[j]) {
                    answer[i] = cnt;
                    check = false;
                    break;
                }
            }
            if(check)   answer[i] = cnt;
        }
        return answer;
    }
}