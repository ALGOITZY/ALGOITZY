package Dt221010;

import java.util.*;

public class MarathonHashEx {
	
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		// 1. 참가자를 모두 hash table에 저장 - key:이름, value:명(이름 중복시 +1)  
		for(int i=0; i<participant.length; i++) {
			if(hm.containsKey(participant[i])) {
				hm.replace(participant[i], hm.get(participant[i]) +1);
			}
			else 
				hm.put(participant[i], 1);
		}
		
		// 2. 완주 한 사람을 map value에서 -1 씩 함   
		for(int j=0; j<completion.length; j++) {
			if(hm.containsKey(completion[j])) {
				hm.replace(completion[j], hm.get(completion[j]) - 1);
			}
		}
		
		// 3. 0 이 아닌 사람은 완주를 못 한 사람 
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
