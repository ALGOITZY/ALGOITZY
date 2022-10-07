package programmers.level1;

import java.util.*;

public class PG42576 {
    public static void main(String[] args) {
        String solution = solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"});
        System.out.println("solution = " + solution);
    }

    public static String solution(String[] participant, String[] completion) {
        Map<String, Integer> participantMap = new LinkedHashMap<>();
        for (String name : participant) {
            int count = participantMap.getOrDefault(name, 0);
            participantMap.put(name, ++count);
        }

        for (String name : completion) {
            int count = participantMap.get(name) - 1;
            participantMap.put(name, count);
        }

        String loser = "";
        Set<String> keys = participantMap.keySet();
        for (String key : keys) {
            if(participantMap.get(key) > 0) {
                loser = key;
                break;
            }
        }

        return loser;
    }
}