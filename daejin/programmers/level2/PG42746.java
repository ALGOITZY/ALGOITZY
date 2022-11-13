package level2;

import java.util.*;

public class PG42746 {
	    public String solution(int[] numbers) {
	         String answer = "";

	        String[] str = new String[numbers.length];

	        //String 배열로 변환
	        for(int i = 0; i < numbers.length; i++){
	            str[i] = String.valueOf(numbers[i]);
	        }

	        //정렬
	        Arrays.sort(str, new Comparator<String>() {
	            @Override
	            public int compare(String a, String b) {
	                return (b+a).compareTo(a+b);
	            }
	        });

	        // 0일 경우 분기
	        if (str[0].equals("0")){
	            return "0";
	        }else{
	            for(int i=0; i<str.length; i++){
	                answer += str[i];
	            }
	        }

	        return answer;
	    }
}


