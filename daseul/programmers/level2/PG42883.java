package programmers.level2;

public class PG42883 {
	public String solution(String number, int k) {
        String answer = "";
        Integer[] arr = new Integer[number.length()];
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> result = new Stack<>();
        List<Integer> list = new ArrayList<Integer>();
        
        for(int idx = 0; idx < number.length(); idx++) {
        	arr[idx] = Integer.parseInt(number.charAt(idx)+"");
        	list.add(Integer.parseInt(number.charAt(idx)+""));
        }
        
        for(int idx = number.length()-1; idx >= 0 ; idx--) {
        	stack.push(arr[idx]);
        }

        int deleteCnt = 0;
        while(!stack.isEmpty() && deleteCnt < k) {
        	if(result.isEmpty()) {
        		result.push(stack.pop());
        	}
        	
        	if(result.peek() < stack.peek()){
        		result.pop();
        		deleteCnt++;
        	} else {
        		result.push(stack.pop());
        	}
        	
        }
        
        
       for(Integer a : result) {
    	   answer += a;
       }
        
        while(!stack.isEmpty()) {
        	answer += stack.pop();
        }
        
        if(answer.length() > number.length() - k) {
        	answer = answer.substring(0, number.length() - k);
        } 
        
        return answer;
    }
}
