package programmers.level1;

import java.util.HashSet;
import java.util.Set;

public class PG1845 {
	public int solution(int[] nums) {
        int length = nums.length;
        Set<Integer> set = new HashSet<Integer>();

        for(int idx = 0; idx < length ; idx++){
            set.add(nums[idx]);
        }

        return set.size() >= length/2 ? length/2 : set.size();
    }
}
