import java.util.*;
// https://school.programmers.co.kr/learn/courses/30/lessons/42746
// 가장 큰수
class pg42746 {
    public String solution(int[] numbers) {
        List<String> list = new ArrayList();
        for(int i : numbers){
            list.add(String.valueOf(i));
        }
        // 오름차순 정렬
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s2+s1).compareTo(s1+s2);
            }

        });
        StringBuilder sb = new StringBuilder();
        for(String s : list){
            sb.append(s);
        }
        
        String answer = sb.toString();
        return answer.charAt(0) == '0' ? "0" : answer;
    }
}
