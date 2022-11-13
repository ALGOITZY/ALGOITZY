package level2;

public class PG42883 {
		 public String solution(String number, int k) {
	         StringBuilder sb = new StringBuilder();
	         int len = number.length();
	         int index = 0;
	         int t = len - k;
	
	         for (int i = 0; i < t; i++) {
	           // 뽑히는 수 만큼 반복문
	           char max = '0';
	           for (int j = index; j <= k + i; j++) {
	             char tmp = number.charAt(j);
	             if(max < tmp) {
	               max = tmp;
	               index = j + 1;
	             }
	           }
	           sb.append(max);
	         }
	         return sb.toString();
	     }
}
