import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int m = Integer.parseInt(br.readLine());

        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightStack = new Stack<>();
        for(int i = 0; i<str.length(); i++) {
            leftStack.push(str.charAt(i));
        }

        while (m-- >0){
            String[] value = br.readLine().split(" ");
            if (value[0].equals("P")) {
                leftStack.push(value[1].charAt(0));
            } else if (value[0].equals("L")) {
                if (!leftStack.isEmpty()) {
                    char poped = leftStack.pop();
                    rightStack.push(poped);
                }
            } else if (value[0].equals("D")) {
                if (rightStack.size() > 0) {
                    char push = rightStack.pop();
                    leftStack.push(push);
                }
            } else {
                if (!leftStack.isEmpty()) {
                    leftStack.pop();
                }
            }
        }

        while (!leftStack.isEmpty()) {
            rightStack.push(leftStack.pop());
        }

        StringBuilder sb = new StringBuilder();
        while (!rightStack.isEmpty()) {
            sb.append(rightStack.pop());
        }
        System.out.println(sb);

    }
}
