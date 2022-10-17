package algoitzy.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 모의고사
public class PG42840 {
    static int[][] pattern = {
            {1, 2, 3, 4, 5}, // 5
            {2, 1, 2, 3, 2, 4, 2, 5}, // 8
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5} // 10
    };

    public static void main(String[] args) {
        int[] solution = solution(new int[]{1, 3, 2, 4, 2});
        System.out.println(Arrays.toString(solution));
    }

    public static int[] solution(int[] answers) {
        int[] MathGiveUp = new int[3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < answers.length; j++) {
                int index = j % pattern[i].length;
                if (answers[j] == pattern[i][index]) {
                    MathGiveUp[i]++;
                }
            }
        }

        int max = Math.max(MathGiveUp[0], Math.max(MathGiveUp[1], MathGiveUp[2]));

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < MathGiveUp.length; i++) {
            if(MathGiveUp[i] == max) {
                list.add(i + 1);
            }
        }

        int[] rank = new int[list.size()];
        for (int i = 0; i < rank.length; i++) {
            rank[i] = list.get(i);
        }

        return rank;
        // return list.stream().mapToInt(x -> x).toArray(); 스트림 시간 진짜 오래 걸림... 2초대..
    }
}
