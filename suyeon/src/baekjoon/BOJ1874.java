package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

/**
 * 스택 수열
 */
public class BOJ1874 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		ArrayList<Integer> arr = new ArrayList<>(); // 입력받은 수열
		while(t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			arr.add(n);
		}

		ArrayList<Integer> stack = new ArrayList<>(); // +된 스택을 쌓아둘 배열
		ArrayList<Integer> sortedArr = (ArrayList<Integer>)arr.clone(); // stack에 넣을 정렬된 배열
		sortedArr.sort(Comparator.comparingInt(i -> i));

		ArrayList<String> result = new ArrayList<>(); // 정답 출력용 배열
		while(sortedArr.size() > 0 || stack.size() > 0){
			// stack의 마지막요소와 남은 수열의 첫번째 요소가 같은 경우
			if(stack.size() > 0 && Objects.equals(stack.get(stack.size() - 1), arr.get(0))){
				stack.remove(stack.size()-1); // stack pop
				arr.remove(0); // 만들어야하는 남은 수열 업데이트

				result.add("-");
			} // "+"할 요소가 남아있는 경우
			else if (sortedArr.size() > 0) {
				stack.add(sortedArr.get(0)); // stack push
				sortedArr.remove(0); // 스택에 넣어야하는 남은 수열 업데이트

				result.add("+");
			} else {
				System.out.println("NO");
				return;
			}
		}

		for(String s: result){
			System.out.println(s);
		}
	}
}
