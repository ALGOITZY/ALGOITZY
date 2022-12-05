package com.company.notes.study.week9;

public class PG42860_fix {
    public static void main(String[] args) {
        PG42860_fix test = new PG42860_fix();
        System.out.println(test.solution("JEROEN"));
    }

    public int solution(String name) {
        int answer = 0;
        int len = name.length();
        int move = len - 1;

        for (int i = 0; i < len; i++) {
            answer += Math.min(name.charAt(i) - 'A', 26 - (name.charAt(i) - 'A')); //상,하 알파벳 맞추기
            if (i < len - 1 && name.charAt(i + 1) == 'A') {
                int endA = i + 1;   //연속된 A가 끝나는 지점
                while (endA < len && name.charAt(endA) == 'A')
                    endA++;
                // leftSize == i
                int rightSize = len - endA;
                move = Math.min(move, i * 2 + rightSize);// 오른쪽으로 갔다 다시 왼쪽으로 꺾기
                move = Math.min(move, i + rightSize * 2);// 왼쪽으로 갔다 다시 오른쪽으로 꺾기
            }
        }
        return answer + move;

    }
}
