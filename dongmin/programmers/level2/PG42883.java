package algoitzy.week6;

// 큰 수 만들기
public class PG42883 {
    public static void main(String[] args) {
        String solution = solution("4177252841", 4);
        System.out.println("solution = " + solution);
    }

    public static String solution(String number, int k) {
        // 핵심: 큰 수를 만들려면 앞 자리에 큰 숫자들이 남아야한다.
        StringBuilder result = new StringBuilder();

        int length = number.length() - k; // 구해야 할 숫자의 자릿수
        int index = 0;

        while (index < number.length() && result.length() != length) {
            int digit = k + result.length() + 1;
            int max = 0;

            for (int i = index; i < digit; i++) {
                int curr = number.charAt(i) - 48;
                if(curr > max) {
                    max = curr;
                    index = i + 1; // 이전 숫자들을 검사하지 않기 위해서
                }
            }
            result.append(max);
        }

        return result.toString();
    }
}
