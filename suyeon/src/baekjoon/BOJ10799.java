package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 쇠막대기
 */
public class BOJ10799 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[] input = br.readLine().toCharArray();
		int result = 0;

		ArrayList<Character> stack = new ArrayList<>();
		for(int i = 0; i<input.length; i++){
			if(input[i] == '('){
				stack.add(input[i]);
			}
			else if(input[i] == ')'){
				stack.remove(stack.size() - 1); // stack pop

				// 레이저
				if(input[i-1] == '('){
					result += stack.size();
				}
				// 막대기 끝
				else {
					result++;
				}
			}
		}
		System.out.println(result);
	}
}
