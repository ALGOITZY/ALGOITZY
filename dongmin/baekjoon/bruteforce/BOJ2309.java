package algoitzy.week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 일곱 난쟁이
public class BOJ2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();
        int total = 0;
        for (int i = 0; i < 9; i++) {
            list.add(Integer.parseInt(br.readLine()));
            total += list.get(i);
        }

        loop:
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int sum = list.get(i) + list.get(j);
                if (total - sum == 100) {
                    list.remove(i);
                    list.remove(j - 1);
                    break loop;
                }
            }
        }

        Collections.sort(list);
        for (Integer num : list) {
            System.out.println(num);
        }
    }
}
