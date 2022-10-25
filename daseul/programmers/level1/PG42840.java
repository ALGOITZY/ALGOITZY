package programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class PG42840 {
	public int[] solution(int[] answers) {
 		int[] scores = {0,0,0};

 		int[] examinee1 = new int[answers.length];
 		int[] examinee2 = new int[answers.length];
 		int[] examinee3 = new int[answers.length];

 		int[] pattern1 = new int[] {1,2,3,4,5};
 		int[] pattern2 = new int[] {2, 1, 2, 3, 2, 4, 2, 5};
 		int[] pattern3 = new int[] {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

 		for(int idx = 0; idx < answers.length ; idx++) {
 			examinee1[idx] = pattern1[idx%pattern1.length];
 			examinee2[idx] = pattern2[idx%pattern2.length];
 			examinee3[idx] = pattern3[idx%pattern3.length];

 			if(answers[idx] == examinee1[idx]) {	scores[0]++;	}
 			if(answers[idx] == examinee2[idx]) {	scores[1]++;	}
 			if(answers[idx] == examinee3[idx]) {	scores[2]++;	}
 		}

 		int max = 0;
 		List<Integer> list = new ArrayList<>();
 		for(int idx = 0; idx < scores.length; idx++) {
 			if(max < scores[idx]) {
 				max = scores[idx];
 				list.clear();
 				list.add(idx+1);

 			} else if(max == scores[idx]) {
 				list.add(idx+1);
 			}
 		}
 		return list.stream().mapToInt(i->i).toArray();
	}
}
