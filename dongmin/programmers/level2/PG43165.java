package algoitzy.week7;

// 타겟 넘버
public class PG43165 {
    int[] numbers;
    int target;
    int result = 0;

    public static void main(String[] args) {
        int solution = new PG43165().solution(new int[]{1, 1, 1, 1, 1}, 3);
        System.out.println("solution = " + solution);
    }

    public int solution(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;

        dfs(0, 0);

        return result;
    }

    private void dfs(int index, int sum) {
        if (index == numbers.length) { // index가 배열의 길이와 같고
            if(sum == target) { // sum == target 인 경우에 result + 1;
                result++;
            }
        }else {
            dfs(index + 1, sum + numbers[index]);
            dfs(index + 1, sum - numbers[index]);
        }
    }
}
