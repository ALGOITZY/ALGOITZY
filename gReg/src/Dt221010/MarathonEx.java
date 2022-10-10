package Dt221010;

import java.util.*;

public class MarathonEx {
	
	public String solution(String[] participant, String[] completion) {
		String answer = "";

		for(int i=0; i<participant.length; i++) {
			for(int j=0; j<completion.length; j++) {
				if(participant[i].equals(completion[j])) {
					participant[i] = "";
					completion[j] = "";
				}
			}
		}
		
		for(int i=0; i<participant.length; i++) {
			if(!participant[i].equals("")){
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
		MarathonEx sol = new MarathonEx();
		System.out.println(sol.solution(participant, completion));
		
		String[] p2 = { "marina", "josipa", "nikola", "vinko", "filipa" };
		String[] c2 = { "josipa", "filipa", "marina", "nikola" };
		System.out.println(sol.solution(p2, c2));
		
		String[] p3 = { "mislav", "stanko", "mislav", "ana" };
		String[] a3 = { "stanko", "ana", "mislav" };
		System.out.println(sol.solution(p3, a3));		
	}

}
