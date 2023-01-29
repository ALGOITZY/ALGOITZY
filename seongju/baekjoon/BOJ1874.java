import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BOJ1874 {  //안풀려서 보류 --> 해결
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        List<String> list = new ArrayList<>();
        int i = 1; int j= 0;
        while(list.size() < n*2) {
            if(stack.size() == 0 && i<=n) {
                stack.add(i); i++;
                list.add("+");
            }
            else if(arr[j] == stack.peek()) {
                stack.pop();
                j++;
                list.add("-");
            } else {
                stack.push(i);
                i++;
                list.add("+");
            }
        }
        if(stack.isEmpty()) {
            for (String s : list) {
                System.out.println(s);
            }
        } else {
            System.out.println("NO");
        }

    }
}


