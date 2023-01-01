package baekjoon;

import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;

public class BOJ16953 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine();
		int pos = line.indexOf(" ");
		int a = Integer.parseInt(line.substring(0, pos));
		int b = Integer.parseInt(line.substring(pos + 1));

		int num = b;
		int result = 0;
		while(a < num){
			String s = Integer.toString(num);
			if(num % 2 == 0){
				num = num / 2;
			}
			else if (s.charAt(s.length() - 1) == '1') {
				s = s.substring(0, s.length()-1);
				num = Integer.parseInt(s);
			}
			else {
				num = 0;
			}
			result++;
		}

		if(a != num){
			result = -1;
		}
		else {
			result += 1;
		}

		System.out.println(result);
	}
}