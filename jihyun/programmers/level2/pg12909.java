import java.util.Stack;
//https://school.programmers.co.kr/learn/courses/30/lessons/12909
public class pg12909 {
        boolean solution(String s) {
            if(s.length()%2 != 0) return false;

            Stack<String> stack = new Stack<>();
            for(String e : s.split("")){
                if(e.equals("("))
                    stack.push("(");
                else if(!stack.empty())
                    stack.pop();
                else
                    return false;
            }

            return stack.empty();
        }
}