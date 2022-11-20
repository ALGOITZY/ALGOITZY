package algoitzy.week7;

// 조이스틱
public class PG42860 {
    public static void main(String[] args) {
        int solution = solution("AZAAAZ");
        System.out.println("solution = " + solution);
    }

    public static int solution(String name) {
        int result = 0;
        int length = name.length();
        int move = length - 1; // 오른쪽으로만 이동하는 경우 총 횟수

        for (int i = 0; i < length; i++) {
            char ch = name.charAt(i);
            // 알파벳 이동
            result += Math.min(ch - 65, 26 - (ch - 65));

            // 좌우 커서 이동 방법

        }

        return 0;
    }
}