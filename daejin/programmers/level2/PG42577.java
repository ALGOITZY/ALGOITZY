package level2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PG42577 {	
	 public static boolean solution(String[] phone_book) {
		 Map<String, Object> map = new HashMap<>();


	        for (int i = 0; i < phone_book.length; i++) 
	            map.put(phone_book[i], '1');
	        

	        for (int i = 0; i < phone_book.length; i++){
	            for (int j = 0; j < phone_book[i].length(); j++){
	                if (map.containsKey(phone_book[i].substring(0, j))){
	                    return false;
	                }
	            }
	        }
	        return true;
	 }
}
