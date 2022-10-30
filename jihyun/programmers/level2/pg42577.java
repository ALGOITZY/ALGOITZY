import java.util.HashMap;
import java.util.Map;

// https://school.programmers.co.kr/learn/courses/30/lessons/42577
// 전화번호 목록
public class pg42577 {
    public boolean solution(String[] phone_book) {
        Map<String, Integer> numbers = new HashMap<>();
        for(String number : phone_book) {
            numbers.put(number, number.length());
        }

        for(String number : phone_book) {
            for(int i=1; i<number.length(); i++) {
                if(numbers.containsKey(number.substring(0,i))) return false;
            }
        }

        return true;
    }
}
