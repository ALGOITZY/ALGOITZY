package programmers.level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PG42577 {
	public boolean solution(String[] phone_book) {
        boolean answer = true;
        Map<String, List<String>> phoneMap = new HashMap<>();
        int min = 21;
        for(String phoneNumber : phone_book) {
        	if(min > phoneNumber.length()) {
        		min = phoneNumber.length();
        	}
        }

        for(String phoneNumber : phone_book) {
        	String key = phoneNumber.substring(0, min);
        	List<String> keyList = phoneMap.get(key);
        	if(null == keyList) {
        		keyList = new ArrayList<>();
        	}
        	keyList.add(phoneNumber);
        	phoneMap.put(key, keyList);
        }

        for(String phoneNumber : phone_book) {
        	String key = phoneNumber.substring(0, min);
        	List<String> keyList = phoneMap.get(key);
        	if(null != keyList) {
        		for(String compareKey : keyList) {
        			if(phoneNumber.length() >= compareKey.length()) {
        				if(phoneNumber.substring(0, compareKey.length()).equals(compareKey)) {
        					if(!phoneNumber.equals(compareKey)) {
        						return false;
        					}
        				}

        			}
        		}
        	}
        }

        return answer;
    }
}
