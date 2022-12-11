import java.util.*;
import java.io.*;
public class bj9095
{
    // https://www.acmicpc.net/problem/9095
    // 1, 2, 3 더하기
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t =  Integer.parseInt(br.readLine());
        int[] nums = new int[t];
        for(int i=0; i<t; i++){
            nums[i] = Integer.parseInt(br.readLine());
        }

        for(int i : nums){
            System.out.println(findCaseCnt(i));
        }
    }

    private int findCaseCnt(int num){
        int cnt = 0;


    }
}
