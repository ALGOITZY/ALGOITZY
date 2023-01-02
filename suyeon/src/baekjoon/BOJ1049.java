package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1049 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine();
		int pos = line.indexOf(" ");
		int n = Integer.parseInt(line.substring(0, pos));
		int m = Integer.parseInt(line.substring(pos + 1));

		int minSetPrice = Integer.MAX_VALUE;
		int minSinglePrice = Integer.MAX_VALUE;
		while(m > 0) {
			String line2 = br.readLine();
			int pos2 = line2.indexOf(" ");
			int setPrice = Integer.parseInt(line2.substring(0, pos2));
			int singlePrice = Integer.parseInt(line2.substring(pos2 + 1));

			minSetPrice = Math.min(setPrice, minSetPrice);
			minSinglePrice = Math.min(singlePrice, minSinglePrice);

			m--;
		}

		int result = n / 6 * minSetPrice + (n % 6) * minSinglePrice;
		if(minSetPrice > minSinglePrice * 6){
			result = n * minSinglePrice;
		}
		else if ((n / 6 + 1) * minSetPrice < result) {
			result = (n / 6 + 1) * minSetPrice;
		}

		System.out.println(result);
	}
}
