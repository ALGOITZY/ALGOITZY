package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * 팰린드롬 만들기
 */
public class BOJ1213 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		Comparator<Character> comparator = Character::compareTo;
		Map<Character, Integer> map = new TreeMap<>(comparator);

		// map에 각 알파벳 개수 입력
		for(char c: s.toCharArray()){
			int count = map.getOrDefault(c, 0);
			map.put(c, count + 1);
		}

		String result = "";
		StringBuilder left = new StringBuilder();
		StringBuilder right = new StringBuilder();
		Character center = 'a';

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			// 팰린드롬 가운데 위치의 알파벳 구하기 (홀수인 경우)
			if(entry.getValue() % 2 == 1){
				if(center == 'a'){
					center = entry.getKey();
				}
				else {
					result = "I'm Sorry Hansoo";
					break;
				}
			}

			// 팰린드롬 왼쪽, 오른쪽 단어 구하기
			String s2 = Character.toString(entry.getKey()).repeat(entry.getValue() / 2);
			left.append(s2);
			right.insert(0, s2);
		}

		if(result.equals("")){ // result != "I'm Sorry Hansoo";
			if(center != 'a'){
				result = left.toString() + center + right;
			}
			else {
				result = left.toString() + right;
			}
		}

		System.out.println(result);
	}
}
