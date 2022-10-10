package Dt221010;

import java.util.*;

public class MarathonHashEx {
	
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		// 1. �����ڸ� ��� hash table�� ���� - key:�̸�, value:��(�̸� �ߺ��� +1)  
		for(int i=0; i<participant.length; i++) {
			if(hm.containsKey(participant[i])) {
				hm.replace(participant[i], hm.get(participant[i]) +1);
			}
			else 
				hm.put(participant[i], 1);
		}
		
		// 2. ���� �� ����� map value���� -1 �� ��   
		for(int j=0; j<completion.length; j++) {
			if(hm.containsKey(completion[j])) {
				hm.replace(completion[j], hm.get(completion[j]) - 1);
			}
		}
		
		// 3. 0 �� �ƴ� ����� ���ָ� �� �� ��� 
		for(int i=0; i<participant.length; i++) {
			if(hm.get(participant[i]) > 0) {
				answer = participant[i];
				break;
			}
		}

		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] participant = { "leo", "kiki", "eden" };
		String[] completion = { "kiki", "eden" };
		MarathonHashEx sol = new MarathonHashEx();
		System.out.println("[HashMap] \r\n" + sol.solution(participant, completion));
		
		String[] p2 = { "marina", "josipa", "nikola", "vinko", "filipa" };
		String[] c2 = { "josipa", "filipa", "marina", "nikola" };
		System.out.println(sol.solution(p2, c2));
		
		String[] p3 = { "mislav", "stanko", "mislav", "ana" };
		String[] a3 = { "stanko", "ana", "mislav" };
		System.out.println(sol.solution(p3, a3));		
	}

}
