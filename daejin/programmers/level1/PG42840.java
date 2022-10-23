package level1;

import java.util.ArrayList;

public class PG42840 {
	public int[] solution(int[] answers) {
		int[] answer = {};
		int[] stu_A = {1,2,3,4,5}; 
        int[] stu_B = {2,1,2,3,2,4,2,5};
        int[] stu_C = {3,3,1,1,2,2,4,4,5,5};
        
        int answ_A = 0;
        int answ_B = 0;
        int answ_C = 0;
        
        for(int i = 0; i < answers.length; i++) {
        	if(stu_A[i%stu_A.length] == answers[i]) {
        		answ_A++;
        	}
        	
        	if(stu_B[i%stu_B.length] == answers[i]) {
        		answ_B++;
        	}
        	
        	if(stu_C[i%stu_C.length] == answers[i]) {
        		answ_C++;
        	}
        }
        
        int max_Score = Math.max(Math.max(answ_A, answ_B), answ_C);
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(max_Score == answ_A) {
        	list.add(1);
        }
        
        if(max_Score == answ_B) {
        	list.add(2);
        }
        
        if(max_Score == answ_C) {
        	list.add(3);
        }
        
        answer = new int[list.size()];
        
        for(int i =0; i<answer.length; i++) {
        	answer[i] = list.get(i);
        }
		
        return answer;
	}
}
