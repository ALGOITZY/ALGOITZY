package algoitzy.week6;

import java.util.Arrays;
import java.util.Comparator;

// 가장 큰 수
public class PG42746 {
    public static void main(String[] args) {
        String solution = solution(new int[]{3, 30, 34, 5, 9});
        System.out.println("solution = " + solution);
    }

    public static String solution(int[] numbers) {

        // Arrays.stream(numbers).mapToObj(num -> String.valueOf(num)).toArray(size -> new String[size]);
        String[] arr = Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new);

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        StringBuilder sb = new StringBuilder();
        for (String number : arr) {
            sb.append(number);
        }

        return sb.toString().charAt(0) == '0' ? "0" : sb.toString();
    }
}
