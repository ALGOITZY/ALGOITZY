package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * 수리공 항승
 */
public class BOJ1449 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());

		StringTokenizer st2 = new StringTokenizer(br.readLine());

		ArrayList<Integer> arr = new ArrayList<>();
		while(st2.hasMoreTokens()){
			arr.add(Integer.parseInt(st2.nextToken()));
		}
		arr.sort(Integer::compareTo);

		int result = 1; // 사용한 테이브 개수
		int tape = l - 1; // 남은 테이프 길이 (초기값 적용)
		for(int i = 1; i<arr.size(); i++){
			if(tape <= 0 || arr.get(i) - arr.get(i-1) > tape){
				result++;
				tape = l - 1;
			}
			else {
				tape -= arr.get(i) - arr.get(i-1);
			}
		}

		if(tape < 0){
			result++;
		}

		System.out.println(result);
	}
}
