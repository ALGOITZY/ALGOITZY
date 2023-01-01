package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1439 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		char lastWord = '2';
		int[] arr = {0, 0};

		for(int i = 0; i < s.length(); i++){
			char word = s.charAt(i);
			if(lastWord != word){
				lastWord = word;
				arr[s.charAt(i) - '0'] += 1;
			}
		}

		int result = Math.min(arr[0], arr[1]);
		System.out.println(result);
	}
}
