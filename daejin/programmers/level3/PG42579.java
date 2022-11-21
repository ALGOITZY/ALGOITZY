package level3;

import java.util.*;

public class PG42579 {
	 public int[] solution(String[] genres, int[] plays) {
	        int[] answer = {};
	        
	        HashMap<String, Integer> hm = new HashMap<String, Integer>();
	        
	        HashMap<Integer, Integer> hm2 = new HashMap<Integer, Integer>();
	        
	        for(int i = 0; i < plays.length; i++) {
	        	hm2.put(i, plays[i]);
	        }
	        
	        for(int i =0; i < genres.length; i++) {
	        	if(hm.containsKey(genres[i])) {
	        		hm.put(genres[i], hm.get(genres[i])+ plays[i]);
	        	}else {
	        		hm.put(genres[i], plays[i]);
	        	}
	        }
	        
	        List<String> genreSet = new ArrayList<>(hm.keySet());
	        
	        Collections.sort(genreSet, (o1,o2)->(hm.get(o2).compareTo(hm.get(o1))));
	        
	        List<Integer> indexSet = new ArrayList<>(hm2.keySet());
	        
	        Collections.sort(indexSet, (o1,o2)->(hm2.get(o2).compareTo(hm2.get(o1))));
	        
	        List<Integer> answerList = new ArrayList<>();
	        
	        for(String a : genreSet) {
	        	int count = 1;
	        	for(int i : indexSet) {
	        		if(a.equals(genres[i]) && count < 3) {
	        			count ++;
	        			answerList.add(i);
	        		}
	        	}
	        }
	        
	        answer = new int[answerList.size()];
	        
	        for(int i  = 0; i < answer.length; i++) {
	        	answer[i] = answerList.get(i);
	        }
	        return answer;
	    }
}
