package com.company.notes.programmers.study;

public class PG42860 {
    public static void main(String[] args) {
        PG42860 test = new PG42860();
        System.out.println(test.solution("JEROEN"));
    }

    public int solution(String name) {
        int maxLen = Integer.MIN_VALUE;
        int lastIndex = -1;
        int firstIndex = -1;
        //leftSize == firstIndex
        //rightSize == name.length-1-lastIndex

        int aLength[] = new int[name.length()];
        if (name.charAt(0) == 'A') aLength[0] = 1;
        else aLength[0] = 0;

        for (int i = 1; i < name.length(); i++) {
            if (name.charAt(i) == 'A') {
                aLength[i] = aLength[i - 1] + 1;
                if (maxLen == aLength[i]) { //연속된 최대 길이가 같은 문자열이 여러 개 있는 경우
                    //해당 문자열을 기준으로 좌측, 우측 길이의 차가 큰 것을 선택
                    int originGap = Math.abs((name.length() - 1 - lastIndex) - firstIndex);
                    int currentFirstIndex = i - aLength[i] + 1;
                    int currentGap = Math.abs((name.length() - 1 - i) - currentFirstIndex);
                    if (Math.max(originGap, currentGap) == currentGap) {
                        lastIndex = i;
                        firstIndex = currentFirstIndex;
                    }
                } else {
                    maxLen = Math.max(maxLen, aLength[i]);
                    if (maxLen == aLength[i]) {
                        lastIndex = i;
                        firstIndex = lastIndex - maxLen + 1;
                    }
                }
            } else aLength[i] = 0;
        }


        int sum = 0;
        int rightSize = name.length() - 1 - lastIndex;
        if (lastIndex == -1) {  //name에 A가 없는 경우 -> 움직이는 것은 고려하지 않아도 됨
            sum += name.length() - 1;
        } else {
            if (firstIndex == 0) {   //왼쪽 공간이 0인 경우 -> 오른쪽 공간만 세기
                sum += rightSize;
            } else if (rightSize == 0) {   //오른쪽 공간이 0인 경우 -> 왼쪽 공간만 세기
                sum += firstIndex - 1;    //시작위치는 포함하지 않음
            } else {
                //오른쪽 진행
                int rightStep = 2 * (firstIndex - 1) + rightSize;
                //왼쪽 진행
                int leftStep = rightSize + firstIndex;
                sum += Math.min(rightStep, leftStep);
            }
        }

        for (char c : name.toCharArray()) {
            int rightId = c - 65;
            int leftId = 26 - rightId;
            sum += Math.min(rightId, leftId);

        }

        return sum;
    }
}
/*
* 채점 결과
* 정확성: 74.1
* 합계: 74.1 / 100.0
* */