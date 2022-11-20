import java.util.*;
//https://school.programmers.co.kr/learn/courses/30/lessons/43165
//타겟넘버
class pg43165 {
    static int answer = 0;
    static int[] nums;
    public int solution(int[] numbers, int target) {
        nums = numbers;
        maketargetNum(0, target);
        return answer;
    }
    
    private void maketargetNum(int idx, int target){
        if(idx == nums.length) {
            if(target == 0) answer +=1;
            return;
        }
        
        maketargetNum(idx+1, target-nums[idx]);
        maketargetNum(idx+1, target+nums[idx]);
    }
}
