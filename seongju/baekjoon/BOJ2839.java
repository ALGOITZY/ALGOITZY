import java.util.Scanner;

public class BOJ2839 {
    public static void main(String[] args) {
        int bag1 = 3;
        int bag2 = 5;
        int count;
        int count2;
        int left2;
        int left;

        Scanner sc = new Scanner(System.in);
        boolean a = true;

        int sugar = sc.nextInt();

        //먼저 설탕을 5kg으로 나누었을때 완벽히 나누어 떨어지면 count에 몫을 할당한다
        if(sugar%bag2 == 0) {
            count = sugar/bag2;
            System.out.println(count);
        }
        //완벽히 나누어 떨어지지 않으면 나머지를 3으로 나눈다
        else if(sugar%bag2 != 0) {
            count = sugar/bag2;
            left = sugar%bag2;
            left2 = left%bag1;
            count2 = left/bag1;
            //만약 3으로 나눈것이 나누어 떨어지면 count에 더하고 아니면 count에 1을 빼고 left에 5를 더한 후 위를 반복한다.
            if(left2 == 0) {
                count = count + count2;
                System.out.println(count);
            }
            else {
                while(a) {
                    count--;
                    left = left+bag2;
                    left2 = left%bag1;
                    count2 = left/bag1;


                    if(count<0) {
                        count =-1;
                        System.out.println(count);
                        a = false;
                    }
                    else if(left2 == 0) {
                        count = count + count2;
                        System.out.println(count);
                        a = false;
                    }
                }
            }
        }
        else if(sugar%bag1 == 0) {
            count = sugar/bag1;
            System.out.println(count);
        }

        /*
         * 만약 count == 0인데 left2 !=0이면 count =-1
         *
         * */
    }
}
