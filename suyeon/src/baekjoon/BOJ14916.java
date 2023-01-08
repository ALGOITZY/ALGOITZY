package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 거스름돈
 */
public class BOJ14916 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int amount = Integer.parseInt(br.readLine());
		int result = 0;

		// 5로 나누어 떨어지면 나누고 종료, 아니면 2를 뺀다.
		while(amount > 0) {
			if(amount % 5 == 0){
				result += amount / 5;
				break;
			}
			else {
				amount -= 2;
				result += 1;
			}
		}

		if(amount < 0){
			result = -1;
		}

		System.out.println(result);
	}
}
