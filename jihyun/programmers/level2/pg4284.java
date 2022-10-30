// https://school.programmers.co.kr/learn/courses/30/lessons/42584
// 주식가격
public class pg4284 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for(int i=0; i<prices.length; i++){
            for(int j = i+1; j<prices.length; j++){
                answer[i] +=1;
                if(prices[i] > prices[j]) break;
            }
        }
        return answer;
    }
}
