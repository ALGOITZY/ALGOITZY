import java.util.Scanner;

// https://www.acmicpc.net/problem/2839
// 2839 설탕배달

public class bj2839 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count =0;

        if(n%5 == 0){
            if(count !=0) count = Math.min(count, n/5);
            else count = n/5;
        }
        if(n%3 ==0){
            if(count !=0) count = Math.min(count, n/3);
            else count = n/3;
        }
        if(n/5 >0) {
            int count5 = n/5;
            int count3 = 0;

            for(int i=0; i<n/5; i++) {
                int num = n;
                num -= count5*5;
                if(num % 3 == 0) {
                    count3 = num/3;
                    if(count !=0) count = Math.min(count, count5+count3);
                    else count = count5+count3;
                    break;
                }
                count5 --;
            }
        }
        if(count == 0) {
            count = -1;
        }

        System.out.println(count);
    }

}