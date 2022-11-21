package com.company.notes.programmers.study;

public class PG43165 {
    static int size;
    static int target;
    static int[] numbers;
    boolean[] isPlus;
    int answer = 0;

    public static void main(String[] args) {
        PG43165 test = new PG43165();
        int[] numbers = {1,1,1,1,1};
        int target = 3;
        System.out.println(test.solution(numbers,target));;
    }

    public int solution(int[] numbers, int target) {
        this.target = target;
        this.numbers = numbers;
        size = numbers.length;
        isPlus = new boolean[size];

        dfs(0);

        return answer;
    }

    public void dfs(int level) {
        if (level == size) {
            int sum = 0;
            for (int i = 0; i < isPlus.length; i++) {
                if (isPlus[i]) sum += numbers[i];
                else sum -= numbers[i];
            }
            if (sum == target) answer++;
        } else {
            isPlus[level] = false;
            dfs(level + 1);
            isPlus[level] = true;
            dfs(level + 1);
        }
    }

}
