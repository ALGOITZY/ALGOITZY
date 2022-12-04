public class CodeRunner {

// Programmers Java 문제 풀이 시,
// IDE에서 코드 작성 및 test code 돌릴 수 있는 템플릿

    /**
     * Solution
     * Programmers에서 제출할 코드
     * @param args
     * 출제 문제에 따라 param의 개수와 타입이 달라질 수 있다.
     * return 값 또한 그러하다.
     */
    class Solution {
        public int sol(int n) {
            int answer = 0;
            return answer;
        }


        Solution() {}
    }

    public class Main {
        public void main(String[] args) {

//        test code
            Solution solution = new Solution();
            System.out.println("============= 1 번");
            int case1 = solution.sol(15);
            if (case1 == 6) {
                System.out.println("passsssss!!!! : " + case1);
            } else {
                System.out.println("XXXXXX fail!" + case1);
            }


        }
    }
}
