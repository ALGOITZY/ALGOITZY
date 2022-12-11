import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// https://www.acmicpc.net/problem/11399
// 11399 atm

public class bj11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =  Integer.parseInt(br.readLine());
        String[] times = br.readLine().split(" ");

        List<Integer> list = new ArrayList<>();
        for(String time : times){
            list.add(Integer.parseInt(time));
        }
        // 내림차순 정렬
        Collections.sort(list);

        int timeSum = 0; // 누적 대기 시간
        int totalSum = 0; // 총 누적 대기 시간
        for(int time : list){
            timeSum += time;

            totalSum += timeSum;
        }
        System.out.println(totalSum);
    }

}