package algoitzy.week3;

import java.util.Arrays;
import java.util.Collections;

public class PG42746 {
    class Permutation {
        StringBuilder permutation(int[] arr, int depth, int n, int r, StringBuilder answer) {
            if (depth == r) {
                for (int i = 0; i < r; i++) {
                    answer.append(arr[i]);
                }
                answer.append(",");
            }
            for (int i = depth; i < n; i++) {
                swap(arr, depth, i);
                answer = permutation(arr, depth+1, n, r, answer);
                swap(arr, depth, i);
            }

            return answer;
        }

        void swap(int[] arr, int depth, int idx) {
            int tmp = arr[depth];
            arr[depth] = arr[idx];
            arr[idx] = tmp;
        }
    }

    public String solution(int[] numbers) {
        StringBuilder answer;
        Permutation permutation = new Permutation();

        String[] strNumbers = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            strNumbers[i] = String.valueOf(numbers[i]);
        }

        int numInt = numbers.length;
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder = permutation.permutation(numbers, 0 , numInt, numInt, stringBuilder);

        String str = stringBuilder.toString();
        String[] strings = str.split(",");

        Integer[] intArray = new Integer[strings.length];

        for (int i = 0; i < strings.length; i++) {
            intArray[i] = Integer.parseInt(strings[i]);
        }
        Arrays.sort(intArray, Collections.reverseOrder());

        answer = new StringBuilder(String.valueOf(intArray[0]));

        return answer.toString();
    }

}
