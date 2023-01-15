package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 설탕 배달
public class BOJ2839 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[5001];

		arr[1] = -1;
		arr[2] = -1;
		arr[3] = 1;
		arr[4] = -1;
		arr[5] = 1;

		for(int i = 6; i<=n; i++){
			arr[i] = -1;
			if(arr[i-3] != -1){
				arr[i] = arr[i-3] + 1;
			}
			if(arr[i-5] != -1 && (arr[i] == -1 || arr[i] > arr[i-5] + 1)){
				arr[i] = arr[i-5] + 1;
			}
		}

		System.out.println(arr[n]);
	}
}
