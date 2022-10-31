package algoitzy.week4;

import java.util.*;

// 전화번호 목록
public class PG42577 {
    public static void main(String[] args) {
        boolean solution = solution(new String[]{"12", "123", "1235", "567", "88"});
        System.out.println("solution = " + solution);
    }

    public static boolean solution(String[] phone_book) {

        Arrays.sort(phone_book);

        Map<String, Integer> map = new LinkedHashMap<>();
        for (String number : phone_book) {
            map.put(number, number.length());
        }

        Iterator<String> it = map.keySet().iterator();

        String prev = it.next(); // 첫 번째 번호
        while (it.hasNext()) {
            String curr = it.next(); // 현재 번호
            if (curr.startsWith(prev)) {
                return false;
            }
            prev = curr; // 번호 최신화
        }

        return true;
    }
}
