package algoitzy.week3;

// 최소직사각형 [완전탐색]
public class PG86491 {
    public static void main(String[] args) {
        int solution = solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}});
        System.out.println("solution = " + solution);
    }

    public static int solution(int[][] sizes) {

        int width = 0;
        int height = 0;

        for (int[] size : sizes) {
            width = Math.max(width, Math.max(size[0], size[1]));
            height = Math.max(height, Math.min(size[0], size[1]));
        }

        return width * height;

    }
}
