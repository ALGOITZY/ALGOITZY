import java.util.*;
// https://school.programmers.co.kr/learn/courses/30/lessons/42839
// 소수 찾기
class pg42839 {
    public static Set<Integer> numSet = new HashSet<>();
    public int solution(String numbers) {
        
        makeNumSet("", numbers);
        
        return (int) numSet.stream().filter(e -> isPrime(e)).count();
    }
    
    private void makeNumSet(String number, String others) {
        if (number != "") {
            numSet.add(Integer.valueOf(number));
        }

        for (int i = 0; i < others.length(); i++){
            makeNumSet(number + others.charAt(i), others.substring(0, i) + others.substring(i + 1));
        }         
    }
    
    public boolean isPrime(int num) {
        if (num == 0 || num == 1){
            return false;
        }

        int maxLimit = (int)Math.sqrt(num);
        for (int i = 2; i <= maxLimit; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
    
}
