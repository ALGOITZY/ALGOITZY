package programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class PG42576 {
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> nameMap = new HashMap<String, Integer>();
        for(String name : participant){
            Integer value = nameMap.get(name);
            value = (value == null) ? 1 : value +1;
            nameMap.put(name, value);
        }

        for(String name : completion){
            int value = nameMap.get(name) -1;
            if(value == 0){
                nameMap.remove(name);
            } else{
                nameMap.put(name, value);
            }
        }

        for(String name : nameMap.keySet()){
            answer = name;
        }
        return answer;
    }
}
