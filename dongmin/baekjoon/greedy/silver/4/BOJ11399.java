package algoitzy.week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// ATM
public class BOJ11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] people = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            people[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(people);

        int result = 0;
        int sum = 0;
        for (int person : people) {
            sum += person;
            result += sum;
        }

        System.out.println(result);
    }
}
